package examenFinalProgra1JosephGranados;

public class EquipoSonidoControlador {

    EquipoSonidoVista vista = new EquipoSonidoVista();
    EquipoSonido modelo = new EquipoSonido();

    public void iniciar() {
        int i = 0;
        vista.welcome();
        modelo.guardarEspacio();

        while (i < 3) {
            vista.pedirCancionInicio();
            modelo.agregarCancion(vista.pedirCancionInicio);
            i++;
        }

        
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
                vista.pedirCancion();
                modelo.agregarCancion(vista.cancion);
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
                if (vista.opcionDesabilitar == 1) {
                    vista.subwoofer(modelo.songs);
                    vista.parlanteIz(modelo.songs);
                    vista.volumeImpre(vista.volume);

                } else if (vista.opcionDesabilitar == 2) {
                    vista.subwoofer(modelo.songs);
                    vista.parlanteDere(modelo.songs);
                    vista.volumeImpre(vista.volume);

                } else if (vista.opcionDesabilitar == 3) {
                    vista.parlanteIz(modelo.songs);
                    vista.parlanteDere(modelo.songs);
                    vista.volumeImpre(vista.volume);

                } else if (vista.opcionDesabilitar == 4) {
                    vista.mute();

                } else if (vista.opcionDesabilitar == 5) {
                    vista.parlanteIz(modelo.songs);
                    vista.parlanteDere(modelo.songs);
                    vista.subwoofer(modelo.songs);
                    vista.volumeImpre(vista.volume);
                }
                break;
            case 7:
                vista.volume();
                vista.volumeImpre(vista.volume);
                break;

        }

    }

}
