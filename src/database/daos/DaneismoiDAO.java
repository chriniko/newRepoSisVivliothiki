package database.daos;

import database.models.Antitypo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DaneismoiDAO {

    private final Connection conn;
    private PreparedStatement pStat;
    private ResultSet rs;

    public DaneismoiDAO(Connection conn) {
        this.conn = conn;
    }//ctor.

    //===============================================================
    private static final String EURESI_ANTITYPOU = "SELECT * FROM antitypa WHERE vivlia_isbn_vivliou = ? AND id_antitypou = ?";

    public Antitypo euresiAntitypou(String isbn, int idAntitypou) {
        Antitypo result = null;
        try {
            pStat = conn.prepareStatement(EURESI_ANTITYPOU);
            pStat.setString(1, isbn);
            pStat.setInt(2, idAntitypou);

            rs = pStat.executeQuery();
            if (rs.first()) {

                result = new Antitypo();
                result.setIsbnVivliou(rs.getString("vivlia_isbn_vivliou"));
                result.setIdAntitypou(rs.getInt("id_antitypou"));
                result.setKatastasiAntitypou(rs.getString("katastasi_antitypou"));
                result.setAm_daneismenou_melous(rs.getInt("am_daneismenou_melous"));
                result.setHmnia_daneismou(rs.getDate("hmnia_daneismou"));

            }//if.

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
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
            }
        }
        return result;
    }//euresiAntitypou.
    //===============================================================

    private static final String EINAI_TO_ANTITYPO_DIATHESIMO = "SELECT * FROM antitypa WHERE vivlia_isbn_vivliou = ? AND id_antitypou = ? AND"
            + "  am_daneismenou_melous IS NULL";//ama to am_daneismenou_melous einai NULL tote shmainei oti to vivlio einai diathesimo.....

    public boolean einaiToAntitypoDiathesimoGiaDaneismo(String isbn, int idAntitypou) {
        boolean result = false;
        try {
            pStat = conn.prepareStatement(EINAI_TO_ANTITYPO_DIATHESIMO);
            pStat.setString(1, isbn);
            pStat.setInt(2, idAntitypou);

            rs = pStat.executeQuery();

            if (rs.first()) {
                result = true;
            }
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        } finally {
            try {
                if (!rs.isClosed()) {
                    rs.close();
                }
                if (!pStat.isClosed()) {
                    pStat.close();
                }
            } catch (SQLException ex) {

            }
        }
        return result;
    }//einaiToAntitypoDaneismeno.
    //===============================================================

    private static final String KANE_DANEISMO_ANTITYPOU = "UPDATE antitypa SET am_daneismenou_melous = ?, hmnia_daneismou = curdate() "
            + "WHERE vivlia_isbn_vivliou = ? AND id_antitypou = ?";

    public boolean kaneDaneismoAntitypou(String isbn, int id_antitypou, int am_melous) {
        boolean result = false;
        try {
            pStat = conn.prepareStatement(KANE_DANEISMO_ANTITYPOU);
            pStat.setInt(1, am_melous);
            pStat.setString(2, isbn);
            pStat.setInt(3, id_antitypou);

            int res = pStat.executeUpdate();
            result = (res == 1);

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        } finally {
            try {
                if (!pStat.isClosed()) {
                    pStat.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
        return result;
    }//kaneDaneismoAntitypou.

    //================================================================
    private static final String EPISTROFI_ANTITYPOU = "UPDATE antitypa SET am_daneismenou_melous = NULL, hmnia_daneismou = NULL"
            + " WHERE vivlia_isbn_vivliou = ? AND id_antitypou = ? AND am_daneismenou_melous = ?";

    public boolean epistrofiDaneismenouAntitypou(String isbn, int idAntitypou, int am_melous) {
        boolean result = false;
        try {

            pStat = conn.prepareStatement(EPISTROFI_ANTITYPOU);
            pStat.setString(1, isbn);
            pStat.setInt(2, idAntitypou);
            pStat.setInt(3, am_melous);

            int count = pStat.executeUpdate();

            result = (count == 1);

        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
        } finally {
            try {
                if (!pStat.isClosed()) {
                    pStat.close();
                }//if.
            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
            }
        }
        return result;
    }//epistrofiDaneismenouAntitypou.

    //================================================================
}//DaneismoiDAO.
