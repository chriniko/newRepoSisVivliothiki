package database.daos;

import database.models.Ekdotis;
import database.models.Vivlio;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author nikos
 */
@SuppressWarnings("ThrowableResultIgnored")
public class EkdotesDAO {

    private final Connection con;
    private PreparedStatement pStat;
    private ResultSet rs;
    private static final String ANAKTISI_VIVLIWN_EKDOTI = "SELECT * FROM vivlia WHERE ekdotes_id_ekdoti = ? ORDER BY 1";
    private static final String DIAGRAFI_EKDOTI = "DELETE FROM ekdotes WHERE id_ekdoti = ?";
    private static final String ENIMERWSI_EKDOTI = "UPDATE ekdotes SET onoma_ekdoti = ? WHERE id_ekdoti = ?";
    private static final String ANAKTISI_ID_EKDOTI_QUERY = "SELECT id_ekdoti FROM ekdotes WHERE onoma_ekdoti = ?";

    public EkdotesDAO(Connection conn) {
        this.con = conn;
    }

    //----------------------------------------------------------------------------------    
    public void insertEkdoti(Ekdotis ekdotis) {

        try {
            String sql = "INSERT INTO sistima_vivliothikis_ergasia.ekdotes (onoma_ekdoti) VALUES (?)";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, ekdotis.getName());
                ps.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println(e + "     EkdotesDAO.insertEkdoti()");
        }
    }

    //----------------------------------------------------------------------------------
    public ArrayList<Ekdotis> findAll() {

        ArrayList allPublishers = new ArrayList();
        Ekdotis ekdotis;
        try {
            String sql = "SELECT * FROM sistima_vivliothikis_ergasia.ekdotes ORDER BY onoma_ekdoti";
            try (Statement s = con.createStatement();
                    ResultSet rs = s.executeQuery(sql);) {

                while (rs.next()) {
                    ekdotis = new Ekdotis();

                    ekdotis.setId(Integer.parseInt(rs.getString("id_ekdoti")));
                    ekdotis.setName(rs.getString("onoma_ekdoti"));

                    allPublishers.add(ekdotis);
                }
            }

        } catch (NumberFormatException | SQLException e) {
            System.out.println(e + "       EkdotesDAO.findAll()");
        }
        return allPublishers;
    }

    //----------------------------------------------------------------------------------   
    public ArrayList<Vivlio> anaktisiVivliwnEkdoti(int idEkdoti) {

        try {
            pStat = con.prepareStatement(ANAKTISI_VIVLIWN_EKDOTI);
            pStat.setInt(1, idEkdoti);

            rs = pStat.executeQuery();

            ArrayList<Vivlio> vivliaEkdoti = new ArrayList<>();
            Vivlio tempVivlio;

            while (rs.next()) {

                tempVivlio = new Vivlio();

                tempVivlio.setIsbn(rs.getString("isbn_vivliou"));
                tempVivlio.setTitlos(rs.getString("titlos_vivliou"));
                tempVivlio.setUrl_exwfilou_vivliou(rs.getString("url_exwfilou_vivliou"));
                tempVivlio.setPerigrafi_vivliou(rs.getString("perigrafi_vivliou"));
                tempVivlio.setId_ekdoti(rs.getInt("ekdotes_id_ekdoti"));

                vivliaEkdoti.add(tempVivlio);

            }//while.

            return vivliaEkdoti;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            while ((ex = ex.getNextException()) != null) {
                System.err.println(ex.getSQLState() + " - " + ex.getErrorCode());
            }//while
        } finally {
            try {
                if (!rs.isClosed()) {
                    rs.close();
                }
                if (!pStat.isClosed()) {
                    pStat.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
                while ((ex = ex.getNextException()) != null) {
                    System.err.println(ex.getSQLState() + " - " + ex.getErrorCode());
                }//while
            }
        }//finally.
        return null;
    }//anaktisiVivliwnEkdoti.

    //--------------------------------------------------------------------------------
    public boolean diagrafiEkdoti(int idEkdoti) {
        try {
            pStat = con.prepareStatement(DIAGRAFI_EKDOTI);
            pStat.setInt(1, idEkdoti);

            int res = pStat.executeUpdate();

            return res == 1;

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            while ((ex = ex.getNextException()) != null) {
                System.err.println(ex.getSQLState() + " - " + ex.getErrorCode());
            }//while
        } finally {
            try {
                if (!pStat.isClosed()) {
                    pStat.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
                while ((ex = ex.getNextException()) != null) {
                    System.err.println(ex.getSQLState() + " - " + ex.getErrorCode());
                }//while
            }
        }//finally.

        return false;
    }//diagrafiEkdoti.

    //-----------------------------------------------------------------------------------
    public boolean enimerwsiEkdoti(int idEkdoti, String onomaEkdoti) {
        try {

            pStat = con.prepareStatement(ENIMERWSI_EKDOTI);
            pStat.setString(1, onomaEkdoti);
            pStat.setInt(2, idEkdoti);

            int res = pStat.executeUpdate();

            return res == 1;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            while ((ex = ex.getNextException()) != null) {
                System.err.println(ex.getSQLState() + " - " + ex.getErrorCode());
            }//while
        } finally {
            try {
                if (!pStat.isClosed()) {
                    pStat.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
                while ((ex = ex.getNextException()) != null) {
                    System.err.println(ex.getSQLState() + " - " + ex.getErrorCode());
                }//while
            }
        }
        return false;
    }//enimerwsiEkdoti.

//-----------------------------------------------------------------------------------    
    public Ekdotis searchEkdotiByName(String name) {

        Ekdotis ekdotis = new Ekdotis();
        try {
            pStat = con.prepareStatement(ANAKTISI_ID_EKDOTI_QUERY);
            pStat.setString(1, name);
            rs = pStat.executeQuery();

            if (rs.first()) {
                ekdotis.setId(rs.getInt("id_ekdoti"));
                ekdotis.setName(rs.getString("onoma_eksoti"));
                                
                rs.close();
                return ekdotis;
            } else {
                rs.close();
                return null;
            }            

        } catch (NumberFormatException | SQLException e) {
            System.out.println(e + "     EkdotesDAO.searchEkdotiByName()");
        }
        return null;
    }
//----------------------------------------------------------------------------------    

}//EkdotesDAO.
