package database.daos;

import database.models.Siggrafeas;
import database.models.Vivlio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

@SuppressWarnings("ThrowableResultIgnored")
public class SiggrafeisDAO {

    private final Connection con;
    private PreparedStatement pStat;
    private ResultSet rs;
    private static final String ENIMERWSI_SIGGRAFEA = "UPDATE  siggrafeis SET onoma_siggrafea = ? , epitheto_siggrafea = ? WHERE id_siggrafea = ?";
    private static final String DIAGRAFI_SIGGRAFEA = "DELETE FROM siggrafeis WHERE id_siggrafea = ?";
    private static final String ANAKTISI_VIVLIWN_SIGGRAFEA = "SELECT isbn_vivliou, titlos_vivliou, url_exwfilou_vivliou, perigrafi_vivliou, ekdotes_id_ekdoti "
            + " FROM vivlia, vivlia_has_siggrafeis WHERE isbn_vivliou = vivlia_isbn_vivliou AND siggrafeis_id_siggrafea = ?";

    public SiggrafeisDAO(Connection con) {
        this.con = con;
    }//ctor.

    //--------------------------------------------------------------------------------------    
    public void insertSiggrafea(Siggrafeas siggrafeas) {

        try {
            String sql = "INSERT INTO sistima_vivliothikis_ergasia.siggrafeis (onoma_siggrafea, epitheto_siggrafea) VALUES (?,?)";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, siggrafeas.getOnoma());
                ps.setString(2, siggrafeas.getEpitheto());

                ps.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println(e + "     SiggrafeisDAO.insertSiggrafea()");
        }
    }

    //--------------------------------------------------------------------------------------    
    public ArrayList<Siggrafeas> findAll() {

        ArrayList allWriters = new ArrayList();
        Siggrafeas siggrafeas;
        try {
            String sql = "SELECT * FROM sistima_vivliothikis_ergasia.siggrafeis ORDER BY epitheto_siggrafea";
            try (Statement s = con.createStatement();
                    ResultSet _loc = s.executeQuery(sql);) {

                while (_loc.next()) {
                    siggrafeas = new Siggrafeas();

                    siggrafeas.setId(Integer.parseInt(_loc.getString("id_siggrafea")));
                    siggrafeas.setOnoma(_loc.getString("onoma_siggrafea"));
                    siggrafeas.setEpitheto(_loc.getString("epitheto_siggrafea"));

                    allWriters.add(siggrafeas);
                }
            }

        } catch (SQLException | NumberFormatException e) {
            System.out.println(e + "       SiggrafeisDAO.findAll()");
        }

        return allWriters;
    }

    //--------------------------------------------------------------------------------------
    public boolean diagrafiSiggrafea(int idSiggrafea) {
        try {
            pStat = con.prepareStatement(DIAGRAFI_SIGGRAFEA);
            pStat.setInt(1, idSiggrafea);

            int res = pStat.executeUpdate();

            return res == 1;

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            while ((ex = ex.getNextException()) != null) {
                System.err.println(ex.getSQLState() + " - " + ex.getErrorCode());
            }//while.
        } finally {
            try {
                if (!pStat.isClosed()) {
                    pStat.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
                while ((ex = ex.getNextException()) != null) {
                    System.err.println(ex.getSQLState() + " - " + ex.getErrorCode());
                }//while.
            }
        }//finally.

        return false;
    }//diagrafiSiggrafea.
    //--------------------------------------------------------------------------------------

    public boolean enimerwsiSiggrafea(Siggrafeas input) {

        try {
            pStat = con.prepareStatement(ENIMERWSI_SIGGRAFEA);
            pStat.setString(1, input.getOnoma());
            pStat.setString(2, input.getEpitheto());
            pStat.setInt(3, input.getId());

            int res = pStat.executeUpdate();

            return res == 1;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            while ((ex = ex.getNextException()) != null) {
                System.err.println(ex.getSQLState() + " - " + ex.getErrorCode());
            }//while.
        } finally {
            try {
                if (!pStat.isClosed()) {
                    pStat.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
                while ((ex = ex.getNextException()) != null) {
                    System.err.println(ex.getSQLState() + " - " + ex.getErrorCode());
                }//while.
            }
        }//finally.
        return false;
    }//enimerwsiSiggrafea.
    //---------------------------------------------------------------------------------------

    public ArrayList<Vivlio> anaktisiVivliwnSiggrafea(int idSiggrafea) {
        try {
            pStat = con.prepareStatement(ANAKTISI_VIVLIWN_SIGGRAFEA);
            pStat.setInt(1, idSiggrafea);

            rs = pStat.executeQuery();

            ArrayList<Vivlio> vivliaSiggrafea = new ArrayList<>();
            Vivlio temp;

            while (rs.next()) {

                temp = new Vivlio();

                temp.setIsbn(rs.getString("isbn_vivliou"));
                temp.setTitlos(rs.getString("titlos_vivliou"));
                temp.setUrl_exwfilou_vivliou(rs.getString("url_exwfilou_vivliou"));
                temp.setPerigrafi_vivliou(rs.getString("perigrafi_vivliou"));
                temp.setId_ekdoti(rs.getInt("ekdotes_id_ekdoti"));

                vivliaSiggrafea.add(temp);

            }//while.

            return vivliaSiggrafea;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            while ((ex = ex.getNextException()) != null) {
                System.err.println(ex.getSQLState() + " - " + ex.getErrorCode());
            }//while.
        } finally {
            try {
                if (!pStat.isClosed()) {
                    pStat.close();
                }
                if (!rs.isClosed()) {
                    rs.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
                while ((ex = ex.getNextException()) != null) {
                    System.err.println(ex.getSQLState() + " - " + ex.getErrorCode());
                }//while.
            }
        }//finally.
        return null;
    }//anaktisiVivliwnSIggrafea.
    //----------------------------------------------------------------------------------------

}//SIggrafeisDAO.
