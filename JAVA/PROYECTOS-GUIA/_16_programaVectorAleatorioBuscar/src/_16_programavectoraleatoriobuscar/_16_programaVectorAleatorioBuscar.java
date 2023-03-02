/*
Realizar un algoritmo que 1. rellene un vector de tamaño N, 2. con valores aleatorios, y le pida al
usuario un numero a 3. buscar en el vector. 
El programa 4. mostrará donde se encuentra el numero, y 5. si se encuentra repetido.
 */
package _16_programavectoraleatoriobuscar;

//@author MENESES-FLOREZ

import java.util.Scanner;

public class _16_programaVectorAleatorioBuscar {

    public static void main(String[] args) {
        //Instanciamos clase Scanner para leer por pantalla datos
        Scanner input =new Scanner(System.in);
        /*Creamos un vector a partir de la función general FulFillArray, en la que tanto los números como la dimensión
        del array son variables*/
        int[] vector = FulfillArray();        
        System.out.println("");
        //Se solicita a usuario desde main un número a buscar en el arreglo
        int numberToBeFound;
        System.out.println("Ingrese un número a buscar en el vector:");
        numberToBeFound = input.nextInt();
        //Se confirma cuál ha sido el número ingresado por usuario
        System.out.println("El número a buscar es: "+numberToBeFound);
        
        FindInArray(vector, numberToBeFound);
        
    }
    public static int[] FulfillArray(){          
        int dimension;
        do {
            dimension = (int)(Math.random()*10);
        } while (dimension == 0);
        System.out.println(dimension);
        int[] vector = new int[dimension]; 
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int)(Math.random()*10);
            System.out.print(vector[i]+" ");
        }
        return vector;
    }
    public static void FindInArray(int[] vector, int numberToBeFound){
        int counter = 0;
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numberToBeFound) {
                counter ++;
            }
        }
        System.out.println("El número "+numberToBeFound+" se repite "+counter+" veces, ");
        
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] == numberToBeFound) {
                System.out.println("hallado en los subindices: "+i);               
            }
        }
        System.out.println("");
        
        if (counter == 0) {
            System.out.println("El número no se encuentra en el arreglo.");
        }
    
    }
}
