/*
name, lastName, age, idNumber, mascota;
 */
package Services;

import java.util.Scanner;
import Entities.Cliente;

/**
 *
 * @author MENESES-FLOREZ
 */
public class ClienteService
{
    private Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    
    public Cliente createCliente()
    {
        Cliente cliente = new Cliente();
        
        System.out.println("Introduzca el nombre del cliente: ");
        cliente.setName(input.next());
        
        System.out.println("Introduzca el apellido del cliente: ");
        cliente.setLastName(input.next());
        
        System.out.println("Introduzca la edad del cliente: ");
        cliente.setAge(input.next());
        
        System.out.println("Introduzca el DNI del cliente: ");
        cliente.setIdNumber(input.next());        
        
        return cliente;
    }
    
    public void mostrarCliente(Cliente cliente)
    {
        System.out.println(cliente.toString());
    }
}
