/*
Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la
letra (String o char) que le corresponde. Dispondrá de los siguientes métodos:
 Métodos getters y setters para el número de DNI y la letra.
 */
package Entities;

//@author MENESES-FLOREZ */
public class NIF
{
    //Atributes
    private long dni;
    private char letra;
    
    //Constructor
    public NIF() {}

    public NIF(long dni, char letra) {
        this.dni = dni;
        this.letra = letra;
    }
    
    //Getter & Setters

    public long getDni() {
        return dni;
    }

    public char getLetra() {
        return letra;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }
    
    
    
}
