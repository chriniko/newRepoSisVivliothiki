/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package formes;

import database.connection.DbConnection;
import database.daos.EkdotesDAO;
import database.daos.VivliaDAO;
import database.models.Ekdotis;
import database.models.Siggrafeas;
import java.util.ArrayList;
import table_models.EmfanisiSiggrafewnTableModel;

/**
 *
 * @author nikos
 */
public class EisagwgiNeouVivliouInternalFrame extends javax.swing.JInternalFrame {

    private final VivliaDAO vivliaDAO = new VivliaDAO(DbConnection.getInstance().getConnection());
    
    public EisagwgiNeouVivliouInternalFrame() {
        initComponents();
        fillComboEkdotes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        firstPane = new javax.swing.JPanel();
        isbnLbl = new javax.swing.JLabel();
        titlosLbl = new javax.swing.JLabel();
        ekdotisLbl = new javax.swing.JLabel();
        ekdotisComboBox = new javax.swing.JComboBox();
        isbnFld = new javax.swing.JTextField();
        titlosFld = new javax.swing.JTextField();
        eikonaLbl = new javax.swing.JLabel();
        fortwsiEikonasBtn = new javax.swing.JButton();
        siggrafeisLbl = new javax.swing.JLabel();
        siggrafeisTableScroller = new javax.swing.JScrollPane();
        siggrafeisTable = new javax.swing.JTable();
        perigrafiVivliouLbl = new javax.swing.JLabel();
        perigrafiVivliouTxtPaneScroller = new javax.swing.JScrollPane();
        perigrafiVivliouTxtPane = new javax.swing.JTextPane();
        secondPane = new javax.swing.JPanel();
        epilegmeniEikonaLbl = new javax.swing.JLabel();
        labelToLoadUserSelectedIcon = new javax.swing.JLabel();
        thirdPane = new javax.swing.JPanel();
        kleisimoParathirouBtn = new javax.swing.JButton();
        eisagwgiVivliouBtn = new javax.swing.JButton();
        katharismosPediwnBtn = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Εισαγωγή νέου βιβλίου");

        isbnLbl.setText("Δώσε ISBN:");

        titlosLbl.setText("Δώσε τίτλο βιβλίου:");

        ekdotisLbl.setText("Επιλογή εκδότη:");

        eikonaLbl.setText("Επιλογή εικόνας:");

        fortwsiEikonasBtn.setText("Φόρτωση εικόνας...");

        siggrafeisLbl.setText("Επιλογή συγγραφέων:");

        siggrafeisTable.setModel(new EmfanisiSiggrafewnTableModel());
        siggrafeisTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                siggrafeisTableMouseClicked(evt);
            }
        });
        siggrafeisTableScroller.setViewportView(siggrafeisTable);

        perigrafiVivliouLbl.setText("Εισαγωγή περιγραφής βιβλίου:");

        perigrafiVivliouTxtPaneScroller.setViewportView(perigrafiVivliouTxtPane);

        javax.swing.GroupLayout firstPaneLayout = new javax.swing.GroupLayout(firstPane);
        firstPane.setLayout(firstPaneLayout);
        firstPaneLayout.setHorizontalGroup(
            firstPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(firstPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(perigrafiVivliouTxtPaneScroller)
                    .addGroup(firstPaneLayout.createSequentialGroup()
                        .addGroup(firstPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(firstPaneLayout.createSequentialGroup()
                                .addGroup(firstPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ekdotisLbl)
                                    .addComponent(isbnLbl)
                                    .addComponent(titlosLbl)
                                    .addComponent(eikonaLbl))
                                .addGap(36, 36, 36)
                                .addGroup(firstPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(isbnFld)
                                    .addComponent(titlosFld)
                                    .addGroup(firstPaneLayout.createSequentialGroup()
                                        .addGroup(firstPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(fortwsiEikonasBtn)
                                            .addComponent(ekdotisComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 210, Short.MAX_VALUE))))
                            .addComponent(siggrafeisLbl)
                            .addComponent(perigrafiVivliouLbl))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(siggrafeisTableScroller, javax.swing.GroupLayout.DEFAULT_SIZE, 625, Short.MAX_VALUE))
                .addContainerGap())
        );
        firstPaneLayout.setVerticalGroup(
            firstPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(firstPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isbnLbl)
                    .addComponent(isbnFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(firstPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(titlosLbl)
                    .addComponent(titlosFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(firstPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ekdotisLbl)
                    .addComponent(ekdotisComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(firstPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eikonaLbl)
                    .addComponent(fortwsiEikonasBtn))
                .addGap(17, 17, 17)
                .addComponent(siggrafeisLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(siggrafeisTableScroller, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(perigrafiVivliouLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(perigrafiVivliouTxtPaneScroller, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                .addContainerGap())
        );

        epilegmeniEikonaLbl.setText("Η εικόνα που επιλέξατε ειναι:");

        labelToLoadUserSelectedIcon.setText("εδώ φορτώνεται η εικόνα...");

        javax.swing.GroupLayout secondPaneLayout = new javax.swing.GroupLayout(secondPane);
        secondPane.setLayout(secondPaneLayout);
        secondPaneLayout.setHorizontalGroup(
            secondPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(secondPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(epilegmeniEikonaLbl)
                    .addComponent(labelToLoadUserSelectedIcon))
                .addContainerGap(149, Short.MAX_VALUE))
        );
        secondPaneLayout.setVerticalGroup(
            secondPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secondPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(epilegmeniEikonaLbl)
                .addGap(44, 44, 44)
                .addComponent(labelToLoadUserSelectedIcon)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        kleisimoParathirouBtn.setText("Κλείσιμο παράθυρου");
        kleisimoParathirouBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kleisimoParathirouBtnActionPerformed(evt);
            }
        });

        eisagwgiVivliouBtn.setText("Εισαγωγή βιβλίου");

        katharismosPediwnBtn.setText("Καθαρισμός πεδίων");

        javax.swing.GroupLayout thirdPaneLayout = new javax.swing.GroupLayout(thirdPane);
        thirdPane.setLayout(thirdPaneLayout);
        thirdPaneLayout.setHorizontalGroup(
            thirdPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thirdPaneLayout.createSequentialGroup()
                .addContainerGap(142, Short.MAX_VALUE)
                .addGroup(thirdPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(kleisimoParathirouBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(eisagwgiVivliouBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(katharismosPediwnBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        thirdPaneLayout.setVerticalGroup(
            thirdPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, thirdPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(katharismosPediwnBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(eisagwgiVivliouBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(kleisimoParathirouBtn)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(firstPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(thirdPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(secondPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(secondPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addComponent(thirdPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(firstPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kleisimoParathirouBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kleisimoParathirouBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_kleisimoParathirouBtnActionPerformed

    private void siggrafeisTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siggrafeisTableMouseClicked
        // TODO add your handling code here:        
    }//GEN-LAST:event_siggrafeisTableMouseClicked

    private void fillComboEkdotes(){            
        EkdotesDAO dao = new EkdotesDAO(DbConnection.getInstance().getConnection());
        ArrayList<Ekdotis> ekdotes = dao.findAll();
        
        for(Ekdotis e : ekdotes){
            ekdotisComboBox.addItem(e.getName());        
        }        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel eikonaLbl;
    private javax.swing.JButton eisagwgiVivliouBtn;
    private javax.swing.JComboBox ekdotisComboBox;
    private javax.swing.JLabel ekdotisLbl;
    private javax.swing.JLabel epilegmeniEikonaLbl;
    private javax.swing.JPanel firstPane;
    private javax.swing.JButton fortwsiEikonasBtn;
    private javax.swing.JTextField isbnFld;
    private javax.swing.JLabel isbnLbl;
    private javax.swing.JButton katharismosPediwnBtn;
    private javax.swing.JButton kleisimoParathirouBtn;
    private javax.swing.JLabel labelToLoadUserSelectedIcon;
    private javax.swing.JLabel perigrafiVivliouLbl;
    private javax.swing.JTextPane perigrafiVivliouTxtPane;
    private javax.swing.JScrollPane perigrafiVivliouTxtPaneScroller;
    private javax.swing.JPanel secondPane;
    private javax.swing.JLabel siggrafeisLbl;
    private javax.swing.JTable siggrafeisTable;
    private javax.swing.JScrollPane siggrafeisTableScroller;
    private javax.swing.JPanel thirdPane;
    private javax.swing.JTextField titlosFld;
    private javax.swing.JLabel titlosLbl;
    // End of variables declaration//GEN-END:variables
}
