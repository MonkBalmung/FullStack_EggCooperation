/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. 
 */
package Entities;

//@author MENESES-FLOREZ

import java.util.Comparator;

public class Raza
{
    //Atributes
    private String nombreRaza;
    
    //Comparator
    public static Comparator<Raza> ordenarListaRaza = new Comparator<Raza>() {
        @Override
        public int compare(Raza r1, Raza r2) {
            return r1.getNombreRaza().compareTo(r2.getNombreRaza());
        }
    };
    
    //Contructors

    public Raza() {}

    public Raza(String nombreRaza) {
        this.nombreRaza = nombreRaza;
    }
    
    //Getter % Setters

    public String getNombreRaza() {
        return nombreRaza;
    }

    public void setNombreRaza(String nombreRaza) {
        this.nombreRaza = nombreRaza;
    }
    
    //ToString

    @Override
    public String toString() {
        return nombreRaza ;
    }
}
