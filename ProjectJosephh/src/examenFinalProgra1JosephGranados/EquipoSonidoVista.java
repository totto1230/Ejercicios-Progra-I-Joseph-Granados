/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenFinalProgra1JosephGranados;

import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author josep
 */
public class EquipoSonidoVista {
    JFrame frame;
    JLabel eti;
    int optionContinue = 1;
    int cancionNumber = 0;
    String pedirCancionInicio;
    String cancion;
    int cancionElegida;
    int opcion = 0;
    int opcionDesabilitar = 0;
    int optionDelete = 0;
    int volume = 5;
    Scanner s = new Scanner(System.in);

    public EquipoSonidoVista() {
    }

    //MENU
    public void menuOption() {
        this.opcion = s.nextInt();

    }

    /* public void cancionElegida() {
        System.out.println("Que numero de la cancion quiere elegir: ");
        cancionElegida = s.nextInt();

        
    }*/
    public void radio(){
        frame.setBounds(500, opcion, opcion, opcion);
        
    }
    
    public void optionContinue() {
        System.out.println("Desea continuar? 1. Si deseo continuar, >2. Deseo salir");
        optionContinue = s.nextInt();

    }

    public void optionDelete() {
        System.out.println("Que numero de cancion desea eliminar?");
        optionDelete = s.nextInt();

    }

    //Impresiones
    public void volume() {
        System.out.println("Por default el programa inicia en un volumen 5, desea bajarlo o subir? Valores permitidos: 1-10");
        volume = s.nextInt();

    }

    public void volumeImpre(int volume) {
        System.out.println("Los parlantes estan a un volumen de " + volume);

    }

    public void exit() {
        System.out.println("Seleciono salir, no olvide depositar al dev mediante paypal para mejorar el programa");

    }

    public void mute() {
        System.out.println("MUTE");
    }

    public void welcome() {
        System.out.println("Bienvenido al mejor equipo de sonido.");
        System.out.println("Dev: Joseph Granados");
        System.out.println("Cuantas canciones desea agregar? Max 1000, para tener acceso a mas canciones, escribir a joseph.granados@hotmail.com");
        cancionNumber = s.nextInt();
        System.out.println("");
    }

    public void pedirCancion() {
        System.out.println("Por favor agregue al menos una cancion, max 1000");
        cancion = s.next();
    }

    public void desabilitar() {
        System.out.println("Que parlante(s)desea desabilitar?");
        System.out.println("1. Derecho, 2. Izquierdo, 3. subwoofer, 4. Todos, 5. Ninguno");
        this.opcionDesabilitar = s.nextInt();
        System.out.println("");
    }

    public void menu() {
        System.out.println("");
        System.out.println("Que desea hacer? ");
        System.out.println("1. Reproducir la lista en orden");
        System.out.println("2. Reproducir la lista en forma aleatoria");
        System.out.println("3. Mostrar la lista completa");
        System.out.println("4. Agregar nuevo audio");
        System.out.println("5. Eliminar audio");
        System.out.println("6. Modificar Parlante");
        System.out.println("7. Subir o bajar volumen");
        System.out.println("8. Escuchar la radio (Unica emisora de internet)");
        System.out.println("9. Crear alarma de encendido");
        System.out.println("10. Salir");
        System.out.println("");
    }

    public void pedirCancionInicio(String[] array) {
        System.out.println("");
        System.out.println("Para iniciar tu experiencia con buen pie, ingrese " + array.length + " canciones, mas adelante podras modificar tu playlist");

        pedirCancionInicio = s.next();

    }

    public void delete(String[] array, int option) {

        System.out.println("Seleccionaste eliminar la cancion" + array[option]);

    }

    public void parlanteIz(String[] cancion) {
        System.out.println("El parlante izquierdo esta reproduciendo:" + Arrays.toString(cancion));

    }

    public void parlanteDere(String[] cancion) {
        System.out.println("El parlante derecho esta reproduciendo:" + Arrays.toString(cancion));

    }

    public void subwoofer(String[] cancion) {
        System.out.println("El parlante subwoofer esta reproduciendo:" + Arrays.toString(cancion));

    }

    public void mostrarLista(String[] canciones) {

        System.out.println("La lista completa de canciones es la siguiente: " + Arrays.toString(canciones));
    }

}
