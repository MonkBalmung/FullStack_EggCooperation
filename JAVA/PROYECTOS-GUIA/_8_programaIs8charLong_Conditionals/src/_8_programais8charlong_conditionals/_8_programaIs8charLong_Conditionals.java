/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si el
usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje por
pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la función Lenght() en Java.
 */
package _8_programais8charlong_conditionals;
import java.util.Scanner;

//@author MENESES-FLOREZ

public class _8_programaIs8charLong_Conditionals {

    public static void main(String[] args) {
        //Instanciamos la clase Scanner en el objeto 'input' para leer datos por teclado
        Scanner input = new Scanner(System.in);
        //Declaramos la variable para almacenar los datos
        String cadena;
        System.out.println("***PROGRAMA PARA EVALUAR SI LA CADENA INGRESADA TIENE 8 CARACTRES DE LARGO");
        //Capturamos el dato y lo almacenamos en la variable
        System.out.println("Ingrese la palabra: ");
        cadena = input.nextLine();
        //Llamamos al método
        IsMoreThan8(cadena);
    }
    public static void IsMoreThan8(String string){        
        if ( string.length() == 8 ) {
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }
    
}
