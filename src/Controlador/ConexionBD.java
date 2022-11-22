package Controlador;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

//Abre y cierra conexiones a la BD mysql
public class ConexionBD {

    private static ConexionBD conexion = new ConexionBD(); //Instancia estatica para manejarla por toda el progrmama

    private Connection conn;  //conn de la BD

    public ConexionBD() {

    }

    public void Conexion() {
        try {
            //Conexta a la BD
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:33060/db06", "root", "admin");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void Conectar() {  //Construye el estatico
        this.Conexion();
    }

    public void Cerrar() {    //Cierra la conexion
        try {
            this.conn.close();
           
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    

    public static ConexionBD getConexion() {
        return conexion;
    }

    public static void setConexion(ConexionBD conexion) {
        ConexionBD.conexion = conexion;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

}
