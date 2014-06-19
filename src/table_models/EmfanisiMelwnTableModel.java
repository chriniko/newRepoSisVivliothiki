package table_models;

import database.connection.DbConnection;
import database.daos.MelhDAO;
import database.models.Melos;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author nikos
 */
public class EmfanisiMelwnTableModel extends AbstractTableModel {

    //fields.
    private final String[] columnNames = {"ΑΜ Μέλους", "Όνομα Μέλους",
        "Επίθετο Μέλους", "Email Μέλους"};

    private final ArrayList<Melos> data;
    private final MelhDAO melhDAO = new MelhDAO(DbConnection.getInstance().getConnection());

    //methods.
    public EmfanisiMelwnTableModel() {
        //anaktoume oles tis eggrafes twn melwn.
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
        Melos melos = data.get(row);

        if (col == 0) {//sthn prwth stili vazoume to am.
            return melos.getAm();
        } else if (col == 1) {//sthn deuteri stili vazoume to onoma.
            return melos.getOnoma();
        } else if (col == 3) {//sthn trith stili vazoume to epitheto.
            return melos.getEpitheto();
        } else {//stin tetarti stili vazoume to email.
            return melos.getEmail();
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
    public ArrayList<Melos> getData() {
        return data;
    }

}//EmfanisiMelwnTableModel.
