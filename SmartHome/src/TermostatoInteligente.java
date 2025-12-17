public class TermostatoInteligente extends DispositivoInteligente {
    private double temperaturaActual;
    private double temperaturaObjetivo;
    public TermostatoInteligente(String nombre, double temperaturaActual) {
        super(nombre);
        this.temperaturaActual = temperaturaActual;
        this.temperaturaObjetivo = 22.0;
    }
    @Override
    public void encender() {
        this.estaEncendido = true;
        System.out.println(nombre + " ACTIVADO. Temperatura Objetivo: " + temperaturaObjetivo + "°C");
    }
    public void fijarTemperatura(double grados) {
        if (estaEncendido) {
            this.temperaturaObjetivo = grados;
            System.out.println(nombre + " ajustado a: " + grados + "°C");
        } else {
            System.out.println(nombre + " debe estar encendido para fijar la temperatura.");
        }
    }

    public void establecerModoNoche() {
        if (!estaEncendido) {
            this.encender();
        }
        fijarTemperatura(18.0); // Temperatura de ahorro/noche
    }
    @Override
    public void mostrarEstado() {
        String estado = estaEncendido ? "ACTIVO" : "INACTIVO";
        System.out.printf("%s [Estado: %s, Actual: %.1f°C, Objetivo: %.1f°C]%n",
                nombre, estado, temperaturaActual, temperaturaObjetivo);
    }
}