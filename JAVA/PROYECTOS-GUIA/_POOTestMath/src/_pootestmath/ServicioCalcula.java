/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package _pootestmath;

import java.util.Scanner;

/**
 *
 * 
 * a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 * @author luisc
 */
public class ServicioCalcula {
    private Numeros nume;
    
    public void LeerNumeros(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero 1:");
        nume.setNum1(leer.nextDouble());
        System.out.println("Ingrese el numero 2:");
        nume.setNum2(leer.nextDouble());
    }
    
    public double devolverMayor(){
        return Math.max(nume.getNum1(), nume.getNum2());        
    }
    
    public double calcularPotencia(){
        double max=Math.round(Math.max(nume.getNum1(), nume.getNum2()));        
        double min=Math.round(Math.min(nume.getNum1(), nume.getNum2()));        
        return Math.pow(max, min);        
    }
    
    public double calcularRaiz(){        
        double min=Math.min(nume.getNum1(), nume.getNum2());        
        return Math.sqrt(Math.abs( min));        
    }

    public ServicioCalcula(Numeros nume) {
        this.nume = nume;
    }
    
    public ServicioCalcula() {
        this.nume = new Numeros();
    }
    
    
}
