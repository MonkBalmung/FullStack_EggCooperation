/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
 */
package Entities;

//@author MENESES-FLOREZ*/
public class Cancion
{
    //Attributes
    private String title;
    private String author;
    
    //Constructors
    public Cancion() {}
    public Cancion(String title, String author) {
        this.title = title;
        this.author = author;
    }
    
    //Getter & Setters

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
    
    //ToString

    @Override
    public String toString() {
        return "Cancion{" + "title=" + title + ", author=" + author + '}';
    }
    
    
}
