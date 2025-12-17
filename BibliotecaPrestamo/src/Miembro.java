import java.util.ArrayList;
import java.util.List;

public class Miembro {
    private String nombre;
    private int idMiembro;
    private List<Libro> librosPrestados;

    public Miembro(String nombre, int idMiembro) {
        this.nombre = nombre;
        this.idMiembro = idMiembro;
        this.librosPrestados = new ArrayList<>();
    }

    // Intenta tomar un libro, si está disponible, lo añade a su lista

    public boolean pedirLibro(Libro libro) {
        if (libro.prestar()) {
//      ^--- Se eliminó el caracter `/` aquí.
            librosPrestados.add(libro);
            return true;
        }
        return false;
    }

    // Devuelve un libro, si lo tenía prestado, lo remueve de su lista

    public boolean devolverLibro(Libro libro) {
        if (librosPrestados.remove(libro)) {
            libro.devolver(); // Llama al método devolver del objeto Libro
            return true;
        }
        return false;
    }
    public int getIdMiembro() { return idMiembro; }
    public String getNombre() { return nombre; }
    public void mostrarLibros() {
        System.out.println("Libros prestados a " + nombre + ":");
        if (librosPrestados.isEmpty()) {
            System.out.println("  Ningún libro actualmente.");
        } else {
            for (Libro libro : librosPrestados) {
                System.out.println("  - " + libro.getTitulo());
            }
        }
    }
}