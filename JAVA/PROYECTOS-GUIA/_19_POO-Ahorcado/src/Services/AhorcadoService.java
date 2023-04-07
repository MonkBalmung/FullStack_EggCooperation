/*
Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
máximas, el valor que ingresó el usuario y encontradas en 0.

 Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.

 Método buscar(letra): este método recibe una letra dada por el usuario y busca si la
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.

 Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.

 Método intentos(): para mostrar cuantas oportunidades le queda al jugador.

 Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.
 */
package Services;

//@author MENESES-FLOREZ */

import Entities.Ahorcado;
import java.util.Scanner;

public class AhorcadoService
{
    private Scanner input = new Scanner(System.in).useDelimiter("\n");
    /**
     * 
     * @return 
     */
    public Ahorcado createGame()
    {
        System.out.println("***BIENVENIDO AL JUEGO DEL AHORCADO***");
        
        Ahorcado juegoAhorcado = new Ahorcado();
        
        String palabra = randomWordBank();
        
        juegoAhorcado.setPalabra(palabra);
        juegoAhorcado.setCantidadLetras(palabra.length());
        juegoAhorcado.setTurno(palabra.length()); 
        
        String[] arrayPalabras = new String[juegoAhorcado.getCantidadLetras()];
        
        for (int i = 0; i < arrayPalabras.length; i++) {
            arrayPalabras[i] = palabra.substring(i, i);
        }
        
        juegoAhorcado.setArrayPalabra(arrayPalabras);        
        
        return juegoAhorcado;
    }//Fin createGame()
    /**
     * 
     * @return 
     */
    public String randomWordBank()
    {
        String[] palabras = new String[10];
        String palabra;
        
        palabras[0] = "datos";
        palabras[1] = "procedimientos";
        palabras[2] = "objetos";
        palabras[3] = "clases";
        palabras[4] = "compilador";
        palabras[5] = "variables";
        palabras[6] = "almacenamiento";
        palabras[7] = "abstraccion";
        palabras[8] = "logica";
        palabras[9] = "programacion";
        
        palabra = palabras[(int)(Math.random()*10)];        
        
        return palabra;
    }//Fin randomWordBank()
    /**
     * 
     * @param juego
     * @return 
     */
    public int longitudPalabra(Ahorcado juego)
    {
        return juego.getCantidadLetras();
    }//Fin longitudPalabra()
    
    /**
     * 
     * @param juego 
     */    
    public void buscarLetra(Ahorcado juego)
    {
        String palabra = juego.getPalabra();
        
        int counter = 0;
        int intentos = juego.getTurno();
        
        System.out.println(palabra);
        
        while (intentos > 0) {
            System.out.println("Ingrese letra: ");
            char letra = input.next().charAt(0);  
            for (int i = 0; i < palabra.length(); i++) {
                System.out.println(i);
                if (letra == palabra.charAt(i)) {
                    System.out.println(letra + " " + palabra.charAt(i));
                    counter++; 
                    System.out.println("["+i+"]");
                }//Fin if                
            }//Fin for
            intentos--;
            System.out.println("Intentos restantes "+intentos);
        }//Fin while
        
        if (intentos == 0) {
            System.out.println("---FIN DEL AHORCADO---");
            System.out.println("(La palabra era \""+palabra+"\")");
        }
        
    }
}
/*

*/