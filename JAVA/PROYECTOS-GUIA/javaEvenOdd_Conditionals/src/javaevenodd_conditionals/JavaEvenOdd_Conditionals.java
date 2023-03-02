/*
Crear un programa que dado un numero determine si es par o impar.
 */
package javaevenodd_conditionals;

import java.util.Scanner;

/**
 *
 * @author MENESES-FLOREZ
 */
public class JavaEvenOdd_Conditionals {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number;
        boolean isEven;
        String cadena;
        System.out.println("***PROGRAMA PARA DETERMINAR SI UN NÚMERO ES PAR O IMPAR");
        System.out.println("Ingrese un número: ");
        number = input.nextInt();
        isEven = IsEven(number);
        cadena = BooleanACadena(isEven);
        System.out.println("El número ingresado es: "+cadena);
    }
    
    public static boolean IsEven(int number){
        boolean flag;
        if( number % 2 == 0) {
            flag = true;
        }else{
            flag = false;
        }
        return flag;
    }
    
    public static String BooleanACadena(boolean flag){
        String cadena;
        if (flag){
            cadena = "PAR";
        }else{
            cadena = "IMPAR";
        }
        return cadena;
    }
}
