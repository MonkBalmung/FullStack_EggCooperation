/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a cada
una. 
A continuación, realizar las instrucciones necesarias para que: 
B tome el valor de C,
C tome el valor de A, 
A tome el valor de D y 
D tome el valor de B. 
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una variable auxiliar.
 */
package _1_programaextraasignarvalores;

// @author MENESES-FLOREZ
public class _1_programaExtraAsignarValores {

    public static void main(String[] args) {
        int numA = 8;
        int numB = 45;
        int numC = 98;
        int numD = 23;
        int numAux;
        
        System.out.println("Valores iniciales de las variables:\n"
                + "numero A: "+numA+"\n"
                + "numero B: "+numB+"\n"
                + "numero C: "+numC+"\n"
                + "numero D: "+numD+"\n");
        
        numAux = numB;
        numB = numC;
        numC = numA;
        numA = numD;
        numD = numAux;
        
        System.out.println("Valores finales de las variables:\n"
                + "numero A: "+numA+"\n"
                + "numero B: "+numB+"\n"
                + "numero C: "+numC+"\n"
                + "numero D: "+numD+"\n");
    }
    
}
