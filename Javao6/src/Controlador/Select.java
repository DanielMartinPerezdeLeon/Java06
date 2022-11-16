package Controlador;

import Modelo.Persona;
import java.sql.*;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Select {

    private static Select rs = new Select();

    Connection conn = null;
    PreparedStatement st = null;

    public Select() {

    }

    public Persona buscar(String dni, String nombre) {
        try {

            String comando = "select * from persona where dni = ? and nombre = ?";

            conn = ConexionBD.getConexion().getConn();
            st = conn.prepareStatement(comando);

            st.setString(1, dni);
            st.setString(2,nombre);

            ResultSet rs = st.executeQuery();

            if(rs.next()){
            Date aux = rs.getDate("fecha_nac");
                GregorianCalendar fecha = new GregorianCalendar();
                fecha.setTime(aux);
                
            return new Persona(rs.getString("dni"),
                        rs.getString("nombre"),
                        rs.getString("apellido"),
                        fecha,
                        rs.getString("foto"),
                        rs.getFloat("total_multas"),
                        rs.getString("apalabrado"));
            }else{
                return null;
            }
            
            

        } catch (SQLException ex) {
            Logger.getLogger(Select.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

    public static Select getResultado() {
        return rs;
    }

    public static void setResultado(Select resultado) {
        Select.rs = resultado;
    }

}
