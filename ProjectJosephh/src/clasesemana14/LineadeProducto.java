/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesemana14;

/**
 *
 * @author josep
 */
public class LineadeProducto {

    private Integer cantidad;
    private float price;
    private Producto producto;

    public LineadeProducto(Integer cantidad, float price, Producto producto) {
        this.cantidad = cantidad;
        this.price = price;
        this.producto = producto;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }

}
