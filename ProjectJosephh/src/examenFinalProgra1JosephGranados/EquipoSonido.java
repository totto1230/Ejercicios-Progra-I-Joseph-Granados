/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenFinalProgra1JosephGranados;

/**
 *
 * @author josep
 */
public class EquipoSonido {

    String[] songs;
    int i;

    public EquipoSonido() {
    }

    public void guardarEspacio(int a) {
        a = 1000;
        this.songs = new String[a];
        this.i = 0;
    }

    public void agregarCancion(String cancion) {
        this.songs[i] = cancion;
        i++;

    }

    public void arrayRandom(String[] array) {
        
        int n = array.length;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (array[j - 1] > array[j]) {
                    temp= array[j-1];
                    array = array[j - 1];
                    array[j - 1] = array[j];
                    array[j] = temp;

                }
            }
        }

    }

}
