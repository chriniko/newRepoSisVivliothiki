package table_models;

import database.connection.DbConnection;
import database.daos.SiggrafeisDAO;
import database.models.Siggrafeas;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

public class EmfanisiSiggrafewn_StiliEpilogisTableModel extends AbstractTableModel {

    //fields.
    private final String[] columnNames = {"Αύξων Αριθμός Συγγραφέα", "Όνομα Συγγραφέα", "Επίθετο Συγγραφέα", "Επιλογή"};

    private final ArrayList<Siggrafeas> data;
    private final SiggrafeisDAO melhDAO = new SiggrafeisDAO(DbConnection.getInstance().getConnection());

    //methods.
    public EmfanisiSiggrafewn_StiliEpilogisTableModel() {
        //anaktoume oles tis eggrafes twn siggrafewn.
        data = melhDAO.findAll();
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

        //anaktoume thn katallili eggrafi siggrafea.
        Siggrafeas siggrafeas = data.get(row);

        if (col == 0) {
            return siggrafeas.getId();
        } else if (col == 1) {
            return siggrafeas.getOnoma();
        } else if (col == 2) {
            return siggrafeas.getEpitheto();
        } else {
            return siggrafeas.isIsSelected();
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
    @Override
    public boolean isCellEditable(int row, int col) {
        return col == 3;
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        super.setValueAt(aValue, rowIndex, columnIndex);

        if (columnIndex == 3) {//ean o xristis pathse panw sto checkbox tote....

            if (!data.get(rowIndex).isIsSelected()) {//ean den einai epilegmeno tote...
                data.get(rowIndex).setIsSelected(true);//to epilegoume.
            } else {//ean einai epilegmeno tote...
                data.get(rowIndex).setIsSelected(false);//to xemarkaroume.
            }
        }//if.

    }

    public ArrayList<Siggrafeas> getData() {
        return data;
    }

}//EmfanisiSiggrafewnTableModel.
