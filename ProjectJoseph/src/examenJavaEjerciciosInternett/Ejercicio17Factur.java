package examenJavaEjerciciosInternett;

import java.util.Scanner;

public class Ejercicio17Factur {

    public int factur(int a) {
        int suma = 0;
        int litsum = 0;
        int masse = 0;

        Scanner entry = new Scanner(System.in);

        for (int i = 0; i < a; i++) {
            System.out.println("Ingrese el codigo: ");
            char cod = entry.next().charAt(0);
            System.out.println("Ingrese Cantidad vendida en litros: ");
            int lit = entry.nextInt();
            System.out.println("Precio por litro");
            int precio = entry.nextInt();
            suma = suma + (lit * precio);
            litsum = litsum + lit;
            if (suma > 600) {
                masse++;

            }

        }
        System.out.println("La Facturacion total: " + " " + suma + " " + "Litros total: " + " " + litsum + " " + "Cantidad facturas>600: " + " " + masse);
        return 0;

    }

}
