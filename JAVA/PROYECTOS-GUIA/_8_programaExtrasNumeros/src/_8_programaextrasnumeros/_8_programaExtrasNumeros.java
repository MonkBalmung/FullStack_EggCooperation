/*
Escriba un programa que lea números enteros. 
Si el número es múltiplo de cinco debe detener la lectura 
y mostrar la cantidad de números leídos, 
la cantidad de números pares y
la cantidad de números impares. 
Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package _8_programaextrasnumeros;

//@author MENESES-FLOREZ

import java.util.Scanner;

public class _8_programaExtrasNumeros {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numero;
        int cantidad = 0;
        int contPares = 0;
        int contImpares = 0;
        
        do {
            System.out.println("Ingrese números enteros:");
            numero = input.nextInt();
            if (!(numero < 0)) {
               cantidad++;
               if(numero % 2 == 0){
                contPares++;
                }else{
                    contImpares++;
                }
            } 
            
        } while (!(numero % 5 == 0));
        
        System.out.println("Cantidad total de numeros ingresados enteros positivos: "+cantidad);
        System.out.println("Cantidad total de numeros pares ingresados: "+contPares);
        System.out.println("Cantidad total de numeros impares ingresados: "+contImpares);
        
    }
    
}
