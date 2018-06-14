/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omjdbc.base;

/**
 * OMDB 13.04.2018 : Menu "principal" de cette petite application de gestion de catégories et de sous catégories
 * pour des libellés de questions posées dans des travaux écrits destinés à des apprentis dans presques tous les domaines
 * du monde entier de la terre mondiale
 *
 * @author zaurak
 */
public class ClaMenu extends javax.swing.JFrame {
    // OMDB 03.04.2018 : Nouvel objet essaiListeSelect.
    private ClaGestionLibellesCatSousCat form_GestionLibellesCatSousCat;

     /**
     * Creates new form Menu
     */
    public ClaMenu() {
        initComponents();
        form_GestionLibellesCatSousCat = new ClaGestionLibellesCatSousCat();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1SousCategories = new javax.swing.JButton();
        jButton1GestionsLibelles = new javax.swing.JButton();
        jButton2essaiJlist = new javax.swing.JButton();
        jButton2JlistCatSc = new javax.swing.JButton();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        openMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        saveAsMenuItem = new javax.swing.JMenuItem();
        exitMenuItemHommageBanderet = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        cutMenuItem = new javax.swing.JMenuItem();
        copyMenuItem = new javax.swing.JMenuItem();
        pasteMenuItem = new javax.swing.JMenuItem();
        deleteMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        contentsMenuItem = new javax.swing.JMenuItem();
        aboutMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jButton1SousCategories.setText("Sous catégories");
        jButton1SousCategories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1SousCategoriesActionPerformed(evt);
            }
        });

        jButton1GestionsLibelles.setText("Libellés");
        jButton1GestionsLibelles.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1GestionsLibellesActionPerformed(evt);
            }
        });

        jButton2essaiJlist.setText("Essai Jlist");
        jButton2essaiJlist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2essaiJlistActionPerformed(evt);
            }
        });

        jButton2JlistCatSc.setText("Jlist CAT/SOUS-CAT");
        jButton2JlistCatSc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2JlistCatScActionPerformed(evt);
            }
        });

        fileMenu.setMnemonic('f');
        fileMenu.setText("File");

        openMenuItem.setMnemonic('o');
        openMenuItem.setText("Open");
        fileMenu.add(openMenuItem);

        saveMenuItem.setMnemonic('s');
        saveMenuItem.setText("Save");
        fileMenu.add(saveMenuItem);

        saveAsMenuItem.setMnemonic('a');
        saveAsMenuItem.setText("Save As ...");
        saveAsMenuItem.setDisplayedMnemonicIndex(5);
        fileMenu.add(saveAsMenuItem);

        exitMenuItemHommageBanderet.setMnemonic('x');
        exitMenuItemHommageBanderet.setText("Exit");
        exitMenuItemHommageBanderet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemHommageBanderetActionPerformed(evt);
            }
        });
        fileMenu.add(exitMenuItemHommageBanderet);

        menuBar.add(fileMenu);

        editMenu.setMnemonic('e');
        editMenu.setText("Edit");

        cutMenuItem.setMnemonic('t');
        cutMenuItem.setText("Cut");
        editMenu.add(cutMenuItem);

        copyMenuItem.setMnemonic('y');
        copyMenuItem.setText("Copy");
        editMenu.add(copyMenuItem);

        pasteMenuItem.setMnemonic('p');
        pasteMenuItem.setText("Paste");
        editMenu.add(pasteMenuItem);

        deleteMenuItem.setMnemonic('d');
        deleteMenuItem.setText("Delete");
        editMenu.add(deleteMenuItem);

        menuBar.add(editMenu);

        helpMenu.setMnemonic('h');
        helpMenu.setText("Help");

        contentsMenuItem.setMnemonic('c');
        contentsMenuItem.setText("Contents");
        helpMenu.add(contentsMenuItem);

        aboutMenuItem.setMnemonic('a');
        aboutMenuItem.setText("About");
        helpMenu.add(aboutMenuItem);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2essaiJlist)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2JlistCatSc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addComponent(jButton1SousCategories))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1GestionsLibelles)
                        .addGap(0, 301, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1GestionsLibelles)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1SousCategories)
                    .addComponent(jButton2essaiJlist)
                    .addComponent(jButton2JlistCatSc))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemHommageBanderetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemHommageBanderetActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemHommageBanderetActionPerformed

    private void jButton1SousCategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1SousCategoriesActionPerformed
        // TODO add your handling code here:
        // OMDB 19.03.2018 : Nouvel objet sousCategories.
        ClaGestionSousCategories sousCategories = new ClaGestionSousCategories();
        // OMDB 19.03.2018 : "Affichage" du formulaire de gestion des sous catégories.
        sousCategories.setVisible(true);
    }//GEN-LAST:event_jButton1SousCategoriesActionPerformed

    private void jButton1GestionsLibellesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1GestionsLibellesActionPerformed
        // TODO add your handling code here:
        // OMDB 02.04.2018 : Nouvel objet gestionLibelles.
        ClaLibellesCategoriesSousCategoriesReponses gestionLibelles = new ClaLibellesCategoriesSousCategoriesReponses();
        // OMDB 02.04.2018 : "Affichage" du formulaire de gestion des libellés.
        gestionLibelles.setVisible(true);        
    }//GEN-LAST:event_jButton1GestionsLibellesActionPerformed

    private void jButton2essaiJlistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2essaiJlistActionPerformed
        // TODO add your handling code here:
        // OMDB 03.04.2018 : Nouvel objet essaiListe.
        ClaSelectJlistSousCategories essaiListe = new ClaSelectJlistSousCategories();
        // OMDB 02.04.2018 : "Affichage" du formulaire.
        essaiListe.setVisible(true);        
    }//GEN-LAST:event_jButton2essaiJlistActionPerformed

    private void jButton2JlistCatScActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2JlistCatScActionPerformed
        // TODO add your handling code here:

        // OMDB 11.04.2018 : Si le formulaire est ouvert on désactive le bouton, pour empêcher qu'il s'ouvre plus d'une fois
        if (form_GestionLibellesCatSousCat.isVisible()) {
            jButton2JlistCatSc.setEnabled(false);
            jButton1SousCategories.setEnabled(false);
        } else {
            // OMDB 02.04.2018 : "Affichage" du formulaire.
            form_GestionLibellesCatSousCat.setVisible(true);
            /* OMDB 11.04.2018 : Désactiver le bouton d'affichage du formulaire, pour empêcher d'ouvrir le même formulaire plusieurs fois.
                on le réactive à la fermeture du formulaire
            */
            jButton2JlistCatSc.setEnabled(false);
            jButton1SousCategories.setEnabled(false);
        }
    }//GEN-LAST:event_jButton2JlistCatScActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
        /* OMDB 11.04.2018 : Si le formulaire est visible, désactiver le bouton d'affichage du formulaire, pour empêcher d'ouvrir le même formulaire plusieurs fois.
            Si le formulaire n'est pas visible, on active le bouton d'ouverture du formulaire "form_GestionLibellesCatSousCat"
        */        
            if (form_GestionLibellesCatSousCat.isVisible()) {
                jButton2JlistCatSc.setEnabled(false);
                jButton1SousCategories.setEnabled(false);                
            } else {
                jButton2JlistCatSc.setEnabled(true);
                jButton1SousCategories.setEnabled(true);
            }
    }//GEN-LAST:event_formWindowActivated



    
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ClaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClaMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutMenuItem;
    private javax.swing.JMenuItem contentsMenuItem;
    private javax.swing.JMenuItem copyMenuItem;
    private javax.swing.JMenuItem cutMenuItem;
    private javax.swing.JMenuItem deleteMenuItem;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenuItem exitMenuItemHommageBanderet;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JButton jButton1GestionsLibelles;
    private javax.swing.JButton jButton1SousCategories;
    private javax.swing.JButton jButton2JlistCatSc;
    private javax.swing.JButton jButton2essaiJlist;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem openMenuItem;
    private javax.swing.JMenuItem pasteMenuItem;
    private javax.swing.JMenuItem saveAsMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    // End of variables declaration//GEN-END:variables

}
