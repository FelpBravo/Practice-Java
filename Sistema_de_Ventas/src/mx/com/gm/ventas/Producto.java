package mx.com.gm.ventas;

import java.util.StringJoiner;

public class Producto {
    private final int idProducto;
    private String nombre;
    private Double precio;
    private static int contadorProductos;

    private Producto(){
        this.idProducto = ++Producto.contadorProductos;
    }

    public Producto(String nombre, Double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Producto.class.getSimpleName() + "[", "]")
                .add("idProducto=" + idProducto)
                .add("nombre='" + nombre + "'")
                .add("precio=" + precio)
                .toString();
    }

    public int getIdProducto() {
        return idProducto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
}
