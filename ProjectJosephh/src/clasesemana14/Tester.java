package clasesemana14;

public class Tester {

    public static void main(String[] args) {
        Perro p1 = new Perro();
        p1.setNombre("Name1"); //Ponerle un nombre, es decir setearle un valor quemado
        p1.getNombre();
        
        
        Perro p2 = new Perro("NAme2", "Verde");
        
       p2.toString();
    }

}
