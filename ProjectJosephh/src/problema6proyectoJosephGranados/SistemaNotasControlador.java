package problema6proyectoJosephGranados;

import java.util.Arrays;

public class SistemaNotasControlador {

    private SistemaNotasReporte Report;
    private final SistemaNotasInterfaz Inter = new SistemaNotasInterfaz();

    public void iniciar() {
        //Esta variable sirve para digitar N veces el valor en el ARRAY
        int i = 0;
        int j = 0;

        //Agregar el lenght al array; es decir, reservar espacio
        Inter.generarEst();
        Report = new SistemaNotasReporte(Inter.cantEst);

        //AGREGAMOS LAS NOTAS AL ARRAY
        while (i < Report.notas.length) {
            Inter.digitarNota();
            Report.agregarNota(Inter.nota);
            i++;
        }

        //Sirve para ordenar el array de mayor a menor
        Report.generarReporteTodosExamenes(Report.notas);

        //Agregar el lenght al array de nombres; es decir, reservar espacio
        Report.guardarCampAlum(Inter.cantEst);

        //AGREGAMOS NOMBRES
        while (j < Report.nombresAlum.length) {
            Inter.digitarnName();
            Report.agregarNombreAlum(Inter.nombre);
            j++;
        }
        //Impresión del ARRAY
        Inter.imprimir(Report.notas, Report.promedio, Report.nombresAlum);

    }

}
