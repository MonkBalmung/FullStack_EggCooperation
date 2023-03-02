/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M cantidad de
hijos. Escriba un programa que pida la cantidad de familias y para cada familia la
cantidad de hijos para averiguar la media de edad de los hijos de todas las familias.
 */
package _14_programaextrapromedioedadhijos;

//@author MENESES-FLOREZ

import java.util.Scanner;

public class _14_programaExtraPromedioEdadHijos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int cantidadFamilias, cantidadHijos, totalHijos = 0, edad, sumatoria = 0;
        double promedio;
        
        System.out.println("Ingrese la cantidad de familias a considerar:");
        cantidadFamilias = input.nextInt();  
        //Tomamos la cantidad de familias y aplicamos a la iteración de familias
        for (int i = 0; i < cantidadFamilias; i++) 
        {
            System.out.println("Ingrese la cantidad de hijos por familia "+(i+1));
            cantidadHijos = input.nextInt();
            //Se va acumulando la cantidad total de hijos ingresada
            totalHijos += cantidadHijos;
            
            //Tomamos la cantidad de hijos por familia, lo que determina la cantidad de iteraciones de hijos
            for (int j = 0; j < cantidadHijos; j++) 
            {
                System.out.println("Ingrese la edad del hijo "+(j+1)+" de la familia "+(i+1));
                edad = input.nextInt();
                //Se va acumulando las edades de todos los niños
                sumatoria += edad;
            }
        }
        //Se calcula el promedio a partir de la acumulación de niños y edades
        promedio = sumatoria / totalHijos;
        
        System.out.println("El promedio total de edades de los hijos registrados es: "+promedio);
    }
    
}
