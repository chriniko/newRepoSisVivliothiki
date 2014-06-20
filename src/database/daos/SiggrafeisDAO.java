package database.daos;

import database.models.Siggrafeas;
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
public class SiggrafeisDAO {

    private final Connection con;

    public SiggrafeisDAO(Connection con) {
        this.con = con;
    }//ctor.

//----------------------------------------------------------------------------------    
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
//----------------------------------------------------------------------------------    

    public ArrayList<Siggrafeas> findAll() {

        ArrayList allWriters = new ArrayList();
        Siggrafeas siggrafeas;
        try {
            String sql = "SELECT * FROM sistima_vivliothikis_ergasia.siggrafeis ORDER BY epitheto_siggrafea";
            try (Statement s = con.createStatement();
                    ResultSet rs = s.executeQuery(sql);) {

                while (rs.next()) {
                    siggrafeas = new Siggrafeas();

                    siggrafeas.setId(Integer.parseInt(rs.getString("id_siggrafea")));
                    siggrafeas.setOnoma(rs.getString("onoma_siggrafea"));
                    siggrafeas.setEpitheto(rs.getString("epitheto_siggrafea"));

                    allWriters.add(siggrafeas);
                }
            }

        } catch (SQLException | NumberFormatException e) {
            System.out.println(e + "       SiggrafeisDAO.findAll()");
        }

        return allWriters;
    }
//----------------------------------------------------------------------------------

}//SIggrafeisDAO.
