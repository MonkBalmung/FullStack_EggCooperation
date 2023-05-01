
package Entidad;

import java.util.Comparator;

/**
 *
 * @author jairg
 */
public class Pelicula {
    private String titulo;
    private String director;
    private Float horaDeDuracion;

    public static Comparator<Pelicula> ordenarPorDuracionDeMayorAMenor = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o2.getHoraDeDuracion().compareTo(o1.getHoraDeDuracion());
        }
    };
    
    
    public static Comparator<Pelicula> ordenarPorDuracionDeMenorAMayor = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getHoraDeDuracion().compareTo(o2.getHoraDeDuracion());
        }
    };
    
    
    public static Comparator<Pelicula> ordenarPorTitulo = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getTitulo().compareTo(o2.getTitulo());
        }
    };
    
    
    public static Comparator<Pelicula> ordenarPorDirector = new Comparator<Pelicula>(){
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o1.getDirector().compareTo(o2.getDirector());
        }
    };
    
    
    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Float horaDeDuracion) {
        this.titulo = titulo;
        this.director = director;
        this.horaDeDuracion = horaDeDuracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Float getHoraDeDuracion() {
        return horaDeDuracion;
    }

    public void setHoraDeDuracion(Float horaDeDuracion) {
        this.horaDeDuracion = horaDeDuracion;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", director=" + director + ", horaDeDuracion=" + horaDeDuracion + '}';
    }
    
    
}
