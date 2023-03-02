/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y los
muestre por pantalla en orden descendente.
 */
package _14_programavector100n;

//@author MENESES-FLOREZ
public class _14_programaVector100N {

    public static void main(String[] args) {
        
        ShowVector(FulfillVector()); 
        
    }
    public static int[] FulfillVector(){
        int[] vector =  new int[100];        
        for (int i = 0; i < 100; i++) {
            vector[i] = i;
        }     
        return vector;
    }
    public static void ShowVector(int[] vector){
        for (int i = 99; i >= 0; i--) {
            System.out.println("Valor: "+vector[i]+" en subindice: "+i);
        }    
    }
}
