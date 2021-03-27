package examenJavaEjerciciosInternett;

import java.util.Scanner;

public class Promedio {

    public double Prom(int a) {
        int cont = 0;
        double prom1 = 0;
        double promf = 0;
        Scanner entry = new Scanner(System.in);

        while (a > 0) {
            System.out.println("ingrese un numero: ");
            int num = entry.nextInt();
            prom1 = (prom1 + num);
            cont++;
            promf = prom1 / cont;
            if (num < 0) {
                System.out.println("Ingresaste un numero negativo, se termina el programa");

                break;
            }

        }

        System.out.println("El promedio es: ");
        return promf;
    }

}
