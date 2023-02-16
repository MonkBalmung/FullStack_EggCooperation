//@author MENESES-FLOREZ
package javaintroexercises;
import java.util.Scanner;

/*Los paquetes son contenedores de clases 
y su función es la de organizar la distribución de las clases.*/
public class JavaIntroExercises {
//Clase: las clases sirven para MODELAR los objetos que serán utilizados por nuestros programas.
    public static void main(String[] args) {
       //Metodo donde se escriben las sentencias a ejecutar
        //Un método es una secuencia de sentencias ejecutables
        
        //Primitive Data types  
        byte quiteSmallNumb = 8;
        short smallNumb = 16;
        int num = 1000;
        long masiveNumber = 235678768;
        float floatNumb = 9.567f;//Todos los tipos float necesitan la letra 'f' al final 
        double pi = 3.4526;  
        boolean bandera = true;
        char caracter = 'B';
        String cadena = "Cadena de caracteres";//String es una clase 
        
        System.out.println("Hello World");
        System.out.println("Tipo byte: " + quiteSmallNumb);
        System.out.println("Tipo short: " + smallNumb);
        System.out.println("Tipo int: " + num);
        System.out.println("Tipo long: " + masiveNumber);
        System.out.println("Tipo float: " + floatNumb);
        System.out.println("Tipo double: " + pi);   
        System.out.println("Tipo boolean: " + bandera);
        System.out.println("Tipo character: " + caracter);  
        System.out.println("Tipo byte: " + cadena);
        
       /* Implementar un programa que le pida dos números enteros 
        a usuario y determine si ambos o alguno de ellos es mayor a 25.*/
        
       Scanner leer = new Scanner(System.in);
       System.out.println("Ingrese dos números enteros");
       System.out.println("Ingrese un primer numero");
       int num1 = leer.nextInt();
       System.out.println("Ingrese un segundo numero");
       int num2 =leer.nextInt();
       
       if ((num1 > 25) || (num2 > 25)) {
            System.out.println("Uno o ambos nnumeros son mayores a 25");            
        }else{
           System.out.println("Ningun numero es mayor a 25");
        }
    }   
}