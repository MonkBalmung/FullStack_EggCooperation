/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
 */
package _7_poo.persona;

//@author MENESES-FLOREZ

import Entidades.Persona;
import Servicios.PersonaServicios;

public class _7_POOPersona
{
    public static void main(String[] args)
    {
        //Instanciación de los servicios de Clase Persona
        PersonaServicios serviciosPersona = new PersonaServicios();
        
        //Creación de 4 objetos Persona diferentes
        Persona[] estudiantes = new Persona[4];
        for (int i = 0; i < estudiantes.length; i++) {
            estudiantes[i] = serviciosPersona.crearPersona();            
        }
        //Dterminar IMC y esMayor de Edad para cada estudiante
        //Tipificar las variables como double para poder dividirlas luego en el promedio
        int imc = 0;
        double pesoIdeal = 0;
        double sobrepeso = 0;
        double desnutricion = 0;
        double mayorEdad = 0;
        double menorEdad = 0;
        boolean esMayor = false;
        for (Persona estudiante : estudiantes)
        {
            imc = serviciosPersona.calcularIMC(estudiante.getPeso(), estudiante.getAltura());
            switch (imc)
            {
                case 1:
                    System.out.println(estudiante.getNombre()+" está en sobrepeso");
                    sobrepeso++;
                    break;
                case -1:
                    System.out.println(estudiante.getNombre()+" está desnutrido");
                    desnutricion++;
                    break;
                case 0:
                    System.out.println(estudiante.getNombre()+" está en un peso ideal");
                    pesoIdeal++;
                    break;
            }
            esMayor = serviciosPersona.esMayorDeEdad(estudiante.getEdad());
            if (esMayor)
            {
                System.out.println(estudiante.getNombre()+" ¿es mayor de edad? "+ esMayor);
                mayorEdad++;
            }
            else
            {
                System.out.println(estudiante.getNombre()+" ¿es mayor de edad? "+ esMayor);
                menorEdad++;
            }
            //System.out.println(estudiante);
        }
        
        System.out.println("INFORME:\n"
                + "El procentaje de personas con sobrepeso es "+((sobrepeso / estudiantes.length)*100)+"%\n"
                + "El procentaje de personas con desnutrición es "+((desnutricion / estudiantes.length)*100)+"%\n"
                + "El procentaje de personas con peso ideal es "+((pesoIdeal / estudiantes.length)*100)+"%\n"
                + "El porcentaje de mayores de edad son "+((mayorEdad / estudiantes.length)*100)+"%\n"
                + "El porcentaje de menores de edad son "+((menorEdad / estudiantes.length)*100)+"%\n");
        
    }
    
}
