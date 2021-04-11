package prueba;

public class prueba {

    public static void main(String[] args) {
        int[] array = {23, 43, 55};
        int[] copiedArray = new int[3];

        System.arraycopy(array, 0, copiedArray, 0, 3);
        System.arraycopy(array, 0, copiedArray, 0, 0);
    }

}
