package examenJavaEjerciciosInternett;

import java.util.Scanner;

public class Ejercicio14Sueldos {

    public int salary(int a) {
        Scanner entry = new Scanner(System.in);
        int suma = 0;
        int contM = 0;
        for (int i = 0; i < a; i++) {
            System.out.println("Ingrese su salario: ");
            int salary = entry.nextInt();
            suma = suma + salary;
            if (salary > 1000) {
                contM++;
            }
        }
        System.out.println("La Suma de Salarios es: " + "\t" + suma + "\n");
        System.out.println("Hay" + " " + contM + " salarios mayores a 1000");

        return suma;

    }

}
