/*
En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set.
 */
package _9_poo.mathematics;
import Services.MathematicsServices;
import Entities.Mathematics;

//@author MENESES-FLOREZ
public class _9_POOMathematics 
{
    public static void main(String[] args)
    {
        MathematicsServices serviceMath = new MathematicsServices();
        Mathematics operationA = serviceMath.creatObject();
        System.out.println(operationA.toString());
        serviceMath.retrieveBigger(operationA);
        
        System.out.println("El numero mayor elevado a la potencia del menor es: "+serviceMath.retrievePowerof(operationA));
        
        System.out.println("La raíz cuadrada del número menor es: "+serviceMath.retrieveRootof(operationA));
    }
    
}
