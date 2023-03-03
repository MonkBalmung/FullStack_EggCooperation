/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo por
parámetro. Después haremos otra función o procedimiento que imprima el vector.
 */
package _20_programaextrarellenarvector;

//@author MENESES-FLOREZ

import java.util.Scanner;

public class _20_programaExtraRellenarVector {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int dimension;
        
        System.out.println("Ingrese la dimensión del vector:");
        dimension = input.nextInt();
        
        int[] vector = new int[dimension];
        
       FulfillArray(vector,dimension);
       
       imprimirVector(vector,dimension);
        
    }
    public static void FulfillArray(int[] vector, int dimension)
    {          
        do {
            dimension = (int)(Math.random()*10);
        } while (dimension == 0);
        System.out.println(dimension);
        
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*1000);
        }
        
    }
    public static void imprimirVector(int[] vector, int dimension)
    {
        for (int i = 0; i < dimension; i++)
        {
            System.out.print(vector[i] + " ");
        }
        System.out.println("");
    }
}
