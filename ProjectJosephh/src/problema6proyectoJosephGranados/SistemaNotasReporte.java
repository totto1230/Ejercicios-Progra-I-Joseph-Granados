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

    public int[] notas;
    int ind;

    /**
     Metodo constructor default
     */
    public SistemaNotasReporte() {
    }

    /**
     * Guardan la cantidad de espacios del arreglo dependiendo del numero de est
     *  Metodo constructor para guardar espacis
     * @param CantEst
     */
    
    public SistemaNotasReporte(int CantEst) {
        this.notas = new int[CantEst];
        ind = 0;
    }

    /**
     metodo GET
     */
    public int getNotas(int i) {
        return notas[i];
    }

    /**
     *Metodo para Agregar las notas al array
     */
    public void agregarNota(int nota) {

        notas[ind] = nota;
        ind++;
     // System.out.println(Arrays.toString(notas)); 
    }

    
    /*
    /**
     Enseña todos los exámenes, más una nota promedio, el más alto y el más bajo
     */
    public String generarReporteTodosExamenes() {

        return null;

    }

    /**
     * Muestra la info del estudiante, nombre y apellidos de el alumno y de los
     * papás
     *
     *
     */
    public String generarReporteTodosAlumnos() {

        return null;

    }

    /**
     * Muestra las notas más bajas a 70
     */
    public String generarReporteAlumnosConNotaInferiorA(int nota) {

        return null;

    }

    /*
   Ordena las Notas por Nota Ascendiente
     */
    public String generarReporteTodosExamenesOrdenadosPor(String propiedad) {

        return null;

    }

}
