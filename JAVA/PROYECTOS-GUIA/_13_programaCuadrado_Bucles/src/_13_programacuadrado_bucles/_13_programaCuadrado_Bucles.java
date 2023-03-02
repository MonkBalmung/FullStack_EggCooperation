/*
Dibujar un cuadrado de N elementos por side utilizando el carácter “*”. Por ejemplo, si el
cuadrado tiene 4 elementos por side se deberá dibujar lo siguiente:
* * * *
*     *
*     *
* * * *
 */
package _13_programacuadrado_bucles;

//@author MENESES-FLOREZ

import java.util.Scanner;

public class _13_programaCuadrado_Bucles {
    

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int side;
        System.out.println("Ingrese la dimensión del side del cuadrado: ");
        side = input.nextInt();
        BuildSquare(side);
        
    }
    public static void BuildSquare(int side){
        for (int i = 0; i < side; i++) {
            for (int j = 0; j < side; j++) {
                if ((i!=0 && i!=(side-1)) && (j!=0 && j!=(side-1))) {
                    System.out.print("   ");
                }else{
                    System.out.print(" * ");
                }                
            }
            System.out.println("");
        }
    
    }
}
