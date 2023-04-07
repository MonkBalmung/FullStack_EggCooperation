/*
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación, declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo,
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto. Si el
usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar adivinar
el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
¡Ha acertado!
 */
package Services;

//@author MENESES-FLOREZ */

import Entities.Mes;
import java.util.Scanner;

public class MesService
{
    private Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public Mes createObject()
    {
        Mes mes = new Mes();
        
        String[] mesesDelAnio = new String[12];
        
        for (int i = 0; i < mesesDelAnio.length; i++)
        {
            switch (i)
            {
                case 0:
                    mesesDelAnio[i] = "enero";
                    break;
                case 1:
                    mesesDelAnio[i] = "febrero";
                    break;
                case 2:
                    mesesDelAnio[i] = "marzo";
                    break;
                case 3:
                    mesesDelAnio[i] = "abril";
                    break;
                case 4:
                    mesesDelAnio[i] = "mayo";
                    break;
                case 5:
                    mesesDelAnio[i] = "junio";
                    break;
                case 6:
                    mesesDelAnio[i] = "julio";
                    break;
                case 7:
                    mesesDelAnio[i] = "agosto";
                    break;
                case 8:
                    mesesDelAnio[i] = "septiembre";
                    break;
                case 9:
                    mesesDelAnio[i] = "octubre";
                    break;
                case 10:
                    mesesDelAnio[i] = "noviembre";
                    break;
                case 11:
                    mesesDelAnio[i] = "diciembre";
                    break;
            }
        }
        
        int azar = (int)(Math.round(Math.random()*10));
        
        for (int i = 0; i < mesesDelAnio.length; i++)
        {
            if (i == azar)
            {
                mes.setMesSecreto(mesesDelAnio[i]);
            }
            //System.out.println(mesesDelAnio[i]);
        }
        
        return mes;
    }//Fin createObject()
    
    public void adivinarMes(Mes mes)
    {
        int contadorIntentos = 0;
        String adivinaMes;        
        
        contadorIntentos++;
        System.out.println("Ingrese un mes a adivinar (Turno " + contadorIntentos+")");
        adivinaMes = input.next();
        
        while (!(adivinaMes.equalsIgnoreCase(mes.getMesSecreto())) || contadorIntentos < 5)
        {
            if (contadorIntentos == 5)
            {
                System.out.println("Los sentimos! Se han agotado tus turnos");
                break;
            }else if (adivinaMes.equalsIgnoreCase(mes.getMesSecreto()))
            {            
                System.out.println("Has adivinado!"); 
                break;                
            }else
            {
                System.out.println("¡Nope! Intenta de nuevo (Turno " + (contadorIntentos + 1)+")");
                adivinaMes = input.next();
                contadorIntentos++;
            }//Fin if             
        }//Fin while               
    }//Fin adivinaMes()
}
