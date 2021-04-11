package problema5proyectoResultoJosephGranados;

import java.util.Arrays;

public class Ordenar {

    PedirNum ObjetoToOrdenar;

    public void Ordenar() {
        ObjetoToOrdenar = new PedirNum();
        ObjetoToOrdenar.PedirNumm();
        int[] array1 = ObjetoToOrdenar.cont1;
        int[] array2 = ObjetoToOrdenar.cont2;
        int total = array1.length + array2.length;
        int[] c = new int[total];
        System.out.println(" ------- ------- ------- -------   ");
        System.out.println("El primer conjunto queda: " + Arrays.toString(array1) + " , " + "El segundo conjunto queda: " + Arrays.toString(array2));
        // System.arraycopy(Copyfrom, desdeDondeEmpezar a copiar (Posicion), CopyTo, (posicionEnDondePonerEstosValores, Numero de elementos a copiar)
        System.arraycopy(array1, 0, c, 0, array1.length);
        System.arraycopy(array2, 0, c, array1.length, array2.length);
        System.out.println(" ------- ------- ------- -------   ");
        System.out.println("El merge de los arreglos que digitó, es el siguient: ");
        System.out.println(Arrays.toString(c));
        System.out.println(" ------- ------- ------- -------   ");

    }

}
