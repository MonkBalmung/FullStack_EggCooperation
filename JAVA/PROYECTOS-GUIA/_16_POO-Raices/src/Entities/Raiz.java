/*
Vamos a realizar una clase llamada Raices, donde representaremos los valores de una
ecuación de 2o grado. Tendremos los 3 coeficientes como atributos, llamémosles a, b y c.
Hay que insertar estos 3 valores para construir el objeto a través de un método
constructor. 
 */
package Entities;

//@author MENESES-FLOREZ */
public class Raiz
{
    //Atributes
    private int coeficienteA;
    private int coeficienteB;
    private int coeficienteC;
    
    //constructors
    public Raiz() {}
    public Raiz(int coeficienteA, int coeficienteB, int coeficienteC) {
        this.coeficienteA = coeficienteA;
        this.coeficienteB = coeficienteB;
        this.coeficienteC = coeficienteC;
    }
    
    //Getters & Setters

    public int getCoeficienteA() {
        return coeficienteA;
    }

    public int getCoeficienteB() {
        return coeficienteB;
    }

    public int getCoeficienteC() {
        return coeficienteC;
    }

    public void setCoeficienteA(int coeficienteA) {
        this.coeficienteA = coeficienteA;
    }

    public void setCoeficienteB(int coeficienteB) {
        this.coeficienteB = coeficienteB;
    }

    public void setCoeficienteC(int coeficienteC) {
        this.coeficienteC = coeficienteC;
    }
    
    
}
