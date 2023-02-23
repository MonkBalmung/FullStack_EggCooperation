/*
OBJETIVO DEL PROGRAMA:
Dada una cantidad de grados centígrados se debe mostrar su equivalente en grados
Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5).
 */
package _4_programaconversortemp;

//@author MENESES-FLOREZ

import java.util.Scanner;

public class _4_programaConversorTemp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        char scale;
        float temperature;
        System.out.println("***PROGRAMA CONVERSOR DE TEMPERATURA***");
        System.out.println("Indique por favor si la temperatura a ingresar está dada en grados (F)Fahrenheit o (C)Celsius:");
        scale = input.next().toUpperCase().charAt(0);
        
        switch (scale) {
            case 'F':
                System.out.println("Ingrese la temperatura en escala Fahrenheit: ");
                temperature = input.nextFloat();
                temperature = ConversorACelsius(temperature);
                System.out.println("En escala Celsius los grados son: "+temperature+"°C");
                break;
            case 'C':
                System.out.println("Ingrese la temperatura en escala Celsius: ");
                temperature = input.nextFloat();
                temperature = ConversorAFahrenheit(temperature);
                System.out.println("En escala Fahrenheit los grados son: "+temperature+"°F");
                break;
            default:
                //throw new AssertionError();
        }
        
    }
    public static float ConversorAFahrenheit(float temperature){
        float fahrenheit = 32 + (9/5 * (temperature));
        return fahrenheit;
    }
    
     public static float ConversorACelsius(float temperature){
         float celsius = (temperature - 32) * 5/9;
        return celsius;
    }
}
