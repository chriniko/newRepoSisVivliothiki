package formes;

import database.connection.DbConnection;
import database.daos.EkdotesDAO;
import database.models.Ekdotis;
import database.models.Vivlio;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import table_models.EmfanisiEkdotwnTableModel;

public class EmfanisiEkdotwnInternalFrame extends javax.swing.JInternalFrame {

    private final EkdotesDAO ekdotesDao = new EkdotesDAO(DbConnection.getInstance().getConnection());
    private boolean isUnderUpdate = false;
    private final Ekdotis ekdotiToUpdate = new Ekdotis();

    /**
     * Creates new form EmfanisiEkdotwnInternalFrame
     */
    public EmfanisiEkdotwnInternalFrame() {
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
        ekdotesTable = new javax.swing.JTable();
        mainPane = new javax.swing.JPanel();
        onomaEkdotiLbl = new javax.swing.JLabel();
        onomaEkdotiFld = new javax.swing.JTextField();
        kleisimoDialogBtn = new javax.swing.JButton();
        diagrafiEkdotiBtn = new javax.swing.JButton();
        enimerwsiEkdotiBtn = new javax.swing.JButton();
        akirwsiEnimerwsisBtn = new javax.swing.JButton();
        epivevaiwshEnimerwsisBtn = new javax.swing.JButton();
        auxwnArithmosLbl = new javax.swing.JLabel();
        auxwnArithmosFld = new javax.swing.JTextField();
        ananewsiPinakaBtn = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Εμφάνιση Εκδοτών");

        ekdotesTable.setModel(new EmfanisiEkdotwnTableModel());
        ekdotesTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        ekdotesTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ekdotesTableMouseClicked(evt);
            }
        });
        ekdotesTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                ekdotesTableKeyReleased(evt);
            }
        });
        scrollPane.setViewportView(ekdotesTable);

        onomaEkdotiLbl.setText("Όνομα εκδότη:");

        onomaEkdotiFld.setEditable(false);

        kleisimoDialogBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_icons/close.png"))); // NOI18N
        kleisimoDialogBtn.setText("Κλείσιμο παράθυρου");
        kleisimoDialogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kleisimoDialogBtnActionPerformed(evt);
            }
        });

        diagrafiEkdotiBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_icons/delete.png"))); // NOI18N
        diagrafiEkdotiBtn.setText("Διαγραφή Εκδότη");
        diagrafiEkdotiBtn.setEnabled(false);
        diagrafiEkdotiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagrafiEkdotiBtnActionPerformed(evt);
            }
        });

        enimerwsiEkdotiBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_icons/update.png"))); // NOI18N
        enimerwsiEkdotiBtn.setText("Ενημέρωση εκδότη");
        enimerwsiEkdotiBtn.setEnabled(false);
        enimerwsiEkdotiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enimerwsiEkdotiBtnActionPerformed(evt);
            }
        });

        akirwsiEnimerwsisBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_icons/exit.png"))); // NOI18N
        akirwsiEnimerwsisBtn.setText("Ακύρωση Ενημέρωσης");
        akirwsiEnimerwsisBtn.setEnabled(false);
        akirwsiEnimerwsisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akirwsiEnimerwsisBtnActionPerformed(evt);
            }
        });

        epivevaiwshEnimerwsisBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_icons/done.png"))); // NOI18N
        epivevaiwshEnimerwsisBtn.setText("Επιβεβαίωση Ενημέρωσης");
        epivevaiwshEnimerwsisBtn.setEnabled(false);
        epivevaiwshEnimerwsisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                epivevaiwshEnimerwsisBtnActionPerformed(evt);
            }
        });

        auxwnArithmosLbl.setText("Αύξων αριθμός εκδότη:");

        auxwnArithmosFld.setEditable(false);

        ananewsiPinakaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_icons/refresh.png"))); // NOI18N
        ananewsiPinakaBtn.setText("Ανανέωση πίνακα");
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
                .addComponent(enimerwsiEkdotiBtn)
                .addGap(18, 18, 18)
                .addComponent(akirwsiEnimerwsisBtn)
                .addGap(18, 18, 18)
                .addComponent(epivevaiwshEnimerwsisBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(diagrafiEkdotiBtn)
                .addGap(18, 18, 18)
                .addComponent(kleisimoDialogBtn))
            .addGroup(mainPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(onomaEkdotiLbl)
                    .addComponent(auxwnArithmosLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(onomaEkdotiFld, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                    .addComponent(auxwnArithmosFld))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ananewsiPinakaBtn)
                .addContainerGap())
        );
        mainPaneLayout.setVerticalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(auxwnArithmosLbl)
                    .addComponent(auxwnArithmosFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ananewsiPinakaBtn))
                .addGap(16, 16, 16)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onomaEkdotiLbl)
                    .addComponent(onomaEkdotiFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enimerwsiEkdotiBtn)
                    .addComponent(akirwsiEnimerwsisBtn)
                    .addComponent(epivevaiwshEnimerwsisBtn)
                    .addComponent(diagrafiEkdotiBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kleisimoDialogBtn))
                .addGap(66, 66, 66))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(scrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 993, Short.MAX_VALUE)
                        .addGap(18, 18, 18))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mainPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mainPane, javax.swing.GroupLayout.PREFERRED_SIZE, 160, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kleisimoDialogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kleisimoDialogBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_kleisimoDialogBtnActionPerformed

    private void ekdotesTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ekdotesTableMouseClicked
        fortwsi_epilegmenou_onomatos_ekdoti_sto_txt_field();
    }//GEN-LAST:event_ekdotesTableMouseClicked

    private void ekdotesTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ekdotesTableKeyReleased
        fortwsi_epilegmenou_onomatos_ekdoti_sto_txt_field();
    }//GEN-LAST:event_ekdotesTableKeyReleased

    private void akirwsiEnimerwsisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akirwsiEnimerwsisBtnActionPerformed
        enimerwsiEkdotiBtn.setEnabled(true);
        akirwsiEnimerwsisBtn.setEnabled(false);
        epivevaiwshEnimerwsisBtn.setEnabled(false);
        diagrafiEkdotiBtn.setEnabled(true);
        kleisimoDialogBtn.setEnabled(true);
        this.setClosable(true);
        ekdotesTable.setEnabled(true);
        isUnderUpdate = false;

        onomaEkdotiFld.setEditable(false);

        ananewsiPinakaBtn.setEnabled(true);

        onomaEkdotiFld.setText(ekdotiToUpdate.getName());

    }//GEN-LAST:event_akirwsiEnimerwsisBtnActionPerformed

    private void epivevaiwshEnimerwsisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_epivevaiwshEnimerwsisBtnActionPerformed

        String newName = onomaEkdotiFld.getText();
        if (newName.trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Παρακαλώ δώστε έγκυρο όνομα εκδότη!");
            return;
        }//if.

        int idEkdotiToUpdate = Integer.parseInt(auxwnArithmosFld.getText());

        boolean enimerwthike = ekdotesDao.enimerwsiEkdoti(idEkdotiToUpdate, newName);
        if (!enimerwthike) {
            JOptionPane.showMessageDialog(this, "Κάτι πήγε στραβά κατα την ενημέρωση, κοιτάξτε την ΒΔ!");
            return;
        }//if.

        //ean ftasame edw shmainei oti enimerwthike h db...
        JOptionPane.showMessageDialog(this, "Η ενημέρωση του εκδότη ήταν επιτυχής!");

        enimerwsiEkdotiBtn.setEnabled(true);
        akirwsiEnimerwsisBtn.setEnabled(false);
        epivevaiwshEnimerwsisBtn.setEnabled(false);
        diagrafiEkdotiBtn.setEnabled(true);
        kleisimoDialogBtn.setEnabled(true);
        this.setClosable(true);
        ekdotesTable.setEnabled(true);
        isUnderUpdate = false;
        onomaEkdotiFld.setEditable(false);

        ananewsiPinakaBtn.setEnabled(true);

        ananewsiPinakaBtn.doClick();

    }//GEN-LAST:event_epivevaiwshEnimerwsisBtnActionPerformed

    private void diagrafiEkdotiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagrafiEkdotiBtnActionPerformed

        int res = JOptionPane.showConfirmDialog(this, "Είστε σίγουρος?");
        if (res != JOptionPane.YES_OPTION) {
            return;
        }//if.

        //twra tha elegxoume an o sigekrimenos ekdotis exei kapoio reference se vivlio, ean exei tote den to diagrafoume, 
        //leme sto xristi na diagrapsei prwta to vivlio kai meta na xanaprospathisei, ean den exei kanena reference tote ton diagrafoume...
        ArrayList<Vivlio> vivliaEkdoti = ekdotesDao.anaktisiVivliwnEkdoti(Integer.parseInt(auxwnArithmosFld.getText()));
        if (vivliaEkdoti != null && !vivliaEkdoti.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Ο εκδότης που θές να διαγράψεις ειναι reference στο πινακα 'vivlia',\n"
                    + " διέγραψε πρώτα τα βιβλία που είναι reference και ξαναπροσπάθησε!");
            return;
        }//if.

        //ean ftasame edw shmainei oti o sigekrimenos ekdotis den exei reference sta vivlia ara ton diagrafoume...
        boolean diegrafi = ekdotesDao.diagrafiEkdoti(Integer.parseInt(auxwnArithmosFld.getText()));
        if (!diegrafi) {
            JOptionPane.showMessageDialog(this, "Δεν ήταν επιτυχής η διαγραφή του εκδοτη, δες την ΒΔ!");
            return;
        }//if.

        //ananewnoume to modelo tou JTable...
        ekdotesTable.setModel(new EmfanisiEkdotwnTableModel());
        ekdotesTable.repaint();

        enimerwsiEkdotiBtn.setEnabled(false);
        diagrafiEkdotiBtn.setEnabled(false);
        auxwnArithmosFld.setText("");
        onomaEkdotiFld.setText("");

    }//GEN-LAST:event_diagrafiEkdotiBtnActionPerformed

    private void enimerwsiEkdotiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enimerwsiEkdotiBtnActionPerformed
        enimerwsiEkdotiBtn.setEnabled(false);
        akirwsiEnimerwsisBtn.setEnabled(true);
        epivevaiwshEnimerwsisBtn.setEnabled(true);
        diagrafiEkdotiBtn.setEnabled(false);
        kleisimoDialogBtn.setEnabled(false);
        this.setClosable(false);
        ekdotesTable.setEnabled(false);
        isUnderUpdate = true;

        ananewsiPinakaBtn.setEnabled(false);

        ekdotiToUpdate.setId(Integer.parseInt(auxwnArithmosFld.getText()));
        ekdotiToUpdate.setName(onomaEkdotiFld.getText());

        onomaEkdotiFld.setEditable(true);
        onomaEkdotiFld.requestFocus();
    }//GEN-LAST:event_enimerwsiEkdotiBtnActionPerformed

    private void ananewsiPinakaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ananewsiPinakaBtnActionPerformed
        ekdotesTable.setModel(new EmfanisiEkdotwnTableModel());
        ekdotesTable.repaint();
        auxwnArithmosFld.setText("");
        onomaEkdotiFld.setText("");
        diagrafiEkdotiBtn.setEnabled(false);
        enimerwsiEkdotiBtn.setEnabled(false);
    }//GEN-LAST:event_ananewsiPinakaBtnActionPerformed

    private void fortwsi_epilegmenou_onomatos_ekdoti_sto_txt_field() {

        if (isUnderUpdate) {
            return;
        }

        int selectedRow = ekdotesTable.getSelectedRow();
        if (selectedRow == -1) {
            enimerwsiEkdotiBtn.setEnabled(false);
            diagrafiEkdotiBtn.setEnabled(false);
            auxwnArithmosFld.setText("");
            onomaEkdotiFld.setText("");
            return;
        }//if.

        ArrayList<Ekdotis> ekdotes = ((EmfanisiEkdotwnTableModel) ekdotesTable.getModel()).getData();

        Ekdotis epilegmenosEkdotis = ekdotes.get(selectedRow);

        auxwnArithmosFld.setText(epilegmenosEkdotis.getId() + "");
        onomaEkdotiFld.setText(epilegmenosEkdotis.getName());

        enimerwsiEkdotiBtn.setEnabled(true);
        diagrafiEkdotiBtn.setEnabled(true);

    }//fortwsi_epilegmenou_onomatos_ekdoti_sto_txt_field.


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton akirwsiEnimerwsisBtn;
    private javax.swing.JButton ananewsiPinakaBtn;
    private javax.swing.JTextField auxwnArithmosFld;
    private javax.swing.JLabel auxwnArithmosLbl;
    private javax.swing.JButton diagrafiEkdotiBtn;
    private javax.swing.JTable ekdotesTable;
    private javax.swing.JButton enimerwsiEkdotiBtn;
    private javax.swing.JButton epivevaiwshEnimerwsisBtn;
    private javax.swing.JButton kleisimoDialogBtn;
    private javax.swing.JPanel mainPane;
    private javax.swing.JTextField onomaEkdotiFld;
    private javax.swing.JLabel onomaEkdotiLbl;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
}
