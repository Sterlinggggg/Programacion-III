public class Personaje {
    protected String nombre;
    protected int salud;
    protected int ataque;

    public Personaje(String nombre, int salud, int ataque) {
        this.nombre = nombre;
        this.salud = salud;
        this.ataque = ataque;
    }

    public void atacar(Personaje enemigo) {
        System.out.println(nombre + " ataca a " + enemigo.nombre + " con " + ataque + " de daño.");
        enemigo.recibirDanio(this.ataque);
    }

    public void recibirDanio(int cantidad) {
        this.salud -= cantidad;
        // La salud nunca debe ser menor que cero
        System.out.println(nombre + " recibe " + cantidad + " de daño. Salud restante: " + Math.max(0, salud));
    }
    public boolean estaVivo() {
        return salud > 0;
    }

    public int getSalud() {
        return salud;
    }
    public String getNombre() {
        return nombre;
    }
}