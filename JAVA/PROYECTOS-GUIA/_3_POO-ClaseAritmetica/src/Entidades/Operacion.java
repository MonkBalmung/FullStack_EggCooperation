/*
Crear una clase llamada Operacion que tenga como atributos privados numero1 y
numero2. A continuación, se deben crear los siguientes métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Metodo constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
 */
package Entidades;

//@author MENESES-FLOREZ
public class Operacion
{
    //Declaracion de Atributos de Clase
    private int number_1;
    private int number_2;
    
    //Constructores
    public Operacion() {}
    public Operacion(int number_1, int number_2)
    {
        this.number_1 = number_1;
        this.number_2 = number_2;
    }

    public void setNumber_1(int number_1) {
        this.number_1 = number_1;
    }

    public void setNumber_2(int number_2) {
        this.number_2 = number_2;
    }

    public int getNumber_1() {
        return number_1;
    }

    public int getNumber_2() {
        return number_2;
    }

    @Override
    public String toString() {
        return "Operacion{" + "number_1=" + number_1 + ", number_2=" + number_2 + '}';
    }
    
    
    
    
}
