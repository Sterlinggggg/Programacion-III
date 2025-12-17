public abstract class DispositivoInteligente {
    protected String nombre;
    protected boolean estaEncendido;

    public DispositivoInteligente(String nombre) {
        this.nombre = nombre;
        this.estaEncendido = false; // Por defecto, apagado
    }
    public abstract void encender();
    public void apagar() {
        this.estaEncendido = false;
        System.out.println(nombre + " APAGADO.");
    }
    public abstract void mostrarEstado();
    public String getNombre() { return nombre; }
    public boolean isEstaEncendido() { return estaEncendido; }
}