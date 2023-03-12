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
package entidades;

import java.util.Scanner;

/**
 *
 * @author MENESES-FLOREZ
 */
public class Libro
{
    private String isbn; 
    private String titulo; 
    private String autor;
    private int numPaginas;
    
    public Libro(){}

    public Libro(String isbn, String titulo, String autor, int numPaginas)
    {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumPaginas() {
        return numPaginas;
    }
    
    
    //Mostramos los datos de la clase
    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numPaginas=" + numPaginas + '}';
    }
    
    
}
