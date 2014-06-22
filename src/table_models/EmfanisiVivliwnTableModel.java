/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package table_models;

import database.connection.DbConnection;
import database.daos.VivliaDAO;
import database.models.Vivlio;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Akis
 */
public class EmfanisiVivliwnTableModel extends AbstractTableModel {
    
    private final String[] columnNames = {""};
    private final ArrayList<Vivlio> data;
    private final VivliaDAO vivliaDAO = new VivliaDAO(DbConnection.getInstance().getConnection());

    public EmfanisiVivliwnTableModel() {
        this.data = vivliaDAO.findAll();
    }
    
    

    @Override
    public int getRowCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getColumnCount() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
