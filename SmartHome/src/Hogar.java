import java.util.ArrayList;
import java.util.List;
public class Hogar {
    private List<DispositivoInteligente> dispositivos;
    public Hogar() {
        this.dispositivos = new ArrayList<>();
    }
    public void agregarDispositivo(DispositivoInteligente dispositivo) {
        this.dispositivos.add(dispositivo);
        System.out.println(dispositivo.getNombre() + " agregado al sistema del Hogar.");
    }
    public void encenderTodasLasLuces() {
        System.out.println("\n--- Encendiendo todas las luces mi lider... ---");
        for (DispositivoInteligente d : dispositivos) {
            // Usamos 'instanceof' para identificar qué tipo de dispositivo es
            if (d instanceof LuzInteligente) {
                d.encender();
            }
        }
    }

    public void apagarTodo() {
        System.out.println("\n--- Apagando todos los dispositivos mi lider... ---");
        for (DispositivoInteligente d : dispositivos) {
            d.apagar();
        }
    }

    public void establecerModoNoche() {
        System.out.println("\n--- Estableciendo MODO NOCHE: Apagando luces y ajustando termostatos. ---");

        for (DispositivoInteligente d : dispositivos) {
            if (d instanceof LuzInteligente) {
                ((LuzInteligente) d).apagarParaNoche();
            }
            else if (d instanceof TermostatoInteligente) {
                ((TermostatoInteligente) d).establecerModoNoche();
            }
        }
    }
    public void mostrarTodosLosEstados() {
        System.out.println("\n--- ESTADO DE TODOS LOS DISPOSITIVOS ---");
        for (DispositivoInteligente d : dispositivos) {
            d.mostrarEstado();
        }
    }
}