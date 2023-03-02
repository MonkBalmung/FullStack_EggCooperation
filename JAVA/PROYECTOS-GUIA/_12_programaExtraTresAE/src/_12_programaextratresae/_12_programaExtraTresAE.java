/*
Necesitamos mostrar un contador con 3 dígitos (X-X-X), que muestre los números del 0-
0-0 al 9-9-9, con la particularidad que cada vez que aparezca un 3 lo sustituya por una E.
Ejemplo:
0-0-0
0-0-1
0-0-2
0-0-E
0-0-4
0-1-2
0-1-E
Nota: investigar función equals() y como convertir números a String.
 */
package _12_programaextratresae;

//@author MENESES-FLOREZ
public class _12_programaExtraTresAE {

    public static void main(String[] args) {
        int limite = 10;
        String string_I, string_J, string_K;
        
        //Vamos a generar la cadena a través de iteraciones for
        for (int i = 0; i < limite; i++) {
            //Convertimos TODOS los valores enteros de i a cadena
            string_I = String.valueOf(i);
            //Condicionamos a que cuando i (string_I) valga 3 ("3") se imprima "E".
            if (string_I.equalsIgnoreCase("3")) {
                string_I = "E";
            }
            for (int j = 0; j < limite; j++) {
                //Convertimos TODOS los valores enteros de j a cadena
                string_J = String.valueOf(j);
                //Condicionamos a que cuando j (string_J) valga 3 ("3") se imprima "E".
                if (string_J.equalsIgnoreCase("3")) {
                    string_J = "E";
                }
                for (int k = 0; k < limite; k++) {
                    //Convertimos TODOS los valores enteros de k a cadena
                    string_K = String.valueOf(k);
                    //Condicionamos a que cuando k (string_K) valga 3 ("3") se imprima "E".
                    if (string_K.equalsIgnoreCase("3")) {
                        string_K = "E";
                    }
                    System.out.println(string_I+"-"+string_J+"-"+string_K);
                }
                                        
            }
        }
    }
}
    

