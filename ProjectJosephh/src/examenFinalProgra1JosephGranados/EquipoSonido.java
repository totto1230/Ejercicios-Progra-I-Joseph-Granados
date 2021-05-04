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

    public void guardarEspacio(int a) {

        this.songs = new String[a];
        i = 0;
    }

    public void agregarCancion(String cancion) {
        this.songs[i] = cancion;
        i++;

    }
    public void agregarCancionDesdeMenu(String cancion, int z) {
        this.songs[z] = cancion;
      
    }
    

    public String[] arrayRandom(String[] array) {
        int a = array.length - 1;
        int b = 0;
        for (int j = 0; j < array.length; j++) {

        }
        return this.songs = array;
    }

    public void delete(int delete) {
        this.songs[delete] = "";

    }
}
