/*
Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
programa para organizar la información de cada curso. Para ello, crearemos una clase
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 */
package Entities;

//@author MENESES-FLOREZ */
public class Curso
{
    //Atributes
    private String nombreCurso;
    private float cantidadHorasPorDia;
    private int cantidadDiasPorSemana;
    private String jornada;
    private float precioPorHora;
    //private String[] alumnos = new String[5];
    private String[] alumnos;
    
    //Constructors

    public Curso() {}

    public Curso(String nombreCurso, float cantidadHorasPorDia, int cantidadDiasPorSemana, String jornada, float precioPorHora, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasPorDia = cantidadHorasPorDia;
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
        this.jornada = jornada;
        this.precioPorHora = precioPorHora;
        this.alumnos = alumnos;
    }
    

//    public Curso(String nombreCurso, float cantidadHorasPorDia, int cantidadDiasPorSemana, String jornada, float precioPorHora) {
//        this.nombreCurso = nombreCurso;
//        this.cantidadHorasPorDia = cantidadHorasPorDia;
//        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
//        this.jornada = jornada;
//        this.precioPorHora = precioPorHora;
//    }
    
    //Getter & Setter

    public String getNombreCurso() {
        return nombreCurso;
    }

    public float getCantidadHorasPorDia() {
        return cantidadHorasPorDia;
    }

    public int getCantidadDiasPorSemana() {
        return cantidadDiasPorSemana;
    }

    public String getJornada() {
        return jornada;
    }

    public float getPrecioPorHora() {
        return precioPorHora;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public void setCantidadHorasPorDia(float cantidadHorasPorDia) {
        this.cantidadHorasPorDia = cantidadHorasPorDia;
    }

    public void setCantidadDiasPorSemana(int cantidadDiasPorSemana) {
        this.cantidadDiasPorSemana = cantidadDiasPorSemana;
    }

    public void setJornada(String jornada) {
        this.jornada = jornada;
    }

    public void setPrecioPorHora(float precioPorHora) {
        this.precioPorHora = precioPorHora;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }
    
    //toString
    @Override
    public String toString() {
        return "Curso[Curso: " + nombreCurso + ", horas: " + cantidadHorasPorDia + ", dias: " + cantidadDiasPorSemana + ", jornada: " + jornada + ", precio/hora: $" + precioPorHora+"]";
    }
    
    
}
