/*
OBJETIVO DEL PROGRAMA:
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación solicite
números al usuario hasta que la suma de los números introducidos supere el límite inicial.
 */
package _10_programasumatoriabucles;

//@author MENESES-FLOREZ

import java.util.Scanner;

public class _10_programaSumatoriaBucles {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int limite;
        int numeros = 0;
        int suma = 0;
        
        System.out.println("***PROGRAMA PARA SUMAR NUMEROS HASTA SUPERAR EL LIMITE INICIAL***");
        System.out.println("Ingrese un número-límite para finalizar el programa: ");
        limite = input.nextInt();
        
        do {
            System.out.println("Ingrese un número: ");
            numeros = input.nextInt();
            suma += numeros; 
        } while (suma < limite);
        
        System.out.println("La suma total fue "+suma+" y el límite inicial fue "+limite);
    }
    
}
