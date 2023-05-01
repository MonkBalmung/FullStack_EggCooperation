/*

 */
package _2_collections_alumno;

//@author MENESES-FLOREZ */


import Entities.Alumno;
import Services.AlumnoService;

public class _2_Collections_Alumno
{
    public static void main(String[] args)
    {
        AlumnoService servicioAlumno = new AlumnoService();
           
        servicioAlumno.llenarListaAlumnos();
        
        servicioAlumno.notaFinal();
        
        servicioAlumno.mostrarAlumno();
        
        
    }
    
}
