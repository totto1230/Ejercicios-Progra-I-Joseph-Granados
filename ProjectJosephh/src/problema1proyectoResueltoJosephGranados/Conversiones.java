package problema1proyectoResueltoJosephGranados;

import java.util.Scanner;

public class Conversiones {

    Moneda Cantidad;

    public void Convertir() {
        Cantidad = new Moneda();
        double valor = Cantidad.SolicitarDatos();

        System.out.println(" 1. Dolar\n 2. Euro \n 3. Colones");
        Scanner s = new Scanner(System.in);
        int select = s.nextInt();

        switch (select) {
            case (1):

                System.out.println("A qué moneda desea pasar estos " + valor + " dolares? \t" + "\n 1. Dolares > Euros \n 2. Dolares > Colones");

                int selectt = s.nextInt();

                if (selectt == 1) {

                    double result = (valor * 1) / 1.53;
                    System.out.println("En total son: " + result + " Euros");

                } else if (selectt == 2) {
                    double result = (valor * 500) / 1;
                    System.out.println("En total son: " + result + " Colones");

                } else {
                    System.out.println("Ingrese un valor valido.");

                }
                break;

            case (2):
                int selectta = s.nextInt();

                if (selectta == 1) {
                    double result = (Cantidad.SolicitarDatos() * 1.53) / 1;
                    System.out.println("En total son: " + result + " Dolares");

                } else if (selectta == 2) {

                    double result = (Cantidad.SolicitarDatos() * 1.53) / 1;
                    double resultt = (result * 500) / 1;
                    System.out.println("En total son: " + resultt + " Colones");

                } else {
                    System.out.println("Ingrese un valor valido.");

                }
                break;

            case (3):
                int selectat = s.nextInt();

                if (selectat == 1) {
                    double result = (Cantidad.SolicitarDatos() * 1) / 500;
                    double resultt = (result * 1) / 1.53;
                    System.out.println("En total son: " + resultt + " Dolares");

                } else if (selectat == 2) {
                    double result = (Cantidad.SolicitarDatos() * 1) / 500;
                    System.out.println("En total son: " + result + " Colones");

                } else {
                    System.out.println("Ingrese un valor valido.");

                }
                break;

        }

    }
}
