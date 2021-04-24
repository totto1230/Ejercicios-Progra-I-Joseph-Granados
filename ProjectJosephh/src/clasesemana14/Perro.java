
package clasesemana14;

import java.util.Objects;

public class Perro {
    public String nombre;
    public static int contador;
    public String color;
    
    public static void aumento(){
        contador++;
        System.out.println(contador);
    
    
}

  /*  @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Perro other = (Perro) obj;
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return true;
    }*/
    
    
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
