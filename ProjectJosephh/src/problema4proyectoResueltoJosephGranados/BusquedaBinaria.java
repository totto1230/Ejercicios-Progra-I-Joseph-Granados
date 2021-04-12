package problema4proyectoResueltoJosephGranados;

import java.util.Arrays;
import java.util.Scanner;

public class BusquedaBinaria {

    PedirYOrdenarArray array1;

    public void Buscar() {
        Scanner s = new Scanner(System.in);
        array1 = new PedirYOrdenarArray();
        //Agarrar el VALOR del array de la otra clase
        array1.PerdirArray();
        int[] arreglo = array1.array;
        int num = array1.num;

        System.out.println(Arrays.toString(arreglo));

        // SE DECLARAN LAS VARIABLES QUE SE VAN A USAR EN LA BUSQUEDA
        int a = 0;
        int b = 1;

        //El primer while sirve para hacer la búsqueda (el anidado) , el segundo sirve para hacer repetir constantemente el número nuevo del user
        while (a < b) {
            System.out.println("Ingrese el número que quiere buscar: ");
            int numDescubrir = s.nextInt();
            System.out.println(" ");
            int min = 0;
            int superior = num - 1;

            while (min <= superior) {
                int mid = (min + superior) / 2;

                if (arreglo[mid] == numDescubrir) {
                    System.out.println("El numero buscado está en la posicion: " + mid);
                    System.out.println(" ");
                    break;
                } else if (numDescubrir < arreglo[mid]) {
                    superior = mid - 1;

                } else {
                    min = mid + 1;

                }
                if (min > superior) {
                    System.out.println("El valor no está en el Array");
                    System.out.println(" ");
                    break;
                }

            }
            System.out.println("Desea continuar: ");
            System.out.println("1 para salir, 2 para continuar");
            int exit = s.nextInt();
            System.out.println(" ");
            if (exit == 1) {
                break;
            }

        }
    }

}
