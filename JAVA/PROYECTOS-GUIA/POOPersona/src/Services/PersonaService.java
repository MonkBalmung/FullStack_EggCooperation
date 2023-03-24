/*
Y los siguientes métodos:
 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.

 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.

 Agregar a la clase service el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.

 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package Services;

//@author MENESES-FLOREZ */

import java.util.Scanner;
import Entities.Persona;
import java.util.Date;

public class PersonaService
{
    private Scanner input = new Scanner(System.in);
    
    public Persona crearPersona()
    {
        Persona persona = new Persona();
        
        System.out.println("Ingrese nombre de la persona:");
        persona.setName(input.nextLine());
        
        int dia, mes, anio;
        
        System.out.println("Ingrese por favor la fecha de nacimiento:");
        System.out.print("DIA:");
        dia = input.nextInt();
        input.nextLine();
        
        System.out.print("MES:");
        mes = input.nextInt();
        mes--;
        input.nextLine();
        
        System.out.print("AÑO:");
        anio = input.nextInt();
        anio -= 1900;
        input.nextLine();
        
        Date fechaDeNacimiento = new Date(anio, mes, dia);
        
        persona.setFechaNacimiento(fechaDeNacimiento);
        
        return persona;
    }//Fin crearPersona()
    
    public int calcularEdad(Persona persona)
    {
        Date fechaActual = new Date();
        
        return fechaActual.getYear() - persona.getFechaNacimiento().getYear();
    }//Fin calcularEdad()
    
    public boolean menorQue(int edad)
    {
        boolean menorQue = false;
        
        Persona persona = this.crearPersona();
        
        if (edad < persona.getFechaNacimiento().getYear()) {
            menorQue = false;
        }
        mostrarPersona(persona);
        return false;
    }//Fin menorQue()
    
    public void mostrarPersona(Persona persona )
    {
        System.out.println("Nombre: "+persona.getName()+"; FECHA NACIMIENTO: "+persona.getFechaNacimiento());
    }
}
