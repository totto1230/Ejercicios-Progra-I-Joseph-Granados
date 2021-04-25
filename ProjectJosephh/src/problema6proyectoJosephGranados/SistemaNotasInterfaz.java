package problema6proyectoJosephGranados;

import java.util.Arrays;
import java.util.Scanner;

public class SistemaNotasInterfaz {

    int nota;
    public int cantEst;
    SistemaNotasReporte impr;
    Scanner s = new Scanner(System.in);

    public int generarEst() {

        System.out.println("Ingrese la Cantidad de Estudiantes que tiene: ");
        return this.cantEst = s.nextInt();

    }

    public void digitarNota() {
        int i = 0;
        while (i < cantEst) {
            System.out.println("Agregue la nota: ");
            nota = s.nextInt();
            i++;
        }
    }
}
