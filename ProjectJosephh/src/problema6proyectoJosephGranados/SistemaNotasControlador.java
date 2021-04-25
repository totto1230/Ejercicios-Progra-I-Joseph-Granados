package problema6proyectoJosephGranados;

import java.util.Arrays;

public class SistemaNotasControlador {

    private SistemaNotasReporte Report;
    private final SistemaNotasInterfaz Inter = new SistemaNotasInterfaz();

    public void iniciar() {
        //Estas variables sirven para digitar N veces el valor en el ARRAY
        int i = 0;
        int j = 0;
        int k = 0;

        //Agregar el lenght al array; es decir, reservar espacio
        Inter.generarEst();
        Report = new SistemaNotasReporte(Inter.cantEst);

        //AGREGAMOS LAS NOTAS AL ARRAY
        while (i < Report.notas.length) {
            Inter.digitarNota();
            Report.generarReporteAlumnosConNotaInferiorA(Inter.nota);

            Report.agregarNota(Inter.nota);

            i++;
        }

        //Sirve para ordenar el array de mayor a menor
        Report.generarReporteTodosExamenesOrdenadosPor(Report.notas);

        //Agregar el length al array de nombres; es decir, reservar espacio
        Report.guardarCampAlum(Inter.cantEst);
        Report.guardarCampPap(Inter.cantEst);

        //AGREGAMOS NOMBRES
        while (j < Report.nombresAlum.length) {
            Inter.digitarnName();
            Report.agregarNombreAlum(Inter.nombre);
            j++;
        }

        //Digitar Nombres PAPAS
        while (k < Report.nombresPapas.length) {
            Inter.digitarNameP(Report.nombresAlum);
            Report.agregarNombrePap(Inter.nombreP);
            
            k++;
        }

        //Impresión del ARRAY
        Inter.imprimirNota(Report.notas, Report.nombresAlum);

        //IMPRIMIR ESTADISTICAS
        Inter.estadisticas(Report.notas, Report.promedio, Report.contador);
        
        //IMPRIMIR INFORMACION ESTU
        Inter.informacionEstu(Report.nombresAlum,Report.nombresPapas);
      

    }

}
