/*
Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la
suma de sus filas, sus columnas y sus diagonales son idénticas. Crear un programa que
permita introducir un cuadrado por teclado y determine si este cuadrado es mágico o no.
El programa deberá comprobar que los números introducidos son correctos, es decir,
están entre el 1 y el 9.
 */
package _20_programa.matrizmagica;

//@author MENESES-FLOREZ

import java.util.Scanner;

public class _20_programaMatrizMagica {

    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);
        
        System.out.println("Ingrese el número de filas que desea tenga la matriz: ");
        int dimension = input.nextInt();
        int[][] matriz = FulfillMatrix(dimension);
        
        System.out.println("Matriz:");        
        print_Matrix(matriz);
        
        boolean rowsEquals = false;
        boolean columnsEquals = false;
        boolean diagonalsEquals = false;
        //Sumar filas
        rowsEquals = row_Equals(matriz, dimension);
        //Sumar columnas
        columnsEquals = column_Equals(matriz, dimension);
        //Suma de Diagonales
        diagonalsEquals = diagonals_Equals(matriz, dimension);        
        
        evaluateProcess(rowsEquals, columnsEquals, diagonalsEquals);

    }
    
    public static int[][] FulfillMatrix(int dimension){  
        Scanner input = new Scanner(System.in);
        int[][] matrix = new int[dimension][dimension]; 
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.println("Ingrese el número para la coordenada ("+i+","+j+")");
                matrix[i][j] = input.nextInt();
                //System.out.print(matrix[i][j]+" ");
            }
            System.out.println(" ");
        }
        return matrix;
    }
    
    public static void print_Matrix(int[][] matrix){
        System.out.println("La matriz ingresada es:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    }
    //Sumar filas
    public static boolean row_Equals(int[][] matrix, int dimension){
        boolean rowEquals = false;
        int suma = 0, sumaFila = 0, totalFila = 0, contadorFila = 0;
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                suma += matrix[i][j];
                totalFila = suma;
                if (i > 0 && totalFila == sumaFila) {
                    contadorFila++;
                }
                if (j == dimension - 1) {
                    sumaFila = suma;
                    suma = 0;
                }
            }
        }
        if  (contadorFila == (dimension - 1)) {
            rowEquals =  true;
            System.out.println("La suma de cada una de las filas es igual a "+totalFila);
        }else{
            rowEquals = false;
            System.out.println("La suma de las filas no son iguales.");
        }
        return rowEquals;
    }
    //Suma Columnas
    public static boolean column_Equals(int[][] matrix, int dimension){
        boolean columnsEquals = false;
        int suma = 0, sumaColumna = 0, totalColumna = 0, contadorColumna = 0;
        for (int j = 0; j < dimension; j++) {
            for (int i = 0; i < dimension; i++) {
                suma += matrix[j][i];
                totalColumna = suma;
                if (j > 0 && totalColumna == sumaColumna) {
                    contadorColumna++;
                }
                if (i == (dimension - 1)) {
                    sumaColumna = suma;
                    suma = 0;
                }
            }
        }
        if (contadorColumna == (dimension - 1)) {
            columnsEquals = true;
            System.out.println("La suma de cada una de las columnas es igual a "+totalColumna);
        }else{
            columnsEquals = false;
            System.out.println("La suma de las columnas no son iguales.");
        }
        return columnsEquals;
    }
    //Suma Diagonales
    public static boolean diagonals_Equals(int[][] matrix, int dimension){
        boolean diagonalsEquals = false;
        //Diagonal Principal
        int suma = 0, sumaDiagonalPr = 0, totalDiagonalSec = 0;
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                if (i == j) {
                    suma += matrix[i][j];
                    sumaDiagonalPr = suma;
                }
            }
        }
        suma = 0;
        //Diagonal Secundaria
        for (int i = 0; i < dimension; i++) {
            for (int j = (dimension - 1); j >= 0; j--) {
                suma += matrix[i][j];
                totalDiagonalSec = suma;
                dimension--;
                if (i >= 0) {
                    i++;
                }
            }
        }
        if (sumaDiagonalPr == totalDiagonalSec) {
            diagonalsEquals = true;
            System.out.println("La suma de ambas diagonales es: "+sumaDiagonalPr);
        }else{
            diagonalsEquals = false;
            System.out.println("La suma de ambas diagonales no es igual.");
        }
        return diagonalsEquals;
    }
    //Evaluate process and print output
    public static void evaluateProcess(boolean forRows, boolean forColumns, boolean forDiagonals){
        if ((forRows && forColumns) && (forRows && forDiagonals)) {
            System.out.println("¡¡¡La Matriz sí es una °°°Matriz Mágica°°°!!!");
        }else{
            System.out.println("Lamentablemente no cumple los requisitos para ser una Matriz Mágica"); 
        }
    }
}
