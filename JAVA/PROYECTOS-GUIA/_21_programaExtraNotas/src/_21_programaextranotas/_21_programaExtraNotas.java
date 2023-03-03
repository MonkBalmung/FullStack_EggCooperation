/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _21_programaextranotas;
import java.util.Scanner;

//@author MENESES-FLOREZ
public class _21_programaExtraNotas {

    public static void main(String[] args) {
         Scanner leer= new Scanner(System.in);
        int alumnos=10;
        
        double[][] notas = new double[alumnos][5];
        
        for (int i = 0; i < alumnos; i++) {
            
            System.out.println("Alumno "+(i+1)+ ":");
            System.out.println("Ingrese la nota del primer trabajo práctico evaluativo: ");
            notas[i][0]= leer.nextDouble();
            
            System.out.println("Ingrese la nota del sgundo práctico: ");
            notas[i][1]= leer.nextDouble();
            //notas[i][1]= notas[i][1]*0.15;
            System.out.println("Ingrese la nota del primer integrador: ");
            notas[i][2]= leer.nextDouble();
            //notas[i][2]= notas[i][2]*0.25;
            System.out.println("Ingrese la nota del segundo integrador: ");
            notas[i][3]= leer.nextDouble();
            //notas[i][3]= notas[i][3]*0.5;
            double notafinal= ((notas[i][0]*0.1) + (notas[i][1]*0.15) + (notas[i][2]*0.25) + (notas[i][3]*0.5)) ;
            notas[i][4]= notafinal;
        }
        
        for (int i = 0; i < alumnos; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("["+notas[i][j]+"]");
  
            } 
            System.out.println(" ");
        }
    
        int contador=0;
      
        for (int i = 0; i < alumnos; i++) {
            System.out.println("La nota final del alumno "+(i+1)+" "+notas[i][4]);
            if (notas[i][4]>=7.0) {
                contador++;
                
            }
            
        }
        System.out.println("Los alumnos que aprobaron son: "+contador);
        System.out.println("Los alumnos desaprobados son: "+(alumnos-contador));
    }
}
    

