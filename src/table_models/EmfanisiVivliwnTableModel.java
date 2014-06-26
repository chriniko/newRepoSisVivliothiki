package table_models;

import database.connection.DbConnection;
import database.daos.AntitypaDAO;
import database.daos.VivliaDAO;
import database.models.Vivlio;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Akis
 */
public class EmfanisiVivliwnTableModel extends AbstractTableModel {

    //fields.
    private final String[] columnNames = {"ISBN", "Τίτλος", "Εκδόσεις", "Σύνολο Αντίτυπων", "Διαθέσιμα Αντίτυπα", "Μη-Διαθέσιμα Αντίτυπα", "Εξώφυλλο"};

    private final ArrayList<Vivlio> data;
    private final VivliaDAO vivliaDAO = new VivliaDAO(DbConnection.getInstance().getConnection());
    private final AntitypaDAO antitypaDAO = new AntitypaDAO(DbConnection.getInstance().getConnection());

    //methods.
    public EmfanisiVivliwnTableModel() {
        data = vivliaDAO.findAll();
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

        Vivlio vivlio = data.get(row);

        if (col == 0) {
            return vivlio.getIsbn();
        } else if (col == 1) {
            return vivlio.getTitlos();
        } else if (col == 2) {
            return vivlio.getOnoma_ekdoti();
        } else if (col == 3) {
            return antitypaDAO.anaktisiPlithousAntitypwnVivliou(vivlio.getIsbn());
        } else if (col == 4) {
            return antitypaDAO.anaktisiPlithousDiathesimwnAntitypwnVivliou(vivlio.getIsbn());
        } else if (col == 5) {
            return antitypaDAO.anaktisiPlithousMiDiathesimwnAntitypwnVivliou(vivlio.getIsbn());
        } else {
            return new ImageIcon(vivlio.getUrl_exwfilou_vivliou());
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
        return false;
    }

    public ArrayList<Vivlio> getData() {
        return data;
    }

}
