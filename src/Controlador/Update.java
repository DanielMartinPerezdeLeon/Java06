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
public class Update {

    private static Update rs = new Update();

    Connection conn = null;
    PreparedStatement st = null;

    public Update() {

    }

    public void modificarCasa(int codigo, String direccion) {
        try {
            String comando = "update casa "
                    + "set direccion=?"
                    + " where codigo=?";
            
            this.conn = ConexionBD.getConexion().getConn();
            System.out.println(conn);
            this.st = this.conn.prepareStatement(comando);
            
            st.setString(1, direccion);
            st.setInt(2, codigo);   
            

            st.executeUpdate();
        } catch (SQLException ex) {
            Error.getError().saltaError(11);
        }
    }

    public static Update getResultado() {
        return rs;
    }
}
