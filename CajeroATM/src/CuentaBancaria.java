public class CuentaBancaria {
    private String numeroCuenta;
    private String titular;
    private double saldo;
    private String pin;
    public CuentaBancaria(String numeroCuenta, String titular, double saldo, String pin) {
        this.numeroCuenta = numeroCuenta;
        this.titular = titular;
        this.saldo = saldo;
        this.pin = pin;
    }
     //Verifica si el PIN ingresado coincide con el PIN de la cuenta.
    public boolean verificarPin(String pinIngresado) {
        return this.pin.equals(pinIngresado);
    }

     //Incrementa el saldo de la cuenta.
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            this.saldo += cantidad;
            System.out.printf("Depósito exitoso. Nuevo saldo: $%.2f%n", this.saldo);
        } else {
            System.out.println("Error: La cantidad a depositar debe ser positiva.");
        }
    }
      //Disminuye el saldo si hay fondos suficientes. @return true si el retiro fue exitoso, false si no hay fondos.
    public boolean retirar(double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad a retirar debe ser positiva.");
            return false;
        }
        if (this.saldo >= cantidad) {
            this.saldo -= cantidad;
            System.out.printf("Retiro exitoso. Saldo restante: $%.2f%n", this.saldo);
            return true;
        } else {
            System.out.println("Error: Fondos insuficientes.");
            return false;
        }
    }
    public double getSaldo() {
        return saldo;
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public String getTitular() {
        return titular;
    }
}