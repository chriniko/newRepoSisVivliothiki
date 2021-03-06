package formes;

import database.connection.DbConnection;
import database.daos.AntitypaDAO;
import database.daos.VivliaDAO;
import database.models.Antitypo;
import database.models.Vivlio;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import table_models.EmfanisiAntitypwnTableModel;

public class DiaxeirisiAntitypwnVivliouInternalFrame extends javax.swing.JInternalFrame {

    private final VivliaDAO vivliaDao = new VivliaDAO(DbConnection.getInstance().getConnection());
    private final AntitypaDAO antitypaDao = new AntitypaDAO(DbConnection.getInstance().getConnection());

    /**
     * Creates new form DiaxeirisiAntitypwnVivliwnInternalFrame
     */
    public DiaxeirisiAntitypwnVivliouInternalFrame() {
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

        searchPane = new javax.swing.JPanel();
        isbnLbl = new javax.swing.JLabel();
        isbnFld = new javax.swing.JTextField();
        anazitisiBtn = new javax.swing.JButton();
        katharismosPediwnBtn = new javax.swing.JButton();
        scrollerForAntitypa = new javax.swing.JScrollPane();
        antitypaTable = new javax.swing.JTable();
        utilsPane = new javax.swing.JPanel();
        deletePane = new javax.swing.JPanel();
        diagrafiAntitypouBtn = new javax.swing.JButton();
        insertBookCopyPane = new javax.swing.JPanel();
        katastasiLbl = new javax.swing.JLabel();
        katastasiComboBox = new javax.swing.JComboBox();
        eisagwgiAntitypouBtn = new javax.swing.JButton();
        updateBookCopyPane = new javax.swing.JPanel();
        neaKatastasiLbl = new javax.swing.JLabel();
        enimerwsiBookCopyBtn = new javax.swing.JButton();
        neaKatastasiComboBox = new javax.swing.JComboBox();
        enimerwsiPinakaBtn = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Διαχείριση αντίτυπων βιβλίου");

        searchPane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search Book's Copies", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Bitstream Charter", 0, 14), java.awt.Color.black)); // NOI18N

        isbnLbl.setText("Δώσε ISBN:");

        anazitisiBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_icons/search.png"))); // NOI18N
        anazitisiBtn.setText("Αναζήτηση");
        anazitisiBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anazitisiBtnActionPerformed(evt);
            }
        });

        katharismosPediwnBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_icons/discardChanges.png"))); // NOI18N
        katharismosPediwnBtn.setText("Καθαρισμός πεδίων");
        katharismosPediwnBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                katharismosPediwnBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout searchPaneLayout = new javax.swing.GroupLayout(searchPane);
        searchPane.setLayout(searchPaneLayout);
        searchPaneLayout.setHorizontalGroup(
            searchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchPaneLayout.createSequentialGroup()
                        .addComponent(isbnLbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(isbnFld, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(searchPaneLayout.createSequentialGroup()
                        .addComponent(anazitisiBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(katharismosPediwnBtn)))
                .addContainerGap(160, Short.MAX_VALUE))
        );
        searchPaneLayout.setVerticalGroup(
            searchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(searchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isbnLbl)
                    .addComponent(isbnFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(searchPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(anazitisiBtn)
                    .addComponent(katharismosPediwnBtn))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        antitypaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ISBN", "Αύξων αριθμός αντιτύπου", "Κατάσταση αντιτύπου", "ΑΜ Δανειζόμενου Μέλους", "Ημερομηνία Δανεισμού"
            }
        ));
        antitypaTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        antitypaTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                antitypaTableMouseClicked(evt);
            }
        });
        scrollerForAntitypa.setViewportView(antitypaTable);

        utilsPane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Selected Book Copy Actions", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Bitstream Charter", 0, 14), java.awt.Color.black)); // NOI18N

        deletePane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Delete Book Copy", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Bitstream Charter", 0, 14), java.awt.Color.black)); // NOI18N

        diagrafiAntitypouBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_icons/delete.png"))); // NOI18N
        diagrafiAntitypouBtn.setText("Διαγραφή Αντίτυπου");
        diagrafiAntitypouBtn.setEnabled(false);
        diagrafiAntitypouBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagrafiAntitypouBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout deletePaneLayout = new javax.swing.GroupLayout(deletePane);
        deletePane.setLayout(deletePaneLayout);
        deletePaneLayout.setHorizontalGroup(
            deletePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(diagrafiAntitypouBtn)
                .addContainerGap(140, Short.MAX_VALUE))
        );
        deletePaneLayout.setVerticalGroup(
            deletePaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deletePaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(diagrafiAntitypouBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        insertBookCopyPane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Insert New Book Copy", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Bitstream Charter", 0, 14), java.awt.Color.black)); // NOI18N

        katastasiLbl.setText("Επίλεξε κατάσταση αντίτυπου:");

        katastasiComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Κακιά", "Μέτρια", "Καλή", "Άριστη" }));
        katastasiComboBox.setEnabled(false);

        eisagwgiAntitypouBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_icons/insert.png"))); // NOI18N
        eisagwgiAntitypouBtn.setText("Εισαγωγή αντίτυπου");
        eisagwgiAntitypouBtn.setToolTipText("");
        eisagwgiAntitypouBtn.setEnabled(false);
        eisagwgiAntitypouBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eisagwgiAntitypouBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout insertBookCopyPaneLayout = new javax.swing.GroupLayout(insertBookCopyPane);
        insertBookCopyPane.setLayout(insertBookCopyPaneLayout);
        insertBookCopyPaneLayout.setHorizontalGroup(
            insertBookCopyPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertBookCopyPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(insertBookCopyPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(katastasiLbl)
                    .addComponent(eisagwgiAntitypouBtn)
                    .addComponent(katastasiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        insertBookCopyPaneLayout.setVerticalGroup(
            insertBookCopyPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(insertBookCopyPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(katastasiLbl)
                .addGap(18, 18, 18)
                .addComponent(katastasiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(eisagwgiAntitypouBtn)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        updateBookCopyPane.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Update Book Copy", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Bitstream Charter", 0, 14), java.awt.Color.black)); // NOI18N

        neaKatastasiLbl.setText("Επίλεξε νέα κατάσταση αντιτύπου:");

        enimerwsiBookCopyBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_icons/saveChanges.png"))); // NOI18N
        enimerwsiBookCopyBtn.setText("Ενημέρωση αντιτύπου");
        enimerwsiBookCopyBtn.setEnabled(false);
        enimerwsiBookCopyBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enimerwsiBookCopyBtnActionPerformed(evt);
            }
        });

        neaKatastasiComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Κακιά", "Μέτρια", "Καλή", "Άριστη" }));
        neaKatastasiComboBox.setEnabled(false);

        javax.swing.GroupLayout updateBookCopyPaneLayout = new javax.swing.GroupLayout(updateBookCopyPane);
        updateBookCopyPane.setLayout(updateBookCopyPaneLayout);
        updateBookCopyPaneLayout.setHorizontalGroup(
            updateBookCopyPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateBookCopyPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(updateBookCopyPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(neaKatastasiLbl)
                    .addComponent(enimerwsiBookCopyBtn)
                    .addComponent(neaKatastasiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        updateBookCopyPaneLayout.setVerticalGroup(
            updateBookCopyPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(updateBookCopyPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(neaKatastasiLbl)
                .addGap(18, 18, 18)
                .addComponent(neaKatastasiComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(enimerwsiBookCopyBtn)
                .addContainerGap())
        );

        javax.swing.GroupLayout utilsPaneLayout = new javax.swing.GroupLayout(utilsPane);
        utilsPane.setLayout(utilsPaneLayout);
        utilsPaneLayout.setHorizontalGroup(
            utilsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(utilsPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(utilsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(utilsPaneLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(deletePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(updateBookCopyPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(insertBookCopyPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        utilsPaneLayout.setVerticalGroup(
            utilsPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(utilsPaneLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(deletePane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(insertBookCopyPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateBookCopyPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        enimerwsiPinakaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ui_icons/refresh.png"))); // NOI18N
        enimerwsiPinakaBtn.setText("Ενημέρωση Πίνακα");
        enimerwsiPinakaBtn.setEnabled(false);
        enimerwsiPinakaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enimerwsiPinakaBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollerForAntitypa)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(searchPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(enimerwsiPinakaBtn))
                        .addGap(0, 110, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(utilsPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(utilsPane, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(searchPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(enimerwsiPinakaBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(scrollerForAntitypa, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void anazitisiBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anazitisiBtnActionPerformed

        if (isbnFld.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Παρακαλώ δώστε έγκυρο ISBN!");
            return;
        }

        //elegxos ean yparxei to isbn...
        Vivlio v = vivliaDao.searchVivlioByISBN(isbnFld.getText());
        if (v == null) {
            JOptionPane.showMessageDialog(this, "Δεν υπάρχει βιβλίο με αυτο το ISBN!");
            return;
        }

        //ean ftasame edw fortwnoume ta antitypa sto jtable....
        antitypaTable.setModel(new EmfanisiAntitypwnTableModel(isbnFld.getText()));

        isbnFld.setEditable(false);
        anazitisiBtn.setEnabled(false);
        katastasiComboBox.setEnabled(true);
        eisagwgiAntitypouBtn.setEnabled(true);
        enimerwsiPinakaBtn.setEnabled(true);


    }//GEN-LAST:event_anazitisiBtnActionPerformed

    private void katharismosPediwnBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_katharismosPediwnBtnActionPerformed
        isbnFld.setEditable(true);
        isbnFld.setText("");
        anazitisiBtn.setEnabled(true);
        diagrafiAntitypouBtn.setEnabled(false);
        katastasiComboBox.setEnabled(false);
        eisagwgiAntitypouBtn.setEnabled(false);
        enimerwsiPinakaBtn.setEnabled(false);

        antitypaTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object[][]{},
                new String[]{
                    "ISBN", "Αύξων αριθμός αντιτύπου", "Κατάσταση αντιτύπου", "ΑΜ Δανειζόμενου Μέλους", "Ημερομηνία Δανεισμού"
                }
        ));

    }//GEN-LAST:event_katharismosPediwnBtnActionPerformed

    private void antitypaTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_antitypaTableMouseClicked
        int selectedRow = antitypaTable.getSelectedRow();
        if (selectedRow < 0) {
            diagrafiAntitypouBtn.setEnabled(false);
            enimerwsiBookCopyBtn.setEnabled(false);
            neaKatastasiComboBox.setEnabled(false);
        } else {
            diagrafiAntitypouBtn.setEnabled(true);
            enimerwsiBookCopyBtn.setEnabled(true);
            neaKatastasiComboBox.setEnabled(true);

            //kai vazoume thn katallili katastasi sto combo box....
            ArrayList<Antitypo> antitypa = ((EmfanisiAntitypwnTableModel) antitypaTable.getModel()).getData();
            Antitypo ant = antitypa.get(selectedRow);
            neaKatastasiComboBox.setSelectedItem(ant.getKatastasiAntitypou());

        }

    }//GEN-LAST:event_antitypaTableMouseClicked

    private void eisagwgiAntitypouBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eisagwgiAntitypouBtnActionPerformed

        //prwta prepei na vroume poio einai to megalytero id antitypou....
        ArrayList<Antitypo> antitypa = ((EmfanisiAntitypwnTableModel) antitypaTable.getModel()).getData();

        int new_next_id;
        if (antitypa.isEmpty()) {
            new_next_id = 1;
        } else {
            Antitypo ant = antitypa.get(antitypa.size() - 1);//anaktisi tou antitypou me to megalytero id....
            new_next_id = ant.getIdAntitypou() + 1;
        }

        //anaktisi isbn kai katastasis antitypou....
        String new_katastasi_antitypou = (String) katastasiComboBox.getSelectedItem();
        String new_isbn_antitypou = isbnFld.getText();

        //eisagwgi tou antitypou sth vasi dedomenwn...
        Antitypo neoAntitypo = new Antitypo();
        neoAntitypo.setIsbnVivliou(new_isbn_antitypou);
        neoAntitypo.setIdAntitypou(new_next_id);
        neoAntitypo.setKatastasiAntitypou(new_katastasi_antitypou);

        boolean inserted = antitypaDao.eisagwgiNeouAntitypou(neoAntitypo);
        if (!inserted) {
            JOptionPane.showMessageDialog(this, "Η εισαγωγή του αντίτυπου ΔΕΝ ήταν επιτυχής!");
            return;
        }//if.

        JOptionPane.showMessageDialog(this, "Η εισαγωγή του αντίτυπου ήταν επιτυχής!");

        //ananewnoume to model tou jtable...
        antitypaTable.setModel(new EmfanisiAntitypwnTableModel(new_isbn_antitypou));
    }//GEN-LAST:event_eisagwgiAntitypouBtnActionPerformed

    private void diagrafiAntitypouBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagrafiAntitypouBtnActionPerformed

        int res = JOptionPane.showConfirmDialog(this, "Είστε σίγουρος?");
        if (res != JOptionPane.YES_OPTION) {
            return;
        }//if.

        //anaktisi tou epilegmenou antitypou...
        int selectedRow = antitypaTable.getSelectedRow();
        ArrayList<Antitypo> antitypa = ((EmfanisiAntitypwnTableModel) antitypaTable.getModel()).getData();
        Antitypo ant = antitypa.get(selectedRow);

        //ean auto to antitypo pou theloume na diagrapsoume einai daneismeno tote....
        if (ant.getAm_daneismenou_melous() != 0 || ant.getHmnia_daneismou() != null) {
            JOptionPane.showMessageDialog(this, "Το αντίτυπο που θές να διαγράψεις ειναι δανεισμένο σε μέλος!");
            return;
        }//if.

        //ean ftasame edw shmainei oti den einai daneismeno se kapoio melos, ara to diagrafoume....
        boolean deleted = antitypaDao.diagrafiAntitypou(ant.getIsbnVivliou(), ant.getIdAntitypou());
        if (!deleted) {
            JOptionPane.showMessageDialog(this, "Η διαγραφή του επιλεγμένου αντιτύπου ΔΕΝ ήταν επιτυχής!");
            return;
        }//if.

        JOptionPane.showMessageDialog(this, "Η διαγραφή του βιβλίου ήταν επιτυχής!");

        //ananewnoume to model tou jtable...
        antitypaTable.setModel(new EmfanisiAntitypwnTableModel(isbnFld.getText()));
        diagrafiAntitypouBtn.setEnabled(false);

    }//GEN-LAST:event_diagrafiAntitypouBtnActionPerformed

    private void enimerwsiPinakaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enimerwsiPinakaBtnActionPerformed
        //ananewnoume to model tou jtable...
        antitypaTable.setModel(new EmfanisiAntitypwnTableModel(isbnFld.getText()));
        diagrafiAntitypouBtn.setEnabled(false);
        enimerwsiBookCopyBtn.setEnabled(false);
        neaKatastasiComboBox.setEnabled(false);
        neaKatastasiComboBox.setSelectedIndex(0);
    }//GEN-LAST:event_enimerwsiPinakaBtnActionPerformed

    private void enimerwsiBookCopyBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enimerwsiBookCopyBtnActionPerformed

        int selectedRow = antitypaTable.getSelectedRow();
        ArrayList<Antitypo> antitypa = ((EmfanisiAntitypwnTableModel) antitypaTable.getModel()).getData();
        Antitypo ant = antitypa.get(selectedRow);

        //swzoume thn nea katastasi sto antikeimeno.......
        ant.setKatastasiAntitypou((String) neaKatastasiComboBox.getSelectedItem());

        //to apothikeuoumai sti vasi dedomenwn...
        boolean updated = antitypaDao.enimerwsiAntitypou(ant);
        if (!updated) {
            JOptionPane.showMessageDialog(this, "Η ενημέρωση του αντιτύπου ΔΕΝ ήταν επιτυχής!");
            return;
        }//if.
        JOptionPane.showMessageDialog(this, "Η ενημέρωση του αντιτύπου ήταν επιτυχής!");

        //enimerwsi modelou....
        //ananewnoume to model tou jtable...
        antitypaTable.setModel(new EmfanisiAntitypwnTableModel(isbnFld.getText()));
        diagrafiAntitypouBtn.setEnabled(false);
        enimerwsiBookCopyBtn.setEnabled(false);
        neaKatastasiComboBox.setEnabled(false);
        neaKatastasiComboBox.setSelectedIndex(0);
    }//GEN-LAST:event_enimerwsiBookCopyBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anazitisiBtn;
    private javax.swing.JTable antitypaTable;
    private javax.swing.JPanel deletePane;
    private javax.swing.JButton diagrafiAntitypouBtn;
    private javax.swing.JButton eisagwgiAntitypouBtn;
    private javax.swing.JButton enimerwsiBookCopyBtn;
    private javax.swing.JButton enimerwsiPinakaBtn;
    private javax.swing.JPanel insertBookCopyPane;
    private javax.swing.JTextField isbnFld;
    private javax.swing.JLabel isbnLbl;
    private javax.swing.JComboBox katastasiComboBox;
    private javax.swing.JLabel katastasiLbl;
    private javax.swing.JButton katharismosPediwnBtn;
    private javax.swing.JComboBox neaKatastasiComboBox;
    private javax.swing.JLabel neaKatastasiLbl;
    private javax.swing.JScrollPane scrollerForAntitypa;
    private javax.swing.JPanel searchPane;
    private javax.swing.JPanel updateBookCopyPane;
    private javax.swing.JPanel utilsPane;
    // End of variables declaration//GEN-END:variables
}
