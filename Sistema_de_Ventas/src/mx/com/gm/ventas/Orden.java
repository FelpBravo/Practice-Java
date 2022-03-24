package mx.com.gm.ventas;

public class Orden {
    private int idOrden;
    private Producto productos[];
    private static int contadorOrdenes;
    private int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;

    public Orden(){
        this.idOrden = ++Orden.contadorOrdenes;
        this.productos = new Producto[Orden.MAX_PRODUCTOS];
    }

    public void agregarProducto(Producto producto){
        if(this.contadorProductos < Orden.MAX_PRODUCTOS){
            this.productos[this.contadorProductos++] = producto;
        }else{
            System.out.println("Se ha superado el maximo de productos " + Orden.MAX_PRODUCTOS);
        }
    }

    public double calcularTotal(){
        double total = 0;
        for(int i = 0; i < this.contadorProductos; i++){
            Producto producto = this.productos[i];
            total += producto.getPrecio();
        }
        return total;
    }

    public void mostrarOrden(){
        System.out.println("###### Orden °N" + this.idOrden + "############");
        double totalOrden = calcularTotal();
        System.out.println("Total de la Orden $" + totalOrden);
        for(int i = 0; i < this.contadorProductos; i++){
            System.out.println("Producto °N" + i + ":" + this.productos[i]);
        }
        System.out.println("###################################");
    }

}
