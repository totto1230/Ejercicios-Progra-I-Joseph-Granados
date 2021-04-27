package problema6proyectoJosephGranados;

import java.util.Arrays;

public class SistemaNotasControlador {

    private SistemaNotasReporte Report;
    private final SistemaNotasInterfaz Inter = new SistemaNotasInterfaz();
    //Estas variables sirven para digitar N veces el valor en el ARRAY
    private int i = 0;
    private int j = 0;
    private int k = 0;

    public void iniciar() {
        int cont=1;
        int option=0;
        //Agregar el lenght al array; es decir, reservar espacio
        Inter.generarEst();
        Report = new SistemaNotasReporte(Inter.cantEst);
      
        while(cont==1){
        //IMPRIMIR OPCIONES Y GENERAR LA OPCION
        Inter.imprimir_opcion();
        option= Inter.generarOp();
        
        switch (option) {
            /*      OPTIONS:
            
            1. AGREGAR NOTAS, 2. AGREGAR LOS NOMBRES , 3. IMPRIMIR NOTAS, 4. GENERAR REPORTE DE ESTADISTICAS, 2. IMPRIMIR INFO DEL ESTUDIANTE
            
                
             */

            case 1:

                //AGREGAMOS LAS NOTAS AL ARRAY
                while (i < Report.notas.length) {
                    Inter.digitarNota();
                    Report.generarReporteAlumnosConNotaInferiorA(Inter.nota);

                    Report.agregarNota(Inter.nota);

                    i++;
                }
                break;

            case 2:
                //Sirve para ordenar el array de mayor a menor
                Report.generarReporteTodosExamenesOrdenadosPor(Report.notas);
                Inter.arrayOrdenado(Report.notas);

                break;
            case 3:
                //Agregar el length al array de nombres; es decir, reservar espacio
                Report.guardarCampAlum(Inter.cantEst);
                Report.guardarCampPap(Inter.cantEst);

                //AGREGAMOS NOMBRES
                while (j < Report.nombresAlum.length) {
                    Inter.digitarnName();
                    Report.agregarNombreAlum(Inter.nombre);
                    j++;
                }

                //AGREGAMOS Nombres PAPAS
                while (k < Report.nombresPapas.length) {
                    Inter.digitarNameP(Report.nombresAlum);
                    Report.agregarNombrePap(Inter.nombreP);

                    k++;
                }
                break;
            case 4:
                //Impresión del ARRAY
                Inter.imprimirNota(Report.notas, Report.nombresAlum);
                break;
            case 5:
                //IMPRIMIR ESTADISTICAS
                Inter.estadisticas(Report.notas, Report.promedio, Report.contador);
                break;
            case 6:

                //IMPRIMIR INFORMACION ESTU
                Inter.informacionEstu(Report.nombresAlum, Report.nombresPapas);
                break;
            default:
               
        }
       cont= Inter.impriCont();

    }
    }

}
