
package avicola_programacion2;

import java.util.ArrayList;

import java.time.LocalDate;
public class Pedido {
    
    private ArrayList<Producto> productosPedidos= new ArrayList<>();
    private String clienteComprador;
    private LocalDate fechaPedido;
 
    private double precioTotal;

    public Pedido(String clienteComprador) {
        this.clienteComprador = clienteComprador;
    }

 
    
     

    public ArrayList<Producto> getProductos() {
        return productosPedidos;
    }

    public void setProductos(ArrayList<Producto> productos) {
        this.productosPedidos = productos;
    }

    public String getClienteComprador() {
        return clienteComprador;
    }

    public void setClienteComprador(String clienteComprador) {
        this.clienteComprador = clienteComprador;
    }

    public LocalDate getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(LocalDate fechaPedido) {
        this.fechaPedido = LocalDate.now();
    }

  

   

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
    
    public void agregarProducto(Producto producto, int cantidad) {
        producto.setCantidadProducto(cantidad);
        productosPedidos.add(producto);
        precioTotal += producto.getPrecioProducto()* cantidad;
    }
}
