/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito, cuántos
de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package _17_programandigitos;

//@author MENESES-FLOREZ

import java.util.Scanner;

public class _17_programaNDigitos {

    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        /*Creamos un vector a partir de la función general FulFillArray, en la que tanto los números como la dimensión
        del array son variables*/
        int[] vector = {465, 12, 8765, 23409, 76543};         
         
        for (int i = 0; i < vector.length; i++) {
            System.out.print( vector[i]+ ", ");
        }
        System.out.println(" ");
        
        /*Recorremos el vector, y tomamos cada cifra 
        y la dividimos por 10 tantas veces como sea necesario para determinar cuantas cifras son.
        Lo guardamos en otro vector.                
                */
        int[] vCifras = new int[5];
        double draftNumber;
        int counter = 0;
        for (int i = 0; i < vector.length; i++) {
            draftNumber = vector[i];
            do {
                draftNumber = draftNumber / 10 ;
                counter++;
            } while (draftNumber >= 1);
            vCifras[i] = counter;
            counter = 0;
            System.out.println("Cifras: "+vCifras[i]);
        }
        FindInArray(vCifras);
    }
    /*public static int[] FulfillArray(){          
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
    }*/
    public static void FindInArray(int[] vector){
        int numberToBeFound;
        int counter = 0;
        int countKeeper = 0;
        int cifrasKeeper = 0;
        for (int i = 0; i < vector.length; i++) {
            numberToBeFound = vector[i];
            if (i > 0) {
                cifrasKeeper = vector[i-1];
            }
            //Counter adding
            for (int j = 0; j < vector.length; j++) {
                if (vector[j] == numberToBeFound) {
                counter++;
                }               
            }
            if ((countKeeper == counter) && (cifrasKeeper == numberToBeFound)) {
                countKeeper = counter;
                counter = 0;                
            }else{      
                countKeeper = counter;   
                System.out.println("Hay "+countKeeper+" de  "+numberToBeFound+" cifras"); 
                counter = 0; 
            }                               
        }         
    }
}
