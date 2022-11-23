/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.GregorianCalendar;

/**
 *
 * @author alumno
 */
public class Coche {
    private String matricula;
    private String marca;
    private String modelo;
    private String propietario;
    private GregorianCalendar fecha_matriculacion;

    public Coche(String matricula, String marcha, String modelo, String propietario, GregorianCalendar fecha_matriculacion) {
        this.matricula = matricula;
        this.marca = marcha;
        this.modelo = modelo;
        this.propietario = propietario;
        this.fecha_matriculacion = fecha_matriculacion;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getPropietario() {
        return propietario;
    }

    public void setPropietario(String propietario) {
        this.propietario = propietario;
    }

    public GregorianCalendar getFecha_matriculacion() {
        return fecha_matriculacion;
    }

    public void setFecha_matriculacion(GregorianCalendar fecha_matriculacion) {
        this.fecha_matriculacion = fecha_matriculacion;
    }
    
    
    
}
