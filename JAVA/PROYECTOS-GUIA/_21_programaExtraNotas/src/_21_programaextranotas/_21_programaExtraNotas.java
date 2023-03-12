/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _21_programaextranotas;
import java.util.Scanner;

//@author MENESES-FLOREZ
public class _21_programaExtraNotas {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int numeroAlumnos, cantidadNotas;
        System.out.println("Ingrese el número de alumnos a ingresar notas:"); 
        numeroAlumnos = input.nextInt();
        //Creamos vector alumnos
        String[] alumnos = new String[numeroAlumnos];
        input.nextLine();
        //Aumentamos una casilla más adicional a la cantidad de notas a ingresar, 
        //para en esa columna almacenar la sumatoria. 
        cantidadNotas = 5;
        //Creamos matriz notas
        double[][] notas = new double[numeroAlumnos][cantidadNotas];
        
        for (int i = 0; i < numeroAlumnos; i++) 
        {            
            System.out.println("Ingrese el nombre del alumno:");
            alumnos[i] = input.nextLine();
            alumnos[i] = alumnos[i].toUpperCase();            
            System.out.println("Alumno " + alumnos[i] + ":");
            System.out.println("Ingrese la nota del primer trabajo práctico: ");
            notas[i][0] = input.nextDouble();
            System.out.println("Ingrese la nota del segundo práctico: ");
            notas[i][1] = input.nextDouble();
            //notas[i][1]= notas[i][1]*0.15;
            System.out.println("Ingrese la nota del primer integrador: ");
            notas[i][2] = input.nextDouble();
            //notas[i][2]= notas[i][2]*0.25;
            System.out.println("Ingrese la nota del segundo integrador: ");
            notas[i][3] = input.nextDouble();
            input.nextLine();
            //notas[i][3]= notas[i][3]*0.5;
            double notafinal = ((notas[i][0] * 0.1) + (notas[i][1] * 0.15) + (notas[i][2] * 0.25) + (notas[i][3] * 0.5));
            notas[i][4] = notafinal;        
        }
        
        
        for (int i = 0; i < numeroAlumnos; i++)
        {
            System.out.println(alumnos[i]+ " ");
            for (int j = 0; j < 5; j++)
            {                
                System.out.print("["+notas[i][j]+"]");  
            } 
            System.out.println(" ");
        }
    
        int contador=0;
      
        for (int i = 0; i < numeroAlumnos; i++)
        {
            System.out.println("La nota final del alumno "+alumnos[i]+" "+notas[i][4]);
            if (notas[i][4]>=7.0)
            {
                contador++;                
            }
            
        }
        System.out.println("Los alumnos que aprobaron son: "+contador);
        System.out.println("Los alumnos desaprobados son: "+(numeroAlumnos-contador));
    }
}
    

