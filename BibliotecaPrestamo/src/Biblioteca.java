import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Biblioteca {
    private Map<String, Libro> catalogo;
    private List<Miembro> miembros;
    public Biblioteca() {
        this.catalogo = new HashMap<>();
        this.miembros = new ArrayList<>();
    }
    public void agregarLibro(Libro libro) {
        catalogo.put(libro.getIsbn(), libro);
        System.out.println("Libro agregado al catálogo: " + libro.getTitulo());
    }
    public void registrarMiembro(Miembro miembro) {
        miembros.add(miembro);
        System.out.println("Miembro registrado: " + miembro.getNombre());
    }
    public Libro buscarLibroPorTitulo(String titulo) {
        for (Libro libro : catalogo.values()) {
            if (libro.getTitulo().equalsIgnoreCase(titulo)) {
                return libro;
            }
        }
        System.out.println("Libro no encontrado: " + titulo);
        return null;
    }
    public boolean procesarPrestamo(Libro libro, Miembro miembro) {
        if (libro == null || miembro == null) {
            System.out.println("Error: Libro o miembro no válidos para el préstamo.");
            return false;
        }
        if (miembro.pedirLibro(libro)) {
            System.out.println("PRÉSTAMO EXITOSO: " + libro.getTitulo() + " prestado a " + miembro.getNombre());
            return true;
        }
        System.out.println("Préstamo fallido: El libro ya está prestado.");
        return false;
    }
}