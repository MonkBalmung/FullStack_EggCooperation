/*
Define una variable que aloje tu nombre y otra que guarde tu edad. Imprime ambas variables por
pantalla.
Define una variable de tipo boolean, double y char. Guarda información en ellas a través del
Scanner.
 */
package javainputoutput;
import java.util.Scanner;

/**
 *
 * @author MENESES-FLOREZ
 */
public class JavaInputOutput {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String name;
        int age;
        
        System.out.println("Ingrese su nombre completo: ");
        name = input.nextLine();
        
        System.out.println("Ahora ingrese su edad: ");
        age = input.nextInt();
        
        System.out.println("Su nombre es "+name+" y su edad "+age);
        
        boolean flagState;
        double floatNumber;
        char letter;
        
        System.out.println("Ingrese, en su orden, un valor verdadero o falso; luego un decimal, y finalmente un caracter");
        flagState = input.nextBoolean();
        floatNumber = input.nextDouble();
        letter = input.next().charAt(0);
        
        System.out.println("Los datos ingresados son: \n"
                + "boolean: "+flagState+"\n"
                + "decimal: "+floatNumber+"\n"
                + "caracter: "+letter);
    }
    
}
