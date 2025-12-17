public class Producto {
    private int idProducto;
    private String nombre;
    private double precio;
    private int stock;
    public Producto(int idProducto, String nombre, double precio, int stock) {
        this.idProducto = idProducto;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public int getIdProducto() { return idProducto; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }

    public void reducirStock(int cantidad) {
        if (this.stock >= cantidad) {
            this.stock -= cantidad;
        } else {
            System.err.println("Error de stock: No hay suficiente " + nombre);
        }
    }
}