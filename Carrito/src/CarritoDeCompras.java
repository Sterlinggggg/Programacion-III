import java.util.ArrayList;
import java.util.List;
public class CarritoDeCompras {
    private List<ItemCarrito> items;
    public CarritoDeCompras() {
        this.items = new ArrayList<>();
    }
      //Busca si el producto ya existe. Si existe, actualiza la cantidad. Si no, añade un nuevo ItemCarrito.
    public void agregarProducto(Producto producto, int cantidad) {
        if (cantidad <= 0 || producto.getStock() < cantidad) {
            System.out.println("Error: Cantidad inválida o stock insuficiente para " + producto.getNombre());
            return;
        }
        for (ItemCarrito item : items) {
            if (item.getProducto().getIdProducto() == producto.getIdProducto()) {
                item.setCantidad(item.getCantidad() + cantidad);
                System.out.println("Añadido " + cantidad + " más de " + producto.getNombre() + ".");
                return;
            }
        }
        items.add(new ItemCarrito(producto, cantidad));
        System.out.println("Añadido " + cantidad + " x " + producto.getNombre() + " al carrito.");
    }

    public void eliminarProducto(int idProducto) {
        items.removeIf(item -> item.getProducto().getIdProducto() == idProducto);
        System.out.println("Producto con ID " + idProducto + " eliminado del carrito.");
    }
    public double calcularTotal() {
        double total = 0;
        for (ItemCarrito item : items) {
            total += item.calcularSubtotal();
        }
        return total;
    }
    public void vaciar() {
        this.items.clear();
        System.out.println("\nCarrito vaciado.");
    }
    public List<ItemCarrito> getItems() {
        return items;
    }
    public void mostrarContenido() {
        System.out.println("\n--- Contenido del Carrito ---");
        for (ItemCarrito item : items) {
            System.out.printf("- %d x %s @ %.2f c/u = %.2f%n",
                    item.getCantidad(), item.getProducto().getNombre(),
                    item.getProducto().getPrecio(), item.calcularSubtotal());
        }
        System.out.printf("TOTAL: %.2f%n", calcularTotal());
        System.out.println("-----------------------------");
    }
}