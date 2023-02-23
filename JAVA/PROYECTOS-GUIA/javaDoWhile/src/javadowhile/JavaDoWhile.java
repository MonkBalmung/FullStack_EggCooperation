/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe salir del
bucle y mostrar el mensaje "Se capturó el numero cero". El programa deberá calcular y mostrar el
resultado de la suma de los números leídos, pero si el número es negativo no debe sumarse.
Nota: recordar el uso de la sentencia break.
 */
package javadowhile;
import java.util.Scanner;

/**
 *
 * @author MENESES-FLOREZ
 */
public class JavaDoWhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int i = 0;
        double number = 0.0;
        double outcome = 0.0;
        int resultado = 0;
        
        do {
            System.out.println((i+1)+") Ingrese un número: ");
            number = input.nextDouble();
            if ( number == 0 ) {
                System.out.println("\"Se capturó el numero cero. Se ha terminado el programa.\"");
                break;
            }else if (number < 0) {
                System.out.println("\"Se capturó el numero negativo. No se tendrá encuenta para la suma.\"");
            }else{
                outcome += number;
                resultado = (int)outcome;
            }
           
            i++;
        } while ( i < 20 );
        
        System.out.println("El resultado de la suma de todos los enteros positivos ingresados es: "+resultado);
                
    }
    
}
