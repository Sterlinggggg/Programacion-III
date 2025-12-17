public class Tienda {


     //Procesa la compra: crea un Pedido, actualiza el stock de los productos y vacía el carrito.
    public Pedido procesarCompra(CarritoDeCompras carrito, String nombreCliente) {
        double total = carrito.calcularTotal();
        if (total == 0) {
            System.out.println("Error: El carrito está vacío miserable. Compra no procesada.");
            return null;
        }
        System.out.println("\n--- Procesando Compra para: " + nombreCliente + " ---");
        for (ItemCarrito item : carrito.getItems()) {
            item.getProducto().reducirStock(item.getCantidad());
        }
        Pedido nuevoPedido = new Pedido(carrito.getItems(), total);
        carrito.vaciar();
        return nuevoPedido;
    }
}