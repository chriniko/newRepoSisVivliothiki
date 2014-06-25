package formes;

import database.models.Ekdotis;
import database.models.Siggrafeas;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JInternalFrame;
import table_models.EmfanisiEkdotwn_StiliEpilogisTableModel;
import table_models.EmfanisiSiggrafewn_StiliEpilogisTableModel;
import utils.ApothikeutisEnimerwmenwnSiggrafewnEkdoti;

/**
 *
 * @author nikos
 */
public class EpilogiNeouEkdotiSiggrafewn_EnimerwsiVivliouInternalFrame extends javax.swing.JInternalFrame {

    /**
     * Creates new form
     * EpilogiNeouEkdotiSiggrafewn_EnimerwsiVivliouInternalFrame
     */
    public EpilogiNeouEkdotiSiggrafewn_EnimerwsiVivliouInternalFrame() {
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
        epilogiEkdotiLbl = new javax.swing.JLabel();
        ekdotesScrollPane = new javax.swing.JScrollPane();
        ekdotesTable = new javax.swing.JTable();
        kleisimoParathirouBtn = new javax.swing.JButton();
        apothikeusiEpilogwnBtn = new javax.swing.JButton();
        epilogiSiggrafeaLbl = new javax.swing.JLabel();
        siggrafeisScrollPane = new javax.swing.JScrollPane();
        siggrafeisTable = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Ενημέρωση Βιβλιου - Επιλογή Εκδότη - Συγγραφέων");

        epilogiEkdotiLbl.setText("Επιλογή εκδότη:");

        ekdotesTable.setModel(new EmfanisiEkdotwn_StiliEpilogisTableModel
            ());
        ekdotesScrollPane.setViewportView(ekdotesTable);

        kleisimoParathirouBtn.setText("Κλείσιμο Παράθυρου");
        kleisimoParathirouBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kleisimoParathirouBtnActionPerformed(evt);
            }
        });

        apothikeusiEpilogwnBtn.setText("Αποθήκευση επιλογών");
        apothikeusiEpilogwnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apothikeusiEpilogwnBtnActionPerformed(evt);
            }
        });

        epilogiSiggrafeaLbl.setText("Επιλογή συγγραφέα/συγγραφέων:");

        siggrafeisTable.setModel(new table_models.EmfanisiSiggrafewn_StiliEpilogisTableModel
            ());
        siggrafeisScrollPane.setViewportView(siggrafeisTable);

        javax.swing.GroupLayout mainPaneLayout = new javax.swing.GroupLayout(mainPane);
        mainPane.setLayout(mainPaneLayout);
        mainPaneLayout.setHorizontalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPaneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(apothikeusiEpilogwnBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(kleisimoParathirouBtn))
                    .addGroup(mainPaneLayout.createSequentialGroup()
                        .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(siggrafeisScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ekdotesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(epilogiEkdotiLbl)
                            .addComponent(epilogiSiggrafeaLbl))
                        .addGap(0, 93, Short.MAX_VALUE)))
                .addContainerGap())
        );

        mainPaneLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {ekdotesScrollPane, siggrafeisScrollPane});

        mainPaneLayout.setVerticalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(epilogiEkdotiLbl)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ekdotesScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(epilogiSiggrafeaLbl)
                .addGap(18, 18, 18)
                .addComponent(siggrafeisScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kleisimoParathirouBtn)
                    .addComponent(apothikeusiEpilogwnBtn))
                .addContainerGap())
        );

        mainPaneLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {ekdotesScrollPane, siggrafeisScrollPane});

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
                .addContainerGap()
                .addComponent(mainPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kleisimoParathirouBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kleisimoParathirouBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_kleisimoParathirouBtnActionPerformed

    private void apothikeusiEpilogwnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apothikeusiEpilogwnBtnActionPerformed

        //anaktisi tou epilegmenou ekdoti....
        ArrayList<Ekdotis> ekdotes = ((EmfanisiEkdotwn_StiliEpilogisTableModel) ekdotesTable.getModel()).getData();
        Ekdotis epilegmenosEkdotis = null;
        for (Ekdotis temp : ekdotes) {
            if (temp.isSelected()) {
                epilegmenosEkdotis = temp;
                break;
            }
        }

        //anaktisi twn epilegmenwn siggrafewn...
        ArrayList<Siggrafeas> siggrafeis = ((EmfanisiSiggrafewn_StiliEpilogisTableModel) siggrafeisTable.getModel()).getData();
        ArrayList<Siggrafeas> epilegmenoiSiggrafeis = new ArrayList<>();
        for (Siggrafeas temp : siggrafeis) {
            if (temp.isIsSelected()) {
                epilegmenoiSiggrafeis.add(temp);
            }
        }

//        System.out.println(epilegmenosEkdotis);
//        for (Siggrafeas temp : epilegmenoiSiggrafeis) {
//            System.out.println(temp);
//        }
        


    }//GEN-LAST:event_apothikeusiEpilogwnBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton apothikeusiEpilogwnBtn;
    private javax.swing.JScrollPane ekdotesScrollPane;
    private javax.swing.JTable ekdotesTable;
    private javax.swing.JLabel epilogiEkdotiLbl;
    private javax.swing.JLabel epilogiSiggrafeaLbl;
    private javax.swing.JButton kleisimoParathirouBtn;
    private javax.swing.JPanel mainPane;
    private javax.swing.JScrollPane siggrafeisScrollPane;
    private javax.swing.JTable siggrafeisTable;
    // End of variables declaration//GEN-END:variables
}
