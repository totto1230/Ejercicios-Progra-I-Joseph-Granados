package problema6proyectoJosephGranados;

public class SistemaNotasControlador {

    private SistemaNotasReporte Report;
    private  SistemaNotasInterfaz Inter;
    
    
    
    public void iniciar(){
       
        Inter= new SistemaNotasInterfaz();
        Report= new SistemaNotasReporte(Inter.generarEst());
        Inter.imprimir();
 
        
    }
    
    
    
    

}
