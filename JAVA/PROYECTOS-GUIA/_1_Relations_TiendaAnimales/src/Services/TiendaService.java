/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

/**
 *
 * @author MENESES-FLOREZ
 */
import Entities.Cliente;
import Entities.Mascota;
import Entities.Tienda;
import java.util.List;
import java.util.Scanner;
import Services.ClienteService;
import java.util.ArrayList;

public class TiendaService
{
    private Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    private List<Cliente> listaClientes = new ArrayList();
    
    private List<Mascota> listaMascotas = new ArrayList();
    
    private ClienteService serviceCliente = new ClienteService();
    private MascotaService serviceMascota = new MascotaService();

    
    public Tienda createTienda()
    {
        Tienda veterinaria = new Tienda();
        
        System.out.println("Ingrese el nombre de la tienda veterinaria: ");
        veterinaria.setName(input.next());
        
        System.out.println("Ingrese el NIF de la tienda veterinaria: "+veterinaria.getName());
        veterinaria.setNIF(input.next());
        
        return veterinaria;
    }
    
    public List<Cliente> introducirClientes(List<Cliente> listaClientes)
    {
        do
        {
            System.out.println("***MÓDULO INTRODUCIR CLIENTES***");
            
            listaClientes.add(serviceCliente.createCliente());
            
            System.out.println("¿Desea introducir otro? S/N");
        } 
        while (input.next().equalsIgnoreCase("S"));  
        
        return listaClientes;
        
    }
    
    public List<Mascota> introducirMascotas(List<Mascota> listaMascotas)
    {
        do
        {
            System.out.println("***MÓDULO INTRODUCIR ANIMALES***");
            
            listaMascotas.add(serviceMascota.createMascota());
            
            System.out.println("¿Desea introducir otro? S/N");
        }
        while (input.next().equalsIgnoreCase("S"));
        
        return listaMascotas;
        
    }
    
    public void mostrarClientes(List<Cliente> listaClientes)
    {
        for (Cliente cliente : listaClientes) {
            System.out.println(cliente);   
        }
    
    }
    
    public void mostrarInventario(List<Mascota> listaMascotas) {
        for (Mascota mascota : listaMascotas) {
            System.out.println(mascota);
        }

    }
}

