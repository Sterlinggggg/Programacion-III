public class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean estaPrestado;
    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.estaPrestado = false;
    }

     //Marca el libro como prestado si no lo está ya. @return true si el préstamo fue exitoso, false si ya estaba prestado.

    public boolean prestar() {
        if (!this.estaPrestado) {
            this.estaPrestado = true;
            return true;
        }
        return false;
    }

      //Marca el libro como disponible si estaba prestado. @return true si la devolución fue exitosa, false si ya estaba disponible.

    public boolean devolver() {
        if (this.estaPrestado) {
            this.estaPrestado = false;
            return true;
        }
        return false;
    }

    public String getTitulo() { return titulo; }
    public String getIsbn() { return isbn; }
    public boolean isEstaPrestado() { return estaPrestado; }
    @Override
    public String toString() {
        return "Libro{" + titulo + ", Autor: " + autor + ", Prestado: " + estaPrestado + '}';
    }
}