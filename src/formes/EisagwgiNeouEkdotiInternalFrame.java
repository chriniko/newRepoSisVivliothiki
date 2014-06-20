/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formes;

import database.connection.DbConnection;
import database.daos.EkdotesDAO;
import database.models.Ekdotis;
import javax.swing.JOptionPane;

/**
 *
 * @author nikos
 */
public class EisagwgiNeouEkdotiInternalFrame extends javax.swing.JInternalFrame {

    private final EkdotesDAO ekdotesDao = new EkdotesDAO(DbConnection.getInstance().getConnection());

    /**
     * Creates new form EisagwgiNeouEkdotiInternalFrame
     */
    public EisagwgiNeouEkdotiInternalFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainPane = new javax.swing.JPanel();
        onomaEkdotiLbl = new javax.swing.JLabel();
        onomaEkdotiFld = new javax.swing.JTextField();
        kleisimoParathirouBtn = new javax.swing.JButton();
        eisagwgiEkdotiBtn = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Εισαγωγή νέου εκδότη");

        onomaEkdotiLbl.setText("Όνομα εκδότη:");

        kleisimoParathirouBtn.setText("Κλείσιμο Παράθυρου");
        kleisimoParathirouBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kleisimoParathirouBtnActionPerformed(evt);
            }
        });

        eisagwgiEkdotiBtn.setText("Εισαγωγή Εκδότη");
        eisagwgiEkdotiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eisagwgiEkdotiBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPaneLayout = new javax.swing.GroupLayout(mainPane);
        mainPane.setLayout(mainPaneLayout);
        mainPaneLayout.setHorizontalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(onomaEkdotiLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(onomaEkdotiFld, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPaneLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(eisagwgiEkdotiBtn)
                .addGap(18, 18, 18)
                .addComponent(kleisimoParathirouBtn))
        );
        mainPaneLayout.setVerticalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onomaEkdotiLbl)
                    .addComponent(onomaEkdotiFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kleisimoParathirouBtn)
                    .addComponent(eisagwgiEkdotiBtn))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(mainPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kleisimoParathirouBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kleisimoParathirouBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_kleisimoParathirouBtnActionPerformed

    private void eisagwgiEkdotiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eisagwgiEkdotiBtnActionPerformed

        String onomaEkdoti = onomaEkdotiFld.getText();

        if (onomaEkdoti.trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Παρακαλώ εισάγετε έγκυρο όνομα εκδότη!");
            return;
        }
        Ekdotis neosEkdotis = new Ekdotis();
        neosEkdotis.setName(onomaEkdoti);

        ekdotesDao.insertEkdoti(neosEkdotis);

        JOptionPane.showMessageDialog(this, "Η εισαγωγή του νέου εκδότη στην ΒΔ έγινε επιτυχώς!");

        onomaEkdotiFld.setText("");


    }//GEN-LAST:event_eisagwgiEkdotiBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton eisagwgiEkdotiBtn;
    private javax.swing.JButton kleisimoParathirouBtn;
    private javax.swing.JPanel mainPane;
    private javax.swing.JTextField onomaEkdotiFld;
    private javax.swing.JLabel onomaEkdotiLbl;
    // End of variables declaration//GEN-END:variables
}
