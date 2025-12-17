public class Monstruo extends Personaje {
    private String tipo;
    public Monstruo(String nombre, int salud, int ataque, String tipo) {
        super(nombre, salud, ataque);
        this.tipo = tipo;
        System.out.println("Aparece un " + tipo + " llamado " + nombre + "!");
    }
    public String getTipo() {
        return tipo;
    }
}