/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
 */
package Entidades;

//@author MENESES-FLOREZ
public class Cuenta 
{
    //Atributos
    private int numeroCuenta;
    private long clienteDNI;
    private double saldoActual;
    
    //Constructores
    public Cuenta() {}
    public Cuenta(int numeroCuenta, long clienteDNI, int saldoActual)
    {
        this.numeroCuenta = numeroCuenta;
        this.clienteDNI = clienteDNI;
        this.saldoActual = saldoActual;
    }
    
    //Getter & Setters
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setClienteDNI(long clienteDNI) {
        this.clienteDNI = clienteDNI;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getClienteDNI() {
        return clienteDNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    //ToString
    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", clienteDNI=" + clienteDNI + ", saldoActual=" + saldoActual + '}';
    }
}
