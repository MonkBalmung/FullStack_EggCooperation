/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
 */
package _11_poo.date;

//@author MENESES-FLOREZ

import java.util.Date;
import java.util.Scanner;

public class _11_POODate
{
    public static void main(String[] args)
    {
        int dia;
        int mes;
        int anio;
        
        Scanner input = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("***MÓDULO CÁLCULO DE AÑOS ENTRE UNA FECHA DADA Y LA ACTUAL***");
        System.out.print("Ingrese por favor el dia:");
        dia = input.nextInt();
        
        System.out.print("Ingrese por favor el mes:");
        mes = input.nextInt();
        mes--;
        System.out.print("Ingrese por favor el año:");
        anio = input.nextInt();
        anio -= 1900;
        Date date = new Date(anio, mes, dia);
        
        System.out.println("La fecha ingresada es: "+date);
        
        Date currentDate = new Date();
        System.out.println("La fecha actual es: "+currentDate);
        
        System.out.println("Los años transcurridos entre la fecha ingresada y la actual es "+(currentDate.getYear()-date.getYear())+" años.");
        
        System.out.println("");
        
        System.out.println("Los años transcurridos entre la fecha ingresada y la actual es "+(currentDate.compareTo(date))+" años.");
    }
    
}
