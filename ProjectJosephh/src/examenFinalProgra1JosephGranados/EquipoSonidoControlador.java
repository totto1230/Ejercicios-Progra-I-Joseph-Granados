package examenFinalProgra1JosephGranados;

import java.util.Date;

public class EquipoSonidoControlador {

    private EquipoSonidoVista vista = new EquipoSonidoVista();
    private EquipoSonido modelo = new EquipoSonido();
    private Reloj reloj;

    public void iniciar() {
        int i = 0;
        vista.welcomee();
        if (vista.opcionInicio == 1) {

            vista.radio();
        } else {
            vista.welcome();
            modelo.guardarEspacio(vista.cancionNumber);

            while (i < modelo.songs.length) {
                vista.pedirCancionInicio(modelo.songs);
                modelo.agregarCancion(vista.pedirCancionInicio);
                i++;
            }

            while (vista.optionContinue == 1) {
                vista.menu();
                vista.menuOption();
                switch (vista.opcion) {
                    case 1:
                        //REPRODUCIR CANCIONES RANDOM
                        vista.parlanteIz(modelo.songs);
                        vista.parlanteDere(modelo.songs);
                        vista.subwoofer(modelo.songs);

                        break;
                    case 2:
                        //RANDOM SONGS
                        modelo.arrayRandom(modelo.songs);
                        vista.parlanteIz(modelo.songs);
                        vista.parlanteDere(modelo.songs);
                        vista.subwoofer(modelo.songs);

                        break;
                    case 3:
                        //Imprimir cancion
                        vista.mostrarLista(modelo.songs);
                        break;
                    case 4:
                        //Agregar una cancion
                        modelo.guardarEspacio((vista.cancionNumber + 1));
                        vista.pedirCancion();
                        modelo.agregarCancionDesdeMenu(vista.cancion, vista.cancionNumber);
                        break;
                    case 5:
                        //Eliminar Cancion
                        vista.optionDelete();

                        vista.delete(modelo.songs, vista.optionDelete);
                        modelo.delete(vista.optionDelete);
                        break;

                    case 6:
                        //OPCION DE PARLANTES 
                        vista.desabilitar();
                        switch (vista.opcionDesabilitar) {
                            case 1:
                                vista.subwoofer(modelo.songs);
                                vista.parlanteIz(modelo.songs);
                                vista.volumeImpre(vista.volume);
                                break;
                            case 2:
                                vista.subwoofer(modelo.songs);
                                vista.parlanteDere(modelo.songs);
                                vista.volumeImpre(vista.volume);
                                break;
                            case 3:
                                vista.parlanteIz(modelo.songs);
                                vista.parlanteDere(modelo.songs);
                                vista.volumeImpre(vista.volume);
                                break;
                            case 4:
                                vista.mute();
                                break;
                            case 5:
                                vista.parlanteIz(modelo.songs);
                                vista.parlanteDere(modelo.songs);
                                vista.subwoofer(modelo.songs);
                                vista.volumeImpre(vista.volume);
                                break;
                            default:
                                break;
                        }
                        break;

                    case 7:
                        vista.volume();
                        vista.volumeImpre(vista.volume);
                        break;
                    case 8:
                        vista.obtenerMinHoras();
                        reloj.setAlarm(vista.hora, vista.minutos);
                        break;

                }
                vista.optionContinue();
            }
        }

    }
}
