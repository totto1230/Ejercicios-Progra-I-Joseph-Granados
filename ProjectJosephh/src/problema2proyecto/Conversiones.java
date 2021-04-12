package problema2proyecto;

import java.util.Scanner;

public class Conversiones {

    PedirDatos Datos;

    public void Convertir() {
        Scanner s = new Scanner(System.in);
        Datos = new PedirDatos();
        Datos.PedirDatos();
        double colones = Datos.CantidadColones;
        double moneda1 = Datos.CantidadMoneda1;
        double moneda2 = Datos.CantidadMoneda2;
        
        String name1 = Datos.NombreMoneda;
        String name2 = Datos.NombreMoneda2;
        int select = s.nextInt();

        System.out.println("Presione:\n" + " 1. Colones a: " + name1 + "\n" + "Colones a :" + name2 + "\n" + " 3. " + name1 + " a " + name2 + "\n" + " 4. " + name2 + " a " + name1);
        switch (select) {
            case (1):
                double result= (colones*moneda1)/1;
                System.out.println("Estos "+colones+ " son "+ result+ name1);
                break;
            case (2):
                double resultt= (colones*moneda2)/1;
                System.out.println("Estos "+colones+ " son "+ resultt+ name2);
                break;
                
            case (3):
                double resulttt= (colones*moneda1)/1; // convertidas a moneda 1
                
                
                
                
            case (4):
                double resultta= (colones*moneda2)/1;
                
                
                
        }

    }

}
