/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este tipo de
dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar con un formato
fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer carácter tiene que ser
X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la secuencia
especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda secuencia distinta
de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas correctas e
incorrectas recibidas. Para resolver el ejercicio deberá investigar cómo se utilizan las
siguientes funciones de Java Substring(), Length(), equals().
 */
package _12_programadispositivors232_bucles;

//@author MENESES-FLOREZ

import java.util.Scanner;

public class _12_programaDispositivoRS232_Bucles {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        String string;
        String letter;
        int counter = 0;
        boolean flag = false;
        System.out.println("***PROGRAMA DISPOSITIVO RS232***");
        
        do {
            System.out.println("Ingrese una frase o palabra de máximo cinco caracteres: ");
            string = input.nextLine();            
        } while ( string.length() > 5 );  
        
        for (int i = 0; i < string.length(); i++) {
            letter = string.substring(i, (i+1));
            if (letter.equalsIgnoreCase("&")) {
                counter++;
            }
            if (i == 0 && letter.equalsIgnoreCase("X")) {
                counter++;
            }else if (i == string.length()-1 && letter.equalsIgnoreCase("O")){
                counter++;
            }
        }
        switch (counter) {
            case 5:
                System.out.println("FDE Fin de los Envíos");
                break;
            case 2:
                System.out.println("La cadena es CORRECTA");
                break;
            default:
                System.out.println("La cadena es INCORRECTA");
        }
 
    }
        
}
