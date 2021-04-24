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
public class Producto {

    private String id;
    private String name;
    private String supplier;

    public Producto(String id, String name, String supplier) {
        this.id = id;
        this.name = name;
        this.supplier = supplier;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }
}
