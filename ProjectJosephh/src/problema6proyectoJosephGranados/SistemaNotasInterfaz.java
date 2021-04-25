package problema6proyectoJosephGranados;

import java.util.Arrays;
import java.util.Scanner;

public class SistemaNotasInterfaz {
    String nombre;
    int nota;
    public int cantEst;
    //SistemaNotasReporte model = new SistemaNotasReporte();
    
    Scanner s = new Scanner(System.in);

    public int generarEst() {

        System.out.println("Ingrese la Cantidad de Estudiantes que tiene: ");
        return this.cantEst = s.nextInt();

    }

    public void digitarNota() {

        System.out.println("Agregue la nota: ");
        nota = s.nextInt();
      
    }
    
    public void digitarnName(){
        System.out.println("Digite el nomnbre el estudiante: ");
        nombre= s.next();
        
    }

    /**
     *Este método sirve para imprimir la nota más baja y la más alta, el array digitado, y el promedio
     * @param array
     * @param promedio
     * @param name
     */
    public void imprimir(int[] array, double promedio, String[] name){
      int a= array.length;
      
      for (int i=0;i<a; i++ ){
          System.out.print(" La nota del estudiante "+ name[i]);
          System.out.println("  es " + array[i]);
         }
      
      System.out.println("---------------------------------------");
      System.out.println("Estadisticas");
      System.out.println("La nota más alta fue: "+ array [(a-1)]);
      System.out.println("La nota más baja fue: "+ array[0]);
      System.out.println("El promedio de las notas es: "+ promedio );
      System.out.println("---------------------------------------");
  } 
   
}
