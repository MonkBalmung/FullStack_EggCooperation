/*
El programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package Services;

//@author MENESES-FLOREZ

import Entities.Raza;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class RazaService
{
    private Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    private ArrayList<Raza> listaRazaPerros = new ArrayList();
    
    private Raza razaPerro = new Raza();
    
    public Raza crearRaza()
    {
        Raza razaPerro = new Raza();
        
        System.out.println("Ingrese la raza del perro: ");
        razaPerro.setNombreRaza(input.next().toUpperCase());  
        
        return razaPerro;
    }
    
    public void llenarLista()
    {
        boolean ingresar = true;
        String opcion;
        
        while (ingresar) {
            listaRazaPerros.add(crearRaza());   
            System.out.println("¿Desea ingresar otra raza? S/N");
            ingresar = input.next().toUpperCase().equals("S"); // Esta expresion reemplaza en sintaxis al IF
            
        }
       
    }
    
    public void mostrarListaRazas()
    {
        System.out.println("");
        System.out.println("La lista de razas de perro es:");
        listaRazaPerros.forEach((e)-> System.out.println(e));
    }
    
    public void ordenarLista()
    {
        System.out.println("");
        System.out.println("La lista de razas de perro ORDENADA es: ");
        listaRazaPerros.sort(Raza.ordenarListaRaza);
    }
    
    public void eliminarElemento()
    {
        System.out.println("Ingrese la raza de perro que desea eliminar de la lista: ");
        String razaAEliminar = input.next().toUpperCase();
        
        int sizeListaOriginal = listaRazaPerros.size();
        int counter = 0;
        
        Iterator<Raza> iterator = listaRazaPerros.iterator();
        
        while (iterator.hasNext())
        {
            if (iterator.next().getNombreRaza().equals(razaAEliminar))
            {
                iterator.remove();
            }  
            else
            {
                counter++;
            }
        }
        
        if (counter == sizeListaOriginal) {
            System.out.println("");
            System.out.println("El elemento no se encuentra en la lista.");
        }
        
        this.mostrarListaRazas();
    }
    
}
