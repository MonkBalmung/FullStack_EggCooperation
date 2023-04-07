/*

 */
package _16_poo.raices;

//@author MENESES-FLOREZ */

import Entities.Raiz;
import Service.RaizService;

public class _16_POORaices
{
    public static void main(String[] args)
    {
        RaizService serviceEcuation = new RaizService();
        
        Raiz ecuation = serviceEcuation.createEcuation();
        
        double discriminante = serviceEcuation.getDiscriminante(ecuation);
        boolean tieneRaices = serviceEcuation.tieneRaices(discriminante);
        boolean tieneRaiz = serviceEcuation.tieneRaiz(discriminante);
        
        System.out.println("Discriminante: "+discriminante);        
        System.out.println("¿La ecuación cuadrática tiene dos raíces reales? "+tieneRaices);        
        System.out.println("¿La ecuación cuadrática tiene una raíz repetida? "+tieneRaiz);
        
        serviceEcuation.calcular(ecuation);
        
        
    }
    
}
