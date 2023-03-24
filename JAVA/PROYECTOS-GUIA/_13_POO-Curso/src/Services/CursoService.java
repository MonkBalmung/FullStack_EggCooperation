/*
 método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
 */
package Services;
import Entities.Curso;

//@author MENESES-FLOREZ */

import java.util.Scanner;

public class CursoService
{
    private Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public Curso createObject()
    {
        Curso curso = new Curso();
        
        String nombreCurso;
        float cantidadHorasPorDia;
        int cantidadDiasPorSemana;
        String jornada;
        float precioPorHora;
        
        System.out.println("Ingrese el nombre del curso: ");
        nombreCurso = input.next(); 
        curso.setNombreCurso(nombreCurso);
        
        System.out.println("Ingrese la cantidad de horas por dia del curso: "+nombreCurso);
        cantidadHorasPorDia = input.nextInt();//Integer.parseInt(scanner.nextLine());
        //input.nextLine();  
        curso.setCantidadHorasPorDia(cantidadHorasPorDia);
        
        System.out.println("Ingrese la cantidad de dias del curso: "+nombreCurso);
        cantidadDiasPorSemana = input.nextInt();
        //input.nextLine();
        curso.setCantidadDiasPorSemana(cantidadDiasPorSemana);
        
        boolean flag = true;
        do {
            System.out.println("Ingrese la jornada (\"Maniana\"/\"Tarde\" del curso: ");
            jornada = input.next().toUpperCase();
            curso.setJornada(jornada);
            if (curso.getJornada().equalsIgnoreCase("maniana") || curso.getJornada().equalsIgnoreCase("tarde"))
            {
                flag = false;
                
            } else {System.out.println("Ingrese valores válidos: ");}
        } while (flag);        
        
        System.out.println("Ingrese el precio a cobrar por hora: ");
        precioPorHora = input.nextFloat();//Float.parseFloat(input.nextLine());
        //input.nextLine();
        curso.setPrecioPorHora(precioPorHora);
        
        System.out.println("Ingrese la cantidad de alumnos: ");
        cargarAlumnos(input.nextInt(), curso);
        
        return curso;
    }
    
    public void cargarAlumnos(int numAlumnos, Curso curso)
    {
        String[] alumnos = new String[numAlumnos];
        //input.next();
        System.out.println("Ingrese el nombre de los alumnos: ");
        for (int i = 0; i < alumnos.length; i++) {
            System.out.print((i+1)+") Nombre: ");
            alumnos[i] = input.next();
        }
        curso.setAlumnos(alumnos);
    }
    
    public void mostrarAlumnos(Curso curso)
    {
        System.out.println("ALUMNOS curso "+curso.getNombreCurso()+":");
        System.out.print("[");
        for (int i = 0; i < curso.getAlumnos().length; i++) {
            System.out.print(curso.getAlumnos()[i]+", ");
        }
        System.out.print("]");
        System.out.println("");
    }
    
    public float calcularGananciaSemanal(Curso curso)
    {
        float ganancias;        
        ganancias = curso.getCantidadHorasPorDia() * curso.getPrecioPorHora() * curso.getCantidadDiasPorSemana() * 5;
        return ganancias;
    }
}
/*se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.*/