package examenJavaEjerciciosInternett;

import java.util.Scanner;

public class Ejercicio5 {

    public int ale(int n) {

        int randomm = (int) (Math.random() * 100);
        int cont = 0;

        while (n != 0) {
            Scanner entry = new Scanner(System.in);
            System.out.println("Digite el num: ");
            int num = entry.nextInt();
            cont++;
            if (num > randomm) {
                System.out.println("Su num es mayor, pruebe uno menor " + "\t" + num);
            } else if (num < randomm) {
                System.out.println("Su num es menor, pruebe uno mayor " + "\t" + num);
            } else if (num == randomm) {
                System.out.println("Adivino el num " + "\t" + num);
                break;
            }

        }

        return cont;

    }

}
