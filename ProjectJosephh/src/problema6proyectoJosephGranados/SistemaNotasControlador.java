package problema6proyectoJosephGranados;

import java.util.Arrays;

public class SistemaNotasControlador {

    private SistemaNotasReporte Report;
    private final SistemaNotasInterfaz Inter = new SistemaNotasInterfaz();

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
        
        //Sirve para ordenar el array de mayor a menor
        Report.generarReporteTodosExamenes(Report.notas);
        Inter.imprimir(Report.notas, Report.promedio);
    
    
    }

}
