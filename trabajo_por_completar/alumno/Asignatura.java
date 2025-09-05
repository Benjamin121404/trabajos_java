/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumno;

/**
 *
 * @author vina
 */
public class Asignatura {
    private int codigo_asigntara;
    private String n_asignatura;
    private String nota1;
    private String nota2;
    private String nota3;
    public Asignatura(int codigo_asigntara, String n_asignatura) {
        this.codigo_asigntara = codigo_asigntara;
        this.n_asignatura = n_asignatura;
    }

    public Asignatura(String nota1, String nota2, String nota3) {
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public int getCodigo_asigntara() {
        return codigo_asigntara;
    }

    public void setCodigo_asigntara(int codigo_asigntara) {
        this.codigo_asigntara = codigo_asigntara;
    }

    public String getN_asignatura() {
        return n_asignatura;
    }

    public void setN_asignatura(String n_asignatura) {
        this.n_asignatura = n_asignatura;
    }

    public String getNota1() {
        return nota1;
    }

    public void setNota1(String nota1) {
        this.nota1 = nota1;
    }

    public String getNota2() {
        return nota2;
    }

    public void setNota2(String nota2) {
        this.nota2 = nota2;
    }

    public String getNota3() {
        return nota3;
    }

    public void setNota3(String nota3) {
        this.nota3 = nota3;
    }
    
}
