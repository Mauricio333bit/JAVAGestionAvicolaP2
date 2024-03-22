package avicola_programacion2;

import java.io.Serializable;

public class Producto implements Serializable {

    private String nombreProducto;
    private double costoProducto;
    private double precioProducto;
    private int cantidadProducto;
    private int stockDisponible;

    public Producto(String nombreProducto, double costoProducto, double precioProducto, int stockDisponible) {
        this.nombreProducto = nombreProducto;
        this.costoProducto = costoProducto;
        this.precioProducto = precioProducto;
        this.stockDisponible = stockDisponible;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public double getCostoProducto() {
        return costoProducto;
    }

    public void setCostoProducto(double costoProducto) {
        this.costoProducto = costoProducto;
    }

    public double getPrecioProducto() {
        return precioProducto;
    }

    public void setPrecioProducto(double precioProducto) {
        this.precioProducto = precioProducto;
    }

    public int getCantidadProducto() {
        return cantidadProducto;
    }

    public void setCantidadProducto(int cantidadProducto) {
        this.cantidadProducto = cantidadProducto;
    }

    public int getStockDisponible() {
        return stockDisponible;
    }

    public void setStockDisponible(int stockDisponible) {
        this.stockDisponible = stockDisponible;
    }

   

}
