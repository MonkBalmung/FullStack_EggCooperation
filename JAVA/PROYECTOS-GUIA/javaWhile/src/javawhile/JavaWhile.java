/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10 la nota se
pedirá de nuevo hasta que la nota sea correcta.
 */
package javawhile;
import java.util.Scanner;

/**
 *
 * @author MENESES-FLOREZ
 */
public class JavaWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double note = 0.0;
        
        System.out.println("Ingrese la nota: ");
        note = input.nextDouble();
        
        while (note < 0.0 || note > 10.0){
            System.out.println("La nota debe estar comprendida entre 0 y 10. Ingrese la nota de nuevo: ");
            note = input.nextDouble();
        }
        
        int nota = (int)note;
        System.out.println("la nota ingresada fue "+nota);        
                
    }
    
}
