/*
 
 */
package mascotapp.services;

//@author MENESES-FLOREZ

import Entidades.Mascota;
import java.util.Scanner;

public class ServicioMascota
{
    private Scanner input = new Scanner(System.in).useDelimiter("\n");
    //Funcion que retorna un Objeto de la clase Mascota
    public Mascota crearMascota()
    {
        //Instanciamos objeto de clase Mascota
        Mascota mascota = new Mascota();
        
//        System.out.println("Ingrese el nombre");
//        String nombre = input.nextLine();
        System.out.println("Ingrese el nombre");
        mascota.setNombre(input.nextLine());
        
//        System.out.println("Ingrese el apodo");
//        String apodo = input.nextLine();

        System.out.println("Ingrese el apodo");
        mascota.setApodo(input.nextLine());
        
//        System.out.println("Ingrese la edad");
//        int edad = input.nextInt();
        System.out.println("Ingrese la edad");
        mascota.setEdad(input.nextInt());
        
        return mascota;
        //return new Mascota(nombre, apodo, edad);
    }
}
