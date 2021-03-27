package ClaseSemana11;

import java.util.Scanner;

public class DestinoVIaje {

    String pais;
    double duracion;
    float distancia;
    int precios;

    public void Datos() {
        Scanner s = new Scanner(System.in);
        this.distancia = s.nextFloat();
        this.duracion = s.nextDouble();
        this.precios = s.nextInt();
        this.pais = s.next();
    }

    @Override
    public String toString() {
        return "DestinoVIaje{" + "pais=" + pais + ", duracion=" + duracion + ", distancia=" + distancia + ", precios=" + precios + '}';
    }

    public String getPais() {
        return pais;
    }

    public double getDuracion() {
        return duracion;
    }

    public float getDistancia() {
        return distancia;
    }

    public int getPrecios() {
        return precios;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public void setPrecios(int precios) {
        this.precios = precios;
    }

}
