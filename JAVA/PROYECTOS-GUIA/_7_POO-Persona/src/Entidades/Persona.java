/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 */
package Entidades;

//@author MENESES-FLOREZ
public class Persona
{
    //Atributes
    private String nombre;
    private int edad;
    private char sexo;
    private float peso;
    private float altura;
    private int imc;
    private boolean esMayor;
    
    //Constructors
    public Persona() {}

    public Persona(String nombre, int edad, char sexo, float peso, float altura, int imc, boolean esMayor)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
        this.esMayor = esMayor;
    }
    //Getter & Setter
        public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public char getSexo() {
        return sexo;
    }

    public float getPeso() {
        return peso;
    }

    public float getAltura() {
        return altura;
    }
     
    public int getImc(){
        return imc;
    }
    
    public boolean getEsMayor(){
        return esMayor;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public void setImc(int imc){
        this.imc = imc;
    }
    
    public void setEsMayor(boolean esMayor){
        this.esMayor = esMayor;
    }
    
    //toString
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + ", peso=" + peso + ", altura=" + altura + '}';
    }
  
}//Fin Clase Persona
