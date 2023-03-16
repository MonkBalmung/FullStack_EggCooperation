/*
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarAzucar(int): se le pide al usuario una cantidad de azucar, el método lo
recibe y se añade a la taza la cantidad de café indicada.
 */
package Servicios;
import Entidades.Cafetera;
import java.util.Scanner;
//@author MENESES-FLOREZ
public class CafeteraServicios
{
    //Instanciamos objeto cafetera con capacidad 100 onzas
    private Cafetera cafetera = new Cafetera(100, 0);
    
    //Instanciamos un objeto Scanner para lectura
    private Scanner input = new Scanner(System.in);
    
    private boolean filled = true;
    
    //Metodo para llenar la cafetera
    public boolean llenarCafetera()
    {
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        System.out.println("Cafetera lista con agua caliente para ser servida"); 
        dibujarCafetera(cafetera.getCantidadActual());
        return filled;
    }//Fin método llenarCafetera()
    
    //Vaciamos cafetera
    public void vaciarCafetera()
    {
        cafetera.setCantidadActual(0);
        System.out.println("La cafetera se encuentra vacía");
        dibujarCafetera(cafetera.getCantidadActual());
    }//Fin método vaciarCafetera()
    
    public void servirTaza(boolean fulfilled)
    {
        int tamanioTaza = 0;
        int tazaServida = 0;
        int cucharadasAzucar = 0;
        char opcion;

        while (fulfilled)
        {
            System.out.println("Ingrese el tamaño de la taza a utilizar, en onzas:");
            tamanioTaza = input.nextInt();
            if (cafetera.getCantidadActual() < tamanioTaza)
            {
                tazaServida = cafetera.getCantidadActual();
                cafetera.setCantidadActual(0);
                System.out.println("La taza no alcanzó a llenarse por completo, se sirvieron tan solo " + tazaServida + " onzas");
                this.vaciarCafetera();
                if (cafetera.getCantidadActual() == 0)
        {
            dibujarCafetera(cafetera.getCantidadActual());
            System.out.println("El café se encuentra agotado. ¿Desea llenar la cafetara una vez más?");
            opcion = input.next().toUpperCase().charAt(0);
            if (opcion == 'S') {
                this.llenarCafetera();
            }
            else
            {
                System.out.println("La tienda ha cerrado por el día de hoy.");
                fulfilled = false;
            }
            
        }
            } else
            {
                tazaServida = tamanioTaza;
                cafetera.setCantidadActual(cafetera.getCantidadActual() - tamanioTaza);
                
                cucharadasAzucar = agregarAzucar();
                System.out.println("Su taza de " + tamanioTaza + " onzas ha sido servida junto a " + cucharadasAzucar + " de azúcar. Disfrute!");
                System.out.println("Cantidad Actual: "+cafetera.getCantidadActual());
                dibujarCafetera(cafetera.getCantidadActual());
            }
        }
        if (cafetera.getCantidadActual() == 0)
        {
            System.out.println("El café se encuentra agotado. ¿Desea llenar la cafetara una vez más?");
            opcion = input.next().toUpperCase().charAt(0);
            if (opcion == 'S') {
                this.llenarCafetera();
            }
            else
            {
                System.out.println("La tienda ha cerrado por el día de hoy.");
                fulfilled = false;
            }
            
        }
    }//Fin metodo servirTaza()                     
     public int agregarAzucar()
     {
         int cucharadasCafe = 0;
         System.out.println("¿Cuántas cucharadas de café desea agregar?");
         cucharadasCafe = input.nextInt();
         return cucharadasCafe;
     }//Fin metodo agregarCafe()
     public void dibujarCafetera(int nivel)
     {
         nivel /= 10;
         System.out.println("NIVEL ACTUAL");
         for (int i = 0; i < nivel; i++) 
         {
             System.out.print("*");
         }
         System.out.println("");
     }
}//Fin Clase CafeteraServicios
