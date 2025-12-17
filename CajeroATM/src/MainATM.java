public class MainATM {
    public static void main(String[] args) {
        Banco bancoCentral = new Banco("Banco Central de Java");
        CuentaBancaria cuentaAna = new CuentaBancaria("1001", "Ana Pérez", 500.00, "1234");
        CuentaBancaria cuentaLuis = new CuentaBancaria("2002", "Luis Gómez", 1250.75, "4321");
        bancoCentral.agregarCuenta(cuentaAna);
        bancoCentral.agregarCuenta(cuentaLuis);
        CajeroAutomatico atm = new CajeroAutomatico("ATM-001", bancoCentral);
        atm.iniciarSesion("1001", "0000");
        System.out.println("\n--- Inicio de Sesión Correcto ---");
        if (atm.iniciarSesion("1001", "1234")) {
            atm.mostrarMenu(); // Inicia el bucle de menú interactivo
        }

        // Nota: En un entorno real, el escáner se cerraría o gestionaría cuidadosamente.
        // Aquí, la simulación terminará después de que el usuario seleccione "4. Cerrar Sesión".
    }
}