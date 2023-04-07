/*
Luego, las operaciones que se podrán realizar son las siguientes:

 Método getDiscriminante(): devuelve el valor del discriminante (double). El
discriminante tiene la siguiente formula: (b^2)-4*a*c

 Método tieneRaices(): devuelve un booleano indicando si tiene dos soluciones, para
que esto ocurra, el discriminante debe ser mayor o igual que 0.

 Método tieneRaiz(): devuelve un booleano indicando si tiene una única solución, para
que esto ocurra, el discriminante debe ser igual que 0.

 Método obtenerRaices(): llama a tieneRaíces() y si devolvió́ true, imprime las 2
posibles soluciones.

 Método obtenerRaiz(): llama a tieneRaiz() y si devolvió́ true imprime una única raíz.
Es en el caso en que se tenga una única solución posible.

 Método calcular(): esté método llamará tieneRaices() y a tieneRaíz(), y mostrará por
pantalla las posibles soluciones que tiene nuestra ecuación con los métodos
obtenerRaices() o obtenerRaiz(), según lo que devuelvan nuestros métodos y en caso
de no existir solución, se mostrará un mensaje.

Nota: Formula ecuación 2o grado: (-b±√((b^2)-(4*a*c)))/(2*a) Solo varia el signo
delante de -b
 */
package Service;

//@author MENESES-FLOREZ */

import Entities.Raiz;
import java.util.Scanner;

public class RaizService
{
    private Scanner input = new Scanner(System.in);
    
    public Raiz createEcuation()
    {
        Raiz ecuation = new Raiz();
        
        System.out.print("Ingrese coefciente A:");
        ecuation.setCoeficienteA(input.nextInt());
        
        System.out.print("Ingrese coefciente B:");
        ecuation.setCoeficienteB(input.nextInt());
        
        System.out.print("Ingrese coefciente C:");
        ecuation.setCoeficienteC(input.nextInt());
        
        return ecuation;
    }//Fin createEcuation()
    
    //(b^2)-4*a*c
    public double getDiscriminante(Raiz ecuation)
    {
        double discriminante = 0d;
        
        discriminante = Math.pow(ecuation.getCoeficienteB(), 2) - (4 * (ecuation.getCoeficienteA() * ecuation.getCoeficienteC()));
        
        return discriminante;
    }//Fin getDiscriminante()
    
    public boolean tieneRaices(double discriminante)
    {
        boolean tieneRaices = false;
        
        if (discriminante > 0) {
            tieneRaices = true;
        }
        
        return tieneRaices;
    }//Fin tieneRaices()
    
    public boolean tieneRaiz(double discriminante)
    {
        boolean tieneRaiz = false;
        
        if (discriminante == 0) {
            tieneRaiz = true;
        }
        
        return tieneRaiz;
    }//Fin tieneRaiz() 
    
    public void obtenerRaices(boolean raices, Raiz ecuacion)
    {
        double x1; 
        double x2;
        int a = ecuacion.getCoeficienteA();
        int b = ecuacion.getCoeficienteB();
        int c = ecuacion.getCoeficienteC();
        
        x1 = (-b+(Math.sqrt((Math.pow(b,2))-(4*a*c))))/(2*a);
        x2 = (-b-(Math.sqrt((Math.pow(b,2))-(4*a*c))))/(2*a);
        
        if (raices)
        {
            System.out.println(x1+", "+x2);
        }
    }//Fin obtenerRaices()
    
    public void obtenerRaiz(boolean raiz, Raiz ecuacion)
    {
        double x1; 
        
        int a = ecuacion.getCoeficienteA();
        int b = ecuacion.getCoeficienteB();
        int c = ecuacion.getCoeficienteC();
        
        x1 = (-b+(Math.sqrt((Math.pow(b,2))-(4*a*c))))/(2*a);
                
        if (raiz)
        {
            System.out.println(x1);
        }
    }//Fin obtenerRaiz()
    
    public void calcular(Raiz ecuation)
    {
        this.obtenerRaices(this.tieneRaices(this.getDiscriminante(ecuation)), ecuation);
        this.obtenerRaiz(tieneRaiz(this.getDiscriminante(ecuation)), ecuation);
    }
}
