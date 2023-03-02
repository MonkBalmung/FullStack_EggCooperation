/*
Realice un programa que 
calcule y visualice el valor máximo, 
el valor mínimo 
y el promedio de n números (n>0). 
El valor de n se solicitará al principio del programa 
y los
números serán introducidos por el usuario. Realice dos versiones del programa, una
usando el bucle “while” y otra con el bucle “do - while”.
 */
package _7_programaextramaxminprom;

// @author MENESES-FLOREZ
import java.util.Scanner;

public class _7_programaExtraMaxMinProm {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Almacenamos la lista de números en un vectyor
        int[] v_Numeros;
        int numero, maximo = 0, minimo = 0, cantidadNumeros, i, sumatoria = 0;
        double promedio;

        System.out.println("Ingrese la cantidad de datos que desea introducir:");
        cantidadNumeros = input.nextInt();
        //Le damos dimensión dinámica al vector
        v_Numeros = new int[cantidadNumeros];

        //usamos ciclo "while" para ingresar los números; la variable 'i' nos sirve tanto para controlar
        //el ciclo como para recorrer el vector
        i = 0;
        while (i < cantidadNumeros) {
            System.out.println("Ingrese los números:");
            numero = input.nextInt();
            v_Numeros[i] = numero;

            maximo = v_Numeros[0];
            minimo = v_Numeros[0];

            if (i > 0 && v_Numeros[i] > maximo) {
                maximo = v_Numeros[i];
            }
            if (i > 0 && v_Numeros[i] < minimo) {
                minimo = v_Numeros[i];
            }
            sumatoria += v_Numeros[i];
            i++;
        }
        promedio = sumatoria / cantidadNumeros;
        System.out.println("Con ciclo \"while\"");
        System.out.println("El número mayor ingresado fue (" + maximo + "), el menor (" + minimo + "), y el promedio general es (" + promedio + ").");
        System.out.println("**************");
        
        //usamos ciclo "Do-While" para ingresar los números; la variable 'i' nos sirve tanto para controlar
        //el ciclo como para recorrer el vector
        System.out.println("Ingrese la cantidad de datos que desea introducir:");
        cantidadNumeros = input.nextInt();
        //Reiniciamos variables para no afectar el funcionamiento independiente del ciclo "Do-While"
        promedio = 0;
        sumatoria = 0;
        i = 0;
        do {
            System.out.println("Ingrese los números:");
            numero = input.nextInt();
            v_Numeros[i] = numero;

            maximo = v_Numeros[0];
            minimo = v_Numeros[0];

            if (i > 0 && v_Numeros[i] > maximo) {
                maximo = v_Numeros[i];
            }
            if (i > 0 && v_Numeros[i] < minimo) {
                minimo = v_Numeros[i];
            }
            sumatoria += v_Numeros[i];
            i++;
        } while (i < cantidadNumeros);

        promedio = sumatoria / cantidadNumeros;
        
        System.out.println("Con ciclo \"Do-While\"");
        System.out.println("El número mayor ingresado fue (" + maximo + "), el menor (" + minimo + "), y el promedio general es (" + promedio + ").");
    }

}
