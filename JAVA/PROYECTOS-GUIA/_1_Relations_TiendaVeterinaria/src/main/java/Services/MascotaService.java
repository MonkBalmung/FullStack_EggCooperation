/*
name, biologicFamily, race, age, sexo, tamanio; 
 */
package Services;

//@author MENESES-FLOREZ */

import Entities.Mascota;
import java.util.Scanner;
import Enums.TiendaInventario;
import Enums.MascotaSexo;
import Enums.MascotaTamanio;

public class MascotaService
{
    private Scanner input = new Scanner(System.in).useDelimiter("\n");  
    
    public Mascota createMascota()
    {
        Mascota mascota = new Mascota();
        
        System.out.println("Introduzca el nombre del animal: ");
        mascota.setName(input.next());
        
        System.out.println("Inventario de la tienda: ");
        mostrarInventario();
        System.out.println("");
        System.out.println("Introduzca la clase a que pertenece: ");
        mascota.setBiologicFamily(input.next());
        
        System.out.println("Introduzca la edad del : "+mascota.getBiologicFamily()+ " "+mascota.getName());
        mascota.setAge(input.next());
        
        System.out.println("Sexo de animales: ");
        mostrarSexo();
        System.out.println("");
        System.out.println("Introduzca el sexo del "+mascota.getBiologicFamily()+ " "+mascota.getName());
        mascota.setSexo(input.next());
        
        System.out.println("Tamaño de animales: ");
        mostrarTamanio();
        System.out.println("");
        System.out.println("Introduzca el tamanio del "+mascota.getBiologicFamily()+ " "+mascota.getName());
        mascota.setTamanio(input.next());     
        
        return mascota;
    }
    
    public void mostrarInventario()
    {
        for (TiendaInventario animal : TiendaInventario.values())
        {
            System.out.print(animal+"/ ");
        }
    }
    
    public void mostrarSexo()
    {
        for (MascotaSexo sexo : MascotaSexo.values())
        {
            System.out.print(sexo+"/ ");
        }
        
    }
    
    public void mostrarTamanio()
    {
        for (MascotaTamanio tamanio : MascotaTamanio.values())
        {
            System.out.print(tamanio+"/ ");
        }
        
    }
    
    public void mostrarMascota(Mascota mascota)
    {
        System.out.println(mascota.toString());
    }
}
