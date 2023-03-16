/*
Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, 
y un constructor con todos los atributos pasados por parámetro 
y un
constructor vacío. 
Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 */
package _1_poo_claselibro;

//@author MENESES-FLOREZ

import entidades.Libro;
import servicios.LibroServicios;

public class _1_POO_ClaseLIBRO {

    public static void main(String[] args) {
        //Instanciamos la función de la Clase Servicio que usaremos al crear la Clase Libro
        LibroServicios insertarDatosLibro = new LibroServicios();
        //Instanciamos clase libro y usamos la función del Servicio de la Clase Libro "LibroServicios"
        Libro libro = insertarDatosLibro.insertarDatosLibro();
        //Imprimimos atributos del objeto libro
        System.out.println(libro.toString());
        
    }//Fin método main
    
}//Fin clase Libro
