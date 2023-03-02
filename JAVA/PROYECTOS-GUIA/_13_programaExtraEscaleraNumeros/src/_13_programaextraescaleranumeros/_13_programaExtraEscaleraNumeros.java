/*
Crear un programa que dibuje una escalera de números, donde cada línea de números
comience en uno y termine en el número de la línea. Solicitar la altura de la escalera al
usuario al comenzar. Ejemplo: si se ingresa el número 3:
 */
package _13_programaextraescaleranumeros;

//@author MENESES-FLOREZ

import java.util.Scanner;

public class _13_programaExtraEscaleraNumeros {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int altura;
        System.out.println("Ingrese la altura de la escalera:");
        altura = input.nextInt();
        
        //Ciclo externo "i" recorrera hasta la altura indicada por usuario
        for (int i = 0; i <= altura; i++) {
            //pero ciclo interno "j" recorrera tantas veces como valga "i"
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println("");
        }
    }
    
}
