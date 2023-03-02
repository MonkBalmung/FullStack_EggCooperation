/*
Realizar un programa que pida dos números enteros positivos por teclado y muestre por
pantalla el siguiente menú:

MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:

El usuario deberá elegir una opción y el programa deberá mostrar el resultado por pantalla
y luego volver al menú. El programa deberá ejecutarse hasta que se elija la opción 5.
Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir del programa
directamente, se debe mostrar el siguiente mensaje de confirmación: ¿Está seguro que
desea salir del programa (S/N)? Si el usuario selecciona el carácter ‘S’ se sale del
programa, caso contrario se vuelve a mostrar el menú.
 */
package _11_programaoperations_bucles;

//@author MENESES-FLOREZ

import java.util.Scanner;

public class _11_programaOperations_Bucles {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numA;
        double numB;        
        
        System.out.println("***PROGRAMA PARA REALIZAR OPERACIONES ARITMETICAS***");
        System.out.println("Ingrese un primer número: ");
        numA = input.nextInt();
        System.out.println("Ingrese un segundo número: ");
        numB = input.nextInt();
        numB = ValidateNumber(numB);
        
        Menu(numA, numB);
       
    }
    public static double ValidateNumber(double number){
        Scanner input = new Scanner(System.in);
        do {
            System.out.println("Ingrese un segundo número, distinto de 0: ");
            number = input.nextDouble();
        } while (number == 0);        
        return number;
    }
    public static void Menu(int numA, double numB){
        Scanner input = new Scanner(System.in);
        double resultado;
        char opcion;
        do {
            System.out.println("MENU ARITMÉTICO:\n" +
                        "1. Sumar\n" +
                        "2. Restar\n" +
                        "3. Multiplicar\n" +
                        "4. Dividir\n" +
                        "5. Salir\n" +
                        "Elija opción:");
        opcion = input.next().charAt(0);
                
        switch (opcion) {
            case '1':
                resultado = numA + numB;
                System.out.println("El resultado de la suma es: "+resultado);
                break;
            case '2':
                resultado = numA - numB;
                System.out.println("El resultado de la resta es: "+resultado);
                break;
            case '3':
                resultado = numA * numB;
                System.out.println("El resultado de la multiplicación es: "+resultado);
                break;
            case '4':
                resultado = numA / numB;
                System.out.println("El resultado de la división es: "+resultado);
                break;
            case '5':
                System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                opcion = input.next().toUpperCase().charAt(0);
                break;
            default:
                //throw new AssertionError();
        }     
        } while (opcion != 'S');        
        System.out.println("---FIN DEL PROGRAMA---");
    }
}
