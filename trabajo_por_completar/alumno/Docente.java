/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumno;

import java.util.Date;

/**
 *
 * @author vina
 */
public class Docente {
    private String nombre_docente;
    private String rut;
    private double nro_docente;
    private String sede;
    private String fecha_ingreso;
    
    public Docente(String nombre_docente, String rut, double nro_docente, String sede, String fecha_ingreso){
        this.nombre_docente = nombre_docente;
        this.nro_docente = nro_docente;
        this.rut = rut;
        this.fecha_ingreso = fecha_ingreso;
        this.sede = sede;
               
    }

    public String getNombre_docente() {
        return nombre_docente;
    }

    public void setNombre_docente(String nombre_docente) {
        this.nombre_docente = nombre_docente;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public double getNro_docente() {
        return nro_docente;
    }

    public void setNro_docente(double nro_docente) {
        this.nro_docente = nro_docente;
    }

    public String getSede() {
        return sede;
    }

    public void setSede(String sede) {
        this.sede = sede;
    }

    public String getFecha_ingreso() {
        return fecha_ingreso;
    }

    public void setFecha_ingreso(String fecha_ingreso) {
        this.fecha_ingreso = fecha_ingreso;
    }
    
}
