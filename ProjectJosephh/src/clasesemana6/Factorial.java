/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesemana6;

import java.util.Scanner;

public class Factorial {

    public int factorial(int num) {
        int resultado = 1;

        if (num != 1) {
            for (int i = num; i != 1; i--) {
                resultado = resultado * i;       //declarado arriba 

            }

        }
        return resultado;
    }

}
