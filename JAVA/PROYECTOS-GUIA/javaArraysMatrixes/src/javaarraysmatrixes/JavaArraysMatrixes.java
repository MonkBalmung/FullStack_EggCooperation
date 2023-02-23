/*
Array
tipo[] arrayName = new tipo[Tamaño];
Matriz
tipo[][] matrixName = new tipo[Filas][Columnas];

Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros de equipo y
define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 */
package javaarraysmatrixes;

import java.util.Scanner;

/**
 *
 * @author MENESES-FLOREZ
 */
public class JavaArraysMatrixes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[][] equipo = new String[8][2];
        
        equipo[0][0] = "NOMBRE";
        equipo[0][1] = "EDAD";
        
        
        for (int i = 1; i < 8; i++) { 
            for (int j = 0; j < 2; j++) {
                if (j == 0) {
                    System.out.println("Ingrese el nombre del compañero: ");
                    equipo[i][j] = input.nextLine();
                }else{
                    System.out.println("Ingrese la edad del compañero: ");
                    equipo[i][j] = input.nextLine();
                }                
            }            
        }
        
        System.out.println("Los compañeros del equipo son: ");
        for (int i = 0; i < 8; i++) { 
            for (int j = 0; j < 2; j++) {
                System.out.print(equipo[i][j]+" ");                
            }
               System.out.println(" "); 
        }            
    }
}
    

