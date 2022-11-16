package Modelo;

import Controlador.ConexionBD;
import Controlador.Select;
import java.sql.*;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConsultasSQL {

    public static ConsultasSQL consulta = new ConsultasSQL();

    public ConsultasSQL() {

    }

    public Persona buscarPersona(String dni, String nombre) {
        return Select.getResultado().buscar(dni, nombre);

    }
    
    public void desconectarseBD(){
        ConexionBD.getConexion().Cerrar();
    }

    public ConsultasSQL getConsulta() {
        return consulta;
    }

    
    
}

