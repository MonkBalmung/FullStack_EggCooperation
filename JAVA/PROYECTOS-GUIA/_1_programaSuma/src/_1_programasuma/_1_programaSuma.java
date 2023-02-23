/*
OBJETIVO DEL PROGRAMA SUMA:
Escribir un programa que pida dos números enteros por teclado y calcule la suma de los
dos. El programa deberá después mostrar el resultado de la suma.
 */
package _1_programasuma;
import java.util.Scanner;
// @author MENESES-FLOREZ
public class _1_programaSuma {
    
    public static void main(String[] args) {
        //Instanciamos objeto Scanner del package 'util' como "input" para leer datos por teclado
        Scanner input = new Scanner(System.in);
        // Declaramos dos variables de entrada, y una de salida
        int numA, numB, output;
        
        System.out.println("***PROGRAMA SUMA***");
        //Tomamos datos por teclado
        System.out.println("Ingrese dos números para realizar una suma: ");
        numA = input.nextInt();
        numB = input.nextInt();
        //Llamamos a la función Sumar y guardamos el retorno en variable output
        output = Sumar(numA, numB);
        //Imprimimos por pantalla el resultado de la suma
        System.out.println("El resultado de sumar "+numA+" y "+numB+" es: "+output);
    }
    
    public static int Sumar(int numA, int numB){        
        int suma = numA + numB;        
        return suma;
    }
}
