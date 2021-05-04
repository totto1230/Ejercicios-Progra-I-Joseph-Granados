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

    protected String[] songs;
    private int i;

    public EquipoSonido() {
    }

    public void guardarEspacio() {
        int a = 1000;
        this.songs = new String[a];
        i = 0;
    }

    public void agregarCancion(String cancion) {
        this.songs[i] = cancion;
        i++;

    }

    public String[] arrayRandom(String[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = array[array.length - 1];

        }
        return this.songs = array;
    }

    public void delete(int delete) {
        this.songs[delete] = "";

    }
}
