package table_models;

import database.connection.DbConnection;
import database.daos.IstorikoMelousDAO;
import database.models.IstorikoMelous;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class EmfanisiIstorikouAntitypouTableModel extends AbstractTableModel {

    //fields.
    private final String[] columnNames = {"ISBN", "Αύξων αριθμός αντίτυπου", "ΑΜ Δανειζόμενου Μέλους", "Ημερομηνία Δανεισμού", "Ημερομηνία Επιστροφής"};

    private final ArrayList<IstorikoMelous> data;
    private final IstorikoMelousDAO imDao = new IstorikoMelousDAO(DbConnection.getInstance().getConnection());

    //methods.
    public EmfanisiIstorikouAntitypouTableModel(String isbn, int id) {
        data = imDao.anaktisiIstorikouGiaAntitypo(isbn, id);//pairnoume to istoriko daneismou gia auto to antitypo....
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

        IstorikoMelous temp = data.get(row);

        if (col == 0) {
            return temp.getIsbnVivliou();
        } else if (col == 1) {
            return temp.getIdAntitypou();
        } else if (col == 2) {
            return temp.getAmMelous();
        } else if (col == 3) {
            return temp.getHmniaDaneismou();
        } else {
            return temp.getHmniaEpistrofis();
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
    public ArrayList<IstorikoMelous> getData() {
        return data;
    }

}
