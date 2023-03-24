/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set.  
 */
package Entities;

//@author MENESES-FLOREZ
public class Mathematics
{
    //Atributes
    private double numberA;
    private double numberB;
    
    //Contructors
    public Mathematics() {}
    public Mathematics(double numberA, double numberB)
    {
        this.numberA = numberA;
        this.numberB = numberB;
    }
    
    //Getter & Setter
    public double getNumberA() {
        return numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }
    
    //ToString
    @Override
    public String toString() {
        return "Mathematics{" + "numberA=" + numberA + ", numberB=" + numberB + '}';
    }
    
}
