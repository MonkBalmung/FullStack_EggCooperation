
package Entities;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
propósito: Implementar el ejemplo de Clase del Libro "Como programar en Java 10"
autor: Diego Meneses
modificación
fecha: 04/06/23
hora: 7:38 PM 
 * @author MENESES-FLOREZ
 */

public class Cuenta
{
    private Scanner input = new Scanner(System.in).useDelimiter("\n");
    
//Atributes
    private String name;
    private double saldo;
    
    
    //Constructor
    public Cuenta() {}
    public Cuenta(String name, double saldo) {
        this.name = name; 
        if (saldo > 0.0) this.saldo = saldo;
        else{
            System.out.println("Error en deposito. Intente de nuevo:");
            this.saldo = input.nextDouble();
        }
    }
    
     //Getter & Setter
    public String getName() {
        return name.toUpperCase();
    }
    public double getSaldo(){
        return saldo;
    }
   
    public void setName(String name) {   
        char letter = name.charAt(0);
        if ((int) letter >= 65 && (int) letter <= 90 || (int) letter >= 97 && (int) letter <= 122) {//(int) me permite obtener el valor entero del caracter segun la tabla ASCII
            this.name = name.toUpperCase();    
        }
        else{            
            String $name = JOptionPane.showInputDialog("Caracteres no válidos.\n"
                    + "Ingrese de nuevo el nombre usando letras:");
            setName($name);//Recursion
        }        
    }
    
    public void setSaldo(double deposito){        
         if(deposito > 0.0) this.saldo += deposito; 
         else{
            System.out.println("Error en deposito. Intente de nuevo:");
            this.saldo = input.nextDouble();
        }
    }
    
    public void imprimirInfoCuenta(Cuenta cuenta){
        System.out.printf("Saldo actual de cuentahabiente %s es $%.2f%n", cuenta.getName(), cuenta.getSaldo());
    }
}
