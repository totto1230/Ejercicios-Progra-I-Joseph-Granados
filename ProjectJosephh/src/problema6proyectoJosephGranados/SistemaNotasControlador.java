package problema6proyectoJosephGranados;

public class SistemaNotasControlador {

    private SistemaNotasReporte Report;
    private SistemaNotasInterfaz Inter = new SistemaNotasInterfaz();

    public void iniciar() {
        //Agregar el lenght al array
        Inter.generarEst();
        Report = new SistemaNotasReporte(Inter.cantEst);

        //AGREGAMOS LAS NOTAS AL ARRAY
       
            Inter.digitarNota();
            Report.agregarNota(Inter.nota);

       
    }

}
