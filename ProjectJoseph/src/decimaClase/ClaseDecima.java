package decimaClase;

public class ClaseDecima {

    int iii;

    public void pruebaUno() {
        int iii = 9;
        this.iii = 222;

    }

    public void pruebaDos() {
        int iii = 9;
        this.iii += 222;
        
    }

    public void print() {
        pruebaUno();
        pruebaDos();
        int iii = 11;

        if (false) {
            iii = 777;
        } else {
            iii = 8; // se refiere a la variable global

        }

        System.out.println(iii);
    }

}
