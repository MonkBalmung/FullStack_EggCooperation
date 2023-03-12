/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;
import java.util.Scanner;
import Entidad.Persona;
//@author MENESES-FLOREZ


//Clase Service para la Clase Persona
public class PersonaService
{
    //Objeto global input, que nos permite usarlo a lo largo de la Clase Service
    private Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    //Funcion que retorna un Objeto de la clase Mascota
    public Persona instanciarPersona()
    {
        Persona persona = new Persona();
        
        //Declaramos las variables a pasar como argumentos por Contructor
//        String nombre;
//        String numeroIdentificacion;
//        int edad;
        //Interactuamos por consola con usuario
        System.out.println("Ingrese el nombre de la persona:");
//        nombre = input.nextLine();
        persona.setNombre(input.nextLine());
        
        System.out.println("Ingrese el número de indentificación de la persona:");
        //numeroIdentificacion = input.nextLine();
        persona.setNumeroIdentificacion(input.nextLine());
        
        System.out.println("Ingrese la edad de la persona:");
        //edad = input.nextInt();
        persona.setEdad(input.nextInt());

        //Para poder instanciar la clase debemos importarla
        return persona;
        //return new Persona(nombre, numeroIdentificacion, edad);
    }
    public void mostrarPersona(Persona persona)
    {
        System.out.println("Nombre:"+persona.getNombre()+", Identificación:"+persona.getNumeroIdentificacion()+", Edad:"+persona.getEdad());
    }

}
