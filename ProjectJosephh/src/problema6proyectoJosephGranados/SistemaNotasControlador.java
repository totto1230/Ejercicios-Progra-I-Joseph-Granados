package problema6proyectoJosephGranados;

import java.util.Arrays;

public class SistemaNotasControlador {

    private SistemaNotasReporte Report;
    private SistemaNotasInterfaz Inter = new SistemaNotasInterfaz();

    public void iniciar() {
        int i = 0;
        //Agregar el lenght al array
        Inter.generarEst();
        Report = new SistemaNotasReporte(Inter.cantEst);

        //AGREGAMOS LAS NOTAS AL ARRAY
        while (i < Report.notas.length) {
            Inter.digitarNota();
            Report.agregarNota(Inter.nota);
            i++;
        }
      System.out.println(Arrays.toString(Report.notas));
    }

}
