package database.daos;

import database.models.Antitypo;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

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

                java.sql.Date tempDate = rs.getDate("hmnia_daneismou");
                temp.setHmnia_daneismou(tempDate);

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

    //========================================================================================================
    private static final String DIAGRAFI_ANTITYPOU = "DELETE FROM antitypa WHERE vivlia_isbn_vivliou=? AND id_antitypou = ?";

    public boolean diagrafiAntitypou(String isbn, int id) {
        boolean res = false;
        try {
            pStat = conn.prepareStatement(DIAGRAFI_ANTITYPOU);
            pStat.setString(1, isbn);
            pStat.setInt(2, id);

            int count = pStat.executeUpdate();

            res = (count == 1);
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
        return res;
    }//diagrafiAntitypou.

    private static final String EISAGWGI_NEOU_ANTITYPOU = "INSERT INTO antitypa(vivlia_isbn_vivliou, id_antitypou, katastasi_antitypou) VALUES(?, ?, ?)";

    public boolean eisagwgiNeouAntitypou(Antitypo neoAntitypo) {
        boolean res = false;
        try {
            pStat = conn.prepareStatement(EISAGWGI_NEOU_ANTITYPOU);
            pStat.setString(1, neoAntitypo.getIsbnVivliou());
            pStat.setInt(2, neoAntitypo.getIdAntitypou());
            pStat.setString(3, neoAntitypo.getKatastasiAntitypou());

            int count = pStat.executeUpdate();
            res = (count == 1);
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
        return res;
    }//eisagwgiNeouAntitypou.

    private static final String ENIMERWSI_ANTITYPOU = "UPDATE antitypa SET katastasi_antitypou = ? WHERE vivlia_isbn_vivliou = ? AND id_antitypou = ?";

    public boolean enimerwsiAntitypou(Antitypo input) {//to mono pou epistrepetai na enimerwthei einai h katastasi antitypou....
        boolean res = false;
        try {
            pStat = conn.prepareStatement(ENIMERWSI_ANTITYPOU);
            pStat.setString(1, input.getKatastasiAntitypou());
            pStat.setString(2, input.getIsbnVivliou());
            pStat.setInt(3, input.getIdAntitypou());

            int count = pStat.executeUpdate();
            res = (count == 1);
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

        return res;
    }//enimerwsiAntitypou.

    //============================================================================================================
    private static final String ANAKTISI_ANTITYPOU = "SELECT * FROM antitypa WHERE vivlia_isbn_vivliou=? AND id_antitypou=?";

    public Antitypo anaktisiAntitypou(String isbn, int id) {
        Antitypo result = null;

        try {

            pStat = conn.prepareStatement(ANAKTISI_ANTITYPOU);
            pStat.setString(1, isbn);
            pStat.setInt(2, id);

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
    }//anaktisiAntitypou.

}//AntitypaDAO.
