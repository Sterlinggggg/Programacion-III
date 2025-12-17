public class Juego {

    public void iniciarBatalla(Heroe heroe, Monstruo monstruo) {
        System.out.println("\n--- INICIO DE BATALLA: " + heroe.getNombre() + " vs " + monstruo.getNombre() + " ---");
        int turno = 1;
        while (heroe.estaVivo() && monstruo.estaVivo()) {
            System.out.println("\n*** Turno " + turno + " ***");

            if (heroe.getSalud() < 40 && heroe.getPociones() > 0) {
                heroe.usarPocion();
            } else {
                heroe.atacar(monstruo);
            }
            if (!monstruo.estaVivo()) {
                break;
            }
            monstruo.atacar(heroe);
            turno++;
        }

        System.out.println("\n--- BATALLA TERMINADA ---");
        if (heroe.estaVivo()) {
            System.out.println("¡Victoria! " + heroe.getNombre() + " ha derrotado a petete.");
        } else {
            System.out.println("Perdiste palomo... " + heroe.getNombre() + " ha caído.");
        }
    }
}