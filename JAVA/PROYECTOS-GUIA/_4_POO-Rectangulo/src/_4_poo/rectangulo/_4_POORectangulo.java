/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package _4_poo.rectangulo;

//@author MENESES-FLOREZ

import Entidades.Rectangulo;
import Servicios.RectanguloServicios;

public class _4_POORectangulo
{
    public static void main(String[] args)
    {
        //Instanciamos Clase Service para crear el objeto
        RectanguloServicios recServices = new RectanguloServicios();
        
        //Instanciamos el objeto usando el método crear de la Clase Service
        Rectangulo rectangulo = recServices.crearRectangulo();
        
        //Recibimos el valor retornado por la función calcularSuperficie de la Clase Service
        int superficie = recServices.calcularSuperficie(rectangulo);        
        System.out.println("La superficie del rectangulo es: "+superficie);
        
        //Recibimos el valor retornado por la función calcularPerimetro de la Clase Service
        int perimetro = recServices.calcularPerimetro(rectangulo);
        System.out.println("El perimetro del rectangulo es: "+perimetro);
        
        //Llamamos al método de la Clase Service que dibuja el rectangulo 
        recServices.dibujarRectangulo(rectangulo);
    }
    
}
