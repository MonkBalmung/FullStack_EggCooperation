/*
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.
 */
package javamethod;

import java.util.Scanner;

/**
 *
 * @author MENESES-FLOREZ
 */
public class JavaMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numberA, numberB;
        
        System.out.println("Ingrese dos números enteros: ");
        numberA = input.nextInt();
        numberB = input.nextInt();
        
        //Llamamos al método
        EsMultiplo(numberA, numberB);
    }
    
    public static void EsMultiplo(int numberA, int numberB){
        if (numberA % numberB == 0) {
            System.out.println("El número "+numberA+" es multiplo de "+numberB);
        }else{
            System.out.println("El número "+numberA+" no es multiplo de "+numberB);
        }
        
    }
}
