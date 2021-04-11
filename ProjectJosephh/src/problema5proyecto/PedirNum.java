package problema5proyecto;

import java.util.Scanner;
//private int Conjunto1;

public class PedirNum {

    private int[] cont1 ;
    private int espacios=0;

    public void PedirNumm() {
        Scanner s = new Scanner(System.in);
        System.out.println("Numero de ints quiere meter");
        this.espacios=s.nextInt();
        
        for (int i = 0; i<100; i++) {
           
            System.out.println("Ingrese el dato");
           
            //cont1[i] =  new int [s.nextInt();
            System.out.println(cont1[i]);
        }

    }

    public int[] getCont1() {
        return cont1;
    }

    public int getEspacios() {
        return espacios;
    }

}
