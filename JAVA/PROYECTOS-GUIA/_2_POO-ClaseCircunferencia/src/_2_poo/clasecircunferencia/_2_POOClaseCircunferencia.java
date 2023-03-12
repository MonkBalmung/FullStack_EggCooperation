/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
 */
package _2_poo.clasecircunferencia;

//@author MENESES-FLOREZ

import Entidades.Circunferencia;
import Servicios.CircunferenciaServicios;

public class _2_POOClaseCircunferencia
{
    public static void main(String[] args)
    {
        CircunferenciaServicios circService = new CircunferenciaServicios();
        Circunferencia circunferencia = circService.crearCircunferencia();
        circService.calcularArea(circunferencia.getRadio());
        circService.calcularPerimetro(circunferencia.getRadio());
    }
    
}
