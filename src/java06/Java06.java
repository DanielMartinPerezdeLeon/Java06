/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java06;


import java.util.logging.Level;
import java.util.logging.Logger;

import java.sql.*;



/**
 *
 * @author alumno
 */
public class Java06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:33060/db06", "root", "admin");
            System.out.println("Conectado a la BD.");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Java06.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Java06.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }
    
}
