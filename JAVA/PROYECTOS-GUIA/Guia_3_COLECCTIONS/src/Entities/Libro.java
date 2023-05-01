/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.Comparator;

/**
 *
 * @author MENESES-FLOREZ
 */
public class Libro
{
    //Atributos
    private String titulo;
    private String autor;
    
    //Contructors

    public Libro() {
    }

    public Libro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }
    
    
    //Getter & Setter
    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" + "Titulo: " + titulo + ", Autor:" + autor + '}';
    }
    
    public static Comparator<Libro> ordenarPorAutor = new Comparator<Libro>(){
        @Override
        public int compare(Libro autor1, Libro autor2){
            return autor1.getAutor().compareTo(autor2.getAutor());
        }
    }; 
    
}
