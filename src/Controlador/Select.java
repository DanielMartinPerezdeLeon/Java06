package Controlador;

import Modelo.Coche;
import Modelo.Multa;
import Modelo.Persona;
import java.sql.*;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Select {

    private static Select rs = new Select();

    Connection conn = null;
    PreparedStatement st = null;

    public Select() {

    }

    public Persona persona(String dni, String nombre) {
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
    
    public ArrayList <Multa> multas(String dni){
        try {
            ArrayList <Multa> resultado = new <Multa> ArrayList();
            String comando = "select * from multa where coche = (select matricula from coche where propietario = ?) ";
            
            conn = ConexionBD.getConexion().getConn();
            st = conn.prepareStatement(comando);

            st.setString(1, dni);
            

            
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                
                Date aux = rs.getDate("fecha");
                GregorianCalendar fecha = new GregorianCalendar();
                fecha.setTime(aux);
                
                resultado.add(new Multa(rs.getInt("codigo"),
                                        rs.getString("coche"),
                                        fecha,
                                        rs.getFloat("coste")));
                
                
            }
            
            System.out.println("Multas obtenida correctamente");
            return resultado;

        } catch (SQLException ex) {
            Logger.getLogger(Select.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex);
            return null;
        }
    }
    
    public float valorMultas(String dni){
        try {
            String comando = "select coste from multa where coche = (select matricula from coche where propietario = ?) ";
            
            float res=0;
            
            conn = ConexionBD.getConexion().getConn();
            st = conn.prepareStatement(comando);
            
            st.setString(1, dni);
            
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                res+=rs.getInt("coste");
            }
            
            return res;
            
        } catch (SQLException ex) {
            Logger.getLogger(Select.class.getName()).log(Level.SEVERE, null, ex);
            return -1;
        }
    }
    
    public ArrayList listaCoches(){
        try {
            ArrayList <Coche> resultado = new <Coche> ArrayList();
            String comando = "select * from coche";
            
            conn = ConexionBD.getConexion().getConn();
            st = conn.prepareStatement(comando);
            

            
            ResultSet rs = st.executeQuery();
            
            while(rs.next()){
                
                Date aux = rs.getDate("fecha_matriculacion");
                GregorianCalendar fecha = new GregorianCalendar();
                fecha.setTime(aux);
                
                resultado.add(new Coche(rs.getString("matricula"),
                                        rs.getString("marca"),
                                        rs.getString("modelo"),
                                        rs.getString("propietario"),
                                        fecha));
                
                
            }
            
            System.out.println("Coches obtenidos correctamente");
            return resultado;

        } catch (SQLException ex) {
            Logger.getLogger(Select.class.getName()).log(Level.SEVERE, null, ex);
            System.err.println(ex);
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
