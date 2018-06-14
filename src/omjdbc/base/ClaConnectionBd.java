/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package omjdbc.base;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 * @author zaurak (OMDB) le 29.03.2018
 * MODIFICATIONS : CLOSE DB 17.04.2018
 * exemple pour nos apprentis informaticiens
 * aussi brillants que "zaurak"
 * J'ai laissé les commentaires générés automatiquement par NETBEANS* 
 */
public class ClaConnectionBd {
    
    private static final String DRIVER_NAME = "com.mysql.jdbc.Driver";
//    private static final String CHAINE_CONNECT_DB = "jdbc:mysql://localhost:3306/om_db_latex_final";
//    private static final String CHAINE_CONNECT_DB = "jdbc:mysql://localhost:3306/om_db_latex_final_copie";
    private static final String CHAINE_CONNECT_DB = "jdbc:mysql://localhost:3306/Hadi_LabelsM_DB";
  	    
    private static final String USER = "root";
    private static final String PASSWORD = "root";
    private static Connection conn;
        
    // OMDB 29.03.2018 : Méthode pour se connecter à la BD 
    public static Connection getConnection()
    {
      
        try {
            Class.forName(DRIVER_NAME);
            try {
                conn = DriverManager.getConnection(CHAINE_CONNECT_DB,USER,PASSWORD);
                return conn;
            } catch (SQLException ex) {
                Logger.getLogger(ClaGestionSousCategories.class.getName()).log(Level.SEVERE, null, ex);
                // OMDB 13.03.2018 : Problème de connection à la BD, affiche un message et ferme l'application !
                JOptionPane.showMessageDialog(null, "GROS PROBLEME DE CONECTION A LA BD...!!");
                System.exit(0);
                return null;
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("com.mysql.jdbc.Driver EST ABSENT "); 
        } 
        return conn;
    }

    public boolean closeConnection() throws SQLException{

        if(conn.isClosed()){

        } else {
            conn.close();      
        }
        return true;
    }
}
