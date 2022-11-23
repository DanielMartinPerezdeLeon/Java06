/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class Delete {
    
    private static Delete rs = new Delete();

    Connection conn = null;
    PreparedStatement st = null;

    public Delete() {
        
    }
    
    public void borrarCoche(String matricula){
        try {
            String comando = "delete from coche where matricula=?";
            

            
            this.conn = ConexionBD.getConexion().getConn();
            this.st = this.conn.prepareStatement(comando);
            
            st.setString(1, matricula);
            
            st.executeUpdate();
        } catch (SQLException ex) {

            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Delete getResultado() {
        return rs;
    }
    
    
    
}
