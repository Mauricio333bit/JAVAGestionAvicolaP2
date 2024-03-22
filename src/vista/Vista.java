package vista;

import avicola_programacion2.Cliente;
import avicola_programacion2.LocalStorage;
import avicola_programacion2.Pedido;
import avicola_programacion2.Producto;
import java.util.ArrayList;

import java.util.Scanner;
import modelo.Modelo;

public class Vista {

    static Scanner lectorInputs = new Scanner(System.in);

    public static int menu() {

        System.out.println("Sistema informatico granja Avicola\n Ingrese el valor de la accion que desea realizar:\n 1)Agregar nuevo cliente\n 2)Mostrar clientes registrados\n 3)Crear pedido\n 4)Ver historial de pedidos.\n 5)Cargar nuevo producto\n 6)Listar productos");
        int selector = lectorInputs.nextInt();

        return selector;
    }
//Metodos relacionados a clientes

    public static Cliente agregarCliente() {

        lectorInputs.nextLine();
        System.out.println("Ingrese el nombre: ");
        String nombreNewClient = lectorInputs.nextLine();

        System.out.println("Ingrese el numero de telefono: ");
        String telefonoNewClient = lectorInputs.nextLine();

        System.out.println("Ingrese el email: ");
        String emailNewClient = lectorInputs.nextLine();
        System.out.println("Ingrese el dni: ");
        String dniNewClient = lectorInputs.nextLine();

        System.out.println("Ingrese el estado: ");
        String estadoNewClient = lectorInputs.nextLine();

        Cliente newCliente = new Cliente(nombreNewClient, telefonoNewClient, emailNewClient, dniNewClient, estadoNewClient);

        return newCliente;
    }

    public static void mostrarClientes(ArrayList<Cliente> clientes) {

        for (Cliente clienteRecupe : clientes) 
        {
            System.out.println(clienteRecupe);
        }
        
    }
        //Metodos relacionados a productos  

    public static Producto agregarProducto() {

        lectorInputs.nextLine();
        System.out.println("Ingrese el nombre del producto: ");
        String nombreNewProducto = lectorInputs.nextLine();

        System.out.println("Ingrese el costo: ");
        double costoNewProducto = lectorInputs.nextDouble();

        System.out.println("Ingrese el precio: ");
        double precioNewProducto = lectorInputs.nextDouble();
        System.out.println("Ingrese la stock: ");
        int stockNewProducto = lectorInputs.nextInt();

        Producto newProducto = new Producto(nombreNewProducto,costoNewProducto ,precioNewProducto ,stockNewProducto);

        return newProducto;
    }

    public static void mostrarProductos(ArrayList<Producto> productos) {

        for (Producto productosCargados : productos)
        {
            System.out.println(productosCargados);
        }

//Metodos relacionados a pedidos
    }
    
    public static Pedido crearPedido() {

        lectorInputs.nextLine();
        System.out.println("Ingrese el nombre del Cliente: ");
        String nombreCliente = lectorInputs.nextLine();
        Pedido newPedido = new Pedido(nombreCliente);
        
        System.out.println("Producto: ");
        String producto = lectorInputs.nextLine();
        
        System.out.println("Cantidad: ");
        int cantidad = lectorInputs.nextInt();
        
        newPedido.agregarProducto(producto, cantidad);
        
        System.out.println("Ingrese el precio: ");
        String precioNewProducto = lectorInputs.nextLine()+ "$";
        System.out.println("Ingrese la cantidad: ");
        String cantidadNewProducto = lectorInputs.nextLine();

        Producto newProducto = new Producto(nombreNewProducto, costoNewProducto, precioNewProducto, cantidadNewProducto);

        return newPedido;
    }

}
