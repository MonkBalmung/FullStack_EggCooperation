/*
Desarrollar una clase Cancion con los siguientes atributos: titulo y autor. Se deberá́
definir además dos constructores: uno vacío que inicializa el titulo y el autor a cadenas
vacías y otro que reciba como parámetros el titulo y el autor de la canción. Se deberán
además definir los métodos getters y setters correspondientes.
 */
package _15_poo.cancion;

//@author MENESES-FLOREZ */

import Entities.Cancion;

public class _15_POOCancion
{
    public static void main(String[] args)
    {
        Cancion cancion = new Cancion("Californication", "Red Hot Chilli Peppers");
        
        System.out.println(cancion.toString());
    }
    
}
