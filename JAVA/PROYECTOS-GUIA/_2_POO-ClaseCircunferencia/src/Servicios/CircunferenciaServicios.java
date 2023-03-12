/*
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package Servicios;
import Entidades.Circunferencia;
import java.util.Scanner;
//@author MENESES-FLOREZ

public class CircunferenciaServicios
{
    Scanner input = new Scanner(System.in);
    //Método servicio para instanciar objeto de la Clase Circunferencia
    public Circunferencia crearCircunferencia()
    {
        Circunferencia circunferencia = new Circunferencia();
        //que le pide el radio y lo guarda en el atributo del objeto.
        System.out.println("Ingrese por favor el radio de la Circunferencia:");
        circunferencia.setRadio(input.nextDouble());        
        return circunferencia;
    }
    public void calcularArea(double radio)
    {
        double area;
        area = Math.PI * (Math.pow(radio, 2));
        
        System.out.println("El área de la circunferencia de radio "+radio+" es: "+area);
    }
    public void calcularPerimetro(double radio)
    {
        double perimetro;
        perimetro = 2 * Math.PI * radio;
        System.out.println("El perimetro de la circunferencia de radio "+radio+" es: "+perimetro);
    }
}
