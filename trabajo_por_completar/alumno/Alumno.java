/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumno;
/**
 *
 * @author vina
 */
public class Alumno {
    private String nombre;
    private String rut;
    private double edad;
    private String fecha_nacimiento; 
    
    public Alumno(String nombre, String rut, double edad, String fecha_nacimiento) {
        this.nombre= nombre;
        this.edad = edad;
        this.fecha_nacimiento = fecha_nacimiento;
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public double getEdad() {
        return edad;
    }

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
    }

   

    
        
}
    

