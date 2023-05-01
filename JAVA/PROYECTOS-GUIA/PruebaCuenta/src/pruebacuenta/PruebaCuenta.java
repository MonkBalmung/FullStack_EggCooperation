
package pruebacuenta; //Class Contoler
import Entities.Cuenta;
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
public class PruebaCuenta
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
//        Scanner input = new Scanner(System.in).useDelimiter("\n");
//        
          //Cuenta objetoCuenta = new Cuenta();
//        System.out.println("\""+objetoCuenta+"\"");//Imprime la referencia en memoria        
//        //objetoCuenta.setName();        
//        objetoCuenta.imprimirInfoCuenta(objetoCuenta);
//        
//        Cuenta objetoCuentaDos = new Cuenta("yuliet florez", 800000);
//        //objetoCuentaDos.setName();        
//        objetoCuentaDos.imprimirInfoCuenta(objetoCuentaDos);
//        
//        System.out.println("Ingrese el monto a depositar en le cuenta de "+objetoCuenta.getName());
//        double montoDeposito = input.nextDouble();
//        objetoCuenta.setSaldo(montoDeposito);
//        objetoCuenta.imprimirInfoCuenta(objetoCuenta);
        
//        JOptionPane.showMessageDialog(null, "Bienvenido a MÓDULO DE CREACIÓN DE CUENTA");
//        //showInputDialog() permite tomar una cadena por teclado
//        objetoCuenta.setName(JOptionPane.showInputDialog("¿What is your name?"));
//        //Double.parseDouble() nos permite tratar el valor String como double; de la misma forma Integer.parseInt()
//        objetoCuenta.setSaldo(Double.parseDouble(JOptionPane.showInputDialog("¿What is the amount of your deposit?")));
//        
//        String message = String.format("Welcome %s!%n Su saldo es %.2f%n", objetoCuenta.getName(), objetoCuenta.getSaldo());
//        //showMessageDialog() nos permite imprimir por ventana
//        JOptionPane.showMessageDialog(null, message);

            int nota;
            
            nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota:"));
            
//            if (nota >= 90) System.out.println("A");
//            else if (nota >= 80) System.out.println("B");
//                else if (nota >= 70) System.out.println("C");
//                    else if (nota >= 60) System.out.println("D");
//                        else System.out.println("F");
            
            System.out.println(nota > 90 ? "A" : (nota > 80 ? "B" : (nota > 70 ? "C" : (nota > 60 ? "D" : "F"))));
    }  
}
