package table_models;

import database.connection.DbConnection;
import database.daos.SiggrafeisDAO;
import database.models.Siggrafeas;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author nikos
 */
public class EmfanisiSiggrafewnTableModel extends AbstractTableModel {

    //fields.
    private final String[] columnNames = {"Αύξων Αριθμός Συγγραφέα", "Όνομα Συγγραφέα", "Επίθετο Συγγραφέα"};

    private final ArrayList<Siggrafeas> data;
    private final SiggrafeisDAO melhDAO = new SiggrafeisDAO(DbConnection.getInstance().getConnection());

    //methods.
    public EmfanisiSiggrafewnTableModel() {
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

        //anaktoume thn katallili eggrafi writer.
        Siggrafeas siggrafeas = data.get(row);

        if (col == 0) {
            return siggrafeas.getId();
        } else if (col == 1) {
            return siggrafeas.getOnoma();
        } else {
            return siggrafeas.getEpitheto();
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
    public ArrayList<Siggrafeas> getData() {
        return data;
    }

}//EmfanisiSiggrafewnTableModel.