package problema6proyectoJosephGranados;

import java.util.Arrays;
import java.util.Scanner;

public class SistemaNotasInterfaz {

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

    /**
     *Este método sirve para imprimir la nota más baja y la más alta
     */
    public void imprimir(int[] array, double promedio){
      int a= array.length;
      
      System.out.println("La nota más alta fue: "+ array [(a-1)]);
      System.out.println("La nota más baja fue: "+ array[0]);
      System.out.println("El promedio de las notas es: "+ promedio );
  } 
   
}
