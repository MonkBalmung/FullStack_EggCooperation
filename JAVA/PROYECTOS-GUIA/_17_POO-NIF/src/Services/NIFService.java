/*
 Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
 Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
en mayúscula; por ejemplo: 00395469-F).
 */
package Services;

//@author MENESES-FLOREZ */

import Entities.NIF;
import java.util.Scanner;

public class NIFService
{
    private Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public NIF createObject()
    {
        NIF nif = new NIF();
        
        System.out.print("Ingrese su número de DNI:");
        String dni_String = input.next();
        
        //Método para convertir long a String y comparar longitud de String ingresada con 8
        while (!(dni_String.length() == 8)) {
            System.out.println("Error. El DNI debe contener tan solo 8 números. Ingrese su número de DNI: ");
            dni_String = input.next();
        }
        
        long dni = Integer.parseInt(dni_String);
        nif.setDni(dni);
        
        nif.setLetra(asignarLetra(dni));
        
        return nif;
    }//Fin crearObject()
    
    public char asignarLetra(long dni)
    {
        char letra = 'a';
        
        long resto = dni % 23;
        
        char[] letras = new char[23];
        
        letras[0] = 'T';
        letras[1] = 'R';
        letras[2] = 'W';
        letras[3] = 'A';
        letras[4] = 'G';
        letras[5] = 'M';
        letras[6] = 'Y';
        letras[7] = 'F';
        letras[8] = 'P';
        letras[9] = 'D';
        letras[10] = 'X';
        letras[11] = 'B';
        letras[12] = 'N';
        letras[13] = 'J';
        letras[14] = 'Z';
        letras[15] = 'S';
        letras[16] = 'Q';
        letras[17] = 'V';
        letras[18] = 'H';
        letras[19] = 'L';
        letras[20] = 'C';
        letras[21] = 'K';
        letras[22] = 'E';
        
        for (int i = 0; i < letras.length; i++) {
            if (i == resto) {
                letra = letras[i];
                break;
            }
        }
        
        return letra;
    }//FIN asignarLetra()
    
    public void mostrarNIF(NIF nif)
    {
        System.out.println("NIF: "+nif.getDni()+"-"+nif.getLetra());
    }
}
