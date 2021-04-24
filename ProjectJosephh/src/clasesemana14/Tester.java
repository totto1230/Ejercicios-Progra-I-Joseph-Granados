package clasesemana14;

public class Tester {

    public static void main(String[] args) {
        Perro p1 = new Perro();
        p1.setNombre("Name1"); //Ponerle un nombre, es decir setearle un valor quemado
        p1.setColor("RED");
        Perro.contador++;
        Perro.aumento();
        
        Perro p2 = new Perro("NAme2", "Verde");
        Perro.aumento();
        System.out.println(p1.nombre);
        System.out.println(p2.nombre);
        System.out.println(p1.color);
        System.out.println(p2.color);
       // System.out.println(Perro.contador);
    }

}
