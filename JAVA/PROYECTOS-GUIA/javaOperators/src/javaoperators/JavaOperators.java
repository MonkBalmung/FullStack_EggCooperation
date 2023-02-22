/*
Define variables donde puedas alojar los resultados y prueba usar dos operadores de cada tipo.
 */
package javaoperators;

/**
 *
 * @author MENESES-FLOREZ
 */
public class JavaOperators {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*  Arithmetic Operators
        
            + Operador de Suma
            - Operador de Resta
            * Operador de Multiplicación
            / Operador de División
            % Operador de Módulo*/
        
        double numA = 18;
        double numB = 22;
        
        System.out.println( numA + numB );
        System.out.println( numA - numB );
        System.out.println( numA * numB );
        System.out.println( numA / numB );
        System.out.println( numA % numB );
        
        System.out.println("");
        
        
        /*  Unitarian Operators
        
            + Operador Unario de Suma; indica que el valor es positivo.
            - Operador Unario de Resta; indica que el valor es negativo.
            ++ Operador de Incremento.
            -- Operador de Decremento.*/
        
        int numC = +1;
        int numD = -89;
        int numE = numC++;
        int numF = numD--;
        
        System.out.println(numC);
        System.out.println(numD);
        System.out.println(numE);
        System.out.println(numF);
        
        
        /*  Relational Operators
        
            == Igual
            != Distinto
            > Mayor que
            >= Mayor o igual que
            < Menor que
            <= Menor o igual que*/
        
        System.out.println("");
        
        String word = "word";
        int number = 890;
        
        boolean isTheSame = (word == "word");
        System.out.println(isTheSame);
        
        boolean isEqualTo = (number == 987);
        System.out.println(isEqualTo);    
        
        
    }
    
}
