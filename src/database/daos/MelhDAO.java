package database.daos;

import database.models.Antitypo;
import database.models.Melos;
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
public class MelhDAO {

    private final Connection con;
    private PreparedStatement pStat;
    private ResultSet rs;
    private static final String ANAKTISI_DANEISMENWN_ANTITYPWN_QUERY = "SELECT * FROM antitypa WHERE am_daneismenou_melous = ?";
    private static final String DIAGRAFI_MELOUS_QUERY = "DELETE * FROM melh WHERE am_melous = ?";

    public MelhDAO(Connection conn) {
        this.con = conn;
    }
    //----------------------------------------------------------------------------------    

    public void insertMelos(Melos melos) {

        try {
            String sql = "INSERT INTO sistima_vivliothikis_ergasia.melh (am_melous, onoma_melous, epitheto_melous, email_melous, pass_melous) VALUES (?,?,?,?,?)";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setString(1, String.valueOf(melos.getAm()));
                ps.setString(2, melos.getOnoma());
                ps.setString(3, melos.getEpitheto());
                ps.setString(4, melos.getEmail());
                ps.setString(5, melos.getPass());

                ps.executeUpdate();
            }
        } catch (SQLException e) {
            System.out.println(e + "     MelhDAO.insertMelos()");
        }

    }
    //----------------------------------------------------------------------------------    

    public Melos searchMelosByAm(int am) {

        Melos melos = new Melos();
        try {
            String sql = "SELECT * FROM sistima_vivliothikis_ergasia.melh WHERE am_melous LIKE '" + am + "'";
            try (Statement s = con.createStatement()) {
                ResultSet rs = s.executeQuery(sql);

                if (rs.first()) {
                    melos.setAm(Integer.parseInt(rs.getString("am_melous")));
                    melos.setOnoma(rs.getString("onoma_melous"));
                    melos.setEpitheto(rs.getString("epitheto_melous"));
                    melos.setEmail(rs.getString("email_melous"));
                    melos.setPass(rs.getString("pass_melous"));
                    rs.close();
                    return melos;
                } else {
                    rs.close();
                    return null;
                }
            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e + "     MelhDAO.searchMelosByAM()");
        }

        return null;
    }
    //----------------------------------------------------------------------------------    

    public Melos searchMelosByEpitheto(String epitheto) {

        Melos melos = new Melos();
        try {
            String sql = "SELECT * FROM sistima_vivliothikis_ergasia.melh WHERE epitheto_melous LIKE '" + epitheto + "'";
            try (Statement s = con.createStatement()) {
                ResultSet rs = s.executeQuery(sql);

                if (rs.first()) {
                    melos.setAm(Integer.parseInt(rs.getString("am_melous")));
                    melos.setOnoma(rs.getString("onoma_melous"));
                    melos.setEpitheto(rs.getString("epitheto_melous"));
                    melos.setEmail(rs.getString("email_melous"));
                    melos.setPass(rs.getString("pass_melous"));
                    rs.close();
                    return melos;
                } else {
                    rs.close();
                    return null;
                }
            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e + "     MelhDAO.searchMelosByEpitheto()");
        }
        return null;
    }
    //----------------------------------------------------------------------------------    

    public ArrayList<Melos> findAll() {

        ArrayList allMembers = new ArrayList();
        Melos melos;
        try {
            String sql = "SELECT * FROM sistima_vivliothikis_ergasia.melh ORDER BY epitheto_melous";
            try (Statement s = con.createStatement()) {
                ResultSet rs = s.executeQuery(sql);

                while (rs.next()) {
                    melos = new Melos();

                    melos.setAm(Integer.parseInt(rs.getString("am_melous")));
                    melos.setOnoma(rs.getString("onoma_melous"));
                    melos.setEpitheto(rs.getString("epitheto_melous"));
                    melos.setEmail(rs.getString("email_melous"));
                    melos.setPass(rs.getString("pass_melous"));

                    allMembers.add(melos);
                }
            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e + "       MelhDAO.findAll()");
        }

        return allMembers;
    }
    //----------------------------------------------------------------------------------        

    public ArrayList<Antitypo> anaktisiDaneismenwnAntitypwn(int am) {

        try {

            pStat = con.prepareStatement(ANAKTISI_DANEISMENWN_ANTITYPWN_QUERY);
            pStat.setInt(1, am);
            rs = pStat.executeQuery();

            Antitypo ant;
            ArrayList<Antitypo> antitypa = new ArrayList<>();

            while (rs.next()) {

                ant = new Antitypo();

                ant.setIsbnVivliou(rs.getString("vivlia_isbn_vivliou"));
                ant.setIdAntitypou(rs.getInt("id_antitypou"));
                ant.setKatastasiAntitypou(rs.getString("katastasi_antitypou"));
                ant.setAm_daneismenou_melous(rs.getInt("am_daneismenou_melous"));
                ant.setHmnia_daneismou(rs.getDate("hmnia_daneismou"));

                antitypa.add(ant);

            }//while.

            return antitypa;

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            while ((ex = ex.getNextException()) != null) {
                System.err.println(ex.getSQLState() + "  -  " + ex.getErrorCode());
            }
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
                    System.err.println(ex.getSQLState() + "  -  " + ex.getErrorCode());
                }
            }

        }//finally.

        return null;
    }//anaktisiDaneismenwnAntitypwn.

    //---------------------------------------------------------------------------------
    //---------------------------------------------------------------------------------
    public boolean diagrafiMelous(int am) {

        try {
            pStat = con.prepareStatement(DIAGRAFI_MELOUS_QUERY);
            pStat.setInt(1, am);

            int res = pStat.executeUpdate();

            return res == 1;

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            while ((ex = ex.getNextException()) != null) {
                System.err.println(ex.getSQLState() + "  -  " + ex.getErrorCode());
            }//while.
        } finally {
            try {
                if (!pStat.isClosed()) {
                    pStat.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
                while ((ex = ex.getNextException()) != null) {
                    System.err.println(ex.getSQLState() + "  -  " + ex.getErrorCode());
                }
            }

        }

        return false;
    }//diagrafiMelous.

    /*    
     public static void main(String[] args)
     {
     Melos m = new Melos();
     m.setAm(1);m.setOnoma("akis"); m.setEpitheto("akissss"); m.setEmail("@hotmail.com"); m.setPass("12345");
    
     MelhDAO dao = new MelhDAO();
     dao.insertMelos(m);
     }
     */
}//MelhDAO.
