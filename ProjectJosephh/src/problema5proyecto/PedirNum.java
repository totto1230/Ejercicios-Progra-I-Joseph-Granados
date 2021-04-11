package problema5proyecto;

import java.util.Arrays;
import java.util.Scanner;
//private int Conjunto1;

public class PedirNum {

    public int[] cont1;
    public int[] cont2;
    private int espacios = 0;
    private int espacios2 = 0;

    public void PedirNumm() {

        /* SE PIDE EL NUMERO DE NUMEROS QUE SE QUIERE METER EN EL ARREGLO
            es decir el famoso "array.length"
         */
        Scanner s = new Scanner(System.in);
        System.out.println("Numero de ints quiere meter en el primer conjunto");
        this.espacios = s.nextInt();
        cont1 = new int[espacios];
        System.out.println("Numero de ints quiere meter en el segundo conjunto");
        this.espacios2 = s.nextInt();
        cont2 = new int[espacios2];

        for (int i = 0; i < espacios; i++) {
            System.out.println("-------Conjunto 1-------");
            System.out.println("Digite el numero que va en la posicion: " + (i + 1));
            int a = s.nextInt();
            cont1[i] = a;

        }

        for (int i = 0; i < espacios2; i++) {
            System.out.println("-------Conjunto 2-------");
            System.out.println("Digite el numero que va en la posicion: " + (i + 1));
            int a = s.nextInt();
            cont2[i] = a;

        }
        //System.out.println("El primer conjunto queda: " + Arrays.toString(cont1) + " , " + "El segundo conjunto queda: " + Arrays.toString(cont2));

    }

    public void setCont1(int[] cont1) {
        this.cont1 = cont1;
    }

    public void setEspacios(int espacios) {
        this.espacios = espacios;
    }

    public int[] getCont1() {
        return cont1;
    }

    public int getEspacios() {
        return espacios;
    }

}
