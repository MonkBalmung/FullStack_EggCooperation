/*
Perro, que tendrá como atributos: nombre, raza, edad y tamaño; 
 */
package Entities;

//@author MENESES-FLOREZ */

import Enums.MascotaSexo;
import Enums.MascotaTamanio;



public class Mascota
{
    //Atributes
    private String name;
    private String biologicFamily;
    private String race;
    private String age;
    private String sexo;
    private String tamanio;
    
    //Constructors

    public Mascota() {}

    public Mascota(String name, String biologicFamily, String race, String age, String sexo, String tamanio) {
        this.name = name;
        this.biologicFamily = biologicFamily;
        this.race = race;
        this.age = age;
        this.sexo = sexo;
        this.tamanio = tamanio;
    }
    
    //Getter & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBiologicFamily() {
        return biologicFamily;
    }

    public void setBiologicFamily(String biologicFamily) {
        this.biologicFamily = biologicFamily;
    }

    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    @Override
    public String toString() {
        return "Mascota \n" 
                + "Nombre: " + name+"\n"
                + "Clase: " + biologicFamily+"\n"
                + "Raza: " + race+"\n"
                + "Edad: " + age+"\n"
                + "Sexo: " + sexo+"\n"
                + "Tamaño: " + tamanio;
    }
    
    
    
}
