/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto. Nota: investigar
la función equals() en Java.
 */
package _7_programaequals_conditionals;
import java.util.Scanner;
//@author MENESES-FLOREZ

public class _7_programaEquals_Conditionals {

    public static void main(String[] args) {
        //Instanciamos la clase Scanner en el objeto 'input' para leer datos por teclado
        Scanner input = new Scanner(System.in);
        //Declaramos la variable para almacenar los datos
        String cadena;
        System.out.println("***PROGRAMA PARA EVALUAR SI LA CADENA INGRESADA DICE 'EUREKA'");
        //Capturamos el dato y lo almacenamos en la variable
        System.out.println("Ingrese la palabra: ");
        cadena = input.nextLine();
        //Llamamos al método
        IsEqual(cadena);
    }
    public static void IsEqual(String string){        
        if ( string.equalsIgnoreCase("eureka") ) {
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }
}
