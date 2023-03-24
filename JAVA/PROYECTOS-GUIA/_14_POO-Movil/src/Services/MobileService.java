/*
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo
 */
package Services;
import Entities.Mobile;
import java.util.Scanner;

//@author MENESES-FLOREZ */
public class MobileService
{
    private Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    public void menu()
    {
        boolean flag = true;
        int opcion = 0;
        
        while (flag) {
        System.out.print("***MÓDULO DE INTRODUCCIÓN DE REGISTRO DE PRODUCTO - Inventario***\n"
                + "1) Registro de Producto"
                + "2) Consulta de Producto por Código"
                + "3) Salir"
                + "Digite su opción:");
        opcion = input.nextInt();
        }//Fin while
        switch (opcion) {
            case 1:
                this.createObject();
                break;
            case 2:
                
                break;
            case 3:
                flag = false;
                break;            
        }//Fin switch
    }//Fin menu()
    
    public Mobile createObject()
    {
        
        Mobile mobile = new Mobile();    
        
        //marca, precio, modelo, memoriaRam, almacenamiento y codigo
        System.out.print("MARCA: ");
        mobile.setMarca(input.nextLine());
        
        System.out.print("PRECIO: ");
        mobile.setPrecio(input.nextFloat());
        input.nextLine();
        
        System.out.print("MODELO: ");
        mobile.setModelo(input.nextLine());
        
        System.out.print("RAM: ");
        mobile.setMemoriaRam(input.nextInt());
        input.nextLine();
        
        System.out.print("MEMORIA: ");
        mobile.setAlmacenamiento(input.nextInt());
        input.nextLine();
        
        this.ingresarCodigo(mobile);
        
        return mobile;
    }//Fin crearObject()
    
    public void ingresarCodigo(Mobile mobile)
    {
        System.out.println("CODIGO: ");
            String[] codigo = new String[7];
        for (int i = 0; i < codigo.length; i++)
        {
            codigo[i] = input.nextLine();
            while (codigo[i].length() != 7)
            {
                System.out.print("Error. Código debe tener 7 caracteres. Intente de nuevo: ");
                codigo[i] = input.nextLine();
            }//Fin while            
        }//Fin for
        mobile.setCodigo(codigo);
    }//Fin ingresarCodigo()
    public void mostrarInventario(Mobile mobile)
    {
        String[] codigo = mobile.getCodigo();
        
        System.out.println("Ingrese el código del producto: ");
        String codigoMobile = input.nextLine();
        
        for (int i = 0; i < codigo.length; i++)
        {
            if (codigo[i].equals(codigoMobile))
            {
                System.out.println(mobile.toString());
            }//Fin if
        }//Fin for
    }//Fin mostrarInventario()
}//Fin mobileService
