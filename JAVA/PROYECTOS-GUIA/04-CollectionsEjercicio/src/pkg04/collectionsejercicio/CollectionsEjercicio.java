
package pkg04.collectionsejercicio;

import Entidad.Pelicula;
import Service.ServicePelicula;

/**
 *
 * @author jairg
 */
public class CollectionsEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ServicePelicula sp = new ServicePelicula();
        sp.crearPelicula();
        
        sp.mostrarPeliculas(); 
        System.out.println("");
        sp.mostrarPeliculasMayoresA1Hora();
        System.out.println(" ");
        sp.ordernarMayorAMenor();
        System.out.println(" ");
        sp.ordernarMenorAMayor();
        System.out.println(" ");
        sp.ordenarPorTitulo();
        System.out.println(" ");
        sp.ordenarPorDirector();
    }
    
}
