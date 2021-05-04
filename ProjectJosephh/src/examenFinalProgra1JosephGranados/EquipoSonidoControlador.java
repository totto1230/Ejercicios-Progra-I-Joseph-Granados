package examenFinalProgra1JosephGranados;

public class EquipoSonidoControlador {

    EquipoSonidoVista vista = new EquipoSonidoVista();
    EquipoSonido modelo = new EquipoSonido();

    public void iniciar() {
        vista.welcome();

        vista.pedirCancion();
        vista.menu();
        vista.menuOption();
        vista.cancionElegida();
        
        
        
        switch (vista.opcion) {
            case 1:
                vista.desabilitar();
                if (vista.opcionDesabilitar == 1) {
                    vista.subwoofer(modelo.songs);
                    vista.parlanteIz(modelo.songs);
                    
                } else if (vista.opcionDesabilitar == 2) {
                    vista.subwoofer(modelo.songs);
                    vista.parlanteDere(modelo.songs);

                } else if (vista.opcionDesabilitar == 3) {
                    vista.parlanteIz(modelo.songs);
                    vista.parlanteDere(modelo.songs);
                    
                } else if (vista.opcionDesabilitar == 4) {
                    vista.mute();

                } else if (vista.opcionDesabilitar == 5) {
                    vista.parlanteIz(modelo.songs);
                    vista.parlanteDere(modelo.songs);
                    vista.subwoofer(modelo.songs);
                }

                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;

        }

    }

}
