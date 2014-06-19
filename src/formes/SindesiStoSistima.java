package formes;

import database.connection.DbConnection;
import database.daos.VivliothikarioiDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author nikos
 */
public class SindesiStoSistima extends javax.swing.JFrame {

    VivliothikarioiDAO vivliothikarioiDAO = new VivliothikarioiDAO(DbConnection.getInstance().getConnection());

    /**
     * Creates new form SindesiStoSistima
     */
    public SindesiStoSistima() {
        initComponents();
        this.setLocationRelativeTo(null);
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
        amLbl = new javax.swing.JLabel();
        passLbl = new javax.swing.JLabel();
        amFld = new javax.swing.JTextField();
        passFld = new javax.swing.JPasswordField();
        logariasmosLbl = new javax.swing.JLabel();
        logariasmosComboBox = new javax.swing.JComboBox();
        kleisimoEfarmogisBtn = new javax.swing.JButton();
        sindesiBtn = new javax.swing.JButton();
        welcomeLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Σύνδεση στο σύστημα βιβλιοθήκης");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        amLbl.setText("Αριθμός μητρώου:");

        passLbl.setText("Κωδικός:");

        logariasmosLbl.setText("Τύπος λογαριασμού:");

        logariasmosComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Χρήστης", "Βιβλιοθηκάριος" }));

        kleisimoEfarmogisBtn.setText("Κλείσιμο εφαρμογής");
        kleisimoEfarmogisBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kleisimoEfarmogisBtnActionPerformed(evt);
            }
        });

        sindesiBtn.setText("Σύνδεση");
        sindesiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sindesiBtnActionPerformed(evt);
            }
        });

        welcomeLbl.setText("Καλώς ήρθατε! Παρακαλώ συνδεθείτε για να συνεχίσετε.");

        javax.swing.GroupLayout mainPaneLayout = new javax.swing.GroupLayout(mainPane);
        mainPane.setLayout(mainPaneLayout);
        mainPaneLayout.setHorizontalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPaneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(sindesiBtn)
                        .addGap(18, 18, 18)
                        .addComponent(kleisimoEfarmogisBtn))
                    .addGroup(mainPaneLayout.createSequentialGroup()
                        .addComponent(welcomeLbl)
                        .addGap(0, 125, Short.MAX_VALUE))
                    .addGroup(mainPaneLayout.createSequentialGroup()
                        .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPaneLayout.createSequentialGroup()
                                    .addComponent(passLbl)
                                    .addGap(72, 72, 72))
                                .addGroup(mainPaneLayout.createSequentialGroup()
                                    .addComponent(logariasmosLbl)
                                    .addGap(7, 7, 7)))
                            .addGroup(mainPaneLayout.createSequentialGroup()
                                .addComponent(amLbl)
                                .addGap(18, 18, 18)))
                        .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amFld)
                            .addGroup(mainPaneLayout.createSequentialGroup()
                                .addComponent(logariasmosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(passFld))))
                .addContainerGap())
        );
        mainPaneLayout.setVerticalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(welcomeLbl)
                .addGap(18, 18, 18)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amLbl)
                    .addComponent(amFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(passLbl)
                    .addComponent(passFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logariasmosLbl)
                    .addComponent(logariasmosComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sindesiBtn)
                    .addComponent(kleisimoEfarmogisBtn))
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
                .addContainerGap()
                .addComponent(mainPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        int res = JOptionPane.showConfirmDialog(this, "Είστε σίγουρος?");
        if (res == JOptionPane.YES_OPTION) {
            System.exit(0);
        }

    }//GEN-LAST:event_formWindowClosing

    private void kleisimoEfarmogisBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kleisimoEfarmogisBtnActionPerformed
        System.exit(0);
    }//GEN-LAST:event_kleisimoEfarmogisBtnActionPerformed

    private void sindesiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sindesiBtnActionPerformed

        if (amFld.getText().trim().equals("") || passFld.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Παρακαλώ συμπλήρωσε τα πεδία!");
            return;
        }

        if (this.logariasmosComboBox.getSelectedIndex() == 1) {

        } else if (logariasmosComboBox.getSelectedIndex() == 0) {

        }

    }//GEN-LAST:event_sindesiBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SindesiStoSistima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new SindesiStoSistima().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField amFld;
    private javax.swing.JLabel amLbl;
    private javax.swing.JButton kleisimoEfarmogisBtn;
    private javax.swing.JComboBox logariasmosComboBox;
    private javax.swing.JLabel logariasmosLbl;
    private javax.swing.JPanel mainPane;
    private javax.swing.JPasswordField passFld;
    private javax.swing.JLabel passLbl;
    private javax.swing.JButton sindesiBtn;
    private javax.swing.JLabel welcomeLbl;
    // End of variables declaration//GEN-END:variables
}
