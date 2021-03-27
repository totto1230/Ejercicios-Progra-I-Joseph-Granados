package clasesemana8;

import java.util.Date;

public class Persona {

    //propiedades
    public String nombre1;
    public String nombre2;
    private int version = 222;
    private String lugar;
    private String cedula1;
    private String cedula2;

    public void imprim() {
        String texto = "Se casan" + nombre1 + " " + nombre2 + " " + version + cedula2 + cedula1 + lugar;
        System.out.println(texto);
        imprimirFecha();

    }

    private void imprimirFecha() {
        Date fecha = new Date();
        System.out.println(fecha);

    }

    public void setLugar(String lugar) {
        if (lugar.length() != 6) {
            System.out.println("Num Invalid");
        } else {
            this.lugar = lugar;
        }
    }

    public void setCedula1(String cedula1) {
        if (cedula1.length() != 6) {
            System.out.println("Num Invalid");
        } else {
            this.cedula1 = cedula1;
        }
    }

    public void setCedula2(String cedula2) {
        if (cedula2.length() != 6) {
            System.out.println("Num Invalid");
        } else {
            this.cedula2 = cedula2;
        }
    }

    public String getCedula1() {
        return cedula1;
    }

    public String getCedula2() {
        return cedula2;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre1=" + nombre1 + ", nombre2=" + nombre2 + ", version=" + version + ", lugar=" + lugar + ", cedula1=" + cedula1 + ", cedula2=" + cedula2 + '}';
    }

    
}
