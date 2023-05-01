
package Service;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author jairg
 */
public class ServicePelicula {
    
    Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    private ArrayList<Pelicula> listaPeliculas = new ArrayList();
    
    public void crearPelicula(){
        Pelicula peli;
        do
        {
            peli = new Pelicula();
            System.out.print("Ingrese el título de la película: ");
            peli.setTitulo(input.next());
            System.out.print("Ingrese el nombre del director: ");
            peli.setDirector(input.next());
            System.out.print("Ingrese la duración de la película en HORAS: ");
            peli.setHoraDeDuracion(input.nextFloat());
            listaPeliculas.add(peli);
            
            System.out.println("Quiere seguir agregando películas? S/N");
        }while(input.next().equalsIgnoreCase("s"));
    }
    
    
    public void mostrarPeliculas(){
        for (Pelicula pelicula : listaPeliculas) {
            System.out.println(pelicula.toString());
        }
    }
    
    
    public void mostrarPeliculasMayoresA1Hora(){
      Iterator<Pelicula> it = listaPeliculas.iterator();
      while(it.hasNext())
      {
          Pelicula peli = it.next();
          if(peli.getHoraDeDuracion()>1)
          {
             System.out.println(peli.toString());
          }
      }
    }
    
    
    public void ordernarMayorAMenor(){
        listaPeliculas.sort(Pelicula.ordenarPorDuracionDeMayorAMenor);
        mostrarPeliculas();
    }
    
    
    public void ordernarMenorAMayor(){
        listaPeliculas.sort(Pelicula.ordenarPorDuracionDeMenorAMayor);
        mostrarPeliculas();
    }
    
    
    public void ordenarPorTitulo(){
        listaPeliculas.sort(Pelicula.ordenarPorTitulo);
        mostrarPeliculas();
    }
    
    
    public void ordenarPorDirector(){
        listaPeliculas.sort(Pelicula.ordenarPorDirector);
        mostrarPeliculas();
    }
    
    
    
    public ArrayList<Pelicula> getListaPeliculas() {
        return listaPeliculas;
    }

    public void setListaPeliculas(ArrayList<Pelicula> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }
    
}
