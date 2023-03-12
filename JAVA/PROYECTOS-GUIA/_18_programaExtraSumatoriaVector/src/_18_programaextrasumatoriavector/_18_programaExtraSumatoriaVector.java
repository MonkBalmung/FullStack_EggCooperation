/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño
N, con los valores ingresados por el usuario.
 */
package _18_programaextrasumatoriavector;

//@author MENESES-FLOREZ

import java.util.Scanner;

public class _18_programaExtraSumatoriaVector {

    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);        
        int dimension, sumatoria;
        System.out.println("Ingrese la dimensión del vector:");
        dimension = input.nextInt();
        sumatoria = FulfillVector_NAddElements(dimension);
        System.out.println("La suma de todos los números ingresados es: "+sumatoria);
        
    }
    public static int FulfillVector_NAddElements(int dimension)
    {
        Scanner input = new Scanner(System.in);        
        int[] vector = new int[dimension];
        System.out.println("Ingrese "+dimension+" números:");
        int sumatoria = 0;
        for (int i = 0; i < vector.length; i++)
        {
            vector[i] = input.nextInt();
            sumatoria += vector[i];
        }
        return sumatoria;
    }
}
