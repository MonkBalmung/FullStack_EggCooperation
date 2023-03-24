/*
Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. 

 */
package _8_poo.cadena;

//@author MENESES-FLOREZ

import Entidades.Cadena;
import Servicios.CadenaServicios;
import java.util.Scanner;

public class _8_POOCadena
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        Cadena frase = new Cadena();
        
        System.out.println("Ingrese una palabra frase o cualquiera");
        frase.setFrase(input.nextLine());
        frase.setFraseLength(frase.getFrase());        
        
        CadenaServicios serviciosFrase = new CadenaServicios();
        serviciosFrase.mostrarVocales(frase.getFrase());
        
        System.out.println("Frase Invertida:");
        serviciosFrase.invertirFrase(frase);
        
        System.out.println("Ingrese una letra:");
        char letra = input.next().charAt(0);
        input.nextLine();
        serviciosFrase.vecesRepetido(letra, frase.getFrase());        
        
        System.out.println("Ingrese una nueva frase para comparar la longitud: ");
        String newFrase = input.nextLine();
        serviciosFrase.compararLongitud(newFrase, frase);
        /*Si voy a usar una sola vez el retorno de la variable, no es necesario usar espacio de memoria
        Pero si el retorno lo voy a usar multiples veces, si es importante guardarla en una variable*/
        //String newSecondPhrase = serviciosFrase.unirFrases(newFrase, frase);
        
        System.out.println("Frase unida a la inicial:"+serviciosFrase.unirFrases(newFrase, frase));
        System.out.println("Ingrese un caracter a incluir reemplazando las letras 'A'");
        char caracter = input.next().charAt(0);
        input.nextLine();
        serviciosFrase.reemplazarLetra(caracter, frase);
        
        System.out.println("Ingrese una letra a buscar en la cadena incial: ");
        String caracterToFind = input.nextLine();
        System.out.println("¿La letra está? "+serviciosFrase.contieneLetra(caracterToFind, frase));
        
        
        
    }
    
}//Fin Clase _8_POO-Cadena
