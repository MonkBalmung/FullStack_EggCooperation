/*
Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
correspondiente al código. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 */
package Entities;

//@author MENESES-FLOREZ */
public class Mobile
{
    //Atributes
    private String marca;
    private float precio;
    private String modelo;
    private int memoriaRam;
    private int almacenamiento;
    private String[] codigo = new String[7];
    
    //Constructors

    public Mobile() {}

    public Mobile(String marca, float precio, String modelo, int memoriaRam, int almacenamiento) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
    }
    
    //Getter & Setters

    public String getMarca() {
        return marca;
    }

    public float getPrecio() {
        return precio;
    }

    public String getModelo() {
        return modelo;
    }

    public int getMemoriaRam() {
        return memoriaRam;
    }

    public int getAlmacenamiento() {
        return almacenamiento;
    }

    public String[] getCodigo() {
        return codigo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setMemoriaRam(int memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void setCodigo(String[] codigo) {
        this.codigo = codigo;
    }
    
    //toString

    @Override
    public String toString() {
        return "REGISTRO: {" + "MARCA: " + marca + ", PRECIO: $" + precio + ", MODELO: " + modelo + ", RAM: " + memoriaRam + "Gb, MEMORIA: " + almacenamiento + '}';
    }
    
    
}
