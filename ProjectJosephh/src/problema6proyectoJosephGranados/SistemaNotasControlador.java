package problema6proyectoJosephGranados;

//El diagrama UML fue subido acá: https://drive.google.com/drive/folders/1vVy5UmQwwKEpI6TGjkd6aKisMZBbpVsc?usp=sharing
import java.util.Arrays;

public class SistemaNotasControlador {

    private SistemaNotasReporte Report;
    private final SistemaNotasInterfaz Inter = new SistemaNotasInterfaz();
    //Estas variables sirven para digitar N veces el valor en el ARRAY
    private int i = 0;
    private int j = 0;
    private int k = 0;

    public void iniciar() {
        int cont = 1;
        //Impresion mensaje WELCOME
        Inter.welcome();
        //Elegir el modo
        Inter.elegirModo();

        if (Inter.modo == 1) {
            //Agregar el lenght al array; es decir, reservar espacio
            Inter.ingresarEstuGra();

            //AGREGAMOS LAS NOTAS AL ARRAY
            Report = new SistemaNotasReporte(Inter.cantEst);
            while (i < Report.notas.length) {
                Inter.agregarNotaGra();
                if (Inter.nota > 100) {
                    Inter.errorDigitarGra();
                    Inter.agregarNotaGra();
                    Report.generarReporteAlumnosConNotaInferiorA(Inter.nota);
                    Report.agregarNota(Inter.nota);
                } else {
                    Report.generarReporteAlumnosConNotaInferiorA(Inter.nota);
                    Report.agregarNota(Inter.nota);

                }
                i++;
            }

            //Agregar el length al array de nombres; es decir, reservar espacio
        /*    Report.guardarCampAlum(Inter.cantEst);
            Report.guardarCampPap(Inter.cantEst);

            //AGREGAMOS NOMBRES
            while (j < Report.nombresAlum.length) {
                Inter.digitarNameGra();
                Report.agregarNombreAlum(Inter.nombre);
                j++;
            }

            //AGREGAMOS Nombres PAPAS
            while (k < Report.nombresPapas.length) {
                Inter.digitarNamePaGra();
                Report.agregarNombrePap(Inter.nombreP);

                k++;
            }*/

            Inter.agregarEtis();
            Inter.agregarBoton(Report.notas, Report.promedio, Report.contador);
            
        }

        if (Inter.modo == 2) {

            cont = 1;
            int option = 0;

            //Agregar el lenght al array; es decir, reservar espacio
            Inter.generarEst();

            //AGREGAMOS LAS NOTAS AL ARRAY
            Report = new SistemaNotasReporte(Inter.cantEst);
            while (i < Report.notas.length) {
                Inter.digitarNota();
                if (Inter.nota > 100) {
                    Inter.errorDigitar();
                    Inter.digitarNota();
                    Report.generarReporteAlumnosConNotaInferiorA(Inter.nota);
                    Report.agregarNota(Inter.nota);
                } else {
                    Report.generarReporteAlumnosConNotaInferiorA(Inter.nota);
                    Report.agregarNota(Inter.nota);

                }
                i++;
            }
            while (cont == 1) {
                //IMPRIMIR OPCIONES Y GENERAR LA OPCION
                Inter.imprimir_opcion();
                option = Inter.generarOp();

                switch (option) {
                    /*      OPTIONS:
            
           
           1. Ordenar Notas de Mayor a menor, 2. AGREGAR LOS NOMBRES , 3. IMPRIMIR NOTAS, 4. GENERAR REPORTE DE ESTADISTICAS, 5. IMPRIMIR INFO DEL ESTUDIANTE
                
                     */

                    case 1:

                        //Sirve para ordenar el array de menor a mayor
                        Report.generarReporteTodosExamenesOrdenadosPor(Report.notas);

                        Inter.arrayOrdenado(Report.notas);

                        break;

                    case 2:
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
                    case 3:
                        //Impresión del ARRAY
                        Inter.imprimirNota(Report.notas, Report.nombresAlum);
                        break;
                    case 4:
                        //IMPRIMIR ESTADISTICAS
                        Inter.estadisticas(Report.notas, Report.promedio, Report.contador);
                        break;
                    case 5:
                        //IMPRIMIR INFORMACION ESTU
                        Inter.informacionEstu(Report.nombresAlum, Report.nombresPapas);
                        break;
                    default:

                }
                cont = Inter.impriCont();

            }
        }

    }

}
