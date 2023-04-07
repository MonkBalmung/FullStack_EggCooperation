/*
Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package Services;
import Entities.Mathematics;


//@author MENESES-FLOREZ
public class MathematicsServices
{    
    public Mathematics creatObject()
    {
        Mathematics operationA = new Mathematics();
        
        operationA.setNumberA(Math.random()*10);
        operationA.setNumberB(Math.random()*10);
        
        return operationA;
    }//Fin metodo crearObjeto
    public void retrieveBigger(Mathematics operation)
    {
        if ( operation.getNumberA() > operation.getNumberB() ) {
            System.out.println(operation.getNumberA()+" es mayor");
        }
        else
        {
            System.out.println(operation.getNumberB()+" es mayor");
        }
    }//Fin metodo devolverMayor
    public double retrievePowerof(Mathematics operation)
    {
        double powerOf = 0;
        if ( operation.getNumberA() > operation.getNumberB() ) {
            powerOf = Math.pow(Math.round(operation.getNumberA()), Math.round(operation.getNumberB()));
        }
        else
        {
            powerOf = Math.pow(Math.round(operation.getNumberB()), Math.round(operation.getNumberA()));
        }
        return powerOf;
    }//Fin metodo calcularPotencia()
    public static double retrieveRootof(Mathematics operation)
    {
        double rootOf = 0;
        if ( operation.getNumberA() > operation.getNumberB() ) {
            rootOf = Math.sqrt(Math.abs(operation.getNumberB()));
        }
        else
        {
            rootOf = Math.sqrt(Math.abs(operation.getNumberA()));
        }
        return rootOf;
    }//Fin metodo calcularRaiz)
}//Fin Clase MathematicsServices
