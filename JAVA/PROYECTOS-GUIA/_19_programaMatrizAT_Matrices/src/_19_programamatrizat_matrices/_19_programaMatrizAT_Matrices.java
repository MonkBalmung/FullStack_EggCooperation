/*
Realice un programa que compruebe si una matriz dada es anti simétrica. Se dice que una
matriz A es anti simétrica cuando ésta es igual a su propia traspuesta, pero cambiada de
signo. Es decir, A es anti simétrica si A = -AT. La matriz traspuesta de una matriz A se
denota por AT y se obtiene cambiando sus filas por columnas (o viceversa).
 */
package _19_programamatrizat_matrices;

//@author MENESES-FLOREZ
public class _19_programaMatrizAT_Matrices {

    public static void main(String[] args) {
        int[][] matrizA = new int[3][3]; 
        int[][] matrizAT = new int[3][3];
        int contador = 0;
       
        //Asignar a matrizA
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                matrizA[i][j] = (-2+(int)(Math.random() * 4));
            }
            System.out.println("");
        }
        System.out.println("");
        //Imprime matriz A
        for (int i = 0; i < matrizA.length; i++) {
            for (int j = 0; j < matrizA.length; j++) {
                System.out.print(matrizA[i][j]+" ");
            }
            System.out.println("");
        }
        System.out.println("");
        
        //Matriz Trapuesta
        for (int j = 0; j < matrizA.length; j++) {
            for (int i = 0; i < matrizA.length; i++) {
                matrizAT[i][j] = matrizA[j][i];
            }
        }
        
        //Impresion Matriz Traspuesta
        for (int i = 0; i < matrizAT.length; i++) {
            for (int j = 0; j < matrizAT.length; j++) {
                System.out.print(matrizAT[i][j]+" ");
            }
            System.out.println("");
        }
        //Evaluar Antisimetrica
         for (int i = 0; i < matrizAT.length; i++) {
            for (int j = 0; j < matrizAT.length; j++) {
                if (matrizA[i][j] == (matrizAT[i][j] * - 1)) {
                   contador++;
                }
            }            
        }
        if (contador == (matrizA.length * matrizAT.length)) {
            System.out.println("La matriz AT es Anti-simétrica");
        }else{
            System.out.println("La matriz AT NO es Anti-simétrica");
        }
    }
    
}
