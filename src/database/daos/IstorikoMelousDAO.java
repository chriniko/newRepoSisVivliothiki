package database.daos;

import database.models.IstorikoMelous;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.LinkedList;

public class IstorikoMelousDAO {

    private final Connection conn;
    private PreparedStatement pStat;
    private ResultSet rs;
    //===============================================================================
    private static final String ANAKTISI_ISTORIKOU_MELOUS = "SELECT * FROM istoriko_melous WHERE melh_am_melous = ?";

    //================================================================================
    public IstorikoMelousDAO(Connection conn) {
        this.conn = conn;
    }//ctor.

    public LinkedList<IstorikoMelous> anaktisiIstorikouMelous(int amMelous) {
        try {
            pStat = conn.prepareStatement(ANAKTISI_ISTORIKOU_MELOUS);
            pStat.setInt(1, amMelous);
            rs = pStat.executeQuery();

            LinkedList<IstorikoMelous> istoriko = new LinkedList<>();
            IstorikoMelous temp;

            while (rs.next()) {

                temp = new IstorikoMelous();

                temp.setIsbnVivliou(rs.getString("antitypa_vivlia_isbn_vivliou"));
                temp.setIdAntitypou(rs.getInt("antitypa_id_antitypou"));
                temp.setAmMelous(rs.getInt("melh_am_melous"));
                temp.setHmniaDaneismou(rs.getDate("hmnia_daneismou"));
                temp.setHmniaEpistrofis(rs.getDate("hmnia_epistrofis"));

                istoriko.add(temp);
            }//while.

            return istoriko;
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
        return null;
    }//anaktisiIstorikouMelous.

    //=================================================================================
    private final String ANAKTISI_ISTORIKOU_GIA_ANTITYPO = "SELECT * FROM istoriko_melous WHERE antitypa_vivlia_isbn_vivliou = ? AND antitypa_id_antitypou = ? ORDER BY 4 ASC";

    public ArrayList<IstorikoMelous> anaktisiIstorikouGiaAntitypo(String isbn, int id) {

        ArrayList<IstorikoMelous> result = new ArrayList<>();

        try {

            pStat = conn.prepareStatement(ANAKTISI_ISTORIKOU_GIA_ANTITYPO);
            pStat.setString(1, isbn);
            pStat.setInt(2, id);

            rs = pStat.executeQuery();

            IstorikoMelous temp;

            while (rs.next()) {

                temp = new IstorikoMelous();

                temp.setIsbnVivliou(rs.getString(1));
                temp.setIdAntitypou(rs.getInt(2));
                temp.setAmMelous(rs.getInt(3));
                temp.setHmniaDaneismou(rs.getDate(4));
                temp.setHmniaEpistrofis(rs.getDate(5));

                result.add(temp);
            }//while.

        } catch (SQLException ex) {
            System.err.println(ex.getErrorCode() + " === " + ex.getMessage() + " === " + ex.getSQLState());
        } finally {
            try {

            } catch (Exception ex) {

            }
        }
        return result;
    }//anaktisiIstorikouGiaAntitypo.

}//IstorikoMelousDAO.
