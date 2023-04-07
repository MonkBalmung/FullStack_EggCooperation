/*
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo
 */
package Services;
import Entities.Mobile;
import java.util.ArrayList;
import java.util.Scanner;

//@author MENESES-FLOREZ */
public class MobileService
{
    private Scanner input = new Scanner(System.in).useDelimiter("\n");
    
    private ArrayList<Mobile> mobileInventory = new ArrayList<>();
    
    private Mobile mobile = new Mobile(); 
    
    public void menu()
    {
        boolean flag = true;
        int opcion = 0;
        
        while (flag) {
        System.out.print("***MÓDULO DE INTRODUCCIÓN DE REGISTRO DE PRODUCTO***\n"
                + "1) Registro de Producto\n"
                + "2) Consulta de Producto por Código\n"
                + "3) Salir\n"
                + "Digite su opción:");
        opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    //this.createObject();
                    this.mobileInventoryList(createObject());
                    break;
                case 2:
                    System.out.println("INVENTARIO");
                    for (Mobile mobiles : mobileInventory)
                    {
                        System.out.println(mobiles);
                    }
                    
                    break;
                case 3:
                    flag = false;
                    break;
            }//Fin switch
        }//Fin while       
    }//Fin menu()
    
    public Mobile createObject()
    {   
        //marca, precio, modelo, memoriaRam, almacenamiento y codigo
        System.out.println("**SUB-MÓDULO REGISTRO DE PRODUCTO**");
        System.out.print("MARCA: ");
        mobile.setMarca(input.next());
        
        System.out.print("PRECIO: ");
        mobile.setPrecio(input.nextFloat());
                
        System.out.print("MODELO: ");
        mobile.setModelo(input.next());
        
        System.out.print("RAM: ");
        mobile.setMemoriaRam(input.nextInt());
               
        System.out.print("MEMORIA: ");
        mobile.setAlmacenamiento(input.nextInt());
               
        this.ingresarCodigo(mobile);
        
        return mobile;
    }//Fin crearObject()
    
    public void ingresarCodigo(Mobile mobile)
    {
        String[] codigo = new String[7];
        
        System.out.println("CODIGO: ");        
        String setCode = input.next();
        
        while (!(setCode.length()==7))
        {
            System.out.print("Error. Código debe tener 7 caracteres. Intente de nuevo: ");  
            setCode = input.next();
        }//Fin while 
       
        for (int i = 0; i < codigo.length; i++)
        {
            codigo[i] = setCode.substring(i, i);                       
        }//Fin for
        
        mobile.setCodigo(codigo);
    }//Fin ingresarCodigo()
    
    public void mobileInventoryList(Mobile mobile)
    {
        mobileInventory.add(mobile);        
        
    }//Fin mobileInventoryList()
    
//    public void mostrarInventario(ArrayList mobileInventory, Mobile mobile)
//    {
//        String code = "";
//        for (int i = 0; i < mobile.getCodigo().length; i++)
//        {
//            code += mobile.getCodigo()[i];
//        }
//        
//        System.out.println("**MÓDULO BUSCAR PRODUCTO POR CÓDIGO**");
//        System.out.print("Ingrese el código del producto: ");
//        //String[] searchCode = new String[7];
//        String searchCode = input.next();        
//        
//        for (int i = 0; i < mobileInventory.size(); i++)
//        {
//            for (int j = 0; j < mobile.getCodigo().length; j++)
//            {
//                if (mobile.getCodigo()[i] == searchCode[j])
//                {
//                    System.out.println(mobile.toString());
//                }else{System.out.println("Mobile no encontrado en inventario.");}
//            }
//        }//Fin for
//    }//Fin mostrarInventario()
}//Fin mobileService
