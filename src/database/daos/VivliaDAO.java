package database.daos;

import database.models.Siggrafeas;
import database.models.Vivlio;
import database.models.VivlioHasSiggrafeis;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import utils.Utils;

/**
 *
 * @author nikos
 */
@SuppressWarnings("ThrowableResultIgnored")
public class VivliaDAO {

    private final Connection con;
    private PreparedStatement pStat;
    private ResultSet rs;

    private static final String EISAGWGI_VIVLIOU = "INSERT INTO sistima_vivliothikis_ergasia.vivlia (isbn_vivliou, titlos_vivliou, url_exwfilou_vivliou, perigrafi_vivliou, ekdotes_id_ekdoti) VALUES (?,?,?,?,?)";
    private static final String EISAGWGI_SIGGRAFEIS_VIVLIOU = "INSERT INTO sistima_vivliothikis_ergasia.vivlia_has_siggrafeis (vivlia_isbn_vivliou, siggrafeis_id_siggrafea) VALUES (?,?)";
    private static final String SEARCH_VIVLIO_BY_ISBN = "SELECT * FROM sistima_vivliothikis_ergasia.vivlia WHERE isbn_vivliou = ?";
    private static final String SEARCH_VIVLIO_BY_TITLO = "SELECT * FROM sistima_vivliothikis_ergasia.vivlia WHERE titlos_vivliou = ?";
    private static final String ANAKTISI_SIGGRAFEIS_VIVLIOU = "SELECT id_siggrafea, onoma_siggrafea, epitheto_siggrafea"
            + " FROM siggrafeis, vivlia_has_siggrafeis WHERE id_siggrafea = siggrafeis_id_siggrafea AND vivlia_isbn_vivliou = ?";
    private static final String ANAKTISI_VIVLIWN = "SELECT * FROM sistima_vivliothikis_ergasia.vivlia ORDER BY 2";

    //=======================QUERIES GIA DIAGRAFI VIVLIOU========================================
    private static final String DIAGRAFI_VIVLIOU_QUERY_NO_1 = "DELETE FROM vivlia_has_siggrafeis WHERE vivlia_isbn_vivliou = ?";
    private static final String DIAGRAFI_VIVLIOU_QUERY_NO_2 = "DELETE FROM vivlia WHERE isbn_vivliou = ?";
    //==================================================================================

    //=======================QUERIES GIA ENIMERWSI VIVLIOU=======================================
    private static final String ENIMERWSI_VIVLIOU_QUERY_NO_1 = "DELETE FROM vivlia_has_siggrafeis WHERE vivlia_isbn_vivliou = ?";
    private static final String ENIMERWSI_VIVLIOU_QUERY_NO_2 = "UPDATE vivlia SET titlos_vivliou = ?, url_exwfilou_vivliou = ?, perigrafi_vivliou = ?, ekdotes_id_ekdoti = ? WHERE isbn_vivliou = ?";
    private static final String ENIMERWSI_VIVLIOU_QUERY_NO_3 = "INSERT INTO vivlia_has_siggrafeis(vivlia_isbn_vivliou,siggrafeis_id_siggrafea) VALUES(?, ?)";
    //=================================================================================

    public VivliaDAO(Connection con) {
        this.con = con;
    }//ctor.

    //----------------------------------------------------------------------------------
    public boolean enimerwsiVivliou(Vivlio updatedBook) {
        try {

            //prwta ekteloume to prwto query....
            pStat = con.prepareStatement(ENIMERWSI_VIVLIOU_QUERY_NO_1);
            pStat.setString(1, updatedBook.getIsbn());
            int result_1 = pStat.executeUpdate();

            //meta ekteloume to deutero query....
            pStat = con.prepareStatement(ENIMERWSI_VIVLIOU_QUERY_NO_2);
            pStat.setString(1, updatedBook.getTitlos());
            pStat.setString(2, updatedBook.getUrl_exwfilou_vivliou());
            pStat.setString(3, updatedBook.getPerigrafi_vivliou());
            pStat.setInt(4, updatedBook.getId_ekdoti());
            pStat.setString(5, updatedBook.getIsbn());
            int result_2 = pStat.executeUpdate();

            //telos ekteloume to trito query gia kathe siggrafea....
            pStat = con.prepareStatement(ENIMERWSI_VIVLIOU_QUERY_NO_3);

            int result_3[] = new int[updatedBook.getSiggrafeis().size()];
            int idx = 0;

            for (VivlioHasSiggrafeis temp : updatedBook.getSiggrafeis()) {
                pStat.setString(1, temp.getIsbnVivliou());
                pStat.setInt(1, temp.getIdSiggrafea());
                result_3[idx++] = pStat.executeUpdate();
            }//for.

            int res3 = Utils.findSum(result_3);

            return result_1 >= 1 && result_2 == 1 && res3 == updatedBook.getSiggrafeis().size();

        } catch (SQLException ex) {
            System.err.println(ex.getMessage() + " === " + ex.getSQLState() + " === " + ex.getErrorCode());
        } finally {
            try {
                if (!pStat.isClosed()) {
                    pStat.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage() + " === " + ex.getSQLState() + " === " + ex.getErrorCode());
            }
        }
        return false;
    }//enimerwsiVivliou.

//----------------------------------------------------------------------------------    
    public ArrayList<Vivlio> findAll() {

        ArrayList allBooks = new ArrayList();
        Vivlio book;
        try (Statement s = con.createStatement()) {
            pStat = con.prepareStatement(ANAKTISI_VIVLIWN);
            rs = pStat.executeQuery();

            while (rs.next()) {
                book = new Vivlio();

                book.setIsbn(rs.getString("isbn_vivliou"));
                book.setTitlos(rs.getString("titlos_vivliou"));
                book.setId_ekdoti(rs.getInt("ekdotes_id_ekdoti"));
                book.setPerigrafi_vivliou(rs.getString("perigrafi_vivliou"));
                book.setUrl_exwfilou_vivliou(rs.getString("url_exwfilou_vivliou"));

                allBooks.add(book);
            }
        } catch (NumberFormatException | SQLException e) {
            System.out.println(e + "       VivliaDAO.findAll()");
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
                    System.err.println(ex.getSQLState() + " - " + ex.getErrorCode());
                }//while.
            }
        }

        return allBooks;
    }

//----------------------------------------------------------------------------------
    //WORKS.
    public void insertSuggrafeisVivliou(String isbnVivliou, ArrayList<Siggrafeas> siggrafeis) {

        for (Siggrafeas writer : siggrafeis) {
            try {

                pStat = con.prepareStatement(EISAGWGI_SIGGRAFEIS_VIVLIOU);
                pStat.setString(1, isbnVivliou);
                pStat.setInt(2, writer.getId());
                pStat.executeUpdate();

            } catch (SQLException e) {
                System.out.println(e + "     VivliaDAO.insertSuggrafeisVivliou()");
            }
        }
    }
//----------------------------------------------------------------------------------        

    //WORKS.
    public void insertVivlio(Vivlio book) {

        try {
            pStat = con.prepareStatement(EISAGWGI_VIVLIOU);
            pStat.setString(1, book.getIsbn());
            pStat.setString(2, book.getTitlos());
            pStat.setString(3, book.getUrl_exwfilou_vivliou());
            pStat.setString(4, book.getPerigrafi_vivliou());
            pStat.setInt(5, book.getId_ekdoti());
            pStat.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e + "     VivliaDAO.insertVivlio()");
        } finally {
            try {
                if (!pStat.isClosed()) {
                    pStat.close();
                }

            } catch (SQLException ex) {
                System.err.println(ex.getMessage());
                while ((ex = ex.getNextException()) != null) {
                    System.err.println(ex.getSQLState() + " - " + ex.getErrorCode());
                }//while.
            }
        }//finally.
    }
//----------------------------------------------------------------------------------        

    //WORKS.
    public Vivlio searchVivlioByISBN(String isbn) {

        Vivlio book = new Vivlio();
        try {
            pStat = con.prepareStatement(SEARCH_VIVLIO_BY_ISBN);
            pStat.setString(1, isbn);
            rs = pStat.executeQuery();

            if (rs.first()) {
                book.setIsbn(rs.getString("isbn_vivliou"));
                book.setTitlos(rs.getString("titlos_vivliou"));
                book.setUrl_exwfilou_vivliou(rs.getString("url_exwfilou_vivliou"));
                book.setPerigrafi_vivliou(rs.getString("perigrafi_vivliou"));
                book.setId_ekdoti(rs.getInt("ekdotes_id_ekdoti"));

                rs.close();
                return book;
            } else {
                rs.close();
                return null;
            }

        } catch (NumberFormatException | SQLException e) {
            System.out.println(e + "     VivliaDAO.searchVivlioByISBN()");
        }
        return null;
    }
//----------------------------------------------------------------------------------        

    //WORKS.
    public Vivlio searchVivlioByTitlo(String title) {

        Vivlio book = new Vivlio();
        try {
            pStat = con.prepareStatement(SEARCH_VIVLIO_BY_TITLO);
            pStat.setString(1, title);
            rs = pStat.executeQuery();

            if (rs.first()) {
                book.setIsbn(rs.getString("isbn_vivliou"));
                book.setTitlos(rs.getString("titlos_vivliou"));
                book.setUrl_exwfilou_vivliou(rs.getString("url_exwfilou_vivliou"));
                book.setPerigrafi_vivliou(rs.getString("perigrafi_vivliou"));
                book.setId_ekdoti(rs.getInt("ekdotes_id_ekdoti"));

                rs.close();
                return book;
            } else {
                rs.close();
                return null;
            }

        } catch (NumberFormatException | SQLException e) {
            System.out.println(e + "     VivliaDAO.searchVivlioByTitlo()");
        }
        return null;

    }
//----------------------------------------------------------------------------------            

    //WORKS.
    public ArrayList<Siggrafeas> anaktisiSiggrafeisVivliou(String isbn) {
        try {
            pStat = con.prepareStatement(ANAKTISI_SIGGRAFEIS_VIVLIOU);
            pStat.setString(1, isbn);

            rs = pStat.executeQuery();

            ArrayList<Siggrafeas> writers = new ArrayList<>();
            Siggrafeas temp;

            while (rs.next()) {

                temp = new Siggrafeas();

                temp.setId(rs.getInt("id_siggrafea"));
                temp.setOnoma(rs.getString("onoma_siggrafea"));
                temp.setEpitheto(rs.getString("epitheto_siggrafea"));

                writers.add(temp);

            }//while.

            return writers;
        } catch (SQLException ex) {
            System.err.println(ex.getMessage());
            while ((ex = ex.getNextException()) != null) {
                System.err.println(ex.getSQLState() + " - " + ex.getErrorCode());
            }//while.
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
                    System.err.println(ex.getSQLState() + " - " + ex.getErrorCode());
                }//while.
            }
        }//finally.
        return null;
    }//anaktisiSiggrafeisVivliou.
//----------------------------------------------------------------------------------    

    //WORKS.
    public boolean diagrafiVivliou(String isbn) {
        try {

            //ektelesi tou prwtou query diladi katharisma tis eggrafis tou vivliou pou einai sto juction table: vivlia_has_siggrafeis.
            pStat = con.prepareStatement(DIAGRAFI_VIVLIOU_QUERY_NO_1);
            pStat.setString(1, isbn);

            int result_1 = pStat.executeUpdate();

            //ektelesi tou deuteri query pou diagrafei thn eggrafi tou vivliou ston pinaka: vivlia.
            pStat = con.prepareStatement(DIAGRAFI_VIVLIOU_QUERY_NO_2);
            pStat.setString(1, isbn);

            int result_2 = pStat.executeUpdate();

            return result_1 >= 1 && result_2 >= 1;

        } catch (SQLException ex) {
            System.err.println(ex.getMessage() + " === " + ex.getSQLState() + " === " + ex.getErrorCode());
        } finally {

            try {
                if (!pStat.isClosed()) {
                    pStat.close();
                }
            } catch (SQLException ex) {
                System.err.println(ex.getMessage() + " === " + ex.getSQLState() + " === " + ex.getErrorCode());
            }

        }
        return false;
    }//diagrafiVivliou.
//----------------------------------------------------------------------------------

    /*    
     public static void main(String[] args)
     {
        
     DbConnection con = DbConnection.getInstance(); 
    
     EkdotesDAO edao = new EkdotesDAO(con.getConnection());
     VivliaDAO vdao = new VivliaDAO(con.getConnection());
     
     
     Vivlio v = new Vivlio();
     v.setIsbn("789-456-123"); v.setTitlos("Enterprise JavaBeans 3.1");
     v.setPerigrafi_vivliou("Developing"); v.setUrl_exwfilou_vivliou("C://Users/");
     v.setId_ekdoti(edao.searchEkdotiByName("Kleidarithmos").getId());
     
     vdao.insertVivlio(v);
     
     
     }
    
     */
} //VivliaDAO.
