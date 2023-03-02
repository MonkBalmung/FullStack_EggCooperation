/*
Dadas dos matrices cuadradas de números enteros, la matriz M de 10x10 y la matriz P de 3x3, 
se solicita escribir un programa en el cual se compruebe si la matriz P está contenida dentro de la matriz M. 
Para ello se debe verificar si entre todas las submatrices de 3x3 que se pueden formar en la matriz M, 
desplazándose por filas o columnas, existe al menos una
que coincida con la matriz P. En ese caso, el programa debe indicar la fila y la columna de
la matriz M en la cual empieza el primer elemento de la submatriz P.
 */
package _21_programa.matrizcontenida;

//@author MENESES-FLOREZ
public class _21_programaMatrizContenida {

    public static void main(String[] args) {
        int[][] matrizAmplia = {{56,89,40,36,50,67,67,34,56,12},
                                {45,78,90,89,90,75,67,34,56,12},
                                {45,78,90,14,22,26,67,34,56,12},
                                {56,89,40,36,50,67,67,34,56,12},
                                {89,90,75,14,22,26,67,34,56,12},
                                {45,78,90,30,50,60,67,34,56,12},
                                {45,78,12,34,89,34,56,23,67,23},
                                {36,50,67,14,22,26,67,34,56,12},
                                {89,90,75,14,22,26,67,34,56,12},
                                {14,22,26,14,22,26,67,34,56,12}};
        
        int[][] matrizReducida = {{36,50,67},{89,90,75},{14,22,26}};
        
        
        System.out.println("Matriz M (10x10)");
        printMatrix(matrizAmplia);
        System.out.println("");
        System.out.println("Matriz P 3x3");
        printMatrix(matrizReducida);
        System.out.println("");
        /*Recorrer la matriz amplia, pero en secciones de 3x3*/
        //int dimension = 3;
        //int[][] matrizAuxiliar = new int[dimension][dimension];
        //int inicioColumnas = 0;
        //int corteColumnas = 3;
        //int inicioFilas = 0;
        //int corteFilas = 3;    
        
        int indiceColumna = 0; 
        int indiceFila = 0;
        for (int i = 0; i < matrizAmplia.length; i++) {
            for (int j = 0; j < matrizAmplia.length; j++) {
                if (matrizAmplia[i][j] == matrizReducida[indiceFila][indiceColumna]) {
                    System.out.println(i+","+j+"-> "+indiceColumna);
                }
                if (j == 2 || j == 5 || j == 7 || j == 9 || indiceColumna > 2) {
                   indiceColumna = 0; 
                }else{
                    indiceColumna++;
                }
                if (indiceFila > 2) {
                    indiceFila = 0;
                }
            }
        }
//        int k = 0, l = 0;
//        System.out.println("Posibles sub-matrices 3x3 en M:");
//        while(!(corteFilas == 11)){
//                        System.out.println("Matrices 3x3 en M:"+(inicioFilas+1)+","+(inicioColumnas+1));        
//                        for (int i = inicioFilas; i < corteFilas; i++) {
//                            for (int j = inicioColumnas; j < corteColumnas; j++) {
//                                //System.out.print(matrizAmplia[i][j]+" ");
//                                //for (int k = 0; k < dimension; k++) {
//                                    //for (int l = 0; l < dimension; l++) {
//                                        matrizAuxiliar[k][l] = matrizAmplia[i][j];
//                                        System.out.print(matrizAuxiliar[k][l]+ " ");
//                                        if (l >= 2 ) {
//                                            k++;
//                                        }else {
//                                            l++;
//                                        }
//                                        if (l > 2 || k > 2) {
//                                            break;
//                                        }
//                                    //}
//                                    //System.out.println("");
//                                //}
//                            }
//                            System.out.println("");
//                        }
//                        inicioColumnas++;
//                        corteColumnas++;
//                        if (inicioColumnas == 8) {
//                            inicioFilas++;
//                            corteFilas++;
//                            inicioColumnas = 0;
//                            corteColumnas = 3;
//                        }
//        }

    }
    public static void printMatrix(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println("");
        }
    } 
        
}


