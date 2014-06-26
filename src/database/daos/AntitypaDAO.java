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
    //=======================================================================================================
    private static final String ANAKTISI_ANTITYPWN_VIVLIOU = "SELECT * FROM antitypa WHERE vivlia_isbn_vivliou = ? ORDER BY 1,2,3 ASC";
    private static final String ANAKTISI_DIATHESIMWN_ANT_VIVLIOU = "SELECT * FROM antitypa WHERE am_daneismenou_melous IS NULL AND vivlia_isbn_vivliou = ? "
            + "ORDER BY 1,2,3 ASC";
    private static final String ANAKTISI_MI_DIATHESIMWN_ANT_VIVLIOU = "SELECT * FROM antitypa WHERE am_daneismenou_melous IS NOT NULL AND vivlia_isbn_vivliou = ? "
            + "ORDER BY 1,2,3 ASC";
    //=======================================================================================================
    private static final String ANAKTISI_PLITHOUS_ANTITYPWN_VIVLIOU = "SELECT COUNT(*) FROM antitypa WHERE vivlia_isbn_vivliou = ?";
    private static final String ANAKTISI_PLITHOUS_DIATHESIMWN_ANT_VIVLIOU = "SELECT COUNT(*) FROM antitypa WHERE am_daneismenou_melous IS NULL AND vivlia_isbn_vivliou = ? ";
    private static final String ANAKTISI_PLITHOUS_MI_DIATHESIMWN_ANT_VIVLIOU = "SELECT COUNT(*) FROM antitypa WHERE am_daneismenou_melous IS NOT NULL AND vivlia_isbn_vivliou = ? ";
    //=======================================================================================================
    private static final String ANAKTISI_DANEISMENWN_ANTITYPWN_MELOUS = "SELECT * FROM antitypa WHERE am_daneismenou_melous = ? ORDER BY 1,2,3 ASC";
    //=======================================================================================================

    public AntitypaDAO(Connection conn) {
        this.conn = conn;
    }//ctor.

    //========================================================================================================
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
        try {

            pStat = conn.prepareStatement(ANAKTISI_DIATHESIMWN_ANT_VIVLIOU);
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
                System.err.println(ex.getMessage());
            }
        }
        return null;
    }//anaktisiDiathesimwnAntitypwnVivliou.

    public ArrayList<Antitypo> anaktisiDaneismenwnAntitypwnVivliou(String isbnVivliou) {
        try {

            pStat = conn.prepareStatement(ANAKTISI_MI_DIATHESIMWN_ANT_VIVLIOU);
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
                System.err.println(ex.getMessage());
            }
        }
        return null;
    }//anaktisiDaneismenwnAntitypwnVivliou.

    //==========================================================================================================
    public int anaktisiPlithousAntitypwnVivliou(String isbn) {
        int res = 0;
        try {
            pStat = conn.prepareStatement(ANAKTISI_PLITHOUS_ANTITYPWN_VIVLIOU);
            pStat.setString(1, isbn);

            rs = pStat.executeQuery();
            rs.first();
            res = rs.getInt(1);

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
                System.err.println(ex.getMessage());
            }
        }
        return res;
    }//anaktisiPlithousAntitypwnVivliou.

    public int anaktisiPlithousDiathesimwnAntitypwnVivliou(String isbn) {
        int res = 0;
        try {
            pStat = conn.prepareStatement(ANAKTISI_PLITHOUS_DIATHESIMWN_ANT_VIVLIOU);
            pStat.setString(1, isbn);

            rs = pStat.executeQuery();
            rs.first();
            res = rs.getInt(1);

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
                System.err.println(ex.getMessage());
            }
        }
        return res;
    }//anaktisiPlithousDiathesimwnAntitypwnVivliou.

    public int anaktisiPlithousMiDiathesimwnAntitypwnVivliou(String isbn) {
        int res = 0;
        try {
            pStat = conn.prepareStatement(ANAKTISI_PLITHOUS_MI_DIATHESIMWN_ANT_VIVLIOU);
            pStat.setString(1, isbn);

            rs = pStat.executeQuery();
            rs.first();
            res = rs.getInt(1);

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
                System.err.println(ex.getMessage());
            }
        }
        return res;
    }//anaktisiPlithousMiDiathesimwnAntitypwnVivliou.

    //========================================================================================================
    public ArrayList<Antitypo> anaktisiAntitypwnMelousPouExeiDaneistei(int am_melous) {
        try {

            pStat = conn.prepareStatement(ANAKTISI_DANEISMENWN_ANTITYPWN_MELOUS);
            pStat.setInt(1, am_melous);

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
                System.err.println(ex.getMessage());
            }
        }
        return null;
    }//anaktisiAntitypwnMelous.

}//AntitypaDAO.
