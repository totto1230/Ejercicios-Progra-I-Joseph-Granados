/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenPracticaDrive;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class Bisiessto {

    public void bisis(int a) {
        Scanner entry = new Scanner(System.in);

        for (int i = 0; i < a; a++) {
            System.out.println("Ingrese el año: ");
            int num = entry.nextInt();

            if (num % 4 == 0) {
                if (num % 100 != 0 || num % 400 == 0) {
                    System.out.println(num + " Es año bisiesto.");
                } else {

                    System.out.println("Año no bisiesto:  " + num);
                }
            }
        }

    }

}
