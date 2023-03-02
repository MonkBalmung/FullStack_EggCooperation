/*
Realice un programa para que el usuario adivine el resultado de una multiplicación entre
dos números generados aleatoriamente entre 0 y 10. El programa debe indicar al usuario
si su respuesta es o no correcta. En caso que la respuesta sea incorrecta se debe permitir
al usuario ingresar su respuesta nuevamente. Para realizar este ejercicio investigue como
utilizar la función Math.random() de Java.
 */
package _10_programaextraadivinanumero;

//@author MENESES-FLOREZ

import java.util.Scanner;

public class _10_programaExtraAdivinaNumero {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        int numberA, numberB, timesNumber, number;
        //Ésta variable lógica nos ayuda a salir del algoritmo si el usuario adivina el número
        boolean guessIt = false;
        
        System.out.println("Adivina el número entre 0 y 99");
        //Bucle de 3 series de número al azar
        int outerCounter = 0;
        while (outerCounter < 10){
            if (guessIt == true) {
                outerCounter=9;
            }
            if (outerCounter==9) {
                System.out.println("FIN DEL JUEGO");
            }else{
                System.out.println("Nuevo número, Juego #" + (outerCounter + 1) + " de 10");
                numberA = (int) (Math.random() * 10);
                numberB = (int) (Math.random() * 10);
                timesNumber = numberA * numberB;
                
                //Bucle de 10 intentos para adivinar el número. Si no lo logra, tiene hasta tres series para lograrlo.
                int innerCounter = 0;
                do {
                    if (innerCounter == 10) {
                        System.out.println("No tienes mas chances.");
                        break;
                    } else {
                        System.out.println("Chance #" + (innerCounter + 1));
                        System.out.println("Ingrese el número: ");
                        number = input.nextInt();
      
                        if (number == timesNumber) {
                            System.out.println("Has adivinado!");
                            guessIt = true;
                            break;
                        } else if (outerCounter==3){
                            break;
                        } else {
                            System.out.println("Intenta de nuevo");
                            innerCounter++;
                        }
                        //Esta condicional le ayuda el usuario a adivina un poco más rápido, reduciendo el "scope" de posibiliades 
                        if (number < timesNumber) {
                            System.out.println("El número a adivinar es mayor, intenta con uno más grande.");
                        }else{
                            System.out.println("El número a adivinar es menor, intenta con uno más pequeño.");
                        }
                    }
                } while (innerCounter < 10);
            }
            outerCounter++;
        }

    }
    
}
