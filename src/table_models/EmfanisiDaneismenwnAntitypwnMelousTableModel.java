package table_models;

import database.connection.DbConnection;
import database.daos.AntitypaDAO;
import database.daos.VivliaDAO;
import database.models.Antitypo;
import database.models.Vivlio;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.table.AbstractTableModel;

public class EmfanisiDaneismenwnAntitypwnMelousTableModel extends AbstractTableModel {

    //fields.
    private final String[] columnNames = {"ISBN Βιβλίου", "Αύξων αριθμός αντ.", "Τίτλος Βιβλίου", "Κατάσταση Αντ.", "ΑΜ Μέλους", "Ημ/νία Δανεισμού", "Εξώφυλλο"};

    private final ArrayList<Antitypo> data;
    private final AntitypaDAO antitypaDao = new AntitypaDAO(DbConnection.getInstance().getConnection());
    private final VivliaDAO vivliaDao = new VivliaDAO(DbConnection.getInstance().getConnection());

    //methods.
    public EmfanisiDaneismenwnAntitypwnMelousTableModel(int am_melous) {
        //anaktoume oles tis eggrafes twn ekdotwn.
        data = antitypaDao.anaktisiAntitypwnMelousPouExeiDaneistei(am_melous);
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
        Antitypo ant = data.get(row);
        Vivlio viv = vivliaDao.searchVivlioByISBN(ant.getIsbnVivliou());

        if (col == 0) {
            return ant.getIsbnVivliou();
        } else if (col == 1) {
            return ant.getIdAntitypou();
        } else if (col == 2) {
            return viv.getTitlos();
        } else if (col == 3) {
            return ant.getKatastasiAntitypou();
        } else if (col == 4) {
            return ant.getAm_daneismenou_melous();
        } else if (col == 5) {
            return ant.getHmnia_daneismou();
        } else {
            return new ImageIcon(viv.getUrl_exwfilou_vivliou());
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
