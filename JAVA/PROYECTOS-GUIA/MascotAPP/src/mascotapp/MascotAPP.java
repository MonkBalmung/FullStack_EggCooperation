/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mascotapp;

//@author MENESES-FLOREZ

import Entidades.Mascota;
import Entidades.Usuario;
import java.util.Scanner;
import mascotapp.services.ServicioMascota;

public class MascotAPP {

    public static void main(String[] args)
    {   
        //Scanner input = new Scanner(System.in);
        //Instanciacion de clase "Mascota"
        
        ServicioMascota crearMascota = new ServicioMascota();
        
        Mascota mascotaService = crearMascota.crearMascota();
        
        
        //Mascota mascota1 = new Mascota("Nebula", "Gato", 3, "Gata", true, "Criolla", "Blanqui-Pardo"); // Asignación de valores por constructor
        //Asignación de valores a los atributos de mascota mascota1, atributo por atributo
//        mascota1.apodo = ;
//        mascota1.cola = true;
//        mascota1.color = ;
//        mascota1.edad = 3;
//        mascota1.nombre = ;
//        mascota1.raza = ;
//        mascota1.tipoMascota = ;
        //System.out.println("Ingrese por favor, en su orden: nombre, apellido, cedula, fecha de nacimiento, pais:");
        //Usuario duenio = new Usuario("Diego", "Meneses","80763805", "80/25/1987", "COL");
        //duenio.setNombre("Diego");
        //System.out.println(mascota1.nombre+", "+mascota1.tipoMascota+", "+mascota1.color);
        //System.out.println(mascota1.toString());
        //System.out.println(duenio.toString());
        System.out.println(mascotaService.toString());
        //mascota1.pasear(300);
        //mascota1.pasear(100, 10);
        
        //System.out.println(mascota1.toString());
       
    }
    
}
