public class MainBiblioteca {
    public static void main(String[] args) {
        Biblioteca biblio = new Biblioteca();
        Libro l1 = new Libro("Cien Años de Soledad", "G.G. Márquez", "978-1");
        Libro l2 = new Libro("1984", "George Orwell", "978-2");
        Miembro m1 = new Miembro("Ana López", 1001);
        biblio.agregarLibro(l1);
        biblio.agregarLibro(l2);
        biblio.registrarMiembro(m1);
        System.out.println("\n--- SIMULACIÓN DE PRÉSTAMOS ---");

        Libro libroBuscado = biblio.buscarLibroPorTitulo("1984");
        biblio.procesarPrestamo(libroBuscado, m1);
        m1.mostrarLibros();
        biblio.procesarPrestamo(libroBuscado, m1);
        System.out.println("\n--- SIMULACIÓN DE DEVOLUCIÓN ---");
        if (m1.devolverLibro(libroBuscado)) {
            System.out.println("DEVOLUCIÓN EXITOSA: " + libroBuscado.getTitulo() + " devuelto.");
        }
        m1.mostrarLibros();
        System.out.println("Estado de 1984: Prestado? " + libroBuscado.isEstaPrestado());
    }
}