/*
Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25.
 */
package javaconditionals;
import java.util.Scanner;

/**
 *
 * @author MENESES-FLOREZ
 */
public class JavaConditionals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numberA, numberB;
        
        System.out.println("Ingrese dos números enteros cualquiera: ");
        numberA = input.nextInt();
        numberB = input.nextInt();
        
        if ( numberA > 25 && numberB > 25) {
             System.out.println("Ambos números son mayores que 25.");
        }else if ( numberA > 25 ) {
            System.out.println("El número "+numberA+" es mayor o igual que 25.");
        }else if (numberB > 25) {
            System.out.println("El número "+numberB+" es mayor o igual que 25.");
        }else{
            System.out.println("Ningun número introducido es mayor que 25.");
        }
    }
    
}
