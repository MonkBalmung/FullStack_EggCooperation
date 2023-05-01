/*
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package Services;

//@author MENESES-FLOREZ */

import Entities.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;




public class AlumnoService
{
    private Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    private ArrayList<Alumno> listaAlumnos = new ArrayList();
    
    
    public Alumno crearAlumno()
    {
        System.out.println("*** MÓDULO CARGAR ALUMNO AL SISTEMA ***");
        Alumno alumno = new Alumno();
        
        System.out.println("Ingrese le nombre completo del alumno: ");
        
        alumno.setNombreAlumno(input.next().toUpperCase());
        
        alumno.setListaNotas(llenarListaNotas());
        
        return alumno;
    }
    
    public ArrayList<Double> llenarListaNotas()
    {
        System.out.println("*** MÓDULO CARGAR NOTAS ***");
        ArrayList<Double> listaNotas = new ArrayList();
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese la nota " + (i + 1) + ":");
            Double nota = input.nextDouble();
            listaNotas.add(nota); 
        }
                
        return listaNotas;        
    }
    
    public ArrayList<Alumno> llenarListaAlumnos()
    {               
        do {
            
            listaAlumnos.add(this.crearAlumno());
            
            System.out.println("¿Desea ingresar otro alumno?");
            
        } while (input.next().equalsIgnoreCase("S"));
        
        return listaAlumnos;
    }
    
    public void notaFinal()
    {
        double notaTotal = 0.0;
        double promedio = 0.0;
        
        ArrayList<Double> listaNotas = new ArrayList();
        
        System.out.println("*** MÓDULO CALCULAR PROMEDIO FINAL ***");
        System.out.println("Ingrese el nombre del estudiante: ");
        String nombre = input.next().toUpperCase();
        
        Alumno alumno = new Alumno();
        
        Iterator<Alumno> iterator = listaAlumnos.iterator();
        while (iterator.hasNext())
        {
           
            
            alumno = iterator.next();
            
            if (alumno.getNombreAlumno().equals(nombre))
            {
                
                listaNotas = alumno.getListaNotas();
                break;
            }
   
        }
        
        for (Double nota : listaNotas) {
            notaTotal += nota;
        }
        
        promedio = notaTotal / 3;

        alumno.setPromedio(promedio);
        
        System.out.println(alumno.toString());
 
    }
    
    public void mostrarAlumno()
    {
        for (Alumno alumno : listaAlumnos) {
            System.out.println(alumno.toString());
        }
    }
}
