/*
OBJETIVO DEL PROGRAMA:
Escribir un programa que lea un número entero por teclado y muestre por pantalla el
doble, el triple y la raíz cuadrada de ese número. Nota: investigar la función Math.sqrt().
 */
package _5_programamath;
import java.util.Scanner;
//@author MENESES-FLOREZ

public class _5_programaMath {

    public static void main(String[] args) {
        //Instancia de clase Scanner en objeto input para leer datos por teclado
        Scanner input = new Scanner(System.in);
        //Declaración de variable para almacenar núemro solicitado
        int number;
        
        System.out.println("***PROGRAMA PARA MOSTRAR EL DOBLE; TRIPLE Y LA RAÍZ DE UN NÚMERO DADO***");
        //Captura de dato ingresado por teclado y almacenado en variable
        System.out.println("Ingrese un número cualquiera: ");
        number = input.nextInt();
        //Llamada al método
        Calculadora(number);
    }
    
    public static void Calculadora(int number){        
        int numberDoubled, numberTrilpled;
        
        numberDoubled = number * 2;
        System.out.println("El doble del número es: "+numberDoubled);
        
        numberTrilpled = number * 3;
        System.out.println("El triple del número es: "+numberTrilpled);
        
        double numberFloated = (double)number;
        numberFloated = Math.sqrt(numberFloated);
        System.out.println("La raíz cuadrada del número es: "+numberFloated);
        
    }
}
