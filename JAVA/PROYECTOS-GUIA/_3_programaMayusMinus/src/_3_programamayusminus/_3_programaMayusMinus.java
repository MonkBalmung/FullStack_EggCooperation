/*
OBJETIVO DEL PROGRAMA:
Escribir un programa que pida una frase y la muestre toda en mayúsculas y después toda
en minúsculas. Nota: investigar la función toUpperCase() y toLowerCase() en Java.
 */
package _3_programamayusminus;
import java.util.Scanner;

//@author MENESES-FLOREZ

public class _3_programaMayusMinus {

    public static void main(String[] args) {
        //Instanciamos la clase Scanner en el objeto 'input' para tomar datos por teclado
        Scanner input = new Scanner(System.in);
        //Declaramos variable para almacenar cadena
        String string;
        System.out.println("***PROGRAMA PARA MOSTRAR MAYUSCULAS Y MINUSCULAS***");
        //Capturamos cadena en la variable
        System.out.println("Ingrese una frase o palabra: ");
        string = input.nextLine();
        //Llamamos al método
        MostrarCadenaMayMin(string);
    }
    public static void MostrarCadenaMayMin(String string){
        System.out.println("La cadena en mayúsculas es: "+string.toUpperCase());
        System.out.println("La cadena en minúsculas es: "+string.toLowerCase());
    }
}
