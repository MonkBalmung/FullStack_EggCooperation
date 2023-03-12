
package Entidades;

//@author MENESES-FLOREZ
public class Mascota
{   //Atributos
    private String nombre;
    private String apodo;
    private int edad;
    private String tipoMascota;
    private boolean cola;
    private String raza;
    private String color;
    Usuario duenio;
    private int energia = 1000;
    
    //Clase
    public Mascota() {}
    //Constructor instanciador
    public Mascota(String nombre, String apodo, int edad)
    {
        this.nombre = nombre;
        this.apodo = apodo;
        this.edad = edad;
        this.duenio = new Usuario();
        
    }
    //Constructor instanciador
    public Mascota(String nombre, String apodo, int edad, String tipoMascota, boolean cola, String raza, String color)
    {
        this.nombre = nombre;
        this.apodo = apodo;
        this.edad = edad;
        this.tipoMascota = tipoMascota;
        this.cola = cola;
        this.raza = raza;
        this.color = color;
    }
    //Set
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setTipoMascota(String tipoMascota) {
        this.tipoMascota = tipoMascota;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDuenio(Usuario duenio) {
        this.duenio = duenio;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public int getEdad() {
        return edad;
    }

    public String getTipoMascota() {
        return tipoMascota;
    }

    public boolean isCola() {
        return cola;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public Usuario getDuenio() {
        return duenio;
    }
    
    /** 
     * 
     * @param energiaARestar
     * @return 
     */
    public int pasear(int energiaARestar)
    {
        energia -= energiaARestar;
        
        return energia;
    }
    /** 
     * 
     * @param energiaARestar
     * @param vueltas
     * @return 
     */
    public int pasear(int energiaARestar, int vueltas)
    {
        for (int i = 0; i < vueltas; i++)
        {
             energia -= energiaARestar;
             
            if (energia < 100)
            {
                System.out.println("Una vuelta mas y me muero!!");
                energia = 1000;
                break;
            }
        }      
        
        
        
        return energia;
    }

    @Override
    public String toString() {
        return "Mascota{\n"
                + ""+"nombre:"+nombre+",\n"
                + "apodo:"+apodo+",\n"
                + "edad:"+edad+",\n"
                + "tipoMascota:"+tipoMascota+",\n"
                + "cola:"+cola+",\n"
                + "raza:"+raza+",\n"
                + "color:"+color+",\n"
                + "duenio:" + duenio + ",\n"
                + "energia:" + energia + '}';
    } 
   
}
