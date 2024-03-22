
package modelo;

import avicola_programacion2.Cliente;
import avicola_programacion2.LocalStorage;
import avicola_programacion2.Pedido;
import avicola_programacion2.Producto;
import com.sun.corba.se.impl.ior.NewObjectKeyTemplateBase;
import java.util.ArrayList;


public class Modelo {
     static ArrayList<Cliente> clientes = new ArrayList<>();
      static ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
     static ArrayList<Producto> productos = new ArrayList<>();
    public static void guardarObjeto(Object newObj) {
       if(newObj instanceof Cliente){
        Cliente cliente = (Cliente) newObj;
        
        clientes = obtenerCliente();
        
        clientes.add(cliente);
        LocalStorage.setObject("clientes.txt", clientes);
        }
       if(newObj instanceof Producto){
        Producto producto = (Producto) newObj;
        
        productos = obtenerProductos();
        
        productos.add(producto);
        LocalStorage.setObject("productos.txt", producto);
        }
       if(newObj instanceof Pedido){
        Pedido pedido = (Pedido) newObj;
        
        pedidos = obtenerPedidos();
        
        pedidos.add(pedido);
        LocalStorage.setObject("pedidos.txt", pedidos);
        }
    }
    public static ArrayList<Cliente> obtenerCliente() {
        ArrayList<Cliente> clientesRecuperados = (ArrayList<Cliente>) LocalStorage.getObject("clientes.txt");
        
        return clientesRecuperados;
    }


    public static ArrayList<Pedido> obtenerPedidos() {
        ArrayList<Pedido> pedidosRecuperados = (ArrayList<Pedido>) LocalStorage.getObject("pedidos.txt");

        return pedidosRecuperados;
    }
    
     
      public static ArrayList<Producto> obtenerProductos() {
        ArrayList<Producto> productosRecuperados = (ArrayList<Producto>) LocalStorage.getObject("productos.txt");

        return productosRecuperados;
    }
}
