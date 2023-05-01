/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia_3_colecctions;

import Entities.Libro;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author MENESES-FLOREZ
 */
public class Guia_3_COLECCTIONS
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in).useDelimiter("\n");

//        //Listas
//        ArrayList<Integer> numeros_A = new ArrayList();
//        int x = 20;
//        //Agregamos elementos a la lista
//        for (int i = 0; i < 5; i++) {
//            numeros_A.add(x - i);
//        }
//        //Imprimimos la lista
//        System.out.println(numeros_A);
//        //Removemos un elemento de la lista a partir del indice
//        numeros_A.remove(2);       
//        //Recorremos la lista con un bucle forEach
//        for (Integer elementoDeLaLista : numeros_A) {
//            System.out.print(elementoDeLaLista+" ");   
//        }
//        System.out.println("");
//        //Iteramos y removemos con Iterator en la lista
//        Iterator<Integer> iteratorList = numeros_A.iterator();
//        
//        while (iteratorList.hasNext()) {
//            if (iteratorList.next() == 24 ) {
//                iteratorList.remove();
//            }
//        }
//        System.out.println("Lista despues de iterar y remover: ");
//        System.out.println(numeros_A);
//  
//        Collections.shuffle(numeros_A);
//        
//        System.out.println("Shuffled: "+numeros_A);
//        //Para ordenar una lista usando Collections 
//        Collections.sort(numeros_A);
//        
//        System.out.println("Sorted: "+numeros_A);
//        
//        //Conjuntos
//        HashSet<Integer> numeros_B = new HashSet();
//        Integer y = 30;
//        //Agregamos elementos al conjunto
//        for (int i = 0; i < 5; i++) {
//            numeros_B.add(y + (i * 10));
//        }
//        //Imprimimos el conjunto
//        System.out.println(numeros_B);
//        //Removemos un elemento del conjunto por el elemento a remover
//        numeros_B.remove(60);
//        //Recorremos el conjunto con un bucle forEach
//        for (Integer elementoDelConjunto : numeros_B) {
//            System.out.print(elementoDelConjunto+" ");
//        }
//        
//        System.out.println("");
//        //Iteramos y removemos con Iterator en el conjunto
//        Iterator<Integer> iteratorSet = numeros_B.iterator();
//        
//        while (iteratorSet.hasNext()) {
//            if (iteratorSet.next() == 30 ) {
//                iteratorSet.remove();
//            }
//        }
//        System.out.println("Conjunto despues de iterar y remover: ");
//        System.out.println(numeros_B);
//        
//        System.out.println("");
//       
//       //Mapas
//       HashMap<Integer, String> alumnos = new HashMap();
//       //Asignamos par llave:valor al Mapa
//        for (int i = 0; i < 5; i++) {
//            System.out.println("Ingrese nombre:");
//            alumnos.put((i+1), input.next());
//        }
//       
//       //Imprimimos el Mapa
//        System.out.println(alumnos);
//        //Removemos un par lalve:valor a partir de la # de llave
//        alumnos.remove(2);
//        //Recorremos el Mapa con un bucle for Map.Entry
//        for (Map.Entry<Integer, String> elementoDelMapa : alumnos.entrySet()) {
//            Integer key = elementoDelMapa.getKey();
//            String value = elementoDelMapa.getValue();
//            
//            System.out.println("Llave: "+key+" Valor: "+value);
//            
//        }       
//        //Recorremos el Mapa e imprimimos solo sus llaves con un bucle forEach
//        for (Integer dni : alumnos.keySet()) {
//            System.out.println("Llave: "+dni);
//        }
//        
//        System.out.println("");
//        
//        //Recorremos el Mapa e imprimimos solo sus valores con un bucle forEach
//        for (String nombre : alumnos.values()) {
//            System.out.println("Valor: "+nombre);
//        }
        
        //Collections con clases propias
        //Creop objeto libro
        System.out.println("Ingrese titulo y autor del libro:");
        //Libro libro = new Libro(input.next(), input.next());
        //Creo lista de libros
        ArrayList<Libro> listaLibros = new ArrayList();
        
        for (int i = 0; i < 3; i++) {
            System.out.println("Libro "+(i+1));
           listaLibros.add(new Libro(input.next(), input.next()));
        }
        for (Libro listaLibro : listaLibros) {
            System.out.println(listaLibro);
        }
        
        System.out.println("Lista Ordenada:");
        
       
        
        listaLibros.sort(Libro.ordenarPorAutor);
        
        for (Libro listaLibro : listaLibros) {
            System.out.println(listaLibro);
        }
    }
    
}

