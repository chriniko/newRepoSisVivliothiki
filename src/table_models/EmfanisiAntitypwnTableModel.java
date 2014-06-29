package table_models;

import database.connection.DbConnection;
import database.daos.AntitypaDAO;
import database.models.Antitypo;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author nikos
 */
public class EmfanisiAntitypwnTableModel extends AbstractTableModel {

    //fields.
    private final String[] columnNames = {"ISBN", "Αύξων αριθμός αντίτυπου", "Κατάσταση αντίτυπου", "ΑΜ Δανειζόμενου Μέλους", "Ημερομηνία Δανεισμού"};

    private final ArrayList<Antitypo> data;
    private final AntitypaDAO antitypaDao = new AntitypaDAO(DbConnection.getInstance().getConnection());

    //methods.
    public EmfanisiAntitypwnTableModel(String isbn) {
        data = antitypaDao.anaktisiAntitypwnVivliou(isbn);
    }//ctor.

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public int getRowCount() {
        return data.size();
    }

    @Override
    public String getColumnName(int col) {
        return columnNames[col];
    }

    @Override
    public Object getValueAt(int row, int col) {

        Antitypo antitypo = data.get(row);

        if (col == 0) {
            return antitypo.getIsbnVivliou();
        } else if (col == 1) {
            return antitypo.getIdAntitypou();
        } else if (col == 2) {
            return antitypo.getKatastasiAntitypou();
        } else if (col == 3) {
            if (antitypo.getAm_daneismenou_melous() == 0) {
                return "---";
            }//if.
            return antitypo.getAm_daneismenou_melous();
        } else {
            if (antitypo.getHmnia_daneismou() == null) {
                return "---";
            }//if.
            java.sql.Date temp = antitypo.getHmnia_daneismou();
            return temp;
        }

    }//getValueAt.

    /*
     * JTable uses this method to determine the default renderer/
     * editor for each cell.  If we didn't implement this method,
     * then the last column would contain text ("true"/"false"),
     * rather than a check box.
     */
    @Override
    public Class getColumnClass(int c) {
        return getValueAt(0, c).getClass();
    }

    /*
     * Don't need to implement this method unless your table's
     * editable.
     */
    /*@Override
     public boolean isCellEditable(int row, int col) {
     return col >= 1; //apo poio kai meta column epitrepoume na ginei edit.
     }*/
    public ArrayList<Antitypo> getData() {
        return data;
    }
}
