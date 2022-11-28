package Controlador;

import Vista.DialogError;
import Vista.FramePrincipal;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JDialog;

/**
 *
 * @author alumno
 */
public class Error extends Exception {

    private static Error error= new Error();
    

    public Error() {

    }

    public static Error getError() {
        return error;
    }

    
    public String saltaError(int cod) {
        String mensaje;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd 'a las' HH:mm:ss");
        Date date = new Date(System.currentTimeMillis());

        switch (cod) {
            case 1: {
                mensaje = ("Error "+cod + ". Error al encontrar la clase (ConexionBD). "+formatter.format(date));
                break;
            }
            
            case 2: {
                mensaje = ("Error "+cod + ". Error de sql al conectarse (ConexionBD). "+formatter.format(date));
                break;
            }
            
            case 3: {
                mensaje = ("Error "+cod + ". Error de sql al cerrar la conexion (ConexionBD). "+formatter.format(date));
                break;
            }
            
            case 4: {
                mensaje = ("Error "+cod + ". Error de sql (Delete). "+formatter.format(date));
                break;
            }
            
            case 5: {
                mensaje = ("Error "+cod + ". Error de sql (Insert). "+formatter.format(date));
                break;
            }

            case 6: {
                mensaje = ("Error "+cod + ". Error de sql al buscar a una persona (Select). "+formatter.format(date));
                break;
            }
            
            case 7: {
                mensaje = ("Error "+cod + ". Error de sql al buscar multas (Select). "+formatter.format(date));
                break;
            }
            
            case 8: {
                mensaje = ("Error "+cod + ". Error de sql al buscar el valor de una multa (Select). "+formatter.format(date));
                break;
            }
            
            case 9: {
                mensaje = ("Error "+cod + ". Error de sql al buscar coches (Select). "+formatter.format(date));
                break;
            }
            
            case 10: {
                mensaje = ("Error "+cod + ". Error de sql al buscar casa (Select). "+formatter.format(date));
                break;
            }
            
            case 11: {
                mensaje = ("Error "+cod + ". Error de sql al actualizar casa (Update). "+formatter.format(date));
                break;
            }
            
            case 12: {
                mensaje = ("Error "+cod + ". Error de sql al Escribir en el log (Error). "+formatter.format(date));
                break;
            }
            
            case 13: {
                mensaje = ("Error "+cod + ". Error al iniciar sesion, no existe el usuario o se han introducido mal los datos. "+formatter.format(date));
                break;
            }
            
            case 14: {
                mensaje = ("Error "+cod + ". Error, dni no valido (PanelAltaPersona). "+formatter.format(date));
                break;
            }
            
            default:{
                mensaje = ("Error "+cod + ". Error desconocido/sin definir. "+formatter.format(date));
                break;
            }
        }
        
        System.err.println(mensaje);
        escribeError(mensaje);
        mostrarError(mensaje);
        return mensaje;
    }

    
    public void escribeError(String mensaje) {
        try {
            File log = new File("./log.txt");
            BufferedWriter out = new BufferedWriter(new FileWriter(log));
            
            out.write(mensaje);
            out.close();

        } catch (IOException ex) {
            Error.getError().saltaError(12);
        }
    }
    
    public void mostrarError(String mensaje){
        DialogError dialog = new DialogError(FramePrincipal.fprincipal, true);
        
        dialog.error=mensaje;
        dialog.mostrar();
        
        dialog.setVisible(true);
    }

}
