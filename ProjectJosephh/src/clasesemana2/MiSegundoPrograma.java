//Segundo programa
package clasesemana2;
public class MiSegundoPrograma {
    public static void main (String[] args){
    final String c3= "Joseph ";
    String f4= "Granados";
    String d7= "Concentrix ";
    int b10 = 5555; 
    int b12= 2; //# parientes padre
    int d3= 4; //# parientes madre
    int u2;
    boolean c15 = false;
    boolean c16 = true;
    float d13 = 10.4444f; //flotanteeeee = f
    double b5 = 222.45333;
    char c17 = 'O'; 
    char c18 = '+';
    u2= b12 + d3;
    int b1, c1, d1, e1;
    b1= 1;
    c1= 2;
    d1= 3;
    e1= 4;
    int b2= 44, c2=444, d2=4444, e2=44444;
    String mascota= "Enana";
   
    System.out.println (mascota.contains(d7));
    System.out.println(c3 + f4 + "\n" + d7 + "\n" + "Carnet" + " :" + b10 + "\n" +
           "total de parientes: " + u2 + "\n" + "tiene covid: " + c15);
    System.out.println("impuestos: " + b5 + "\n" + "salario: " + d13);   
    System.out.println("Tipo de sangre: " + c17 + c18 );  
    System.out.println("Prueba int: " + d1 + " " + c1 );   
   //  String mascota = "Enana";
    System.out.println(mascota.toUpperCase()); //pasa mayuscula
    System.out.println(mascota.contains("ana")); //retorna si el texto existe
    System.out.println(mascota.concat("DelValle")); //concatena
    System.out.println(mascota.endsWith("ana")); //retorna si valor termina ana
    System.out.println(mascota.equals("Enana")); //retorna si el valor es igual
    System.out.println(mascota.length()); //retorna el numero de caracteres
    System.out.println("Los índices:");
    System.out.println(mascota.indexOf("E")); //retorna la posicion de la primera E
    System.out.println(mascota.indexOf("n")); //retorna la posicion de la primera n
    System.out.println(mascota.indexOf("a")); //retorna la posicion de la primera a
    }
}
