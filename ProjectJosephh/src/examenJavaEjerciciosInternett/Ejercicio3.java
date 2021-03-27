package examenJavaEjerciciosInternett;

import java.util.Scanner;

public class Ejercicio3 {

    public int cero(int n) {

        while (n != 0) {
            Scanner entry = new Scanner(System.in);
            System.out.println("Ingrese un numero: ");
            int num = entry.nextInt();

            if (num == 0) {

                System.out.println("Ingresó un cero");
                break;
            } else if (num % 2 != 0) {
                System.out.println("Es Impar" + num);

            } else if (num % 2 == 0) {

                System.out.println("Es par " + num);
            }

        }
        System.out.println("Ingresó un cero, pruebe otro num");
        return 0;
    }

}
