import java.time.LocalDateTime;
import java.util.List;
public class Pedido {
    private static int contadorPedidos = 1;
    private int idPedido;
    private List<ItemCarrito> items;
    private LocalDateTime fecha;
    private String estado;
    private double total;
    public Pedido(List<ItemCarrito> items, double total) {
        this.idPedido = contadorPedidos++;
        this.items = items;
        this.fecha = LocalDateTime.now();
        this.estado = "Pendiente";
        this.total = total;
        System.out.println("\n*** PEDIDO CREADO ***");
        System.out.println("ID Pedido: " + idPedido);
        System.out.printf("Total: %.2f%n", total);
        System.out.println("Fecha: " + fecha.toLocalDate());
    }
    public void cambiarEstado(String nuevoEstado) {
        this.estado = nuevoEstado;
        System.out.println("Pedido " + idPedido + " cambiado a estado: " + estado);
    }
    public List<ItemCarrito> getItems() {
        return items;
    }
}