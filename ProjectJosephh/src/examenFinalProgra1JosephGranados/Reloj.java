/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenFinalProgra1JosephGranados;

import java.util.Date;

/**
 *
 * @author josep
 */
public class Reloj {

    EquipoSonidoVista vista;
    int Alarm;
    int hora;
    int min;

    public void setAlarm(int horas, int minutos) {
        vista = new EquipoSonidoVista();
        vista.imprmirAlarm(horas, minutos);
    }

    public int getHora() {
        return hora;
    }

    public int getMin() {
        return min;
    }

}
