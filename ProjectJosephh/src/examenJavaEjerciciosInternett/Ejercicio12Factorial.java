/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenJavaEjerciciosInternett;

public class Ejercicio12Factorial {

    public int factorial(int a) {
        int factorial = 1;

        for (int i = a; i != 1; i--) {

            factorial = i * factorial;
         
        }
        return factorial;
    }

}
