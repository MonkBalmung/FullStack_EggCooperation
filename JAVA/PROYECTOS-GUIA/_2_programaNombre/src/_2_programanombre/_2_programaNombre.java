/*
OBJETIVO DEL PROGRAMA:
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre por
pantalla.
 */
package _2_programanombre;
import java.util.Scanner;
//@author MENESES-FLOREZ

public class _2_programaNombre {

    public static void main(String[] args) {
        //Instanciamos la clase Scanner en un objeto 'input' para tomar datos por teclado
        Scanner input = new Scanner(System.in);
        //Declaramos la variable 'name' para capturar la cadena
        String name;
        System.out.println("***PROGRAMA PARA SALUDAR POR NOMBRE***");
        //Capturamos la cadena y la almacenamos en la variable
        System.out.println("Ingrese su nombre");
        name = input.nextLine();
        //Llamamos al método
        MostrarNombre(name);
    }
    public static void MostrarNombre(String name){
        System.out.println("Hola, "+name+". ¡Bienvenido!");
    }
    
}
