package database.daos;

import database.models.Melos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author nikos
 */
public class MelhDAO {

    private final Connection con;

    public MelhDAO(Connection conn) {
        this.con = conn;
    }
//----------------------------------------------------------------------------------    

    public void insertMelos(Melos melos) {

        try {
            String sql = "INSERT INTO sistima_vivliothikis_ergasia.melh (am_melous, onoma_melous, epitheto_melous, email_melous, pass_melous) VALUES (?,?,?,?,?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, String.valueOf(melos.getAm()));
            ps.setString(2, melos.getOnoma());
            ps.setString(3, melos.getEpitheto());
            ps.setString(4, melos.getEmail());
            ps.setString(5, melos.getPass());

            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e + "     MelhDAO.insertMelos()");
        }

    }
//----------------------------------------------------------------------------------    

    public Melos searchMelosByAm(int am) {

        Melos melos = new Melos();
        try {
            String sql = "SELECT * FROM sistima_vivliothikis_ergasia.melh WHERE am_melous LIKE '" + am + "'";
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                melos.setAm(Integer.parseInt(rs.getString("am_melous")));
                melos.setOnoma(rs.getString("onoma_melous"));
                melos.setEpitheto(rs.getString("epitheto_melous"));
                melos.setEmail(rs.getString("email_melous"));
                melos.setPass(rs.getString("pass_melous"));
            }

            s.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e + "     MelhDAO.searchMelosByAM()");
        }

        return melos;
    }
//----------------------------------------------------------------------------------    

    public Melos searchMelosByEpitheto(String epitheto) {

        Melos melos = new Melos();
        try {
            String sql = "SELECT * FROM sistima_vivliothikis_ergasia.melh WHERE epitheto_melous LIKE '" + epitheto + "'";
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                melos.setAm(Integer.parseInt(rs.getString("am_melous")));
                melos.setOnoma(rs.getString("onoma_melous"));
                melos.setEpitheto(rs.getString("epitheto_melous"));
                melos.setEmail(rs.getString("email_melous"));
                melos.setPass(rs.getString("pass_melous"));
            }
            s.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e + "     MelhDAO.searchMelosByEpitheto()");
        }
        return melos;
    }
//----------------------------------------------------------------------------------    

    public ArrayList<Melos> findAll() {

        ArrayList allMembers = new ArrayList();
        Melos melos;
        try {
            String sql = "SELECT * FROM sistima_vivliothikis_ergasia.melh ORDER BY epitheto_melous";
            Statement s = con.createStatement();
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
            s.close();
            con.close();
        } catch (Exception e) {
            System.out.println(e + "       MelhDAO.findAll()");
        }

        return allMembers;
    }
//----------------------------------------------------------------------------------        

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
