package formes;

import database.connection.DbConnection;
import database.daos.VivliaDAO;
import database.models.Siggrafeas;
import database.models.Vivlio;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import table_models.EmfanisiVivliwnTableModel;

/**
 *
 * @author nikos
 */
public class EmfanisiVivliwnInternalFrame extends javax.swing.JInternalFrame {

    private final VivliaDAO vivliaDao = new VivliaDAO(DbConnection.getInstance().getConnection());
    DefaultListModel listaModelou = new DefaultListModel();

    /**
     * Creates new form EmfanisiVivliwnInternalFrame
     */
    public EmfanisiVivliwnInternalFrame() {
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

        scrollerBooksTable = new javax.swing.JScrollPane();
        booksTable = new javax.swing.JTable();
        firstPane = new javax.swing.JPanel();
        isbnLbl = new javax.swing.JLabel();
        titleLbl = new javax.swing.JLabel();
        ekdoseisLbl = new javax.swing.JLabel();
        kleisimoParathirouBtn = new javax.swing.JButton();
        ekdoseisFld = new javax.swing.JTextField();
        titleFld = new javax.swing.JTextField();
        isbnFld = new javax.swing.JTextField();
        siggrafeasLbl = new javax.swing.JLabel();
        scrollerSiggrafeisList = new javax.swing.JScrollPane();
        siggrafeisList = new javax.swing.JList();
        perigrafiLbl = new javax.swing.JLabel();
        scrollerPerigrafiTxtPane = new javax.swing.JScrollPane();
        perigrafiVivliouTxtPane = new javax.swing.JTextArea();
        ananewsiPinakaBtn = new javax.swing.JButton();
        titlosVivliouLbl = new javax.swing.JLabel();
        titlosToSearch = new javax.swing.JTextField();
        searchTitlosBtn = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Εμφάνιση Βιβλίων");

        booksTable.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        booksTable.setModel(new EmfanisiVivliwnTableModel
            ());
        booksTable.setRowHeight(250);
        booksTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        booksTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booksTableMouseClicked(evt);
            }
        });
        booksTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                booksTableKeyReleased(evt);
            }
        });
        scrollerBooksTable.setViewportView(booksTable);

        isbnLbl.setText("ISBN βιβλίου:");

        titleLbl.setText("Τίτλος βιβλίου:");

        ekdoseisLbl.setText("Εκδόσεις βιβλίου:");

        kleisimoParathirouBtn.setText("Κλείσιμο παράθυρου");
        kleisimoParathirouBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kleisimoParathirouBtnActionPerformed(evt);
            }
        });

        ekdoseisFld.setEditable(false);

        titleFld.setEditable(false);

        isbnFld.setEditable(false);

        siggrafeasLbl.setText("Συγγραφέας/Συγγραφείς βιβλίου:");

        siggrafeisList.setModel(listaModelou);
        scrollerSiggrafeisList.setViewportView(siggrafeisList);

        perigrafiLbl.setText("Περιγραφή βιβλίου:");

        perigrafiVivliouTxtPane.setEditable(false);
        perigrafiVivliouTxtPane.setColumns(20);
        perigrafiVivliouTxtPane.setLineWrap(true);
        perigrafiVivliouTxtPane.setRows(5);
        perigrafiVivliouTxtPane.setWrapStyleWord(true);
        scrollerPerigrafiTxtPane.setViewportView(perigrafiVivliouTxtPane);

        javax.swing.GroupLayout firstPaneLayout = new javax.swing.GroupLayout(firstPane);
        firstPane.setLayout(firstPaneLayout);
        firstPaneLayout.setHorizontalGroup(
            firstPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(firstPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ekdoseisLbl)
                    .addComponent(titleLbl)
                    .addComponent(isbnLbl)
                    .addComponent(siggrafeasLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(firstPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(isbnFld, javax.swing.GroupLayout.DEFAULT_SIZE, 390, Short.MAX_VALUE)
                    .addComponent(titleFld)
                    .addComponent(ekdoseisFld)
                    .addComponent(scrollerSiggrafeisList, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(firstPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollerPerigrafiTxtPane)
                    .addGroup(firstPaneLayout.createSequentialGroup()
                        .addComponent(perigrafiLbl)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, firstPaneLayout.createSequentialGroup()
                        .addGap(342, 342, 342)
                        .addComponent(kleisimoParathirouBtn)))
                .addContainerGap())
        );
        firstPaneLayout.setVerticalGroup(
            firstPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(firstPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(firstPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isbnLbl)
                    .addComponent(isbnFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(perigrafiLbl))
                .addGroup(firstPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(firstPaneLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(scrollerPerigrafiTxtPane)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(kleisimoParathirouBtn))
                    .addGroup(firstPaneLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(firstPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titleLbl)
                            .addComponent(titleFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(firstPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ekdoseisLbl)
                            .addComponent(ekdoseisFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(firstPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(siggrafeasLbl)
                            .addComponent(scrollerSiggrafeisList, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
        );

        ananewsiPinakaBtn.setText("Ανανέωση Πίνακα");
        ananewsiPinakaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ananewsiPinakaBtnActionPerformed(evt);
            }
        });

        titlosVivliouLbl.setText("Πήγαινε στο βιβλίο με τίτλο:");

        searchTitlosBtn.setText("Πήγαινε!");
        searchTitlosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchTitlosBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollerBooksTable, javax.swing.GroupLayout.DEFAULT_SIZE, 1142, Short.MAX_VALUE)
                    .addComponent(firstPane, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ananewsiPinakaBtn)
                        .addGap(18, 18, 18)
                        .addComponent(titlosVivliouLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(titlosToSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchTitlosBtn)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ananewsiPinakaBtn)
                    .addComponent(titlosVivliouLbl)
                    .addComponent(titlosToSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchTitlosBtn))
                .addGap(18, 18, 18)
                .addComponent(scrollerBooksTable, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(firstPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kleisimoParathirouBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kleisimoParathirouBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_kleisimoParathirouBtnActionPerformed

    private void booksTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_booksTableMouseClicked
        fortwsi_epilegmenis_eggrafis_sta_text_fields();
    }//GEN-LAST:event_booksTableMouseClicked

    private void booksTableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_booksTableKeyReleased
        fortwsi_epilegmenis_eggrafis_sta_text_fields();
    }//GEN-LAST:event_booksTableKeyReleased

    private void ananewsiPinakaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ananewsiPinakaBtnActionPerformed

        isbnFld.setText("");
        titleFld.setText("");
        ekdoseisFld.setText("");
        listaModelou.clear();
        perigrafiVivliouTxtPane.setText("");
        booksTable.setModel(new EmfanisiVivliwnTableModel());

    }//GEN-LAST:event_ananewsiPinakaBtnActionPerformed

    private void searchTitlosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchTitlosBtnActionPerformed
        String toFind = titlosToSearch.getText();

        if (toFind.trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Παρακαλώ συμπληρώστε το πεδίο!");
            return;
        }//if.

        ArrayList<Vivlio> vivlia = ((EmfanisiVivliwnTableModel) booksTable.getModel()).getData();

        Pattern pattern = Pattern.compile("^" + toFind + ".*");
        Matcher matcher;

        for (int i = 0; i < vivlia.size(); i++) {
            matcher = pattern.matcher(vivlia.get(i).getTitlos());
            if (matcher.find()) {
                booksTable.setRowSelectionInterval(i, i);
                booksTable.scrollRectToVisible(new Rectangle(booksTable.getCellRect(i, 0, true)));
                break;
            }//if.
        }//for.

    }//GEN-LAST:event_searchTitlosBtnActionPerformed

    private void fortwsi_epilegmenis_eggrafis_sta_text_fields() {

        int selectedRow = booksTable.getSelectedRow();
        if (selectedRow < 0) {
            isbnFld.setText("");
            titleFld.setText("");
            ekdoseisFld.setText("");
            listaModelou.clear();
            perigrafiVivliouTxtPane.setText("");
            return;
        }//if.

        ArrayList<Vivlio> data = ((EmfanisiVivliwnTableModel) booksTable.getModel()).getData();
        Vivlio epilegmenoVivlio = data.get(selectedRow);

        isbnFld.setText(epilegmenoVivlio.getIsbn());
        titleFld.setText(epilegmenoVivlio.getTitlos());
        ekdoseisFld.setText(epilegmenoVivlio.getOnoma_ekdoti());

        //anaktisi siggrafewn vivlio kai topothetisi tou sth lista.....
        ArrayList<Siggrafeas> siggrafeis = vivliaDao.anaktisiSiggrafeisVivliou(epilegmenoVivlio.getIsbn());
        listaModelou.clear();
        for (Siggrafeas siggrafeas : siggrafeis) {
            listaModelou.addElement(siggrafeas.getOnoma() + " " + siggrafeas.getEpitheto());
        }

        perigrafiVivliouTxtPane.setText(epilegmenoVivlio.getPerigrafi_vivliou());

    }//fortwsi_epilegmenis_eggrafis_sta_text_fields.


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ananewsiPinakaBtn;
    private javax.swing.JTable booksTable;
    private javax.swing.JTextField ekdoseisFld;
    private javax.swing.JLabel ekdoseisLbl;
    private javax.swing.JPanel firstPane;
    private javax.swing.JTextField isbnFld;
    private javax.swing.JLabel isbnLbl;
    private javax.swing.JButton kleisimoParathirouBtn;
    private javax.swing.JLabel perigrafiLbl;
    private javax.swing.JTextArea perigrafiVivliouTxtPane;
    private javax.swing.JScrollPane scrollerBooksTable;
    private javax.swing.JScrollPane scrollerPerigrafiTxtPane;
    private javax.swing.JScrollPane scrollerSiggrafeisList;
    private javax.swing.JButton searchTitlosBtn;
    private javax.swing.JLabel siggrafeasLbl;
    private javax.swing.JList siggrafeisList;
    private javax.swing.JTextField titleFld;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JTextField titlosToSearch;
    private javax.swing.JLabel titlosVivliouLbl;
    // End of variables declaration//GEN-END:variables
}
