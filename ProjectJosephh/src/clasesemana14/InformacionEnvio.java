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
public class InformacionEnvio {

    private int shippingId;
    private int shippingRegionId;
    private int shippingCost;
    private String shippingType;
    private Pedido pedidos;

    public void updateShippingInfo() {
    }

    public void setShippingId(int shippingId) {
        this.shippingId = shippingId;
    }

    public void setShippingRegionId(int shippingRegionId) {
        this.shippingRegionId = shippingRegionId;
    }

    public void setShippingCost(int shippingCost) {
        this.shippingCost = shippingCost;
    }

    public void setShippingType(String shippingType) {
        this.shippingType = shippingType;
    }

    public int getShippingId() {
        return shippingId;
    }

    public int getShippingRegionId() {
        return shippingRegionId;
    }

    public int getShippingCost() {
        return shippingCost;
    }

    public String getShippingType() {
        return shippingType;
    }

}
