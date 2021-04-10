package problema1proyectofixed;

import java.util.Scanner;

public class Moneda {

    private double Cantidad;

    public double SolicitarDatos() {
        System.out.println("Ingrese la cantidad: ");
        Scanner s = new Scanner(System.in);
        this.Cantidad = s.nextDouble();
        return Cantidad;

    }

    public double getCantidad() {

        return Cantidad;
    }

    public void setCantidad(double Cantidad) {
        this.Cantidad = Cantidad;
    }

}
