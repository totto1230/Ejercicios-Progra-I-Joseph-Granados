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

    public double promedio;
    public int[] notas;
    private int ind;
    private int indd;
    public String[] nombresAlum;

    /**
     * Metodo constructor default
     */
    public SistemaNotasReporte() {
    }

    /**
     * Guardar cantidad de espacio para nombres
     */
    public void guardarCampAlum(int CantEst) {
        this.nombresAlum = new String[CantEst];
        indd = 0;
    }

    /**
     * Guardan la cantidad de espacios del arreglo dependiendo del numero de est
     * Metodo constructor para guardar espacis
     *
     * @param CantEst
     */
    public SistemaNotasReporte(int CantEst) {
        this.notas = new int[CantEst];
        ind = 0;
    }

    /**
     *Agregar nombres a los estudiantes
     * 
     */
    public void agregarNombreAlum(String nombre) {
        this.nombresAlum[indd]= nombre;
        indd++;
    }

    /**
     * Metodo para Agregar las notas al array
     */
    public void agregarNota(int nota) {

        notas[ind] = nota;
        ind++;

    }

    /**
     * Metodo para calcular la nota promedio, la más alta y la más baja Se
     * utiliza el famoso bubblesort para ordenarlo de mayor a menor. En pocas
     * palabras este metodo es estadistico.
     */
    public void generarReporteTodosExamenesOrdenadosPor(int[] array) {
        int suma = 0;
        int n = array.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    //swap elements  
                    temp = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;

                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            suma = suma + array[i];

        }
        this.promedio = suma / array.length;

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

   

    /**
     * metodo GET
     */
    public int getNotas(int i) {
        return notas[i];
    }

}
