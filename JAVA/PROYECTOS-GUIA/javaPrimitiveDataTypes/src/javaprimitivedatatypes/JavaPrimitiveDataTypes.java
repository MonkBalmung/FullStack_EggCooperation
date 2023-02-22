/*
Crear un proyecto de Java y definir al menos 6 variables en tu IDE de distintos tipos de datos.
 */
package javaprimitivedatatypes;/**
 *
 * @author MENESES-FLOREZ
 */
public class JavaPrimitiveDataTypes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Primitive Data Types
        //Declaración y definición (asignación de valor) de variables
        byte smallInteger = -128; /*Es un entero con signo de 8 bits, el mínimo valor que se puede almacenar es  y
                                    el máximo valor es de 127 (inclusive)*/
        
        short mediumInteger = 7; /*Es un entero con signo de 16 bits. El valor mínimo es -32,768 y el valor máximo
                                        32,767 (inclusive)*/
        
        int numInteger = 600000; /*Es un entero con signo de 32 bits. El valor mínimo es -2,147,483,648 y el valor
                                        máximo es 2,147,483,64 (inclusive). Generalmente es la opción por defecto.
                                        long Es un entero con signo de 64 bits, el valor mínimo que puede almacenar este tipo de*/
        long mamotNumber = 45000000000l;

        float floatNumber = 0.34f; /* Es un número decimal de precisión simple de 32 bits (IEEE 754 Punto Flotante)*/
        double floatGrandNumber = 0.34f; /*Es un número decimal de precisión doble de 64 bits (IEEE 754 Punto Flotante)*/
        boolean stateOf = false; /*Este tipo de dato sólo soporta dos posibles valores: verdadero o falso y el dato es
                                representado con tan solo un bit de información*/

        char characterUnicode = '&';/*El tipo de dato carácter es un simple carácter unicode de 16 bits. Su valor mínimo es
                                    de '\u0000' (En entero es 0) y su valor máximo es de '\uffff' (En entero es 65,535).
                                    Nota: un dato de tipo carácter se puede escribir entre comillas simples, por ejemplo
                                    'a', o también indicando su valor Unicode, por ejemplo '\u0061'.*/

        String stringPhrase = "Java"; /*Además de los tipos de datos primitivos el lenguaje de programación Java provee
                                        también un soporte especial para cadena de caracteres a través de la clase String.
                                        Encerrando la cadena de caracteres con comillas dobles se creará de manera
                                        automática una nueva instancia de un objeto tipo String.
                                        String cadena = “Sebastián”;
                                        Los objetos String son inmutables, esto significa que una vez creados, sus valores
                                        no pueden ser cambiados. Si bien esta clase no es técnicamente un tipo de dato
                                        primitivo, el lenguaje le da un soporte especial y hace parecer como si lo fuera.*/
    }
    
}
