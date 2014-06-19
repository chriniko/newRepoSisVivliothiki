/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package formes;

/**
 *
 * @author nikos
 */
public class EmfanisiMelwnInternalFrame extends javax.swing.JInternalFrame {

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

        enimerwsiMelousBtn.setText("Ενημέρωση μέλους");
        enimerwsiMelousBtn.setEnabled(false);

        akirwsiEnimerwsisBtn.setText("Ακύρωση Ενημέρωσης");
        akirwsiEnimerwsisBtn.setEnabled(false);

        epivevaiwsiEnimerwsisBtn.setText("Επιβεβαίωση Ενημέρωσης");
        epivevaiwsiEnimerwsisBtn.setEnabled(false);

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
                .addContainerGap(364, Short.MAX_VALUE))
            .addGroup(mainPaneLayout.createSequentialGroup()
                .addComponent(enimerwsiMelousBtn)
                .addGap(18, 18, 18)
                .addComponent(akirwsiEnimerwsisBtn)
                .addGap(18, 18, 18)
                .addComponent(epivevaiwsiEnimerwsisBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(diagrafiMelousBtn)
                .addGap(18, 18, 18)
                .addComponent(kleisimoDialogBtn))
        );

        mainPaneLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {diagrafiMelousBtn, kleisimoDialogBtn});

        mainPaneLayout.setVerticalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPaneLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arithmosMitrwouMelousLbl)
                    .addComponent(arithmosMitrwouFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        melhTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
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
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
}
