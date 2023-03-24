/*
a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Guia8Ejercicio9.Servicios;

import Guia8Ejercicio9.Entidades.Matematica;

public class MatematicaServicios {
    
    
    public double devolverMayor(Matematica mat) {
        mat.setMayor(Math.max(mat.getNumero1(), mat.getNumero2()));
        mat.setMenor(Math.min(mat.getNumero1(), mat.getNumero2()));
        return Math.max(mat.getNumero1(), mat.getNumero2());
    }

    public int calcularPotencia(Matematica mat) {
        return (int) (Math.pow(Math.round(mat.getMayor()), Math.round(mat.getMenor())));
    }

    public int calcularRaiz(Matematica mat) {
        return (int) (Math.sqrt(Math.round(mat.getMenor())));
    }
    
    
    
    
}
