/*

 */
package _1_poo_personaclass;

//@author MENESES-FLOREZ

import Entidad.Persona;
import java.util.Date;
import services.PersonaService;


public class _1_POO_PersonaClass {

    public static void main(String[] args)
    {
        //Instanciamos la función de la Clase Service de la Clase Persona, para poder usarla al instanciar la Clase Persona
        PersonaService constructorPersona = new PersonaService();  
        //Instanciamos la Clase Persona, y usamos la función del  servicio instanciado
        Persona personaInstanciada = constructorPersona.instanciarPersona();
        //Mostramos atributos del objeto persona
        //System.out.println(personaInstanciada.toString());
        //personaInstanciada.mostrarPersona(personaInstanciada);
        constructorPersona.mostrarPersona(personaInstanciada);
        
        Date fechaYhora = new Date();
        System.out.println(fechaYhora);
    }
    
}
