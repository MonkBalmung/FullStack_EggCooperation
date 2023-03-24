/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
20.
 */
package _10_poo.arrays;
import Entities.Array;
//
//(@author MENESES-FLOREZ
public class _10_POOArrays
{
    public static void main(String[] args)
    {
        float[] arrayA = new float[50];
        float[] arrayB = new float[20];
        
        System.out.println("ARREGLO A:");
        for (int i = 0; i < 50; i++) {
            arrayA[i] = (float)(Math.random()*10);
            System.out.print("["+arrayA[i]+"] ");
        }
        System.out.println("");
        //Arrays.sort(a);
        System.out.println("ARREGLO A ORDENADO:");
        float varMax = 0.0f;
        float varMin = 0.0f;
        int flag = 0;
        do{
            flag = 0;
            for (int i = 0; i < arrayA.length; i++)
            {
                if (i == 0)
                {
                    varMax = (float) (Math.max(arrayA[i], arrayA[i]));
                    varMin = (float) (Math.min(arrayA[i], arrayA[i]));
                }
                else if (arrayA[i] < varMin)
                {
                        varMin = arrayA[i]; 
                        varMax = arrayA[i-1];
                        arrayA[i-1] = varMin;
                        arrayA[i] = varMax;
                } 
                else
                {
                    varMax = arrayA[i];
                    varMin = arrayA[i];
                    flag++;
                }                
            }            
        }while(!(flag == 50-1));
        
        for (int i = 0; i < arrayA.length; i++) {
            System.out.print("["+arrayA[i]+"] ");
        }
        System.out.println("");
        //System.arraycopy(a, 0, b, 0, 10);
        System.out.println("ARREGLO B:");
        for (int i = 0; i < arrayB.length; i++) {
            //Arrays.fill(b, 10, 20, 0.5);
            if (i < 10) {
                arrayB[i] = arrayA[i];
            }else{arrayB[i] = 0.5f;}
            System.out.print("["+arrayB[i]+"] ");
        }
    }
    
}
