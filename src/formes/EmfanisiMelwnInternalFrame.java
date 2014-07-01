package formes;

import database.connection.DbConnection;
import database.daos.MelhDAO;
import database.models.Antitypo;
import database.models.IstorikoMelous;
import database.models.Melos;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import table_models.EmfanisiMelwnTableModel;

/**
 *
 * @author nikos
 */
public class EmfanisiMelwnInternalFrame extends javax.swing.JInternalFrame {

    private final MelhDAO melhDAO = new MelhDAO(DbConnection.getInstance().getConnection());
    @SuppressWarnings("FieldMayBeFinal")
    private Melos melosUnderUpdate = new Melos();
    private boolean someRecordUnderUpdate = false;

    /**
     * Creates new form EmfanisiMelwnInternalFrame
     */
    public EmfanisiMelwnInternalFrame() {
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
        arithmosMitrwouMelousLbl = new javax.swing.JLabel();
        onomaMelousLbl = new javax.swing.JLabel();
        epithetoMelousLbl = new javax.swing.JLabel();
        emailMelousLbl = new javax.swing.JLabel();
        arithmosMitrwouFld = new javax.swing.JTextField();
        onomaFld = new javax.swing.JTextField();
        emailFld = new javax.swing.JTextField();
        epithetoFld = new javax.swing.JTextField();
        kleisimoDialogBtn = new javax.swing.JButton();
        diagrafiMelousBtn = new javax.swing.JButton();
        enimerwsiMelousBtn = new javax.swing.JButton();
        akirwsiEnimerwsisBtn = new javax.swing.JButton();
        epivevaiwsiEnimerwsisBtn = new javax.swing.JButton();
        refreshMelhTableBtn = new javax.swing.JButton();
        scrollPane = new javax.swing.JScrollPane();
        melhTable = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Εμφάνιση Μελών");

        arithmosMitrwouMelousLbl.setText("Αριθμός Μητρώου μέλους:");

        onomaMelousLbl.setText("Όνομα μέλους:");

        epithetoMelousLbl.setText("Επίθετο μέλους:");

        emailMelousLbl.setText("Email μέλους:");

        arithmosMitrwouFld.setEditable(false);

        onomaFld.setEditable(false);

        emailFld.setEditable(false);

        epithetoFld.setEditable(false);

        kleisimoDialogBtn.setText("Κλείσιμο παράθυρου");
        kleisimoDialogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kleisimoDialogBtnActionPerformed(evt);
            }
        });

        diagrafiMelousBtn.setText("Διαγραφή Μέλους");
        diagrafiMelousBtn.setEnabled(false);
        diagrafiMelousBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagrafiMelousBtnActionPerformed(evt);
            }
        });

        enimerwsiMelousBtn.setText("Ενημέρωση μέλους");
        enimerwsiMelousBtn.setEnabled(false);
        enimerwsiMelousBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enimerwsiMelousBtnActionPerformed(evt);
            }
        });

        akirwsiEnimerwsisBtn.setText("Ακύρωση Ενημέρωσης");
        akirwsiEnimerwsisBtn.setEnabled(false);
        akirwsiEnimerwsisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                akirwsiEnimerwsisBtnActionPerformed(evt);
            }
        });

        epivevaiwsiEnimerwsisBtn.setText("Επιβεβαίωση Ενημέρωσης");
        epivevaiwsiEnimerwsisBtn.setEnabled(false);
        epivevaiwsiEnimerwsisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                epivevaiwsiEnimerwsisBtnActionPerformed(evt);
            }
        });

        refreshMelhTableBtn.setText("Ανανέωση πίνακα");
        refreshMelhTableBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshMelhTableBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPaneLayout = new javax.swing.GroupLayout(mainPane);
        mainPane.setLayout(mainPaneLayout);
        mainPaneLayout.setHorizontalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(arithmosMitrwouMelousLbl)
                    .addComponent(onomaMelousLbl)
                    .addComponent(epithetoMelousLbl)
                    .addComponent(emailMelousLbl))
                .addGap(30, 30, 30)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(emailFld, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
                    .addComponent(epithetoFld, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(onomaFld, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(arithmosMitrwouFld, javax.swing.GroupLayout.Alignment.LEADING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(refreshMelhTableBtn)
                .addContainerGap())
            .addGroup(mainPaneLayout.createSequentialGroup()
                .addComponent(enimerwsiMelousBtn)
                .addGap(18, 18, 18)
                .addComponent(akirwsiEnimerwsisBtn)
                .addGap(18, 18, 18)
                .addComponent(epivevaiwsiEnimerwsisBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                .addComponent(diagrafiMelousBtn)
                .addGap(18, 18, 18)
                .addComponent(kleisimoDialogBtn))
        );

        mainPaneLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {diagrafiMelousBtn, kleisimoDialogBtn});

        mainPaneLayout.setVerticalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPaneLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arithmosMitrwouMelousLbl)
                    .addComponent(arithmosMitrwouFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refreshMelhTableBtn))
                .addGap(18, 18, 18)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(onomaMelousLbl)
                    .addComponent(onomaFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(epithetoMelousLbl)
                    .addComponent(epithetoFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(emailMelousLbl)
                    .addComponent(emailFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enimerwsiMelousBtn)
                    .addComponent(akirwsiEnimerwsisBtn)
                    .addComponent(epivevaiwsiEnimerwsisBtn)
                    .addComponent(diagrafiMelousBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(kleisimoDialogBtn))
                .addContainerGap())
        );

        melhTable.setModel(new EmfanisiMelwnTableModel());
        melhTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        melhTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                melhTableMouseClicked(evt);
            }
        });
        melhTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                melhTableKeyReleased(evt);
            }
        });
        scrollPane.setViewportView(melhTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPane, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(mainPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mainPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kleisimoDialogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kleisimoDialogBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_kleisimoDialogBtnActionPerformed

    private void melhTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_melhTableMouseClicked
        fortwsiPliroforiwnEggrafisMelousStaTxtFields();
    }//GEN-LAST:event_melhTableMouseClicked

    private void melhTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_melhTableKeyReleased
        fortwsiPliroforiwnEggrafisMelousStaTxtFields();
    }//GEN-LAST:event_melhTableKeyReleased

    private void diagrafiMelousBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagrafiMelousBtnActionPerformed

        int result = JOptionPane.showConfirmDialog(this, "Είστε σίγουρος?");

        if (result == JOptionPane.YES_OPTION) {

            //prwta elegxoume ean to melos exei daneismena antitypa ean exei tote den epitrepoume thn diagrafi tou melous...
            ArrayList<Antitypo> antitypa = melhDAO.anaktisiDaneismenwnAntitypwn(Integer.parseInt(arithmosMitrwouFld.getText()));

            if (antitypa != null && !antitypa.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Το μέλος που προσπαθείτε να διαγράψετε εχει δανειστεί αντίτυπα "
                        + "τα οποια δεν εχει επιστρέψει.\nΠρώτα πρέπει να επιστραφούν και μετά δοκιμάστε ξανά για διαφραφή.");
                return;
            }//if.

            //alliws ean ftasame edw shmainei oti to melos den exei antitypa pou prepei na epistrepsei...
            //twra elegxoume ean exei istoriko daneismwn ean exei diagrafoume to istoriko kai meta to melos,
            //ean den exei istoriko diagrafoume kateutheian to melos.
            ArrayList<IstorikoMelous> istoriko = melhDAO.anaktisiIstorikouDaneismwnMelous(Integer.parseInt(arithmosMitrwouFld.getText()));

            if (istoriko != null && !istoriko.isEmpty()) {
                boolean del = melhDAO.diagrafiIstorikouDaneismwnMelous(Integer.parseInt(arithmosMitrwouFld.getText()));
                if (!del) {//ean den htan epituxes to delete tote...
                    JOptionPane.showMessageDialog(this, "Κάτι πήγε στραβά κατα την διαγραφή του ιστορικού του χρήστη, κοιτάξτε την ΒΔ!");
                    return;
                }
            }//if.

            //twra eftase h stigmh na diagrapsoume ton xristi....
            boolean melosDiegrafi = melhDAO.diagrafiMelous(Integer.parseInt(arithmosMitrwouFld.getText()));
            if (!melosDiegrafi) {
                JOptionPane.showMessageDialog(this, "Κάτι πήγε στραβά κατα την διαγραφή του μέλους, κοιτάξτε την ΒΔ!");
                return;
            }//if.

            //emfanizoume minima epityxias...
            JOptionPane.showMessageDialog(this, "Διαγραφή μέλους επιτυχής!");

            //enhmerwnoume to modelo tou table...
            melhTable.setModel(new EmfanisiMelwnTableModel());

            arithmosMitrwouFld.setText("");
            onomaFld.setText("");
            epithetoFld.setText("");
            emailFld.setText("");
            enimerwsiMelousBtn.setEnabled(false);
            diagrafiMelousBtn.setEnabled(false);

        }//if.

    }//GEN-LAST:event_diagrafiMelousBtnActionPerformed

    private void refreshMelhTableBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshMelhTableBtnActionPerformed
        //enhmerwnoume to modelo tou table...
        melhTable.setModel(new EmfanisiMelwnTableModel());
        melhTable.repaint();

        arithmosMitrwouFld.setText("");
        onomaFld.setText("");
        epithetoFld.setText("");
        emailFld.setText("");
        enimerwsiMelousBtn.setEnabled(false);
        diagrafiMelousBtn.setEnabled(false);
    }//GEN-LAST:event_refreshMelhTableBtnActionPerformed

    private void enimerwsiMelousBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enimerwsiMelousBtnActionPerformed

        this.setClosable(false);

        someRecordUnderUpdate = true;

        melosUnderUpdate.setAm(Integer.parseInt(arithmosMitrwouFld.getText()));
        melosUnderUpdate.setOnoma(onomaFld.getText());
        melosUnderUpdate.setEpitheto(epithetoFld.getText());
        melosUnderUpdate.setEmail(emailFld.getText());

        melhTable.setEnabled(false);

        onomaFld.setEditable(true);
        epithetoFld.setEditable(true);
        emailFld.setEditable(true);

        refreshMelhTableBtn.setEnabled(false);
        kleisimoDialogBtn.setEnabled(false);
        diagrafiMelousBtn.setEnabled(false);
        enimerwsiMelousBtn.setEnabled(false);

        akirwsiEnimerwsisBtn.setEnabled(true);
        epivevaiwsiEnimerwsisBtn.setEnabled(true);

        onomaFld.requestFocus();


    }//GEN-LAST:event_enimerwsiMelousBtnActionPerformed

    private void akirwsiEnimerwsisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_akirwsiEnimerwsisBtnActionPerformed

        this.setClosable(true);

        someRecordUnderUpdate = false;

        arithmosMitrwouFld.setText(melosUnderUpdate.getAm() + "");
        onomaFld.setText(melosUnderUpdate.getOnoma());
        epithetoFld.setText(melosUnderUpdate.getEpitheto());
        emailFld.setText(melosUnderUpdate.getEmail());

        melhTable.setEnabled(true);

        onomaFld.setEditable(false);
        epithetoFld.setEditable(false);
        emailFld.setEditable(false);

        refreshMelhTableBtn.setEnabled(true);
        kleisimoDialogBtn.setEnabled(true);
        diagrafiMelousBtn.setEnabled(true);
        enimerwsiMelousBtn.setEnabled(true);

        akirwsiEnimerwsisBtn.setEnabled(false);
        epivevaiwsiEnimerwsisBtn.setEnabled(false);

    }//GEN-LAST:event_akirwsiEnimerwsisBtnActionPerformed

    private void epivevaiwsiEnimerwsisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_epivevaiwsiEnimerwsisBtnActionPerformed

        //pairnoume ta dedomena....
        Melos newDataForMelos = new Melos();
        newDataForMelos.setAm(Integer.parseInt(arithmosMitrwouFld.getText()));
        newDataForMelos.setOnoma(onomaFld.getText());
        newDataForMelos.setEpitheto(epithetoFld.getText());
        newDataForMelos.setEmail(emailFld.getText());

        boolean enimerwthike = melhDAO.enimerwsiEggrafisMelous(newDataForMelos);

        if (!enimerwthike) {
            JOptionPane.showMessageDialog(this, "Κάτι πήγε στραβά κατα την ενημέρωση, κοιτάξτε την ΒΔ!");
            return;
        }//if.

        JOptionPane.showMessageDialog(this, "Τα στοιχεία του μέλους ενημερώθηκαν επιτυχώς!");

        this.setClosable(true);

        someRecordUnderUpdate = false;

        melhTable.setEnabled(true);

        onomaFld.setEditable(false);
        epithetoFld.setEditable(false);
        emailFld.setEditable(false);

        refreshMelhTableBtn.setEnabled(true);
        kleisimoDialogBtn.setEnabled(true);
        diagrafiMelousBtn.setEnabled(true);
        enimerwsiMelousBtn.setEnabled(true);

        akirwsiEnimerwsisBtn.setEnabled(false);
        epivevaiwsiEnimerwsisBtn.setEnabled(false);

        refreshMelhTableBtn.doClick();


    }//GEN-LAST:event_epivevaiwsiEnimerwsisBtnActionPerformed

    private void fortwsiPliroforiwnEggrafisMelousStaTxtFields() {

        if (someRecordUnderUpdate) {
            return;
        }

        int selectedRow = melhTable.getSelectedRow();
        if (selectedRow < 0) {
            arithmosMitrwouFld.setText("");
            onomaFld.setText("");
            epithetoFld.setText("");
            emailFld.setText("");
            enimerwsiMelousBtn.setEnabled(false);
            diagrafiMelousBtn.setEnabled(false);
            return;
        }
        ArrayList<Melos> melh = ((EmfanisiMelwnTableModel) melhTable.getModel()).getData();
        Melos melos = melh.get(selectedRow);
        arithmosMitrwouFld.setText(melos.getAm() + "");
        onomaFld.setText(melos.getOnoma());
        epithetoFld.setText(melos.getEpitheto());
        emailFld.setText(melos.getEmail());
        enimerwsiMelousBtn.setEnabled(true);
        diagrafiMelousBtn.setEnabled(true);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton akirwsiEnimerwsisBtn;
    private javax.swing.JTextField arithmosMitrwouFld;
    private javax.swing.JLabel arithmosMitrwouMelousLbl;
    private javax.swing.JButton diagrafiMelousBtn;
    private javax.swing.JTextField emailFld;
    private javax.swing.JLabel emailMelousLbl;
    private javax.swing.JButton enimerwsiMelousBtn;
    private javax.swing.JTextField epithetoFld;
    private javax.swing.JLabel epithetoMelousLbl;
    private javax.swing.JButton epivevaiwsiEnimerwsisBtn;
    private javax.swing.JButton kleisimoDialogBtn;
    private javax.swing.JPanel mainPane;
    private javax.swing.JTable melhTable;
    private javax.swing.JTextField onomaFld;
    private javax.swing.JLabel onomaMelousLbl;
    private javax.swing.JButton refreshMelhTableBtn;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
}
