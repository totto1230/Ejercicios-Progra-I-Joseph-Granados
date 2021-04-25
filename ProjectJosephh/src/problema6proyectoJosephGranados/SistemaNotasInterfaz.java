package problema6proyectoJosephGranados;

import java.util.Arrays;
import java.util.Scanner;

public class SistemaNotasInterfaz {

    private int cantEst;
    private SistemaNotasReporte impri = new SistemaNotasReporte();
    // public int nota;

    public int generarEst() {
        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la Cantidad de Estudiantes que tiene: ");
        return this.cantEst = s.nextInt();

    }

    public int ingresarNota() {
        Scanner s = new Scanner(System.in);

        System.out.println("Ingrese la cantidad del Estudiante: ");
        return 0;

    }

    public void imprimir() {
        System.out.println((impri.notas.length));

    }

}
