package formes;

import database.models.Vivliothikarios;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author nikos
 */
public class Efarmogi extends javax.swing.JFrame {

    EisagwgiMelousInternalFrame eisagwgiMelousInternalFrame;
    AnazitisiMelousInternalFrame anazitisiMelousInternalFrame;
    EmfanisiMelwnInternalFrame emfanisiMelwnInternalFrame;
    EisagwgiNeouEkdotiInternalFrame eisagwgiNeouEkdotiInternalFrame;
    EisagwgiNeouSiggrafeaInternalFrame eisagwgiNeouSiggrafeaInternalFrame;
    EmfanisiEkdotwnInternalFrame emfanisiEkdotwnInternalFrame;
    EmfanisiSiggrafewnInternalFrame emfanisiSiggrafewnInternalFrame;
    NeosDaneismosAntitypouVivliouInternalFrame neosDaneismosAntitypouVivliouInternalFrame;
    EmfanisiDaneismenwnAntitypwnVivliwnMelous emfanisiDaneismenwnAntitypwnVivliwnMelous;
    EisagwgiNeouVivliouInternalFrame eisagwgiNeouVivliouInternalFrame;
    EmfanisiVivliwnInternalFrame emfanisiVivliwnInternalFrame;
    AnazitisiVivliouInternalFrame anazitisiVivliouInternalFrame;
    DiaxeirisiAntitypwnVivliouInternalFrame diaxeirisiAntitypwnVivliouInternalFrame;
    EmfanisiIstorikouMelousInternalFrame emfanisiIstorikouMelousInternalFrame;

    /**
     * Creates new form Efarmogi
     */
    public Efarmogi() {
        initComponents();
       
        ImageIcon icon = new ImageIcon("/ui_icons/books.png");
        Image ico = icon.getImage();
        this.setIconImage(ico);
        
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        desktopPane = new javax.swing.JDesktopPane();
        menuBar = new javax.swing.JMenuBar();
        diaxeirisiMelwnMenu = new javax.swing.JMenu();
        eisagwgiNeouMelousItem = new javax.swing.JMenuItem();
        anazitisiMelousItem = new javax.swing.JMenuItem();
        emfanishMelwnItem = new javax.swing.JMenuItem();
        emfanisiIstorikouMelousItem = new javax.swing.JMenuItem();
        diaxeirisiEkdotwnMenu = new javax.swing.JMenu();
        eisagwgiNeouEkdotiItem = new javax.swing.JMenuItem();
        emfanisiEkdotwnItem = new javax.swing.JMenuItem();
        diaxeirisiSiggrafewnMenu = new javax.swing.JMenu();
        eisagwgiNeouSiggrafeaItem = new javax.swing.JMenuItem();
        emfanisiSiggrafewnItem = new javax.swing.JMenuItem();
        diaxeirishVivliwnMenu = new javax.swing.JMenu();
        eisagwgiVivliouItem = new javax.swing.JMenuItem();
        emfanisiBooksItem = new javax.swing.JMenuItem();
        searchBookItem = new javax.swing.JMenuItem();
        diaxeirishAntitypwnVivliwnItem = new javax.swing.JMenu();
        diaxeirishDaneismwnMenu = new javax.swing.JMenu();
        neosDaneismosAntitypouVivliouItem = new javax.swing.JMenuItem();
        emfanisiDaneismenwnAntitypwnItem = new javax.swing.JMenuItem();
        aboutMenu = new javax.swing.JMenu();
        kleisimoEfarmogisItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Σύστημα Βιβλιοθήκης");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        diaxeirisiMelwnMenu.setMnemonic('f');
        diaxeirisiMelwnMenu.setText("Διαχείριση Μελών");

        eisagwgiNeouMelousItem.setText("Εισαγωγή νέου μέλους");
        eisagwgiNeouMelousItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eisagwgiNeouMelousItemActionPerformed(evt);
            }
        });
        diaxeirisiMelwnMenu.add(eisagwgiNeouMelousItem);

        anazitisiMelousItem.setText("Αναζήτηση Μέλους");
        anazitisiMelousItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anazitisiMelousItemActionPerformed(evt);
            }
        });
        diaxeirisiMelwnMenu.add(anazitisiMelousItem);

        emfanishMelwnItem.setText("Εμφάνιση Μελών");
        emfanishMelwnItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emfanishMelwnItemActionPerformed(evt);
            }
        });
        diaxeirisiMelwnMenu.add(emfanishMelwnItem);

        emfanisiIstorikouMelousItem.setText("Εμφάνιση Ιστορικού Μέλους");
        emfanisiIstorikouMelousItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emfanisiIstorikouMelousItemActionPerformed(evt);
            }
        });
        diaxeirisiMelwnMenu.add(emfanisiIstorikouMelousItem);

        menuBar.add(diaxeirisiMelwnMenu);

        diaxeirisiEkdotwnMenu.setText("Διαχείριση Εκδοτών");

        eisagwgiNeouEkdotiItem.setText("Εισαγωγή νέου εκδότη");
        eisagwgiNeouEkdotiItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eisagwgiNeouEkdotiItemActionPerformed(evt);
            }
        });
        diaxeirisiEkdotwnMenu.add(eisagwgiNeouEkdotiItem);

        emfanisiEkdotwnItem.setText("Εμφάνιση εκδοτών");
        emfanisiEkdotwnItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emfanisiEkdotwnItemActionPerformed(evt);
            }
        });
        diaxeirisiEkdotwnMenu.add(emfanisiEkdotwnItem);

        menuBar.add(diaxeirisiEkdotwnMenu);

        diaxeirisiSiggrafewnMenu.setText("Διαχείριση Συγγραφέων");

        eisagwgiNeouSiggrafeaItem.setText("Εισαγωγή νέου συγγραφέα");
        eisagwgiNeouSiggrafeaItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eisagwgiNeouSiggrafeaItemActionPerformed(evt);
            }
        });
        diaxeirisiSiggrafewnMenu.add(eisagwgiNeouSiggrafeaItem);

        emfanisiSiggrafewnItem.setText("Εμφάνιση συγγραφέων");
        emfanisiSiggrafewnItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emfanisiSiggrafewnItemActionPerformed(evt);
            }
        });
        diaxeirisiSiggrafewnMenu.add(emfanisiSiggrafewnItem);

        menuBar.add(diaxeirisiSiggrafewnMenu);

        diaxeirishVivliwnMenu.setText("Διαχείριση βιβλίων");

        eisagwgiVivliouItem.setText("Εισαγωγή νέου βιβλίου");
        eisagwgiVivliouItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eisagwgiVivliouItemActionPerformed(evt);
            }
        });
        diaxeirishVivliwnMenu.add(eisagwgiVivliouItem);

        emfanisiBooksItem.setText("Εμφάνιση βιβλίων");
        emfanisiBooksItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emfanisiBooksItemActionPerformed(evt);
            }
        });
        diaxeirishVivliwnMenu.add(emfanisiBooksItem);

        searchBookItem.setText("Αναζήτηση Βιβλίου");
        searchBookItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBookItemActionPerformed(evt);
            }
        });
        diaxeirishVivliwnMenu.add(searchBookItem);

        menuBar.add(diaxeirishVivliwnMenu);

        diaxeirishAntitypwnVivliwnItem.setText("Διαχείριση αντίτυπων βιβλίου");
        diaxeirishAntitypwnVivliwnItem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                diaxeirishAntitypwnVivliwnItemMouseClicked(evt);
            }
        });
        menuBar.add(diaxeirishAntitypwnVivliwnItem);

        diaxeirishDaneismwnMenu.setText("Διαχείριση δανεισμών");

        neosDaneismosAntitypouVivliouItem.setText("Νέος δανεισμός αντίτυπου βιβλίου");
        neosDaneismosAntitypouVivliouItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                neosDaneismosAntitypouVivliouItemActionPerformed(evt);
            }
        });
        diaxeirishDaneismwnMenu.add(neosDaneismosAntitypouVivliouItem);

        emfanisiDaneismenwnAntitypwnItem.setText("Εμφάνιση δανεισμένων αντίτυπων βιβλίων μέλους");
        emfanisiDaneismenwnAntitypwnItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emfanisiDaneismenwnAntitypwnItemActionPerformed(evt);
            }
        });
        diaxeirishDaneismwnMenu.add(emfanisiDaneismenwnAntitypwnItem);

        menuBar.add(diaxeirishDaneismwnMenu);

        aboutMenu.setText("Σχετικά...");
        aboutMenu.setToolTipText("");

        kleisimoEfarmogisItem.setText("Κλείσιμο εφαρμογής");
        kleisimoEfarmogisItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kleisimoEfarmogisItemActionPerformed(evt);
            }
        });
        aboutMenu.add(kleisimoEfarmogisItem);

        menuBar.add(aboutMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1314, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(desktopPane, javax.swing.GroupLayout.DEFAULT_SIZE, 696, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void eisagwgiNeouMelousItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eisagwgiNeouMelousItemActionPerformed

        eisagwgiMelousInternalFrame = new EisagwgiMelousInternalFrame();
        desktopPane.add(eisagwgiMelousInternalFrame);
        eisagwgiMelousInternalFrame.show();

    }//GEN-LAST:event_eisagwgiNeouMelousItemActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing

        int res = JOptionPane.showConfirmDialog(Efarmogi.this, "Είστε σίγουρος?");
        if (res == JOptionPane.YES_OPTION) {
            System.exit(0);
        }

    }//GEN-LAST:event_formWindowClosing

    private void kleisimoEfarmogisItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kleisimoEfarmogisItemActionPerformed
        int res = JOptionPane.showConfirmDialog(Efarmogi.this, "Είστε σίγουρος?");
        if (res == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_kleisimoEfarmogisItemActionPerformed

    private void anazitisiMelousItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anazitisiMelousItemActionPerformed
        anazitisiMelousInternalFrame = new AnazitisiMelousInternalFrame();
        desktopPane.add(anazitisiMelousInternalFrame);
        anazitisiMelousInternalFrame.show();
    }//GEN-LAST:event_anazitisiMelousItemActionPerformed

    private void emfanishMelwnItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emfanishMelwnItemActionPerformed
        emfanisiMelwnInternalFrame = new EmfanisiMelwnInternalFrame();
        desktopPane.add(emfanisiMelwnInternalFrame);
        emfanisiMelwnInternalFrame.show();
    }//GEN-LAST:event_emfanishMelwnItemActionPerformed

    private void eisagwgiNeouEkdotiItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eisagwgiNeouEkdotiItemActionPerformed
        eisagwgiNeouEkdotiInternalFrame = new EisagwgiNeouEkdotiInternalFrame();
        desktopPane.add(eisagwgiNeouEkdotiInternalFrame);
        eisagwgiNeouEkdotiInternalFrame.show();
    }//GEN-LAST:event_eisagwgiNeouEkdotiItemActionPerformed

    private void eisagwgiNeouSiggrafeaItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eisagwgiNeouSiggrafeaItemActionPerformed
        eisagwgiNeouSiggrafeaInternalFrame = new EisagwgiNeouSiggrafeaInternalFrame();
        desktopPane.add(eisagwgiNeouSiggrafeaInternalFrame);
        eisagwgiNeouSiggrafeaInternalFrame.show();
    }//GEN-LAST:event_eisagwgiNeouSiggrafeaItemActionPerformed

    private void emfanisiEkdotwnItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emfanisiEkdotwnItemActionPerformed

        emfanisiEkdotwnInternalFrame = new EmfanisiEkdotwnInternalFrame();
        desktopPane.add(emfanisiEkdotwnInternalFrame);
        emfanisiEkdotwnInternalFrame.show();

    }//GEN-LAST:event_emfanisiEkdotwnItemActionPerformed

    private void emfanisiSiggrafewnItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emfanisiSiggrafewnItemActionPerformed
        emfanisiSiggrafewnInternalFrame = new EmfanisiSiggrafewnInternalFrame();
        desktopPane.add(emfanisiSiggrafewnInternalFrame);
        emfanisiSiggrafewnInternalFrame.show();
    }//GEN-LAST:event_emfanisiSiggrafewnItemActionPerformed

    private void neosDaneismosAntitypouVivliouItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_neosDaneismosAntitypouVivliouItemActionPerformed
        neosDaneismosAntitypouVivliouInternalFrame = new NeosDaneismosAntitypouVivliouInternalFrame();
        desktopPane.add(neosDaneismosAntitypouVivliouInternalFrame);
        neosDaneismosAntitypouVivliouInternalFrame.show();
    }//GEN-LAST:event_neosDaneismosAntitypouVivliouItemActionPerformed

    private void emfanisiDaneismenwnAntitypwnItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emfanisiDaneismenwnAntitypwnItemActionPerformed
        emfanisiDaneismenwnAntitypwnVivliwnMelous = new EmfanisiDaneismenwnAntitypwnVivliwnMelous();
        desktopPane.add(emfanisiDaneismenwnAntitypwnVivliwnMelous);
        emfanisiDaneismenwnAntitypwnVivliwnMelous.show();
    }//GEN-LAST:event_emfanisiDaneismenwnAntitypwnItemActionPerformed

    private void eisagwgiVivliouItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eisagwgiVivliouItemActionPerformed
        eisagwgiNeouVivliouInternalFrame = new EisagwgiNeouVivliouInternalFrame();
        desktopPane.add(eisagwgiNeouVivliouInternalFrame);
        eisagwgiNeouVivliouInternalFrame.show();
    }//GEN-LAST:event_eisagwgiVivliouItemActionPerformed

    private void emfanisiBooksItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emfanisiBooksItemActionPerformed
        emfanisiVivliwnInternalFrame = new EmfanisiVivliwnInternalFrame();
        desktopPane.add(emfanisiVivliwnInternalFrame);
        emfanisiVivliwnInternalFrame.show();
    }//GEN-LAST:event_emfanisiBooksItemActionPerformed

    private void searchBookItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBookItemActionPerformed
        anazitisiVivliouInternalFrame = new AnazitisiVivliouInternalFrame();
        desktopPane.add(anazitisiVivliouInternalFrame);
        anazitisiVivliouInternalFrame.show();
    }//GEN-LAST:event_searchBookItemActionPerformed

    private void diaxeirishAntitypwnVivliwnItemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diaxeirishAntitypwnVivliwnItemMouseClicked
        diaxeirisiAntitypwnVivliouInternalFrame = new DiaxeirisiAntitypwnVivliouInternalFrame();
        desktopPane.add(diaxeirisiAntitypwnVivliouInternalFrame);
        diaxeirisiAntitypwnVivliouInternalFrame.show();
    }//GEN-LAST:event_diaxeirishAntitypwnVivliwnItemMouseClicked

    private void emfanisiIstorikouMelousItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emfanisiIstorikouMelousItemActionPerformed
        emfanisiIstorikouMelousInternalFrame = new EmfanisiIstorikouMelousInternalFrame();
        desktopPane.add(emfanisiIstorikouMelousInternalFrame);
        emfanisiIstorikouMelousInternalFrame.show();
    }//GEN-LAST:event_emfanisiIstorikouMelousItemActionPerformed

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("SleepWhileInLoop")
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
            java.util.logging.Logger.getLogger(Efarmogi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        final SindesiStoSistima sindesi = new SindesiStoSistima();
        sindesi.setAccessGranted(false);
        final Efarmogi efarmogi = new Efarmogi();

        /* emfanisi formas gia sindesi sto sistima....*/
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                sindesi.setVisible(true);
            }
        });

        //anamoni mexri na ginei epityxhs sindesi.....
        do {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
            }
        } while (!sindesi.isAccessGranted());

        //ean ftasame edw shmainei oti h sindesi htan epityxhs....
        JOptionPane.showMessageDialog(sindesi, "Επιτυχής σύνδεση!");

        //pairnoume ta stoixeia tou sindedemenou vivliothikariou....
        final Vivliothikarios sindedemenosVivliothikarios = sindesi.getSindedemenosVivliothikarios();

        //emfanizoume thn forma ths efarmogis mas.....
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                efarmogi.setTitle("Σύστημα Βιβλιοθήκης - Συνδεδεμένος Βιβλιοθηκάριος: " + sindedemenosVivliothikarios.getOnoma() + " "
                        + sindedemenosVivliothikarios.getEpitheto() + " (" + sindedemenosVivliothikarios.getAm() + ")");
                efarmogi.setVisible(true);
                sindesi.dispose();
            }
        });

    }//main.

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu aboutMenu;
    private javax.swing.JMenuItem anazitisiMelousItem;
    private javax.swing.JDesktopPane desktopPane;
    private javax.swing.JMenu diaxeirishAntitypwnVivliwnItem;
    private javax.swing.JMenu diaxeirishDaneismwnMenu;
    private javax.swing.JMenu diaxeirishVivliwnMenu;
    private javax.swing.JMenu diaxeirisiEkdotwnMenu;
    private javax.swing.JMenu diaxeirisiMelwnMenu;
    private javax.swing.JMenu diaxeirisiSiggrafewnMenu;
    private javax.swing.JMenuItem eisagwgiNeouEkdotiItem;
    private javax.swing.JMenuItem eisagwgiNeouMelousItem;
    private javax.swing.JMenuItem eisagwgiNeouSiggrafeaItem;
    private javax.swing.JMenuItem eisagwgiVivliouItem;
    private javax.swing.JMenuItem emfanishMelwnItem;
    private javax.swing.JMenuItem emfanisiBooksItem;
    private javax.swing.JMenuItem emfanisiDaneismenwnAntitypwnItem;
    private javax.swing.JMenuItem emfanisiEkdotwnItem;
    private javax.swing.JMenuItem emfanisiIstorikouMelousItem;
    private javax.swing.JMenuItem emfanisiSiggrafewnItem;
    private javax.swing.JMenuItem kleisimoEfarmogisItem;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem neosDaneismosAntitypouVivliouItem;
    private javax.swing.JMenuItem searchBookItem;
    // End of variables declaration//GEN-END:variables

}
