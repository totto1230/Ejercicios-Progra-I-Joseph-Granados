package clasesemana6;

public class CompuGrama {

    public void compugrama(int num) {

        for (int j = 1; j < num; j++) {

            for (int i = 1; i < num; i++) {
                if (j == 1 || j == num) {
                    System.out.print("*\t");
                } else {
                    System.out.println("\t");
                }
                System.out.println();
            }
        }
    }
}
