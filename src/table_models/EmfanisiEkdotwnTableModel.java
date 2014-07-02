package table_models;

import database.connection.DbConnection;
import database.daos.EkdotesDAO;
import database.models.Ekdotis;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class EmfanisiEkdotwnTableModel extends AbstractTableModel {

    //fields.
    private final String[] columnNames = {"Αύξων Αριθμός Εκδότη", "Όνομα Εκδότη"};

    private final ArrayList<Ekdotis> data;
    private final EkdotesDAO ekdotesDao = new EkdotesDAO(DbConnection.getInstance().getConnection());

    //methods.
    public EmfanisiEkdotwnTableModel() {
        //anaktoume oles tis eggrafes twn ekdotwn.
        data = ekdotesDao.findAll();
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

        //anaktoume thn katallili eggrafi writer.
        Ekdotis ekdotis = data.get(row);

        if (col == 0) {//sthn prwth stili vazoume auxwn arithmo tou ekdoti...
            return ekdotis.getId();
        } else {//sthn deuteri to onoma tou...
            return ekdotis.getName();
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
    public ArrayList<Ekdotis> getData() {
        return data;
    }

}
