import java.util.Scanner;
public class CajeroAutomatico {
    private final String idCajero;
    private CuentaBancaria cuentaActual;
    private Banco banco;
    private final Scanner scanner;
    public CajeroAutomatico(String idCajero, Banco banco) {
        this.idCajero = idCajero;
        this.banco = banco;
        this.cuentaActual = null;
        this.scanner = new Scanner(System.in);
        System.out.println("Cajero " + idCajero + " en línea.");
    }

     //Permite al usuario loguearse.@return true si el inicio de sesión fue exitoso.

    public boolean iniciarSesion(String numeroCuenta, String pin) {
        CuentaBancaria cuenta = banco.buscarCuenta(numeroCuenta);

        if (cuenta == null) {
            System.out.println("Error: Número de cuenta no encontrado.");
            return false;
        }

        if (cuenta.verificarPin(pin)) {
            this.cuentaActual = cuenta;
            System.out.println("Bienvenido/a, " + cuentaActual.getTitular() + ".");
            return true;
        } else {
            System.out.println("Error: PIN incorrecto.");
            return false;
        }
    }

    public void cerrarSesion() {
        if (cuentaActual != null) {
            System.out.println("Gracias por usar el Cajero. Sesión de " + cuentaActual.getTitular() + " cerrada.");
            this.cuentaActual = null;
        }
    }

    public void consultarSaldo() {
        if (cuentaActual != null) {
            System.out.printf("Su saldo actual es: $%.2f%n", cuentaActual.getSaldo());
        }
    }

    public void realizarRetiro() {
        if (cuentaActual != null) {
            System.out.print("Ingrese la cantidad a retirar: $");
            if (scanner.hasNextDouble()) {
                double cantidad = scanner.nextDouble();
                cuentaActual.retirar(cantidad);
            } else {
                System.out.println("Entrada inválida.");
                scanner.next(); // Consumir entrada inválida
            }
        }
    }

    public void realizarDeposito() {
        if (cuentaActual != null) {
            System.out.print("Ingrese la cantidad a depositar: $");
            if (scanner.hasNextDouble()) {
                double cantidad = scanner.nextDouble();
                cuentaActual.depositar(cantidad);
            } else {
                System.out.println("Entrada inválida.");
                scanner.next(); // Consumir entrada inválida
            }
        }
    }
    public void mostrarMenu() {
        if (cuentaActual == null) {
            System.out.println("Debe iniciar sesión primero.");
            return;
        }

        int opcion = 0;
        do {
            System.out.println("\n--- Menú Principal ---");
            System.out.println("1. Consultar Saldo");
            System.out.println("2. Realizar Retiro");
            System.out.println("3. Realizar Depósito");
            System.out.println("4. Cerrar Sesión");
            System.out.print("Seleccione una opción: ");

            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                switch (opcion) {
                    case 1:
                        consultarSaldo();
                        break;
                    case 2:
                        realizarRetiro();
                        break;
                    case 3:
                        realizarDeposito();
                        break;
                    case 4:
                        cerrarSesion();
                        break;
                    default:
                        System.out.println("Opción no válida.");
                }
            } else {
                System.out.println("Entrada inválida. Por favor, ingrese un número.");
                scanner.next();
            }
        } while (opcion != 4 && cuentaActual != null);
    }
}