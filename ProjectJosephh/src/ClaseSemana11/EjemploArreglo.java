package ClaseSemana11;

public class EjemploArreglo {

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] aa = new int[100];

        for (int iw = 0; iw < aa.length; iw++) {
            for (int i = 0; i < aa.length; i++) {
                aa[i] = 1;

            }
            System.out.println(aa[iw]);
        }
    }
}
