public class Heroe extends Personaje {
    private int pociones;
    public Heroe(String nombre, int salud, int ataque, int pociones) {
        super(nombre, salud, ataque);
        this.pociones = pociones;
    }
    public boolean usarPocion() {
        if (pociones > 0) {
            this.salud += 20;
            this.pociones--;
            System.out.println(nombre + " usa una poción (+20 HP). Salud total: " + salud);
            return true;
        }
        System.out.println(nombre + " no tiene pociones restantes.");
        return false;
    }

    public int getPociones() {
        return pociones;
    }
}