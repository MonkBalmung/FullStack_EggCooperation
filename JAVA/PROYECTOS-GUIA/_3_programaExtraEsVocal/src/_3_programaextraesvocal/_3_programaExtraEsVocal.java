/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la clase
String.
 */
package _3_programaextraesvocal;

//@author MENESES-FLOREZ/

import java.util.Scanner;

public class _3_programaExtraEsVocal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        boolean vocal;
        
        String letra;
        System.out.println("Ingrese una letra, identificaremos si es vocal o no:");
        letra = input.next();
        System.out.println("¿La letra ingresada ("+letra+") es vocal?");
        vocal = es_Vocal(letra);
        System.out.println(vocal);
        
        
    }
    public static boolean es_Vocal(String letra){
        boolean vocal;        
        if (letra.equalsIgnoreCase("a")
            || letra.equalsIgnoreCase("e")
            || letra.equalsIgnoreCase("i")
            || letra.equalsIgnoreCase("o")
            || letra.equalsIgnoreCase("u")) {
            vocal = true;            
        }else{
            vocal = false;
        }        
        return vocal;
    }
}
