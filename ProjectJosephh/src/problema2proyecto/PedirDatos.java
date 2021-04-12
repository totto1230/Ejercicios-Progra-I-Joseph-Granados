package problema2proyecto;

import java.util.Scanner;

public class PedirDatos {

    public String NombreMoneda;
    public int CantidadMoneda1;
    public String NombreMoneda2;
    public int CantidadMoneda2;
    public double CantidadColones;

    public void PedirDatos() {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la cantidad en colones: ");
        this.CantidadColones = s.nextDouble();
        System.out.println("Ingrese el nombre de la primera Moneda:");
        this.NombreMoneda=s.next();
        System.out.println("A cuántos colones equivale un: " + NombreMoneda);
        this.CantidadMoneda1=s.nextInt();
        System.out.println("Ingrese el nombre de la Segunda Moneda:");
        this.NombreMoneda2=s.next();
        System.out.println("A cuántos colones equivale un: " + NombreMoneda2);
        this.CantidadMoneda2=s.nextInt();
    }

    public String getNombreMoneda() {
        return NombreMoneda;
    }

    public int getCantidadMoneda1() {
        return CantidadMoneda1;
    }

    public String getNombreMoneda2() {
        return NombreMoneda2;
    }

    public int getCantidadMoneda2() {
        return CantidadMoneda2;
    }

    public double getCantidadColones() {
        return CantidadColones;
    }

 

}
