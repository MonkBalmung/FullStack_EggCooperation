/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package _1_collections_razasperros;

//@author MENESES-FLOREZ

import Entities.Raza;
import Services.RazaService;

public class _1_Collections_RazasPerros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        RazaService serviceRazas = new RazaService();
             
        serviceRazas.llenarLista();
        
        serviceRazas.mostrarListaRazas();
        
        serviceRazas.ordenarLista();
        
        serviceRazas.mostrarListaRazas();
        
        serviceRazas.eliminarElemento();
    }
    
}
