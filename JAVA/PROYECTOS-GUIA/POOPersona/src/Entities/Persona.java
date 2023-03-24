/*
Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set
 */
package Entities;

//@author MENESES-FLOREZ*/

import java.util.Date;

public class Persona
{
    //Atributes
    private String name;
    private Date fechaNacimiento;
    
    //Constructors
    public Persona() {}
    public Persona(String name, Date fechaNacimiento) {
        this.name = name;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    //Getter & Setter

    public String getName() {
        return name;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    
    
    
    
}
