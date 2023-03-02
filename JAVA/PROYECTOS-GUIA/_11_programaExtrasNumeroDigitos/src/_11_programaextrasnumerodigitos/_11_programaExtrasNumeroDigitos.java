/*
Escribir un programa que lea un número entero 
y devuelva el número de dígitos que componen ese número. 

Por ejemplo, si introducimos el número 12345, el programa
deberá devolver 5. Calcular la cantidad de dígitos matemáticamente utilizando el operador
de división. Nota: recordar que las variables de tipo entero truncan los números o
resultados.
 */
package _11_programaextrasnumerodigitos;

//@author MENESES-FLOREZ

import java.util.Scanner;

public class _11_programaExtrasNumeroDigitos {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numero;
        int numAux;
        int contador = 0;
        
        System.out.println("Ingrese un número entero: ");
        numero = input.nextInt();
        
        do {
            numAux = numero / 10;
            numero = numAux;
            contador++;
        } while (numero >= 1);
        
        System.out.println("La cantidad de cifras del número ingresado es: "+contador);
        
    }

}
