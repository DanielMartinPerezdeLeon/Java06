
package Modelo;

import java.util.GregorianCalendar;


//Para guardar datos de la tabla persona de la BD
public class Persona {
    
    private static Persona usuario; //Persona conectada a la BD
    
    private String dni;     //primary key
    private String nombre;
    private String apellido;
    private GregorianCalendar fechanacimiento;      //Mes,dia,año?????
    private String foto;    //Ruta a la foto
    private float totalmultas;  //Sería la suma del valos de todas las multas a nombre de esta persona
    private String apalabrado; //en el sql es un FK al DNI de otra persona
    
    
    //CONSTRUCTOR
    public Persona(String dni, String nombre, String apellido, GregorianCalendar fechanacimiento, String foto, float totalmultas, String apalabrado) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechanacimiento = fechanacimiento;
        this.foto = foto;
        this.totalmultas = totalmultas;
        this.apalabrado = apalabrado;
    }
    
    
    //GETTERS AND SETTERS
    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public GregorianCalendar getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(GregorianCalendar fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public float getTotalmultas() {
        return totalmultas;
    }

    public void setTotalmultas(float totalmultas) {
        this.totalmultas = totalmultas;
    }

    public String getApalabrado() {
        return apalabrado;
    }

    public void setApalabrado(String apalabrado) {
        this.apalabrado = apalabrado;
    }

    public static Persona getUsuario() {
        return usuario;
    }

    public static void setUsuario(Persona usuario) {
        Persona.usuario = usuario;
    }
    
    
    
    
    
}
