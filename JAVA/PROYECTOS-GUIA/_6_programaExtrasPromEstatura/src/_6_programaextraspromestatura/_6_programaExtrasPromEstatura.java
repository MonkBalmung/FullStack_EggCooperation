/*
Leer la altura de N personas 
y determinar el promedio de estaturas que se encuentran por
debajo de 1.60 mts. 
y el promedio de estaturas en general.
 */
package _6_programaextraspromestatura;

//@author MENESES-FLOREZ

import java.util.Scanner;

public class _6_programaExtrasPromEstatura {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int cantidadPersonas;
        double estatura = 0;
        double estaturaGeneral = 0;
        double estaturaDebajo = 0;
        int contadorDebajo = 0;
        double promedioDebajo;
        double promedioGeneral;
       
        
        System.out.println("Ingrese la cantidad de personas: ");
        cantidadPersonas = input.nextInt();
        double [] vEstaturas = new double[cantidadPersonas];
        //Leemos datos de estaturas por teclado        
        for (int i = 0; i < vEstaturas.length; i++) {
            System.out.println("Ingrese la estatura: ");
            vEstaturas[i] = input.nextDouble();
        }
        //Proceso del vector 
        for (int i = 0; i < vEstaturas.length ; i++) {
            estatura = vEstaturas[i];
            if (estatura < 1.60) {
                //Determinar total de estaturas debajo de 1.60
                estaturaDebajo += estatura;
                contadorDebajo++;
            }
            estaturaGeneral += estatura;
        }
        promedioDebajo = estaturaDebajo / contadorDebajo;
        
        promedioGeneral = estaturaGeneral / cantidadPersonas;    
        
        System.out.println("El promedio de estaturas por debajo de 1.60mts es: "+promedioDebajo);
        
        System.out.println("El promedio general de todas las estaturas ingresadas es: "+promedioGeneral);
        
    }
    
}
