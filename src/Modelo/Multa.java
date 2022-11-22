
package Modelo;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;


public class Multa {
    int codigo;
    String coche;
    GregorianCalendar fecha;
    Float coste;

    public Multa(int codigo, String coche, GregorianCalendar fecha, Float Coste) {
        this.codigo = codigo;
        this.coche = coche;
        this.fecha = fecha;
        this.coste = Coste;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCoche() {
        return coche;
    }

    public void setCoche(String coche) {
        this.coche = coche;
    }

    public GregorianCalendar getFecha() {
        return fecha;
    }

    public void setFecha(GregorianCalendar fecha) {
        this.fecha = fecha;
    }

    public Float getCoste() {
        return coste;
    }

    public void setCoste(Float Coste) {
        this.coste = Coste;
    }
    
    public String toString(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
        String dateformatted = sdf.format(this.getFecha().getTime());
        
        return "Código:"+this.codigo+"; Coche:"+this.coche+"; Fecha:"+dateformatted+"; Coste:"+this.coste;
    }
    
}
