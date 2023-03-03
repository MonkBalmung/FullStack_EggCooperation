/*
Crea una aplicación que nos pida un número por teclado y con una función se lo pasamos
por parámetro para que nos indique si es o no un número primo, debe devolver true si es
primo, sino false.
 */
package _17_programaextraesprimo;

//@author MENESES-FLOREZ

import java.util.Scanner;

public class _17_programaExtraEsPrimo {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numero;        
        boolean esPrimo = false;

        System.out.println("VAMOS A DETERMINAR SI EL NÚMERO ES PRIMO");
        System.out.print("Ingrese un número:");
        numero = input.nextInt();
        
        esPrimo = Es_Primo(numero);
        
        System.out.println("¿El numero es primo? "+esPrimo);
       
    }
    public static boolean Es_Primo(int numero)
    {   //Variable a retornar solicitada por el problema
        boolean esPrimo = false;
        int contador = 0;
        //Dividimos "i" veces el número, con el auxiliar contador 
        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0 ) {
                contador++;
            }
        }
        //Si el contador es mayor que 2, quiere decir que el número fue divisible por 1, por si mismo, y por mas multiplos
        if (contador == 2) {
            esPrimo = true;
        }       
        
        return esPrimo;
    }
}
