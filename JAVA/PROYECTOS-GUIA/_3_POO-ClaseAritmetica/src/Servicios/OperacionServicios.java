/*
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main

g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
 */
package Servicios;
import Entidades.Operacion;
//@author MENESES-FLOREZ

import java.util.Scanner;

public class OperacionServicios
{
    private Scanner input = new Scanner(System.in);
    
    public Operacion crearOperacion()
    {
        //instanciamos Clase Operacion
        Operacion operacion = new Operacion();
        
        System.out.println("Ingres el primer número entero positivo:");
        operacion.setNumber_1(input.nextInt());
        
        System.out.println("Ingres el segundo número entero positivo:");
        operacion.setNumber_2(input.nextInt());
        
        //Retornamos objeto 
        return operacion;
    }
    public int sumar(Operacion operacion)
    {
        int suma;
        suma = operacion.getNumber_1() + operacion.getNumber_2();
        return suma;
    }
    public int restar(Operacion operacion)
    {
        int resta;
        resta = operacion.getNumber_1() - operacion.getNumber_2();
        return resta;
    }
    public int multiplicar(Operacion operacion)
    {
        int multiplicaicion = 0;
        if (!( operacion.getNumber_1() == 0 || operacion.getNumber_2() == 0 ))
        {
            multiplicaicion = operacion.getNumber_1() * operacion.getNumber_2();
        }
        else
        {
            System.out.println("Error, uno de los números ingresados es igual a 0");
        }
        
        return multiplicaicion;
    }
    public int dividir(Operacion operacion) 
    {
        int division = 0;
        if ( operacion.getNumber_2() != 0 )
        {
            division = operacion.getNumber_1() / operacion.getNumber_2();
        }
        else
        {
            System.out.println("Error, uno de los números ingresados es igual a 0");
        }
        
        return division;
    }
}
