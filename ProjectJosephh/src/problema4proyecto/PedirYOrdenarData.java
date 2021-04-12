package problema4proyecto;

import java.util.Arrays;
import java.util.Scanner;

public class PedirYOrdenarData {

    public int[] array;
    public int num;

    public void PerdirArray() {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de numeros del Arreglo: ");
        num = s.nextInt();
        this.array = new int[num];

        for (int i = 0; i < num; i++) {

            System.out.println("Ingrese el Dato en la posición: " + (i + 1));
            int b = s.nextInt();
            array[i] = b;

        }
        Arrays.sort(array); //Uso de libreria Array Short para ordenar el arreglo

    }

}
