/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar,
restar, multiplicar y dividir. La aplicación debe tener una función para cada operación
matemática y deben devolver sus resultados para imprimirlos en el main.
 */
package _15_programaextraoperacionesaritmeticas;

//@author MENESES-FLOREZ

import java.util.Scanner;

public class _15_programaExtraoperacionesAritmeticas {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int numA, numB, suma, resta, multiplicacion;
        double division;
        
        System.out.println("Ingrese dos números para mostrar sus operaciones aritméticas:");
        numA = input.nextInt();
        numB = input.nextInt();
        
        suma                = sumarNumeros(numA, numB);
        resta               = restarNumeros(numA, numB);
        multiplicacion      = multiplicarNumeros(numA, numB);
        division            = dividirNumeros(numA, numB);
        
        System.out.println(
                "SUMA: "+suma+"\n"
                + "RESTA: "+resta+"\n"
                + "MULTIPLICACIÓN: "+multiplicacion+"\n"
                + "DIVISIÓN: "+division);
    }
    public static int sumarNumeros(int numA, int numB)
    {
        int suma;
        suma = numA + numB;
        return suma;
    }
    
    public static int restarNumeros(int numA, int numB)
    {
        int resta;
        resta = numA - numB;
        return resta;
    }
    
    public static int multiplicarNumeros(int numA, int numB)
    {
        int multiplicacion;
        multiplicacion = numA * numB;
        return multiplicacion;
    }
    
    public static double dividirNumeros(int numA, int numB)
    {
        double division = 0;
        
        if (numB != 0)
        {
           division = numA / numB; 
        }
        
        return division;
    }
}
