/*
Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla que
diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar
la función Substring y equals() de Java.
 */
package _9_programabeginswitha_conditionals;
import java.util.Scanner;

//@author MENESES-FLOREZ
public class _9_programaBeginswithA_Conditionals {
    
    public static void main(String[] args) {
        //Instanciamos la clase Scanner en el objeto 'input' para leer datos por teclado
        Scanner input = new Scanner(System.in);
        //Declaramos la variable para almacenar los datos
        String cadena;
        System.out.println("***PROGRAMA PARA EVALUAR SI LA CADENA INGRESADA EMPIEZA EN 'A'");
        //Capturamos el dato y lo almacenamos en la variable
        System.out.println("Ingrese la palabra: ");
        cadena = input.nextLine();
        //Llamamos al método
        doBeginsinA(cadena);
    }
    public static void doBeginsinA(String string){        
        if ( string.substring(0, 1).equalsIgnoreCase("A") ) {
            System.out.println("CORRECTO");
        }else{
            System.out.println("INCORRECTO");
        }
    }
    
}
