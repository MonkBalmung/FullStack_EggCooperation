/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. Generar un objeto puntos
usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos.
 */
package _16_poo.puntos;

//@author MENESES-FLOREZ */

import Entities.Punto;
import Services.PuntosServices;

public class _16_POOPuntos
{

    public static void main(String[] args)
    {
        PuntosServices servicesPuntos = new PuntosServices();
        
        Punto coordenadas = servicesPuntos.createObject();
        
        System.out.println("Ls distancia entre los puntos es: "+servicesPuntos.calcularDistancia(coordenadas));
    }
    
}
