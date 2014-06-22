package formes;

import database.connection.DbConnection;
import database.daos.SiggrafeisDAO;
import database.models.Siggrafeas;
import database.models.Vivlio;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import table_models.EmfanisiSiggrafewnTableModel;

/**
 *
 * @author nikos
 */
public class EmfanisiSiggrafewnInternalFrame extends javax.swing.JInternalFrame {

    private final SiggrafeisDAO siggrafeisDAO = new SiggrafeisDAO(DbConnection.getInstance().getConnection());
    private boolean isUnderUpdate = false;
    private Siggrafeas siggrafeasUnderUpdate = new Siggrafeas();

    /**
     * Creates new form EmfanisiSiggrafewnInternalFrame
     */
    public EmfanisiSiggrafewnInternalFrame() {
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

        scrollPane = new javax.swing.JScrollPane();
        siggrafeisTable = new javax.swing.JTable();
        mainPane = new javax.swing.JPanel();
        onomaSiggrafeaLbl = new javax.swing.JLabel();
        onomaSiggrafeaFld = new javax.swing.JTextField();
        kleisimoDialogBtn = new javax.swing.JButton();
        diagrafiSiggrafeaBtn = new javax.swing.JButton();
        enimerwsiSiggrafeaBtn = new javax.swing.JButton();
        akirwsiEnimerwsisBtn = new javax.swing.JButton();
        epivevaiwshEnimerwsisBtn = new javax.swing.JButton();
        epithetoSiggrafeaLbl = new javax.swing.JLabel();
        epithetoSiggrafeaFld = new javax.swing.JTextField();
        auxwnArithmosLbl = new javax.swing.JLabel();
        auxwnArithmosFld = new javax.swing.JTextField();
        ananewsiPinakaBtn = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Εμφάνιση Συγγραφέων");

        siggrafeisTable.setModel(new EmfanisiSiggrafewnTableModel());
        siggrafeisTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                siggrafeisTableMouseClicked(evt);
            }
        });
        siggrafeisTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                siggrafeisTableKeyReleased(evt);
            }
        });
        scrollPane.setViewportView(siggrafeisTable);

        onomaSiggrafeaLbl.setText("Όνομα συγγραφέα:");

        onomaSiggrafeaFld.setEditable(false);

        kleisimoDialogBtn.setText("Κλείσιμο παράθυρου");
        kleisimoDialogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kleisimoDialogBtnActionPerformed(evt);
            }
        });

        diagrafiSiggrafeaBtn.setText("Διαγραφή Συγγραφέα");
        diagrafiSiggrafeaBtn.setEnabled(false);
        diagrafiSiggrafeaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagrafiSiggrafeaBtnActionPerformed(evt);
            }
        });

        enimerwsiSiggrafeaBtn.setText("Ενημέρωση συγγραφέα");
        enimerwsiSiggrafeaBtn.setEnabled(false);
        enimerwsiSiggrafeaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enimerwsiSiggrafeaBtnActionPerformed(evt);
            }
        });

        akirwsiEnimerwsisBtn.setText("Ακύρωση Ενημέρωσης");
        akirwsiEnimerwsisBtn.setEnabled(false);
        akirwsiEnimerwsisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akirwsiEnimerwsisBtnActionPerformed(evt);
            }
        });

        epivevaiwshEnimerwsisBtn.setText("Επιβεβαίωση Ενημέρωσης");
        epivevaiwshEnimerwsisBtn.setEnabled(false);
        epivevaiwshEnimerwsisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                epivevaiwshEnimerwsisBtnActionPerformed(evt);
            }
        });

        epithetoSiggrafeaLbl.setText("Επίθετο συγγραφέα:");

        epithetoSiggrafeaFld.setEditable(false);

        auxwnArithmosLbl.setText("Αύξων αριθμός συγγραφέα:");

        auxwnArithmosFld.setEditable(false);

        ananewsiPinakaBtn.setText("Ανανέωση πίνακα");
        ananewsiPinakaBtn.setToolTipText("");
        ananewsiPinakaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ananewsiPinakaBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPaneLayout = new javax.swing.GroupLayout(mainPane);
        mainPane.setLayout(mainPaneLayout);
        mainPaneLayout.setHorizontalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainPaneLayout.createSequentialGroup()
                        .addComponent(enimerwsiSiggrafeaBtn)
                        .addGap(18, 18, 18)
                        .addComponent(akirwsiEnimerwsisBtn)
                        .addGap(18, 18, 18)
                        .addComponent(epivevaiwshEnimerwsisBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                        .addComponent(diagrafiSiggrafeaBtn)
                        .addGap(18, 18, 18)
                        .addComponent(kleisimoDialogBtn))
                    .addGroup(mainPaneLayout.createSequentialGroup()
                        .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(mainPaneLayout.createSequentialGroup()
                                .addComponent(auxwnArithmosLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(auxwnArithmosFld))
                            .addGroup(mainPaneLayout.createSequentialGroup()
                                .addComponent(epithetoSiggrafeaLbl)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(epithetoSiggrafeaFld, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(mainPaneLayout.createSequentialGroup()
                                .addComponent(onomaSiggrafeaLbl)
                                .addGap(65, 65, 65)
                                .addComponent(onomaSiggrafeaFld, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ananewsiPinakaBtn)))
                .addContainerGap())
        );
        mainPaneLayout.setVerticalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPaneLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(auxwnArithmosLbl)
                    .addComponent(auxwnArithmosFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ananewsiPinakaBtn))
                .addGap(18, 18, 18)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onomaSiggrafeaLbl)
                    .addComponent(onomaSiggrafeaFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(epithetoSiggrafeaLbl)
                    .addComponent(epithetoSiggrafeaFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enimerwsiSiggrafeaBtn)
                    .addComponent(akirwsiEnimerwsisBtn)
                    .addComponent(epivevaiwshEnimerwsisBtn)
                    .addComponent(diagrafiSiggrafeaBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kleisimoDialogBtn))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 995, Short.MAX_VALUE)
                    .addComponent(mainPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mainPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kleisimoDialogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kleisimoDialogBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_kleisimoDialogBtnActionPerformed

    private void siggrafeisTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_siggrafeisTableMouseClicked
        fortwsi_info_siggrafea_sta_txt_fields();
    }//GEN-LAST:event_siggrafeisTableMouseClicked

    private void siggrafeisTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_siggrafeisTableKeyReleased
        fortwsi_info_siggrafea_sta_txt_fields();
    }//GEN-LAST:event_siggrafeisTableKeyReleased

    private void ananewsiPinakaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ananewsiPinakaBtnActionPerformed
        siggrafeisTable.setModel(new EmfanisiSiggrafewnTableModel());
        siggrafeisTable.repaint();
        enimerwsiSiggrafeaBtn.setEnabled(false);
        diagrafiSiggrafeaBtn.setEnabled(false);
        auxwnArithmosFld.setText("");
        onomaSiggrafeaFld.setText("");
        epithetoSiggrafeaFld.setText("");
    }//GEN-LAST:event_ananewsiPinakaBtnActionPerformed

    private void enimerwsiSiggrafeaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enimerwsiSiggrafeaBtnActionPerformed

        siggrafeasUnderUpdate.setOnoma(onomaSiggrafeaFld.getText());
        siggrafeasUnderUpdate.setEpitheto(epithetoSiggrafeaFld.getText());

        onomaSiggrafeaFld.setEditable(true);
        epithetoSiggrafeaFld.setEditable(true);
        enimerwsiSiggrafeaBtn.setEnabled(false);
        diagrafiSiggrafeaBtn.setEnabled(false);
        kleisimoDialogBtn.setEnabled(false);
        ananewsiPinakaBtn.setEnabled(false);
        akirwsiEnimerwsisBtn.setEnabled(true);
        epivevaiwshEnimerwsisBtn.setEnabled(true);
        siggrafeisTable.setEnabled(false);

        isUnderUpdate = true;
        this.setClosable(false);

        onomaSiggrafeaFld.requestFocus();

    }//GEN-LAST:event_enimerwsiSiggrafeaBtnActionPerformed

    private void diagrafiSiggrafeaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagrafiSiggrafeaBtnActionPerformed

        int res = JOptionPane.showConfirmDialog(this, "Είστε σίγουρος?");
        if (res != JOptionPane.YES_OPTION) {
            return;
        }

        int auxwnArithmosSiggrafea = Integer.parseInt(auxwnArithmosFld.getText());

        //prwta elegxoume ean o siggrafea pou pame na diagrapsoume exei vivlia...
        ArrayList<Vivlio> vivliaSIggrafea = siggrafeisDAO.anaktisiVivliwnSiggrafea(auxwnArithmosSiggrafea);
        if (vivliaSIggrafea != null && !vivliaSIggrafea.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ο συγγραφέας που προσπαθείτε να διαγράψετε είναι reference στον πίνακα των βιβλίων, αφαιρέστε πρώτα τα βιβλία και ξαναπροσπαθείστε!");
            return;
        }//if.

        //ean ftasame edw shmainei oti o siggrafeas den exei vivlia ara ton diagrafoume....
        boolean diegrafi = siggrafeisDAO.diagrafiSiggrafea(auxwnArithmosSiggrafea);
        if (!diegrafi) {
            JOptionPane.showMessageDialog(this, "Η διαγραφή του συγγραφέα ήταν μη επιτυχής! Κοιτάξτε τη ΒΔ!");
            return;
        }//if.

        JOptionPane.showMessageDialog(this, "Η διαγραφή του συγγραφέα ήταν επιτυχής!");

        ananewsiPinakaBtn.doClick();

    }//GEN-LAST:event_diagrafiSiggrafeaBtnActionPerformed

    private void akirwsiEnimerwsisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akirwsiEnimerwsisBtnActionPerformed

        onomaSiggrafeaFld.setText(siggrafeasUnderUpdate.getOnoma());
        epithetoSiggrafeaFld.setText(siggrafeasUnderUpdate.getEpitheto());

        onomaSiggrafeaFld.setEditable(false);
        epithetoSiggrafeaFld.setEditable(false);
        enimerwsiSiggrafeaBtn.setEnabled(true);
        diagrafiSiggrafeaBtn.setEnabled(true);
        kleisimoDialogBtn.setEnabled(true);
        ananewsiPinakaBtn.setEnabled(true);
        akirwsiEnimerwsisBtn.setEnabled(false);
        epivevaiwshEnimerwsisBtn.setEnabled(false);
        siggrafeisTable.setEnabled(true);

        isUnderUpdate = false;
        this.setClosable(true);

    }//GEN-LAST:event_akirwsiEnimerwsisBtnActionPerformed

    private void epivevaiwshEnimerwsisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_epivevaiwshEnimerwsisBtnActionPerformed

        int id = Integer.parseInt(auxwnArithmosFld.getText());
        String onoma = onomaSiggrafeaFld.getText();
        String epitheto = epithetoSiggrafeaFld.getText();

        if (onoma.trim().equals("") || epitheto.trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Δώσε έγκυρα δεδομένα στα πεδία!");
            return;
        }//if.

        Siggrafeas siggrafeas = new Siggrafeas();
        siggrafeas.setId(id);
        siggrafeas.setOnoma(onoma);
        siggrafeas.setEpitheto(epitheto);

        boolean updated = siggrafeisDAO.enimerwsiSiggrafea(siggrafeas);
        if (!updated) {
            JOptionPane.showMessageDialog(this, "Η ενημέρωση του συγγραφέα δεν ήταν επιτυχής! Κοιτάξτε τη ΒΔ!");
            return;
        }//if.

        onomaSiggrafeaFld.setEditable(false);
        epithetoSiggrafeaFld.setEditable(false);
        enimerwsiSiggrafeaBtn.setEnabled(true);
        diagrafiSiggrafeaBtn.setEnabled(true);
        kleisimoDialogBtn.setEnabled(true);
        ananewsiPinakaBtn.setEnabled(true);
        akirwsiEnimerwsisBtn.setEnabled(false);
        epivevaiwshEnimerwsisBtn.setEnabled(false);
        siggrafeisTable.setEnabled(true);

        isUnderUpdate = false;
        this.setClosable(true);

        JOptionPane.showMessageDialog(this, "Η ενημέρωση του συγγραφέα ήταν επιτυχής!");
        ananewsiPinakaBtn.doClick();

    }//GEN-LAST:event_epivevaiwshEnimerwsisBtnActionPerformed

    private void fortwsi_info_siggrafea_sta_txt_fields() {
        if (isUnderUpdate) {
            return;
        }

        int selectedRow = siggrafeisTable.getSelectedRow();
        if (selectedRow < 0) {
            enimerwsiSiggrafeaBtn.setEnabled(false);
            diagrafiSiggrafeaBtn.setEnabled(false);
            auxwnArithmosFld.setText("");
            onomaSiggrafeaFld.setText("");
            epithetoSiggrafeaFld.setText("");
            return;
        }//if.

        ArrayList<Siggrafeas> siggrafeis = ((EmfanisiSiggrafewnTableModel) siggrafeisTable.getModel()).getData();

        Siggrafeas epilegmenosSiggrafeas = siggrafeis.get(selectedRow);

        auxwnArithmosFld.setText(epilegmenosSiggrafeas.getId() + "");
        onomaSiggrafeaFld.setText(epilegmenosSiggrafeas.getOnoma());
        epithetoSiggrafeaFld.setText(epilegmenosSiggrafeas.getEpitheto());
        enimerwsiSiggrafeaBtn.setEnabled(true);
        diagrafiSiggrafeaBtn.setEnabled(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton akirwsiEnimerwsisBtn;
    private javax.swing.JButton ananewsiPinakaBtn;
    private javax.swing.JTextField auxwnArithmosFld;
    private javax.swing.JLabel auxwnArithmosLbl;
    private javax.swing.JButton diagrafiSiggrafeaBtn;
    private javax.swing.JButton enimerwsiSiggrafeaBtn;
    private javax.swing.JTextField epithetoSiggrafeaFld;
    private javax.swing.JLabel epithetoSiggrafeaLbl;
    private javax.swing.JButton epivevaiwshEnimerwsisBtn;
    private javax.swing.JButton kleisimoDialogBtn;
    private javax.swing.JPanel mainPane;
    private javax.swing.JTextField onomaSiggrafeaFld;
    private javax.swing.JLabel onomaSiggrafeaLbl;
    private javax.swing.JScrollPane scrollPane;
    private javax.swing.JTable siggrafeisTable;
    // End of variables declaration//GEN-END:variables
}
