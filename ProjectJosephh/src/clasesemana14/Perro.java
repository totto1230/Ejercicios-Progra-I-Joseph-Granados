
package clasesemana14;

public class Perro {
    public String nombre;
    public static int contador;
    public String color;
    
    
    public Perro() {
     
    }

    public Perro(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Perro{" + "nombre=" + nombre + ", color=" + color + '}';
    }

    public static void setContador(int contador) {
        Perro.contador = contador;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    
    
    
    //Metodo Constructor para construir el objeto, es decir, le da el valor al objeto

  
     public Perro(String nombre) {
        this.nombre = nombre;
    }
    
   
    //Para poner el nombre, para enviar el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Obtener el nombre, para jalar el nombre
    public String getNombre() {
        return nombre;
    }

    //Obtener el nombre, para jalar el nombre
    public static int getContador() {
        return contador;
    }

   

    
    
    
}
