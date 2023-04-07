/*
propósito:
autor:
modificación
fecha:
hora:  
 */
package _19_poo.ahorcado;

// @author MENESES-FLOREZ */
import Entities.Ahorcado;
import Services.AhorcadoService;

public class _19_POOAhorcado {

    public static void main(String[] args) {
        AhorcadoService serviceJuegoAhorcado = new AhorcadoService();    
        
        Ahorcado juego = serviceJuegoAhorcado.createGame();
        
        System.out.println("La palabra contiene "+serviceJuegoAhorcado.longitudPalabra(juego)+" letras.");
        
        serviceJuegoAhorcado.buscarLetra(juego);

        
    }

}
