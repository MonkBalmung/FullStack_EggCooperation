/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package guia8ejercicio9_matematica;

import Guia8Ejercicio9.Entidades.Matematica;
import Guia8Ejercicio9.Servicios.MatematicaServicios;

public class Guia8Ejercicio9_Matematica {
    public static void main(String[] args) {
        
        Matematica calculo = new Matematica();
        MatematicaServicios matservicios = new MatematicaServicios();
        calculo.setNumero1(Math.random()*10);
        calculo.setNumero2(Math.random()*10);
        
        matservicios.devolverMayor(calculo);
        
        System.out.println("Num1 "+calculo.getNumero1());
        System.out.println("Num2 "+calculo.getNumero2());
        System.out.println("Mayor: "+ calculo.getMayor());
        System.out.println("Menor: "+ calculo.getMenor());
        
        matservicios.calcularPotencia(calculo);
        System.out.println("Calcular Potencia: "+matservicios.calcularPotencia(calculo));
        
        matservicios.calcularRaiz(calculo);
        System.out.println("Calcular Raiz cuadrada: "+matservicios.calcularRaiz(calculo));
        
        
    }
    
}
