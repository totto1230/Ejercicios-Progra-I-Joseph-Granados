package examenJavaEjerciciosInternett;

import java.util.Scanner;

public class Ejercicio13Medi {

    public int digitar(int a) {
        Scanner entry = new Scanner(System.in);
        int i = 0;
        int contN = 0;
        int contP = 0;
        int contC = 0;
        int promN = 0;
        int promP = 0;
        int promC = 0;
        int promPfinal = 0;
        int promNfinal = 0;
        while (i < a) {
            System.out.println("Ingrese el num: ");
            int num = entry.nextInt();
            i++;
            ;
            if (num < 0) {
                promN = promN + num;
                contN++;
                promNfinal = promN / contN;
            } else if (num == 0) {
                contC++;
            } else if (num > 0) {
                contP++;
                promP = promP + num;
                promPfinal = promP / contP;
            }

        }
        System.out.println("ContFinal");
        System.out.print("El num total de Negativos es: " + contN + "\t" + " El num total de Ceros es: " + contC + "\t" + " El num total de Positivos es: " + contP);
        System.out.println("El promedio de num negativos es: " + promNfinal + "El promedio de num Positivos es: " + promPfinal + "El promedio de Ceros es: " + promC);
        return 0;
    }

}
