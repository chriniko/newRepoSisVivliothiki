package table_models;

import database.connection.DbConnection;
import database.daos.IstorikoMelousDAO;
import database.models.IstorikoMelous;
import java.util.LinkedList;
import javax.swing.table.AbstractTableModel;

public class EmfanisiIstorikouTableModel extends AbstractTableModel {

    //fields.
    private final String[] columnNames = {"ISBN", "Αύξων αριθμός αντίτυπου", "ΑΜ Μέλους", "Ημερομηνία Δανεισμού", "Ημερομηνία Επιστροφής"};

    private final LinkedList<IstorikoMelous> data;
    private final IstorikoMelousDAO istorikoMelousDao = new IstorikoMelousDAO(DbConnection.getInstance().getConnection());

    //methods.
    public EmfanisiIstorikouTableModel(int amMelous) {
        //anaktoume oles tis eggrafes twn melwn.
        data = istorikoMelousDao.anaktisiIstorikouMelous(amMelous);
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

        IstorikoMelous istorikoMelous = data.get(row);

        if (col == 0) {
            return istorikoMelous.getIsbnVivliou();
        } else if (col == 1) {
            return istorikoMelous.getIdAntitypou();
        } else if (col == 2) {
            return istorikoMelous.getAmMelous();
        } else if (col == 3) {
            return istorikoMelous.getHmniaDaneismou();
        } else {
            return istorikoMelous.getHmniaEpistrofis();
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
    public LinkedList<IstorikoMelous> getData() {
        return data;
    }

}
