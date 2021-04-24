package clasesemana14;

import java.util.Date;

public class CarritoDeCompras {

    private Date created;
    private LineadeProducto[] products;

    public CarritoDeCompras() {
        products = new LineadeProducto[100];
        created = new Date();
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public LineadeProducto[] getProducts() {
        return products;
    }

    public void setProducts(LineadeProducto[] products) {
        this.products = products;
    }

}
