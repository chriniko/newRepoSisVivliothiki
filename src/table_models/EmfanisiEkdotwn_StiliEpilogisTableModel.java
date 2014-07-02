package table_models;

import database.connection.DbConnection;
import database.daos.EkdotesDAO;
import database.models.Ekdotis;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class EmfanisiEkdotwn_StiliEpilogisTableModel extends AbstractTableModel {

    //fields.
    private final String[] columnNames = {"Αύξων Αριθμός Εκδότη", "Όνομα Εκδότη", "Επιλογή"};

    private final ArrayList<Ekdotis> data;
    private final EkdotesDAO ekdotesDao = new EkdotesDAO(DbConnection.getInstance().getConnection());

    private boolean sthIsSelected = false;

    //methods.
    public EmfanisiEkdotwn_StiliEpilogisTableModel() {
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
        } else if (col == 1) {//sthn deuteri to onoma tou...
            return ekdotis.getName();
        } else {
            return ekdotis.isSelected();
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

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        if (columnIndex == 2) {//ean o xristis pathse panw sto checkbox tote....
            if (!data.get(rowIndex).isSelected() && !sthIsSelected) {//ean den einai epilegmeno tote...
                data.get(rowIndex).setSelected(true);//to epilegoume.
                sthIsSelected = true;
            } else if (data.get(rowIndex).isSelected() && sthIsSelected) {//ean einai epilegmeno tote...
                data.get(rowIndex).setSelected(false);//to xemarkaroume.
                sthIsSelected = false;
            }
        }//if.
    }

    /*
     * Don't need to implement this method unless your table's
     * editable.
     */
    @Override
    public boolean isCellEditable(int row, int col) {
        return col == 2; //apo poio kai meta column epitrepoume na ginei edit.
    }

    public ArrayList<Ekdotis> getData() {
        return data;
    }

}
