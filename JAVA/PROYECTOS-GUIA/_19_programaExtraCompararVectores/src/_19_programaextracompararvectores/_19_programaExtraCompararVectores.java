/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
package _19_programaextracompararvectores;

//@author MENESES-FLOREZ

import java.util.Scanner;

public class _19_programaExtraCompararVectores {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("PROGRAMA PARA CREAR Y EVALUAR SI DOS ARREGLOS CONTIENEN LOS MISMOS ELEMENTOS");
        System.out.println("Ingrese la dimensión deseada para los vectores: ");
        int dimension = input.nextInt();
        System.out.println("Se crearán Arreglos de "+dimension+" elementos...");
        boolean areEquals = false;
        int[] vectorA =fulfill_Vector(dimension);
        //print_Vector(vectorA);
        int[] vectorB = fulfill_Vector(dimension);
        //print_Vector(vectorA);
        areEquals = compare_Vectors(vectorA, vectorB);
        System.out.println("¿Son ambos vectores iguales? "+areEquals);
    }
    public static int[] fulfill_Vector(int dimension)
    {
        Scanner input = new Scanner(System.in);          
        int[] vector = new int[dimension];
        System.out.println("Ingrese números para el arreglo:");
        for (int i = 0; i < vector.length; i++)
        {
            System.out.println("Posición ("+i+"):");
            vector[i] = input.nextInt();
        }
        return vector;
    }
//    public static void print_Vector(int[] vector)
//    {
//        for (int i = 0; i < vector.length; i++) {
//            System.out.print(vector[i]+" ");
//        }
//        
//        System.out.println("");
//    }
    public static boolean compare_Vectors(int[] vectorA, int[] vectorB)
    {
        boolean areEqual = false;
        if (vectorA.length == vectorB.length) 
        {
           for (int i = 0; i < vectorA.length; i++)
           {
               if (vectorA[i] == vectorB[i])
               {
                   areEqual = true;
               }
               else
               {
                   areEqual = false;
                   break;
               }
           } 
        }
        else
        {
            areEqual = false;
        }
        
        return areEqual;
    }
}
