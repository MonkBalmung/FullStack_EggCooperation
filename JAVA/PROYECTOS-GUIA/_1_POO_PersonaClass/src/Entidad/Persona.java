
package Entidad;

//@author MENESES-FLOREZ
public class Persona 
{
    //Atributos de Persona
    private String nombre;
    private String numeroIdentificacion;
    private int edad;
    
    public Persona(){}

    public Persona(String nombre, String numeroIdentificacion, int edad) {
        this.nombre = nombre;
        this.numeroIdentificacion = numeroIdentificacion;
        this.edad = edad;
    }
 
    public String getNombre() {
        return nombre;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

//    @Override
//    public String toString() {
//        return "Persona{" + "nombre=" + nombre + ", numeroIdentificacion=" + numeroIdentificacion + ", edad=" + edad + '}';
//    }
//    public void mostrarPersona(Persona persona)
//    {
//        System.out.println("Nombre:"+persona.getNombre()+", Identificación:"+persona.getNumeroIdentificacion()+", Edad:"+persona.getEdad());
//    }
    
    
}
