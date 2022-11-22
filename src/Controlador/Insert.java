/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alumno
 */
public class Insert {
    private static Insert rs = new Insert();

    Connection conn = null;
    PreparedStatement st = null;

    public Insert() {
        
    }
    
    public void InsertPersona(String dni, String nombre, String apellido, String fecha_nac, String foto, String apalabrado){
        
        try {
            String comando = "insert into persona values (?,?,?,?,?,0,?)";
            

            
            this.conn = ConexionBD.getConexion().getConn();
            System.out.println(conn);
            this.st = this.conn.prepareStatement(comando);
            
            st.setString(1, dni);
            st.setString(2, nombre);
            st.setString(3, apellido);
            st.setString(4, fecha_nac);
            st.setString(5, foto);
            st.setString(6, apalabrado);
            
            st.executeUpdate();
        } catch (SQLException ex) {
            System.out.println(st);
                        System.err.println(ex);

            Logger.getLogger(Insert.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Insert getResultado() {
        return rs;
    }

 
    
    
}
