/*
Crea una aplicación que a través de una función nos convierta una cantidad de euros
introducida por teclado a otra moneda, estas pueden ser a dólares, yenes o libras. La
función tendrá como parámetros, la cantidad de euros y la moneda a converir que será
una cadena, este no devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package _14_programaconversormoneda_bucle;

//@author MENESES-FLOREZ
import java.util.Scanner;

public class _14_programaConversorMoneda_Bucle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float currency;
        System.out.println("***PROGRAMA PARA CONVERTIR EUROS A OTRAS MONEDAS***");
        System.out.println("Ingrese la suma de euros a convertir: ");
        currency = input.nextFloat();
    }

    public static float ConversorMoneda(char opcion) {
        float currency = 0.0f;
        Scanner input = new Scanner(System.in);
        
        switch (opcion) {
                case '1':
                    System.out.println("Ingrese la suma de euros a convertir: ");
                    currency = input.nextFloat();                    
                    break;
                case '2':
                    
                    break;
                case '3':
                    
                    break;
                case '4':
                    System.out.println("¿Seguro desea salir de la aplicación? (S/N)");
                    opcion = input.next().toUpperCase().charAt(0);    
                    
                default:
                   // throw new AssertionError();
            }
        return currency;
    }

    public static char MENU() {
        Scanner input = new Scanner(System.in);
        char opcion = '/';
        do {
            System.out.println("MENU:\n"
                            + "1. DOLARES\n"
                            + "2. YENES\n"
                            + "3. LIBRAS ESTERLINAS\n"
                            + "4. SALIR (S/N)\n");
            opcion = input.next().charAt(0);
            
        } while (opcion != 'S');
        
        return opcion;

    }
}
