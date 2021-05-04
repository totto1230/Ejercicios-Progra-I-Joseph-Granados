/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenFinalProgra1JosephGranados;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author josep
 */
public class EquipoSonidoVista {
    String cancion;
    int cancionElegida;
    int opcion = 0;
    int opcionDesabilitar=0;
    Scanner s= new Scanner(System.in);
    public EquipoSonidoVista() {
    }

    
    
    
    
    
    //MENU
    public void menuOption(){
        this.opcion=s.nextInt();
        
        
    }
    public void cancionElegida(){
        System.out.println("Que numero de la cancion quiere elegir: ");
        cancionElegida= s.nextInt();
        
        
    
    }
    
    
    
    //Impresiones
    public void mute(){
        System.out.println("MUTE");
    }
    public void welcome() {
        System.out.println("Bienvenido al mejor equipo de sonido.");

    }
    public void pedirCancion(){
        System.out.println("Por favor agregue al menos una cancion, max 1000");
        cancion= s.next();
    }
    
    public void desabilitar(){
        System.out.println("Antes de reproducir la cancion, desea desabilitar algun parlante");
        System.out.println("1. Derecho, 2. Izquierdo, 3. subwoofer, 4. Todos, 5. Ninguno");
        this.opcionDesabilitar=s.nextInt();
    }
     
    
    public void menu() {
        System.out.println("Que desea hacer? ");
        System.out.println("1. Reproducir la lista en orden");
        System.out.println("2. Reproducir la lista en forma aleatoria");
        System.out.println("3. Mostrar la lista completa");
        System.out.println("4. Agregar nuevo audio");
        System.out.println("5. Eliminar audio");
        System.out.println("6. Salir");

    }

    public void parlanteIz(String []cancion) {
        System.out.println("El parlante izquierdo esta reproduciendo:" + Arrays.toString(cancion));

    }

    public void parlanteDere(String []cancion) {
        System.out.println("El parlante derecho esta reproduciendo:" + Arrays.toString(cancion));

    }
    public void subwoofer(String []cancion) {
        System.out.println("El parlante subwoofer esta reproduciendo:" + Arrays.toString(cancion));

    }
    
    
    
}
