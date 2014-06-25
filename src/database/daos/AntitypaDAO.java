package database.daos;

import database.models.Antitypo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author nikos
 */
public class AntitypaDAO {

    private PreparedStatement pStat;
    private ResultSet rs;
    private final Connection conn;
    private static final String ANAKTISI_ANTITYPWN_VIVLIOU = "SELECT * FROM antitypa WHERE vivlia_isbn_vivliou = ?";

    public AntitypaDAO(Connection conn) {
        this.conn = conn;
    }//ctor.

    public ArrayList<Antitypo> anaktisiAntitypwnVivliou(String isbnVivliou) {
        try {

            pStat = conn.prepareStatement(ANAKTISI_ANTITYPWN_VIVLIOU);
            pStat.setString(1, isbnVivliou);

            rs = pStat.executeQuery();

            ArrayList<Antitypo> antitypa = new ArrayList<>();
            Antitypo temp;

            while (rs.next()) {

                temp = new Antitypo();
                temp.setIsbnVivliou(rs.getString("vivlia_isbn_vivliou"));
                temp.setIdAntitypou(rs.getInt("id_antitypou"));
                temp.setKatastasiAntitypou(rs.getString("katastasi_antitypou"));
                temp.setAm_daneismenou_melous(rs.getInt("am_daneismenou_melous"));
                temp.setHmnia_daneismou(rs.getDate("hmnia_daneismou"));

                antitypa.add(temp);
            }//while.

            return antitypa;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage() + " === " + ex.getSQLState() + " === " + ex.getErrorCode());
        } finally {

            try {
                if (!rs.isClosed()) {
                    rs.close();
                }
                if (!pStat.isClosed()) {
                    pStat.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage() + " === " + ex.getSQLState() + " === " + ex.getErrorCode());
            }

        }
        return null;
    }//anaktisiAntitypwnVivliou.

    public ArrayList<Antitypo> anaktisiDiathesimwnAntitypwnVivliou(String isbnVivliou) {
        //TODO add code...
        return null;
    }//anaktisiDiathesimwnAntitypwnVivliou.

    public ArrayList<Antitypo> anaktisiDaneismenwnAntitypwnVivliou(String isbnVivliou) {
        //TODO add code...
        return null;
    }//anaktisiDaneismenwnAntitypwnVivliou.

    public ArrayList<Antitypo> anaktisiAntitypwnMelous(int am_melous) {
        //TODO add code...
        return null;
    }//anaktisiAntitypwnMelous.

}//AntitypaDAO.
