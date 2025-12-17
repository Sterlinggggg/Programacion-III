import java.util.HashMap;
import java.util.Map;
public class Banco {
    private String nombreBanco;
    private Map<String, CuentaBancaria> cuentas;
    public Banco(String nombreBanco) {
        this.nombreBanco = nombreBanco;
        this.cuentas = new HashMap<>();
    }
    public void agregarCuenta(CuentaBancaria cuenta) {
        cuentas.put(cuenta.getNumeroCuenta(), cuenta);
        System.out.println("Cuenta de " + cuenta.getTitular() + " agregada al " + nombreBanco + ".");
    }
    // Busca y retorna la cuenta por su número.
    public CuentaBancaria buscarCuenta(String numeroCuenta) {
        return cuentas.get(numeroCuenta);
    }
}