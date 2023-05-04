/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

//@author MENESES-FLOREZ */

public class Cliente
{
    //Atributes
    private String name;
    private String lastName;
    private String age;
    private String idNumber;
    private Mascota mascota = null;
    
    //Constructor

    public Cliente() {}

    public Cliente(String name, String lastName, String age, String idNumber, Mascota mascota) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.idNumber = idNumber;
        this.mascota = mascota;
    }
    
    //Getter & Setters

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    
    //toString

    @Override
    public String toString() {
        return  "Cliente \n" 
                + "Nombre: " + name+"\n"
                + "Apellido: " + lastName+"\n" 
                + "Edad:" + age+"\n" 
                + "DNI: " + idNumber+"\n"
                + "Mascota: " + mascota;
    }
    
}
