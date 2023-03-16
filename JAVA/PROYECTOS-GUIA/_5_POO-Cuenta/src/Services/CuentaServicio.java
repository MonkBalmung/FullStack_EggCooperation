/*
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Services;
//Importamos la clase "madre"
import Entidades.Cuenta;
import java.util.Scanner;

//@author MENESES-FLOREZ
public class CuentaServicio
{
    Scanner input = new Scanner(System.in);
    private Cuenta cuenta = new Cuenta();
    //private CuentaServicio cuentaService = new CuentaServicio();
    
    public void menu()
    {        
        //CuentaServicio cuentaService = new CuentaServicio();
        //En vez de instanciar el objeto de la misma clase en la clase, podemos usar el "this."
        int opcion;
        boolean flag = true;
        while (flag)
        {
        do {
            System.out.print("BIENVENIDO A SU *** BANCO *** ELIGA SU TRANSACCIÓN:\n"
                    + "1) CREAR CUENTA\n"
                    + "2) CONSIGANCIÓN\n"
                    + "3) RETIRO\n"
                    + "4) RETIRO RÁPIDO\n"
                    + "5) CONSULTA DE SALDO\n"
                    + "6) CONSULTA DE DATOS\n"
                    + "7) SALIR\n"
                    + "Ingrese opción:");
            opcion = input.nextInt(); 
            if (opcion <1 || opcion > 7) {
                System.out.println("Ha ingresado una opción inválida. Intente de nuevo:");
            }
        } while (opcion <1 || opcion > 7);  
        switch (opcion) {
            case 1:
                this.crearCuenta();
                break;
            case 2:
                this.ingresarDinero(cuenta);
                break;
            case 3:
                this.retirarDinero(cuenta);
                break;
            case 4:
                this.extraccionRapida(cuenta);
                break;
            case 5:
                this.consultaSaldo(cuenta);
                break;
            case 6:
                this.consultaDatos(cuenta);
                break;
            case 7:
                flag = false;
                break;
            }
        }       
    }
    public void crearCuenta()
    {       
        cuenta.setSaldoActual(0);
        System.out.println("*** MÓDULO APERTURA DE CUENTA ***");
        System.out.println("Ingrese por favor su Número de Identificación Personal:");
        cuenta.setClienteDNI(input.nextLong());
        
        System.out.println("Ingrese por favor su número de cuenta, sin guiones:");
        cuenta.setNumeroCuenta(input.nextInt());        
        
        
    }
    public void ingresarDinero(Cuenta cuenta)
    {
        System.out.println("Ingrese el monto a consignar en la cuenta ["+cuenta.getNumeroCuenta()+"]");
        cuenta.setSaldoActual(cuenta.getSaldoActual()+input.nextDouble());
    }
    public void retirarDinero(Cuenta cuenta)
    {
        double retiro, saldoActual;
        saldoActual = cuenta.getSaldoActual();
        System.out.println("Ingrese el monto a retirar en la cuenta ["+cuenta.getNumeroCuenta()+"]");
        retiro = input.nextDouble();
        saldoActual -= retiro;
        if ( saldoActual < 0 )
        {
            System.out.println("NO TIENE FONDOS SUFICIENTES saldo:$"+cuenta.getSaldoActual());
        }
        else
        {
            System.out.println("Entregando el monto $" + retiro);
            cuenta.setSaldoActual(saldoActual);
        }
        
    }
    public void extraccionRapida(Cuenta cuenta)
    {
        double retiro, saldoActual;
        char opcion;
        saldoActual = cuenta.getSaldoActual();
        System.out.println("'Extracción Rápida' le permite tomar el 20% del saldo actual ("+cuenta.getSaldoActual()+") de la cuenta #[" + cuenta.getNumeroCuenta() + "]");
        System.out.println("¿Desea proceder? S/N");
        opcion = input.next().toUpperCase().charAt(0);
        if (opcion == 'S') {
            retiro = saldoActual * 0.20;
            System.out.println("El monto a entregar es $"+retiro+". ¿Desea constinuar? S/N");
            opcion = input.next().toUpperCase().charAt(0);
            if (opcion == 'S') {
                saldoActual -= retiro;
                System.out.println("Entregando el monto $" + retiro);
                cuenta.setSaldoActual(saldoActual);
            }
            else
            {
                System.out.println("VUELTA EL MENÚ PRINCIPAL");
            }            
        }
        
        
    }
    public void consultaSaldo(Cuenta cuenta)
    {
        System.out.println("El saldo actual de la cuenta ["+cuenta.getNumeroCuenta()+"] es: $"+cuenta.getSaldoActual());
    }
    public void consultaDatos(Cuenta cuenta)
    {
        System.out.println("Número de Cuenta: "+cuenta.getNumeroCuenta()+", cuentahabiente DNI: "+cuenta.getClienteDNI());
    }
}
