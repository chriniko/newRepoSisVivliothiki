/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formes;

import database.models.IstorikoMelous;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import table_models.EmfanisiIstorikouTableModel;

/**
 *
 * @author nikos
 */
public class EmfanisiIstorikouMelousInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form EmfanisiIstorikouMelousInternalFrame
     */
    public EmfanisiIstorikouMelousInternalFrame() {
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

        kleisimoParathirouBtn = new javax.swing.JButton();
        istorikoTableScroller = new javax.swing.JScrollPane();
        istorikoTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        amMelousLbl = new javax.swing.JLabel();
        amMelousFld = new javax.swing.JTextField();
        fortwsiBtn = new javax.swing.JButton();
        istorikoLbl = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Εμφάνιση Ιστορικού Μέλους");

        kleisimoParathirouBtn.setText("Κλείσιμο Παράθυρου");
        kleisimoParathirouBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kleisimoParathirouBtnActionPerformed(evt);
            }
        });

        istorikoTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ISBN", "Αύξων αριθμός αντίτυπου", "ΑΜ Μέλους", "Ημερομηνία Δανεισμού", "Ημερομηνία Επιστροφής"
            }
        ));
        istorikoTableScroller.setViewportView(istorikoTable);

        amMelousLbl.setText("Δώσε ΑΜ μέλους:");

        fortwsiBtn.setText("Φόρτωση");
        fortwsiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fortwsiBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(amMelousLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(amMelousFld, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fortwsiBtn)
                .addContainerGap(233, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amMelousLbl)
                    .addComponent(amMelousFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fortwsiBtn))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        istorikoLbl.setText("Το ιστορικό του μέλους είναι:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(kleisimoParathirouBtn))
                    .addComponent(istorikoTableScroller)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(istorikoLbl))
                        .addGap(0, 197, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(istorikoLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(istorikoTableScroller, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kleisimoParathirouBtn)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kleisimoParathirouBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kleisimoParathirouBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_kleisimoParathirouBtnActionPerformed

    private void fortwsiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fortwsiBtnActionPerformed

        try {
            Integer.parseInt(amMelousFld.getText());
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Δώσε έγκυρο ΑΜ!");
            return;
        }

        if (amMelousFld.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Δώσε ΑΜ μέλους!");
            return;
        }//if.

        istorikoTable.setModel(new EmfanisiIstorikouTableModel(Integer.parseInt(amMelousFld.getText())));

        LinkedList<IstorikoMelous> istoriko = ((EmfanisiIstorikouTableModel) istorikoTable.getModel()).getData();
        if (istoriko.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Το μέλος με ΑΜ: " + amMelousFld.getText() + " δεν εχει ιστορικό!");
        }

    }//GEN-LAST:event_fortwsiBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amMelousFld;
    private javax.swing.JLabel amMelousLbl;
    private javax.swing.JButton fortwsiBtn;
    private javax.swing.JLabel istorikoLbl;
    private javax.swing.JTable istorikoTable;
    private javax.swing.JScrollPane istorikoTableScroller;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton kleisimoParathirouBtn;
    // End of variables declaration//GEN-END:variables
}
