/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package _pootestmath;

/**
 *
 * @author MENESES-FLOREZ
 */
public class _POOTestMath {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         ServicioCalcula cal = new ServicioCalcula();
        cal.LeerNumeros();
        System.out.println("retornar cuál de los dos atributos tiene el mayor valor: "+cal.devolverMayor());
        
        System.out.println("retornar  la potencia del mayor valor de la clase: "+cal.calcularPotencia());
        
        System.out.println("retornar  la raíz cuadrada del menor: "+cal.calcularRaiz());
    }
    
}
