/*
Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos
con los parámetros que sean necesarios:
 Constructores, tanto el vacío como el parametrizado.
 */
package Entities;

//@author MENESES-FLOREZ */
public class Ahorcado
{
    //Atributes
    private String palabra;
    private int cantidadLetras;
    private int intentos;
    private String[] arrayPalabra;
    
    //Constructors
    public Ahorcado() {}
    public Ahorcado(String palabra, int cantidadLetras, int intentos) {
        this.palabra = palabra;
        this.cantidadLetras = cantidadLetras;
        this.intentos = intentos;
    }
    
    //Getter & Setters
    public String getPalabra() {
        return palabra;
    }

    public int getCantidadLetras() {
        return cantidadLetras;
    }

    public int getTurno() {
        return intentos;
    }
    public String[] getArrayPalabra(){
        return arrayPalabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public void setCantidadLetras(int cantidadLetras) {
        this.cantidadLetras = cantidadLetras;
    }

    public void setTurno(int intentos) {
        this.intentos = intentos;
    }
    
    public void setArrayPalabra(String[] arrayPalabra){
        this.arrayPalabra = arrayPalabra;
    }
    
    //toString

    @Override
    public String toString() {
        return "Ahorcado{" + "palabra=" + palabra + ", cantidadLetras=" + cantidadLetras + ", intentos=" + intentos + '}';
    }
    
    
}
