package database.daos;

import database.models.Ekdotis;
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
public class EkdotesDAO {

    private final Connection con;

    public EkdotesDAO(Connection conn) {
        this.con = conn;
    }

    //----------------------------------------------------------------------------------    
    public void insertEkdoti(Ekdotis ekdotis) {

        try {
            String sql = "INSERT INTO sistima_vivliothikis_ergasia.ekdotes (onoma_ekdoti) VALUES (?)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, ekdotis.getName());

            ps.executeUpdate();
            ps.close();
            con.close();
        } catch (SQLException e) {
            System.out.println(e + "     EkdotesDAO.insertEkdoti()");
        }
    }
//----------------------------------------------------------------------------------

    public ArrayList<Ekdotis> findAll() {

        ArrayList allPublishers = new ArrayList();
        Ekdotis ekdotis;
        try {
            String sql = "SELECT * FROM sistima_vivliothikis_ergasia.eksotes ORDER BY onoma_ekdoti";
            Statement s = con.createStatement();
            ResultSet rs = s.executeQuery(sql);

            while (rs.next()) {
                ekdotis = new Ekdotis();

                ekdotis.setId(Integer.parseInt(rs.getString("id_ekdoti")));
                ekdotis.setName(rs.getString("onoma_ekdoti"));

                allPublishers.add(ekdotis);
            }
            s.close();
            rs.close();
            con.close();
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e + "       EkdotesDAO.findAll()");
        }

        return allPublishers;
    }
//----------------------------------------------------------------------------------   
}//EkdotesDAO.
