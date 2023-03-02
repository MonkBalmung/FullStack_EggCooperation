/*
Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 */
package _4_programaextranumeroaromano;

//@author MENESES-FLOREZ

import java.util.Scanner;

public class _4_programaExtraNumeroARomano {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numero;
        
        System.out.println("Ingrese un número del 1 al 10:");
        numero = input.nextInt();
        
        switch (numero) {
            case 1:
                System.out.println("El número ("+numero+") equivalente en notación romana es (I)");
                break;
            case 2:
                System.out.println("El número ("+numero+") equivalente en notación romana es (II)");
                break;
            case 3:
                System.out.println("El número ("+numero+") equivalente en notación romana es (III)");
                break;
            case 4:
                System.out.println("El número ("+numero+") equivalente en notación romana es (IV)");
                break;
            case 5:
                System.out.println("El número ("+numero+") equivalente en notación romana es (V)");
                break;
            case 6:
                System.out.println("El número ("+numero+") equivalente en notación romana es (VI)");
                break;
            case 7:
                System.out.println("El número ("+numero+") equivalente en notación romana es (VII)");
                break;
            case 8:
                System.out.println("El número ("+numero+") equivalente en notación romana es (VIII)");
                break;
            case 9:
                System.out.println("El número ("+numero+") equivalente en notación romana es (IX)");
                break;
            case 10:
                System.out.println("El número ("+numero+") equivalente en notación romana es (X)");
                break;
            default:
                System.out.println("El número ("+numero+") no obedece al rango exigido por el programa.");
        }
    }
    
}
