/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. Por ejemplo, si el
usuario ingresa 1600 minutos, el sistema debe calcular su equivalente: 1 día, 2 horas.
 */
package _1_programaextraminutosadias;

//@author MENESES-FLOREZ

import java.util.Scanner;

public class _1_programaExtraMinutosADias {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int minutos;
        
        System.out.println("Ingrese la cantidad de minutos a convertir a dias y horas:");
        minutos = input.nextInt();
        
        converToDaysHours(minutos);        
        
    }
    
    public static void converToDaysHours(int minutes){
        int dias, horas, minAux;
        minAux = minutes;
        /*24 horas (un día) equivale a 1440 minutos; por tanto dividimos la cantidad ingresada por 1440
        /que nos dará como resultado el número de dias*/
        dias  = minAux / 1440;
        /*Los minutos los podemos encontrar a partir del residuo de la división de dias, 
        que a su vez será dividido por su equivalente en minutos por hora*/
        minAux = minAux % 1440;
        horas = minAux / 60;
        
        System.out.println("Los minutos ingresados ("+minutes+"), equivalen a ("+dias+") días y ("+horas+") horas.");
    }
}
