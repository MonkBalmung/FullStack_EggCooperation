/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos, sus
atributos serán, x1, y1, x2, y2, siendo cada x e y un punto. 
 */
package Entities;

//@author MENESES-FLOREZ */
public class Punto
{
    //Atributes    
    private int puntoX_1;
    private int puntoY_1;
    private int puntoX_2;
    private int puntoY_2;
    
    //Constructors
    public Punto() {}
    public Punto(int puntoX_1, int puntoY_1, int puntoX_2, int puntoY_2) {
        this.puntoX_1 = puntoX_1;
        this.puntoY_1 = puntoY_1;
        this.puntoX_2 = puntoX_2;
        this.puntoY_2 = puntoY_2;
    }
    
    //Getter & Setters

    public int getPuntoX_1() {
        return puntoX_1;
    }

    public int getPuntoY_1() {
        return puntoY_1;
    }

    public int getPuntoX_2() {
        return puntoX_2;
    }

    public int getPuntoY_2() {
        return puntoY_2;
    }

    public void setPuntoX_1(int puntoX_1) {
        this.puntoX_1 = puntoX_1;
    }

    public void setPuntoY_1(int puntoY_1) {
        this.puntoY_1 = puntoY_1;
    }

    public void setPuntoX_2(int puntoX_2) {
        this.puntoX_2 = puntoX_2;
    }

    public void setPuntoY_2(int puntoY_2) {
        this.puntoY_2 = puntoY_2;
    }
    
    
}
