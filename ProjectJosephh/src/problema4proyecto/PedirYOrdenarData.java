package problema4proyecto;

import java.util.Arrays;
import java.util.Scanner;

public class PedirYOrdenarData {

    private int[] array;

    public void PerdirArray() {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de numeros del Arreglo: ");
        int a = s.nextInt();
        this.array = new int[a];

        for (int i = 0; i < a; i++) {

            System.out.println("Ingrese el Dato en la posición: " + (i + 1));
            int b = s.nextInt();
            array[i] = b;

        }
        System.out.println("El arreglo es el siguiente: "+ Arrays.toString(array));
    }

    

}
