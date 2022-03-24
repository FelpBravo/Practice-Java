package mx.com.gm.ventas.test;

import mx.com.gm.ventas.Orden;
import mx.com.gm.ventas.Producto;

public class VentasTest {
    public static void main(String[] args) {
        Orden orden = new Orden();
        orden.mostrarOrden();
        Producto producto1 = new Producto("Teclado", 15.000);
        Producto producto2 = new Producto("Mouse", 3.000);
        orden.agregarProducto(producto1);
        orden.agregarProducto(producto2);
        orden.mostrarOrden();
    }
}
