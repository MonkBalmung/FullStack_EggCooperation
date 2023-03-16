/*
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
package Servicios;
import Entidades.Persona;
import java.util.Scanner;

//@author MENESES-FLOREZ
public class PersonaServicios
{
    private Scanner input =  new Scanner(System.in).useDelimiter("\n");
    
    public Persona crearPersona()
    {
        Persona persona = new Persona();
        
        System.out.println("***MÓDULO DE INGRESO DE DATOS DE ESTUDIANTE***");
        System.out.print("NOMBRE: ");
        persona.setNombre(input.nextLine());
        
        System.out.print("EDAD: ");
        persona.setEdad(input.nextInt());
        
        System.out.print("SEXO ('H' Hombre/'M' Mujer/'O' Otro): ");
        persona.setSexo(input.next().toUpperCase().charAt(0));
        
        char sexo = persona.getSexo();
        
        while (!( sexo == 'H' || sexo == 'M' || sexo == 'O')) {
            System.out.print("Por favor ingrese sólo una de las siguientes opciones: ('H' Hombre/'M' Mujer/'O' Otro: ");
            persona.setSexo(input.next().toUpperCase().charAt(0));
            sexo = persona.getSexo();
        }
 
        System.out.print("PESO: ");
        persona.setPeso(input.nextFloat());
        
        System.out.print("ESTATURA: ");
        persona.setAltura(input.nextFloat());      
        input.nextLine();        
        
        return persona;
    }
    
    public int calcularIMC(float peso, float altura)
    {
        int indice;
        double imc;
        imc = peso / Math.pow(altura, 2);
        
        if (imc < 20)
        {
            indice = -1;
        }
        else if (imc >= 20 && imc<= 25)
        {
            indice = 0;
        }
        else
        {
            indice = 1;
        }
        return indice;
    }
    
    public boolean esMayorDeEdad(int edad)
    {
        boolean esMayor = false;
        
        if (edad > 18)
        {
            esMayor = true;
        }
        
        return esMayor;
    }
}
