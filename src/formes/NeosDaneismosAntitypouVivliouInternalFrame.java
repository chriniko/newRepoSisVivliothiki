package formes;

import database.connection.DbConnection;
import database.daos.DaneismoiDAO;
import database.daos.MelhDAO;
import database.models.Antitypo;
import database.models.Melos;
import javax.swing.JOptionPane;
import utils.Utils;

/**
 *
 * @author nikos
 */
public class NeosDaneismosAntitypouVivliouInternalFrame extends javax.swing.JInternalFrame {

    private final DaneismoiDAO daneismoiDao = new DaneismoiDAO(DbConnection.getInstance().getConnection());
    private final MelhDAO melhDao = new MelhDAO(DbConnection.getInstance().getConnection());

    /**
     * Creates new form NeosDaneismosAntitypouVivliouInternalFrame
     */
    public NeosDaneismosAntitypouVivliouInternalFrame() {
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
        kleisimoParathirouBtn = new javax.swing.JButton();
        isbnAntitypouBibliouLbl = new javax.swing.JLabel();
        auxwnArithmosAntitypouVivliouLbl = new javax.swing.JLabel();
        arithmosMitrwouMelousLbl = new javax.swing.JLabel();
        isbnAntitypouVivliouFld = new javax.swing.JTextField();
        auxwnArithmosAntitypouVivliouFld = new javax.swing.JTextField();
        arithmosMitrwouMelousFld = new javax.swing.JTextField();
        kataxwrisiDaneismouBtn = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Νέος Δανεισμός Αντίτυπου Βιβλίου");

        kleisimoParathirouBtn.setText("Κλείσιμο Παράθυρου");
        kleisimoParathirouBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kleisimoParathirouBtnActionPerformed(evt);
            }
        });

        isbnAntitypouBibliouLbl.setText("Δώσε ISBN αντίτυπου βιβλίου:");

        auxwnArithmosAntitypouVivliouLbl.setText("Δώσε αύξων αριθμό αντίτυπου βιβλίου:");

        arithmosMitrwouMelousLbl.setText("Δώσε Αριθμό Μητρώου Μέλους:");

        kataxwrisiDaneismouBtn.setText("Καταχώρηση Δανεισμού");
        kataxwrisiDaneismouBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kataxwrisiDaneismouBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainPaneLayout = new javax.swing.GroupLayout(mainPane);
        mainPane.setLayout(mainPaneLayout);
        mainPaneLayout.setHorizontalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPaneLayout.createSequentialGroup()
                        .addGap(0, 284, Short.MAX_VALUE)
                        .addComponent(kataxwrisiDaneismouBtn)
                        .addGap(18, 18, 18)
                        .addComponent(kleisimoParathirouBtn))
                    .addGroup(mainPaneLayout.createSequentialGroup()
                        .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(isbnAntitypouBibliouLbl)
                            .addComponent(auxwnArithmosAntitypouVivliouLbl)
                            .addComponent(arithmosMitrwouMelousLbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(isbnAntitypouVivliouFld)
                            .addComponent(auxwnArithmosAntitypouVivliouFld)
                            .addComponent(arithmosMitrwouMelousFld, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        mainPaneLayout.setVerticalGroup(
            mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(isbnAntitypouBibliouLbl)
                    .addComponent(isbnAntitypouVivliouFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(auxwnArithmosAntitypouVivliouLbl)
                    .addComponent(auxwnArithmosAntitypouVivliouFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arithmosMitrwouMelousLbl)
                    .addComponent(arithmosMitrwouMelousFld, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(mainPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kleisimoParathirouBtn)
                    .addComponent(kataxwrisiDaneismouBtn))
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

    private void kleisimoParathirouBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kleisimoParathirouBtnActionPerformed
        this.dispose();
    }//GEN-LAST:event_kleisimoParathirouBtnActionPerformed

    private void kataxwrisiDaneismouBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kataxwrisiDaneismouBtnActionPerformed

        String in_isbn = isbnAntitypouVivliouFld.getText();
        String in_id = auxwnArithmosAntitypouVivliouFld.getText();
        String in_am = arithmosMitrwouMelousFld.getText();

        //elegxoume egyrothta stoixeiwn...
        if (!Utils.isIntegerNumber(in_am) || !Utils.isIntegerNumber(in_id)) {
            JOptionPane.showMessageDialog(this, "Παρακαλώ δώστε έγκυρα στοιχεία για τα πεδία αύξων αριθμός αντιτύπου και ΑΜ μέλους!");
            return;
        }//if.

        //elegxoume ean yparxei to antitypo...
        Antitypo ant = daneismoiDao.euresiAntitypou(in_isbn, Integer.parseInt(in_id));
        if (ant == null) {
            JOptionPane.showMessageDialog(this, "Δεν υπάρχει αντίτυπο με αυτό το ISBN ή/και αύξων αριθμό αντιτύπου!");
            return;
        }//if.

        //elegxoume ean yparxei melos me auto to AM.
        Melos melos = melhDao.searchMelosByAm(Integer.parseInt(in_am));
        if (melos == null) {
            JOptionPane.showMessageDialog(this, "Δεν υπάρχει μέλος με αυτο το ΑΜ!");
            return;
        }//if.

        //twra elegxoume ean to antitypo einai diathesimo gia daneismo....
        boolean isAvailable = daneismoiDao.einaiToAntitypoDiathesimoGiaDaneismo(in_isbn, Integer.parseInt(in_id));
        if (!isAvailable) {
            JOptionPane.showMessageDialog(this, "Το αντίτυπο που θέλετε να δανείσετε είναι ήδη δανεισμένο!");
            return;
        }//if.

        //ean ftasame edw shmainei oti mporoume na kanoume ton daneismo....
        boolean daneismosEpityxhs = daneismoiDao.kaneDaneismoAntitypou(in_isbn, Integer.parseInt(in_id), Integer.parseInt(in_am));
        if (!daneismosEpityxhs) {
            JOptionPane.showMessageDialog(this, "Ο δανεισμός ΔΕΝ ήταν επιτυχης! Παρακαλώ κοιτάξτε τη ΒΔ!");
            return;
        }//if.

        //emfanizoume minima epityxias....
        JOptionPane.showMessageDialog(this, "Ο δανεισμός του αντίτυπου με στοιχεία: ISBN->" + in_isbn + " , ID->" + in_id
                + "  στο μέλος με ΑΜ: " + in_am + " ήταν επιτυχής!");

        //kleinoume to parathiro...
        this.dispose();

    }//GEN-LAST:event_kataxwrisiDaneismouBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField arithmosMitrwouMelousFld;
    private javax.swing.JLabel arithmosMitrwouMelousLbl;
    private javax.swing.JTextField auxwnArithmosAntitypouVivliouFld;
    private javax.swing.JLabel auxwnArithmosAntitypouVivliouLbl;
    private javax.swing.JLabel isbnAntitypouBibliouLbl;
    private javax.swing.JTextField isbnAntitypouVivliouFld;
    private javax.swing.JButton kataxwrisiDaneismouBtn;
    private javax.swing.JButton kleisimoParathirouBtn;
    private javax.swing.JPanel mainPane;
    // End of variables declaration//GEN-END:variables
}
