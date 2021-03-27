package examenJavaEjerciciosInternett;

import java.util.Scanner;

public class Ejercicio10PedirNum {

    public int ped(int a) {
        Scanner entry = new Scanner(System.in);
        int suma = 0;

        for (int i = 0; i < a; i++) {
            System.out.println("Ingrese el num: ");
            int num = entry.nextInt();
            suma = suma + num;
        }
        System.out.println("La sumatoria es: "+ suma);
        return suma;
       
    }

}
