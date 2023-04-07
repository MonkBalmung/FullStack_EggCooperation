/*
Generar un objeto puntos usando un método crearPuntos() que le pide al usuario los dos números y los ingresa en
los atributos del objeto. Después, a través de otro método calcular y devolver la distancia
que existe entre los dos puntos que existen en la clase Puntos.

 */
package Services;

//@author MENESES-FLOREZ */

import java.util.Scanner;
import Entities.Punto;

public class PuntosServices 
{
    private Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public Punto createObject()
    {
        Punto coordenadas = new Punto();
        
        System.out.println("Ingrese Punto A, coordenada X1:");
        coordenadas.setPuntoX_1(input.nextInt());
        
        System.out.println("Ingrese Punto A, coordenada Y1:");
        coordenadas.setPuntoY_1(input.nextInt());
        
        System.out.println("Ingrese Punto B, coordenada X2:");
        coordenadas.setPuntoX_2(input.nextInt());
        
        System.out.println("Ingrese Punto B, coordenada Y2:");
        coordenadas.setPuntoY_2(input.nextInt());        
        
        return coordenadas;
    }
    
    public double calcularDistancia(Punto punto)
    {
        double X1 = punto.getPuntoX_1();
        double Y1 = punto.getPuntoY_1();
        double X2 = punto.getPuntoX_2();
        double Y2 = punto.getPuntoY_2();
        
        double distancia = Math.sqrt((Math.pow((X2-X1), 2))+(Math.pow((Y2-Y1), 2)));
        
        return distancia;
    }
}
