/*
Y los siguientes métodos:
 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
package Services;
import Entities.Persona;
import java.util.Date;
//import Services.PersonaService;

//@author MENESES-FLOREZ */

import java.util.Scanner;

public class PersonaService
{
    private Scanner input = new Scanner(System.in).useDelimiter("\n");
    private Date currentDate = new Date();
    
    public Persona createObject()
    {
        Persona persona = new Persona();        
        
        int anio, mes, dia;
        System.out.print("Ingrese el nombre de la persona:");
        persona.setName(input.nextLine());
        
        System.out.println("Ingrese la fecha de nacimiento (Formato AÑO/MES/DIA):");
        System.out.print("AÑO:");
        anio = input.nextInt();
        anio -= 1900;
        
        System.out.print("MES:");
        mes = input.nextInt();
        mes -= 1;
        
        System.out.print("DIA:");
        dia = input.nextInt();
        input.nextLine();
        Date fechaNacimiento = new Date(anio, mes, dia);
        persona.setDateBorn(fechaNacimiento);
        
        return persona;
    }
    
    public void calcularEdad(Date fechaNacimiento, Persona persona)
    {
        persona.setEdad(currentDate.getYear() - fechaNacimiento.getYear());
    }
    
    public boolean menorQue(int edad, Persona persona)
    {
        boolean isMinor;
       
        isMinor = edad < persona.getEdad();
  
        return isMinor;
    }
    
    public void mostrarPersona(Persona persona)
    {
        System.out.println(persona.toString());
    }
}
