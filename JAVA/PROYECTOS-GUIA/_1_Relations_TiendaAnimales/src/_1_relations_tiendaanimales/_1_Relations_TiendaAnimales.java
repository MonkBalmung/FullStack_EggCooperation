/*
Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.
 */
package _1_relations_tiendaanimales;

import Entities.Tienda;
import Services.TiendaService;

//@author MENESES-FLOREZ */
public class _1_Relations_TiendaAnimales
{

    public static void main(String[] args)
    {
         TiendaService serviceTienda = new TiendaService();
        
        Tienda tiendaVeterinaria = serviceTienda.createTienda();
        
        serviceTienda.introducirClientes(tiendaVeterinaria.getListaClientes());
        
        serviceTienda.introducirMascotas(tiendaVeterinaria.getListaMascotas());
        
        serviceTienda.mostrarClientes(tiendaVeterinaria.getListaClientes());
        
        serviceTienda.mostrarInventario(tiendaVeterinaria.getListaMascotas());
    }
    
}
