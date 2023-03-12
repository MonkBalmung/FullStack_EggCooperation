/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;
//Importamos la clase "madre"
import entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author MENESES-FLOREZ
 */
public class LibroServicios {
    
    private Scanner input = new Scanner(System.in);
    //creamos un método con el cual pedimos datos por usuario
    //Funcion que retorna un Objeto de la clase Mascota
    public Libro insertarDatosLibro(){
        Libro libro = new Libro();
        System.out.println("Ingrese por favor los siguientes datos del libro:");
        System.out.println("Código ISBN:");
        //Declaramos variables que pertenecen a esta clase.service
        //String isbn = input.nextLine();
        libro.setIsbn(input.nextLine());        
        
        System.out.println("Titulo:");
        //String titulo = input.nextLine();
        libro.setTitulo(input.nextLine());        
        
        System.out.println("Autor:");
        //String autor = input.nextLine();
        libro.setAutor(input.nextLine());        
        
        System.out.println("Número de Páginas:");
        //int numPaginas = input.nextInt();
        libro.setNumPaginas(input.nextInt());
        
        //Pasamos las variables de la clase service como argumento del constructor de la clase "madre"
        return libro;
        //return new Libro(isbn, titulo, autor, numPaginas);    
    }
}
