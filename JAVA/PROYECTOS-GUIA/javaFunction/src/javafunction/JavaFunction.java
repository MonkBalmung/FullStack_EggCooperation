/*
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada
en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se
reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las
vocales acentuadas) se mantienen sin cambios.
 */
package javafunction;
import java.util.Scanner;

/**
 *
 * @author MENESES-FLOREZ
 */
public class JavaFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creamos el método para tomar datos por teclado, instanciando la clase Scanner en un objeto "input"
        Scanner input = new Scanner(System.in);
        
        /*Creamos las variables de proceso:
        phrase, que tomará la cadena que el usuario ingresa por teclado.
        finalPhrase, que mostrará la cadena codificada, segun los valores del Switch
        */
        
        String phrase;
        String finalPhrase;
        
        //El usuario ingresa por teclado la cadena
        System.out.println("Ingrese una frase o palabra a codificar: ");
        phrase = input.nextLine();
        
        finalPhrase = codifiedString(phrase);//Se llama a la funcion que tomara la frase y la recodificara
        
        System.out.println("La frase codificada queda: '"+finalPhrase+"'");
        
    }
    //Funcion codificadora
    public static String codifiedString(String phrase){
        String letter;
        String finalPhrase = "";
        
        //Recorremos la cadena con ciclo for, separando a cada iteracion cada letra, para evaluarla en el Switch
        for (int i = 0; i < phrase.length(); i++) {
            letter = phrase.substring(i, (i+1));
            switch (letter) {
                case "a":
                    finalPhrase = finalPhrase.concat("@"); //Construye la frase codificada, reemplaza la vocal por el caracter
                    break;
                case "e":
                    finalPhrase = finalPhrase.concat("#");
                    break;
                case "i":
                    finalPhrase = finalPhrase.concat("$");
                    break;
                case "o":
                    finalPhrase = finalPhrase.concat("%");
                    break;
                case "u":
                    finalPhrase = finalPhrase.concat("*");
                    break;
                default:
                   finalPhrase = finalPhrase.concat(letter);////Construye la frase codificada, conservando la letra que no se codificará
            }
            
        }
        
        return finalPhrase;
    }
}
