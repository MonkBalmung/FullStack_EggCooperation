/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y muestre la
traspuesta de la matriz. La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).
 */
package _18_programamatriztranspuesta;

//@author MENESES-FLOREZ/

import java.util.Scanner;

public class _18_programaMatrizTranspuesta {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Ingrese el número de filas que desea tenga la matriz: ");
        int dimension = input.nextInt();
        
        System.out.println("Matriz normal:");
        int[][] matriz = FulfillMatrix(dimension);
        
        System.out.println(" ");
        
        System.out.println("Matriz traspuesta:");
        TrasposeMatrix(matriz);
    }
    
    public static int[][] FulfillMatrix(int dimension){         
        int[][] matrix = new int[dimension][dimension]; 
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                matrix[i][j] = (int)(Math.random()*10);
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }
        return matrix;
    }
    
    public static void TrasposeMatrix(int[][] matrix){         
        for (int j = 0; j < matrix.length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                System.out.print(matrix[i][j]+" ");
                        
            }
            System.out.println(" ");
        }
    }
}
