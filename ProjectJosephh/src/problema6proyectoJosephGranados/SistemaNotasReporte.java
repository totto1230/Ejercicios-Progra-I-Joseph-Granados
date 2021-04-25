/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema6proyectoJosephGranados;

import java.util.Arrays;

/**
 *
 * @author josep
 */
public class SistemaNotasReporte {
    public int [] notas;
    int ind;
    
   public SistemaNotasReporte() {
    }

    /**
     *Guardan la cantidad de espacios del arreglo dependiendo del numero de est
     * @param CantEst
     */
    
    //Metodo constructor para guardar espacis
    public SistemaNotasReporte(int CantEst) {
        this.notas= new int[CantEst];
        ind=0;
    }
    
    
    
    public void agregarNota(int nota){
        
        
            while(ind<notas.length){
                notas[ind]=nota;
                ind++;
            }
            
            
            System.out.println(Arrays.toString(notas));
            }

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
/*
    /**
     Enseña todos los exámenes
     */

    public String generarReporteTodosExamenes(){
        
        
        
        
        
        return null;
        
        
        
        
        
    }
    
    /**
     Muestra la info del estudiante, nombre y apellidos de el alumno y de los papás
     * 
     * 
     */
    public String generarReporteTodosAlumnos(){
        
        
        
        return null;
        
        
        
    }
    
    /**
     Muestra las notas más bajas a 70 
     */
    public String generarReporteAlumnosConNotaInferiorA(int nota){
        
        
        
        return null;
        
        
        
    }

    /*
   Ordena las Notas por Nota Ascendiente
     */
    public String generarReporteTodosExamenesOrdenadosPor(String propiedad){
    
    
    
        return null;
    
    
    
    }
    
    
}
