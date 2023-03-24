/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. 
 */
package Entities;
import java.util.Date;

//@author MENESES-FLOREZ */
public class Persona
{
    //Atributes
    private String name;
    private Date dateBorn;
    private int edad;
    
    //Constructors

    public Persona() {}
    public Persona(String name, Date dateBorn) {
        this.name = name;
        this.dateBorn = dateBorn;
    }
    public Persona(String name, Date dateBorn, int edad) {
        this.name = name;
        this.dateBorn = dateBorn;
        this.edad = edad;
    }
    
    //Getter & Setter

    public String getName() {
        return name;
    }

    public Date getDateBorn() {
        return dateBorn;
    }
    
    public int getEdad(){
        return edad;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDateBorn(Date dateBorn) {
        this.dateBorn = dateBorn;
    }
    
    public void setEdad(int edad){
        this.edad = edad;
    }
    
    //toString
    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", dateBorn=" + dateBorn + ", edad=" + edad + '}';
    }

       
}//Fin clase Persona
