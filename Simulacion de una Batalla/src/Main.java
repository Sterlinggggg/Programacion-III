public class Main{
    public static void main(String[] args) {
        Heroe aragon = new Heroe("Felipito", 100, 15, 2);
        Monstruo orco = new Monstruo("Petete", 80, 12, "Asesino del Bosque");

        Juego batalla = new Juego();
        batalla.iniciarBatalla(aragon, orco);
    }
}