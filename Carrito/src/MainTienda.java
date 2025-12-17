public class MainTienda {
    public static void main(String[] args) {
        Producto leche = new Producto(1, "Leche Entera", 1.50, 50);
        Producto pan = new Producto(2, "Pan de Molde", 2.00, 30);
        CarritoDeCompras carritoAna = new CarritoDeCompras();
        Tienda miTienda = new Tienda();
        carritoAna.agregarProducto(leche, 3);
        carritoAna.agregarProducto(pan, 1);
        carritoAna.agregarProducto(leche, 2);
        carritoAna.mostrarContenido();
        carritoAna.eliminarProducto(2);
        carritoAna.mostrarContenido();
        Pedido pedidoFinal = miTienda.procesarCompra(carritoAna, "Ana Fernández");
        if (pedidoFinal != null) {
            pedidoFinal.cambiarEstado("Enviado");
        }
        System.out.println("\nStock final de Leche: " + leche.getStock()); // Debería ser 50 - 5 = 45
    }
}