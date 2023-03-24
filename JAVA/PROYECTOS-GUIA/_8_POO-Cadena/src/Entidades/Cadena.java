/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. 
 */
package Entidades;

//@author MENESES-FLOREZ
public class Cadena
{
    //Atributes
    private String frase;
    private int fraseLength;
    
    //Constructores

    public Cadena() {}
    public Cadena(String frase, int fraseLength)
    {
        this.frase = frase;
        this.fraseLength = fraseLength;
    }
    
    //Getter & Setter

    public String getFrase() {
        return frase;
    }

    public int getFraseLength() {
        return fraseLength;
    }

    public void setFrase(String frase) {
        this.frase = frase.toLowerCase();
    }

    public void setFraseLength(String frase) {
        this.fraseLength = frase.length();
    }
    
    //toString

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", fraseLength=" + fraseLength + '}';
    }
    
    
}
