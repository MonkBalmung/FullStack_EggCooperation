/*
La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario. 
También incluirá un método para calcular la superficie del rectángulo 
y un método para calcular el perímetro del rectángulo. 
Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
 */
package Servicios;
import Entidades.Rectangulo;
import java.util.Scanner;
//@author MENESES-FLOREZ
public class RectanguloServicios
{
    private Scanner input = new Scanner(System.in);
    
    public Rectangulo crearRectangulo()
    {
        Rectangulo rectangulo = new Rectangulo();
        
        System.out.println("Ingrese por favor la base del rectangulo:");
        rectangulo.setBase(input.nextInt());
        
        System.out.println("Ingrese por favor la altura del rectangulo:");
        rectangulo.setAltura(input.nextInt());
        
        return rectangulo;
    }
    public int calcularSuperficie(Rectangulo rectangulo)
    {
        int superficie;        
        superficie = rectangulo.getBase() * rectangulo.getAltura();        
        return superficie;
    }
    public int calcularPerimetro(Rectangulo rectangulo)
    {
        int perimetro;        
        perimetro = (rectangulo.getBase() + rectangulo.getAltura()) * 2;        
        return perimetro;
    }
    public void dibujarRectangulo(Rectangulo rectangulo)
    {
        for (int i = 0; i < rectangulo.getAltura(); i++)
        {
            for (int j = 0; j < rectangulo.getBase(); j++)
            {
                if ( (i == 0 || i == (rectangulo.getAltura() - 1))
                    || 
                    (j == 0 || j == ( rectangulo.getBase() - 1)) )
                {
                    System.out.print(" * ");
                }
                else
                {
                    System.out.print("   ");
                }
               
            }
            System.out.println("");
        }
    }
}
