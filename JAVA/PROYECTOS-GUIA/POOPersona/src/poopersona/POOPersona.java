/*
. 
 */
package poopersona;

//@author MENESES-FLOREZ */

import Entities.Persona;
import Services.PersonaService;

public class POOPersona
{
    public static void main(String[] args)
    {
        PersonaService servicioPersona = new PersonaService();
        
        Persona persona = servicioPersona.crearPersona();
        
        int edad = servicioPersona.calcularEdad(persona);
        
        System.out.println("¿"+persona.getName()+" es menor que la segunda persona?"+servicioPersona.menorQue(edad));
        
        servicioPersona.mostrarPersona(persona);
    }
    
}
