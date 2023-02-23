/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor.
 */
package javafor;

import java.util.Scanner;

/**
 *
 * @author MENESES-FLOREZ
 */
public class JavaFor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number = 0;       
        
        for (int i = 0; i <= 3; i++) {
            do {
                System.out.println("Ingrese un número comprendido entre 1 y 20");
                number = input.nextInt();
            } while (number < 0 || number > 20);
          
            System.out.print(number);
            for (int j = 0; j < number; j++) {
                System.out.print("*");
            }
            System.out.println("");            System.out.println("");

        }

    }
    
}
