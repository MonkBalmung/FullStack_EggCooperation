/*
Implemente la clase Persona. Una persona_A tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona_A a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona_A también se debe conocer la fecha
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona_A que
se recibe como parámetro, o false en caso contrario.
 Metodo mostrarPersona(): este método muestra la persona_A creada en el método
anterior.
 */
package _12_poo.persona_ii;
import Entities.Persona;
import Services.PersonaService;

//@author MENESES-FLOREZ */
public class _12_POOPersona_II
{
    public static void main(String[] args)
    {
        PersonaService serviceToPersona = new PersonaService();
        
        Persona persona_A = serviceToPersona.createObject();  
        
        serviceToPersona.calcularEdad(persona_A.getDateBorn(), persona_A);
        
        System.out.println(persona_A);
        
        Persona persona_B = serviceToPersona.createObject();
        
        boolean isMinor = serviceToPersona.menorQue(persona_B.getEdad(), persona_A);
        
        String formattedString = String.format("¿%s es mayor que %s? ", persona_A.getName(), persona_B.getName());
        System.out.println(formattedString+isMinor);
        serviceToPersona.calcularEdad(persona_B.getDateBorn(), persona_B);
        serviceToPersona.mostrarPersona(persona_B);
        
    }
    
}
