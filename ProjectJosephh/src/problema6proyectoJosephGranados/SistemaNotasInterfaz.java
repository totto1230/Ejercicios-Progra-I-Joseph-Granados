package problema6proyectoJosephGranados;

import java.util.Arrays;
import java.util.Scanner;

public class SistemaNotasInterfaz {

    int continuar;
    int opcionMenu;
    String nombre;
    String nombreP;
    int nota;
    public int cantEst;
    SistemaNotasReporte model = new SistemaNotasReporte();

    Scanner s = new Scanner(System.in);

    public int generarOp() {
        this.opcionMenu = s.nextInt();
        return opcionMenu;
    }

    public void imprimir_opcion() {
        System.out.println("1. AGREGAR NOTAS, 2. Ordenar Notas de Mayor a menor, 3. AGREGAR LOS NOMBRES , 4. IMPRIMIR NOTAS, 5. GENERAR REPORTE DE ESTADISTICAS, 6. IMPRIMIR INFO DEL ESTUDIANTE");

    }

    public int generarEst() {

        System.out.println("Ingrese la Cantidad de Estudiantes que tiene: ");
        return this.cantEst = s.nextInt();

    }

    public void digitarNota() {

        System.out.println("Agregue la nota: ");
        nota = s.nextInt();

    }

    public void digitarnName() {
        System.out.println("Digite el nombre del estudiante: ");
        nombre = s.next();

    }

    public int impriCont() {
        System.out.println("Desea continuar? 1= Deseo continuar, >2 Deseo retirarme");
        return this.continuar = s.nextInt();

    }

    public void digitarNameP(String[] nameA) {
        int i = 0;

        System.out.println("Digite el nombre del Papa/Mama del alumno " + nameA[i]);
        i++;
        nombreP = s.next();

    }

    public void informacionEstu(String[] name, String nameP[]) {

        int i = 0;
        while (i < name.length) {
            System.out.print("El estudiante numero " + (i + 1) + " es ");
            System.out.println(name[i]);
            System.out.println("El papa del estudiante " + name[i] + " es " + nameP[i]);
            i++;
        }
    }

    /**
     * Este método sirve para imprimir la nota más baja y la más alta, el array
     * digitado, y el promedio
     *
     * @param array
     * @param promedio
     * @param setenta
     * @param name
     */
    public void estadisticas(int[] array, double promedio, int setenta) {
        int a = array.length;

        System.out.println("---------------------------------------");
        System.out.println("Estadisticas");
        System.out.println("La nota más alta fue: " + array[(a - 1)]);
        System.out.println("La nota más baja fue: " + array[0]);
        System.out.println("El promedio de las notas es: " + promedio);
        System.out.println("En total hay " + setenta + " notas menores a 70");
        System.out.println("---------------------------------------");

    }

    /**
     * metodo para imprimir notas con el respectivo estudiante
     *
     * @param array
     * @param name
     */
    public void imprimirNota(int[] array, String[] name) {
        int a = array.length;

        for (int i = 0; i < a; i++) {
            System.out.print(" La nota del estudiante " + name[i]);
            System.out.println("  es " + array[i]);
        }

    }
    
    public void arrayOrdenado(int []array){
        System.out.println(Arrays.toString(model.notas));
        
    }

}
