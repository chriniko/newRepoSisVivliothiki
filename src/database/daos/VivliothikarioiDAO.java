package database.daos;

import database.models.Vivliothikarios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author nikos
 */
public class VivliothikarioiDAO {

    private final Connection conn;
    private static final String EGYROS_QUERY = "SELECT * FROM vivliothikarioi WHERE am_vivliothikariou = ? AND pass_vivliothikariou = ?";
    private PreparedStatement pStat;
    private ResultSet rs;

    public VivliothikarioiDAO(Connection conn) {
        this.conn = conn;
    }//ctor.

    public Vivliothikarios egyrosVivliothikarios(Vivliothikarios input) {

        try {
            pStat = conn.prepareStatement(EGYROS_QUERY);

            pStat.setInt(1, input.getAm());
            pStat.setString(2, input.getPassword());

            rs = pStat.executeQuery();

            if (rs.first()) {

                input.setAm(rs.getInt("am_vivliothikariou"));
                input.setPassword(rs.getString("pass_vivliothikariou"));
                input.setOnoma(rs.getString("onoma_vivliothikariou"));
                input.setEpitheto(rs.getString("epitheto_vivliothikariou"));

                return input;
            } else {
                return null;
            }

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            while ((ex = ex.getNextException()) != null) {
                System.err.println(ex.getSQLState() + "  -  " + ex.getErrorCode());
            }
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
                    System.err.println(ex.getSQLState() + "  -  " + ex.getErrorCode());
                }
            }
        }
        return null;
    }//egyrosVivliothikarios.

}//VivliothikarioiDAO.
