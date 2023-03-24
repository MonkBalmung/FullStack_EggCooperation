/*
Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.
 */
package Servicios;
import Entidades.Cadena;

//@author MENESES-FLOREZ
public class CadenaServicios
{   //metodo crearObjeto es imprescindible para no estar instanciando en el main la clase por cada objeto. Solo se llama al Service
    //public Cadena crearCadena(){}
    public void mostrarVocales(String frase)
    {
        int contadorVocales = 0;
        for (int i = 0; i < frase.length(); i++)
        {
            if (frase.charAt(i) == 'a'
                    || frase.charAt(i) == 'e'
                    || frase.charAt(i) == 'i'
                    || frase.charAt(i) == 'o'
                    || frase.charAt(i) == 'u') {
                contadorVocales++;
            }
        }
        System.out.println("La cantidad de vocales de la frase ingresada es "+contadorVocales);
    }//Fin método mostrarVocales
    
    public void invertirFrase(Cadena cadena)
    {
        String frase = cadena.getFrase();
        for (int i = (frase.length()-1); i >= 0; i--)
        {
            System.out.print(frase.charAt(i));
        }
        System.out.println("");
    }//Fin método invertirFrase
    public void vecesRepetido(char letra, String frase)
    {
        int contador = 0;
        for (int i = 0; i < frase.length(); i++)
        {
            if (frase.charAt(i) == letra) {
                contador++;
            }
        }
        //Formatted String %s String %d Int %c Char %b Boolean %f Double
        String formattedString = String.format("La letra %c se repite %d veces.", letra, contador);
        System.out.println(formattedString);
    }//Fin método vecesRepetido
    public void compararLongitud(String frase, Cadena cadena)
    {
        if (frase.length() == cadena.getFraseLength())
        {
            System.out.println("Ambas cadenas son de igual longitud");
        }
        else
        {
            System.out.println("Las cadenas difieren en longitud");
        }
    }//Fin método compararLongitud
    public String unirFrases(String frase, Cadena cadena)
    {
        frase = frase.concat(" "+cadena.getFrase());
        
        return frase;
    }//Fin método unirFrases
    public void reemplazarLetra(char letra, Cadena cadena)
    {
        String frase = cadena.getFrase();
        /*
        https://www.geeksforgeeks.org/replace-a-character-at-a-specific-index-in-a-string-in-java/
        */
        StringBuilder newString = new StringBuilder(frase); //replace(char oldChar, char newChar) return String;
        for (int i = 0; i < frase.length(); i++)
        {
            if (frase.charAt(i) == 'a')
            {
              newString.setCharAt(i, letra);
            }
        }
        System.out.println("La frase queda: \""+newString+"\"");
    }//Fin método reemplazar
    public boolean contieneLetra(String letra, Cadena cadena)//contains(CharSequence s)
    {
        //boolean isItContained = false;
        
        String frase = cadena.getFrase();       
        
//        for (int i = 0; i < frase.length(); i++)
//        {
//            if (frase.charAt(i) == letra)
//            {
//              isItContained = true;
//            }
//        }
        return frase.contains(letra);
    }//Fin método contiene
}//Fin Class CadenaServicios