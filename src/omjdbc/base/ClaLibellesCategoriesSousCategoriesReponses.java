/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omjdbc.base;

import java.awt.BorderLayout;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author zaurak
 */
public class ClaLibellesCategoriesSousCategoriesReponses extends javax.swing.JFrame {
    private JButton btnAdd;
    private JPanel centerPanel;
    private Box vBox;
    /**
     * Creates new form LibellesCategoriesSousCategoriesReponses
     */
    public ClaLibellesCategoriesSousCategoriesReponses() {
        initComponents();

/*
        jLabel1 = new javax.swing.JLabel();
        jLabel1.setText("Hello");
        setLayout(new java.awt.GridBagLayout());
        add(jLabel1, new java.awt.GridBagConstraints());
        
*/
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1_Libelle = new javax.swing.JTextArea();
        jLabel1_Libelle = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1Reponse = new javax.swing.JTextArea();
        jLabel1Reponse = new javax.swing.JLabel();
        jButton1AjouterReponse = new javax.swing.JButton();
        jTextField1path_image_reponse = new javax.swing.JTextField();
        jTextField2path_image_libelle = new javax.swing.JTextField();
        jTextField3Source_reponse = new javax.swing.JTextField();
        jTextField1Nb_Pts_Reponse = new javax.swing.JTextField();
        jTextField1Numero_Article_NIBT = new javax.swing.JTextField();
        jTextField1Commentaires_cours = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jList1categorie = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jList2sous_categorie = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextArea1_Libelle.setColumns(20);
        jTextArea1_Libelle.setRows(5);
        jScrollPane1.setViewportView(jTextArea1_Libelle);

        jLabel1_Libelle.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1_Libelle.setText("Libellé");

        jTextArea1Reponse.setColumns(20);
        jTextArea1Reponse.setRows(5);
        jScrollPane2.setViewportView(jTextArea1Reponse);

        jLabel1Reponse.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1Reponse.setText("Réponse");

        jButton1AjouterReponse.setText("Ajouter réponse");
        jButton1AjouterReponse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1AjouterReponseActionPerformed(evt);
            }
        });

        jTextField1path_image_reponse.setText("Chemin image réponse");

        jTextField2path_image_libelle.setText("Chemin image question");
        jTextField2path_image_libelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2path_image_libelleActionPerformed(evt);
            }
        });

        jTextField3Source_reponse.setText("Source réponse");

        jTextField1Nb_Pts_Reponse.setText("Nb points");
        jTextField1Nb_Pts_Reponse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1Nb_Pts_ReponseActionPerformed(evt);
            }
        });

        jTextField1Numero_Article_NIBT.setText("No article NORMES");

        jTextField1Commentaires_cours.setText("Commentaires support cours");

        jList1categorie.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane3.setViewportView(jList1categorie);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Catégories");

        jList2sous_categorie.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane4.setViewportView(jList2sous_categorie);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Sous catégories");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 416, Short.MAX_VALUE)
                        .addComponent(jLabel1_Libelle)
                        .addComponent(jTextField2path_image_libelle)
                        .addComponent(jScrollPane3))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel1Reponse)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1AjouterReponse))
                        .addComponent(jScrollPane2)
                        .addComponent(jTextField1path_image_reponse)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jTextField3Source_reponse, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                            .addComponent(jTextField1Nb_Pts_Reponse, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jTextField1Numero_Article_NIBT, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1Commentaires_cours)
                        .addComponent(jScrollPane4))
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1Reponse)
                            .addComponent(jButton1AjouterReponse))
                        .addGap(4, 4, 4)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1path_image_reponse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3Source_reponse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1Nb_Pts_Reponse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1Numero_Article_NIBT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1Commentaires_cours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jLabel1_Libelle)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2path_image_libelle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 427, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1AjouterReponseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1AjouterReponseActionPerformed
        // TODO add your handling code here:
        //jTextArea1.setColumns(20);
        //jTextArea1.setRows(5);
        //jScrollPane2.setViewportView(jTextArea1);
        //jTextArea1.add(new javax.swing.JTextArea());
        //vBox.add(new JTextField(20));
        //pack();

    }//GEN-LAST:event_jButton1AjouterReponseActionPerformed

    private void jTextField2path_image_libelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2path_image_libelleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2path_image_libelleActionPerformed

    private void jTextField1Nb_Pts_ReponseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1Nb_Pts_ReponseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1Nb_Pts_ReponseActionPerformed

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
            java.util.logging.Logger.getLogger(ClaLibellesCategoriesSousCategoriesReponses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClaLibellesCategoriesSousCategoriesReponses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClaLibellesCategoriesSousCategoriesReponses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClaLibellesCategoriesSousCategoriesReponses.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new ClaLibellesCategoriesSousCategoriesReponses().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1AjouterReponse;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1Reponse;
    private javax.swing.JLabel jLabel1_Libelle;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1categorie;
    private javax.swing.JList<String> jList2sous_categorie;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextArea jTextArea1Reponse;
    private javax.swing.JTextArea jTextArea1_Libelle;
    private javax.swing.JTextField jTextField1Commentaires_cours;
    private javax.swing.JTextField jTextField1Nb_Pts_Reponse;
    private javax.swing.JTextField jTextField1Numero_Article_NIBT;
    private javax.swing.JTextField jTextField1path_image_reponse;
    private javax.swing.JTextField jTextField2path_image_libelle;
    private javax.swing.JTextField jTextField3Source_reponse;
    // End of variables declaration//GEN-END:variables
}
