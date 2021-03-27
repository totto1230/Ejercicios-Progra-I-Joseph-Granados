/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesemana6;

import java.util.Scanner;

/**
 *
 * @author josep
 */
public class ClaseSemana6 {

    public int buscarNumMax(int nNumeroD) {
        int resultado = 0;
        Scanner entry = new Scanner(System.in);
        int numMax = 0;
        String texto = ("");
        int suma = 0;
        int contador = 0;
        for (int i = 0; i < nNumeroD; i++) {
            int num = entry.nextInt();
            suma += num;
            contador++;
            if (i == 0) {
                numMax = num;
            } else {
                if (num > numMax) {
                    numMax = num;
                }

            }
            texto += ("Num:" + num);

        }
        
        resultado = numMax;
        return resultado;
    }
}