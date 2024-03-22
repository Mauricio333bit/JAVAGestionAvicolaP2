/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package avicola_programacion2;

import java.util.ArrayList;
import modelo.Modelo;
import vista.Vista;

/**
 *
 * @author mauri
 */
public class Avicola_Programacion2 {

    public static void main(String[] args) {
        int opt = Vista.menu();

        switch (opt)
        {
            case 1:
                Cliente unCliente = Vista.agregarCliente();
                Modelo.guardarObjeto(unCliente);
                break;
            case 2:
                ArrayList<Cliente> clientesRegistrados = Modelo.obtenerCliente();

                Vista.mostrarClientes(clientesRegistrados);
                Vista.menu();
                break;
            case 3:

                break;
            case 4:

                break;
            case 5:
                Producto unProducto = Vista.agregarProducto();
                Modelo.guardarObjeto(unProducto);

                break;
            case 6:
                 ArrayList<Producto> productosCargados = Modelo.obtenerProductos();

                Vista.mostrarProductos(productosCargados);
                

                break;
            default:
                throw new AssertionError();
        }

    }

}
