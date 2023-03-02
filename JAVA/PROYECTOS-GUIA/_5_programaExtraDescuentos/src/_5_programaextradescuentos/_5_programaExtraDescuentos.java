/*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de descuento en
todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de descuento
para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre dichos
tratamientos.
o Solicite una letra (carácter) que representa la clase de un socio, y luego un valor
real que represente el costo del tratamiento (previo al descuento) y determine el
importe en efectivo a pagar por dicho socio.
 */
package _5_programaextradescuentos;

//@author MENESES-FLOREZ

import java.util.Scanner;

public class _5_programaExtraDescuentos {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        double valorAPagar = 0.0;
        System.out.println("Ingrese el valor total a pagar:");
        valorAPagar = input.nextDouble();
        
        String categoriaSocio;  
        System.out.println("Ahora ingrese la categoria de socio (A), (B) o (C), según corresponda:");
        categoriaSocio = input.next().toUpperCase();
        while (!(categoriaSocio.equalsIgnoreCase("A") || categoriaSocio.equalsIgnoreCase("B") || categoriaSocio.equalsIgnoreCase("C"))) {
            System.out.println("No ingreso una categoría válida.");
            System.out.println("Ahora ingrese la categoria de socio (A), (B) o (C), según corresponda:");
            categoriaSocio = input.next().toUpperCase();
        } 
        
        Aplicar_Descuento(valorAPagar, categoriaSocio);
    }
    public static void Aplicar_Descuento(double totalAPAgar, String categoria){        
        switch (categoria) {
            case "A":
                totalAPAgar = totalAPAgar - (totalAPAgar * 0.5);
                System.out.println("Por ser socio categoría (" + categoria + ") tiene un 50% de Dcto; el valor a pagar es: $" + totalAPAgar);
                break;
            case "B":
                totalAPAgar = totalAPAgar - (totalAPAgar * 0.35);
                System.out.println("Por ser socio categoría (" + categoria + ") tiene un 35% de Dcto; el valor a pagar es: $" + totalAPAgar);
                break;
            case "C":
                System.out.println("Por ser socio categoría (" + categoria + ") tiene no aplica descuento; el valor a pagar es: $" + totalAPAgar);
                totalAPAgar = totalAPAgar - (totalAPAgar * 0);
                break;
            default:
                System.out.println("No ingreso una categoría válida.");
        }   
            
    }
}
