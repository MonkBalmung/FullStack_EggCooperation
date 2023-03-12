
package Entidades;
//import java.util.Date;
//@author MENESES-FLOREZ

public class Usuario 
{
    private String nombre;
    private String apellido;
    private String id_number;
    private String fechaNacimiento;
    private String pais;
    final String genero = "Masculino";//Declaración de constante en Java
    
    public Usuario() {}

    public Usuario(String nombre, String apellido, String id_number, String fechaNacimiento, String pais)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.id_number = id_number;
        this.fechaNacimiento = fechaNacimiento;
        this.pais = pais;
    }
    //Set
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }   

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getId_number() {
        return id_number;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getPais() {
        return pais;
    }

    public String getGenero() {
        return genero;
    }

    @Override
    public String toString() {
        return "Usuario{\n"
                +"nombre:"+nombre+",\n"
                + "apellido:"+apellido+",\n"
                + "id_number:"+id_number+",\n"
                + "fechaNacimiento:"+fechaNacimiento+",\n"
                + "pais:"+pais+",\n"
                + "genero:"+genero+'}';
    }
    
}
