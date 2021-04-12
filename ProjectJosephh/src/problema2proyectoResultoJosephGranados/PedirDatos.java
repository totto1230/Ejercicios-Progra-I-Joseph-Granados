package problema2proyectoResultoJosephGranados;

import java.util.Scanner;

public class PedirDatos {

    public String NombreMoneda;
    public double CantidadMoneda1;
    public String NombreMoneda2;
    public double CantidadMoneda2;
    public double CantidadColones;

    public void PedirDatos() {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la cantidad en colones: ");
        this.CantidadColones = s.nextDouble();
        System.out.println("Ingrese el nombre de la primera Moneda:");
        this.NombreMoneda=s.next();
        System.out.println("A cuántos colones equivale un: " + NombreMoneda);
        this.CantidadMoneda1=s.nextDouble();
        System.out.println("Ingrese el nombre de la Segunda Moneda:");
        this.NombreMoneda2=s.next();
        System.out.println("A cuántos colones equivale un: " + NombreMoneda2);
        this.CantidadMoneda2=s.nextDouble();
    }

   
 
    

}
