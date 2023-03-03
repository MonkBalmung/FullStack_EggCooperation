/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los datos de
las personas ingresadas por teclado e indique si son mayores o menores de edad.
Después de cada persona, el programa debe preguntarle al usuario si quiere seguir
mostrando personas y frenar cuando el usuario ingrese la palabra “No”.
 */
package _16_programaextranombreedad;

//@author MENESES-FLOREZ

import java.util.Scanner;

public class _16_programaExtraNombreEdad {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String nombre, salir = "";
        int edad;
        
        
        do {
            System.out.print("Ingrese su nombre: ");
            nombre = input.nextLine();
            //input.nextLine();
            System.out.println("Ingrese su edad: ");
            edad = input.nextInt();

            mostrarNombre(nombre, edad);
            System.out.println("¿Desea continuar?(S/N)");
            salir = input.next();
        } while (salir.equalsIgnoreCase("S"));
        
        
        
    }
    public static void mostrarNombre(String nombre, int edad)
    {   
        String esMayordeEdad = esMayor_deEdad(edad);
        System.out.println(nombre+esMayordeEdad);
    }
    
    public static String esMayor_deEdad(int edad)
    {
        String esMayordeEdad = "";
        
        if (edad > 18) 
        {
            esMayordeEdad = " es mayor de edad.";
        }
        else
        {
            esMayordeEdad = " es menor de edad.";
        }
        return esMayordeEdad;
    }
}
