package Modelo;

import Controlador.ConexionBD;
import Controlador.Delete;
import Controlador.Insert;
import Controlador.Select;
import java.util.ArrayList;


public class ConsultasSQL {

    public static ConsultasSQL consulta = new ConsultasSQL();

    public ConsultasSQL() {

    }

    public Persona buscarPersona(String dni, String nombre) {
        return Select.getResultado().persona(dni, nombre);
    }
    
    public ArrayList <Multa> guardarMultas(String dni){
        return Select.getResultado().multas(dni);
    } 
    
    public void desconectarseBD(){
        ConexionBD.getConexion().Cerrar();
    }
    
    public float totalMultas(String dni){
        return Select.getResultado().valorMultas(dni);
    }
    
    public void nuevaPersona(String dni, String nombre, String apellido, String fecha, String foto, String apalabrado){
        Insert.getResultado().InsertPersona(dni, nombre, apellido, fecha, foto, apalabrado);
    }
    
    public ArrayList <Coche> listaCoches(){
        return Select.getResultado().listaCoches();
    }
    
    public void eliminarCoche(String matricula){
        Delete.getResultado().borrarCoche(matricula);
        
    }

    public ConsultasSQL getConsulta() {
        return consulta;
    }

    
    
}

