/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco debe
detener la lectura y mostrar la cantidad de números leídos, la cantidad de números pares
y la cantidad de números impares. Al igual que en el ejercicio anterior los números
negativos no deben sumarse. Nota: recordar el uso de la sentencia break.
 */
package _9_programaextradivisionrestas;

//@author MENESES-FLOREZ
import java.util.Scanner;

public class _9_programaExtraDivisionRestas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int dividendo, divisor;

        System.out.println("Ingrese el número a dividir:");
        dividendo = input.nextInt();

        System.out.println("Ingrese el divisor del número:");
        divisor = input.nextInt();
        
        dividir_Restando(dividendo,divisor);
    }

    public static void dividir_Restando(int dividendo, int divisor) {
        int cociente = 0;
        int resto = 0;
        do {
            resto = dividendo - divisor;		
            dividendo = resto;
            cociente = cociente + 1;
        } while (dividendo >= divisor);
        System.out.println("El cociente de la division es "+cociente+" y el resto es "+resto);
    }
}
