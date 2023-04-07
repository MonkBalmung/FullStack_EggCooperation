/*
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package Entities;

//@author MENESES-FLOREZ */
public class Mes
{
    //Atributes
    private String[] mesesDelAnio;
    private String mesSecreto;
    
    //Constructors
    public Mes() {}

    public Mes(String[] mesesDelAnio, String mesSecreto) {
        this.mesesDelAnio = mesesDelAnio;
        this.mesSecreto = mesSecreto;
    }
    
    //Getter & Setters

    public String[] getMesesDelAnio() {
        return mesesDelAnio;
    }

    public String getMesSecreto() {
        return mesSecreto;
    }

    public void setMesesDelAnio(String[] mesesDelAnio) {
        this.mesesDelAnio = mesesDelAnio;
    }

    public void setMesSecreto(String mesSecreto) {
        this.mesSecreto = mesSecreto;
    }
    
    //toString

    @Override
    public String toString() {
        return "Mes{" + "mesesDelAnio=" + mesesDelAnio + ", mesSecreto=" + mesSecreto + '}';
    }
    
    
}
