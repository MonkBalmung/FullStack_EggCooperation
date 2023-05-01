/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
 */
package Entities;

//@author MENESES-FLOREZ */

import java.util.ArrayList;

public class Alumno 
{
    //Atributes
    private String nombreAlumno;
    private ArrayList<Double> listaNotas;
    private double promedio = 0.0;
    
    //Contructor 
    public Alumno() {}
    public Alumno(String nombreAlumno, ArrayList<Double> listaNotas) {
        this.nombreAlumno = nombreAlumno;
        this.listaNotas = listaNotas;
    }
    
    //Getter & Setter
    public String getNombreAlumno() {
        return nombreAlumno;
    }
    public ArrayList<Double> getListaNotas() {
        return listaNotas;
    }
    public double getPromedio(){
        return promedio;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }
    public void setListaNotas(ArrayList<Double> listaNotas) {
        this.listaNotas = listaNotas;
    }
    public void setPromedio(double promedio){
        this.promedio = promedio;
    }

    //toString
    @Override
    public String toString() {
        System.out.println("Notas "+listaNotas.toString());
        return String.format("Alumno: %s --> Nota Final: %.2f%n ", nombreAlumno, promedio);        
    }
}
