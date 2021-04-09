package libroCalificaciones;

public class LibroCalificacioness {

    private String nombreDelCurso; // nombre del curso que representa este

    private int[][] calificaciones; // arreglo bidimensional de calificaciones de

// el constructor con dos argumentos inicializa nombreDelCurso y el arreglo
    public void LibroCalificaciones(String nombreDelCurso, int[][] calificaciones) {
        this.nombreDelCurso = nombreDelCurso;
        this.calificaciones = calificaciones;
    }

// método para establecer el nombre del curso
    public void establecerNombreDelCurso(String nombreDelCurso) {
        this.nombreDelCurso = nombreDelCurso;
    }

// método para obtener el nombre del curso
    public String obtenerNombreDelCurso() {
        return nombreDelCurso;
    }

// realiza varias operaciones sobre los datos
    public void procesarCalificaciones() {
// imprime el arreglo de calificaciones
        imprimirCalificaciones();

// llama a los métodos obtenerMinima y obtenerMaxima
        System.out.printf("%n%s %d%n%s %d%n%n", " La calificacion mas baja en el libro de calificaciones es", obtenerMinima(), " La calificacion mas alta en el libro de calificaciones es", obtenerMaxima());

// imprime gráfico de distribución de todas las calificaciones para todas
      
    } // fin del método procesarCalificaciones

// busca la calificación más baja
    public int obtenerMinima() {
// asume que el primer elemento del arreglo calificaciones es el más bajo
        int califBaja = calificaciones[0][0];

// itera a través de las filas del arreglo calificaciones
        for (int[] califEstudiantes : calificaciones) {
// itera a través de las columnas de la fila actual
            for (int calificacion : califEstudiantes) {
// si la calificación es menor que califBaja, la asigna a califBaja
                if (calificacion < califBaja) {
                    califBaja = calificacion;
                }
            }
        }

        return califBaja;
    }

// busca la calificación más alta
    public int obtenerMaxima() {
// asume que el primer elemento del arreglo calificaciones es el más alto
        int califAlta = calificaciones[0][0];

// itera a través de las filas del arreglo calificaciones
        for (int[] califEstudiantes : calificaciones) {
// itera a través de las columnas de la fila actual
            for (int calificacion : califEstudiantes) {
// si la calificación es mayor que califAlta, la asigna a califAlta
                if (calificacion > califAlta) {
                    califAlta = calificacion;
                }
            }
        }

        return califAlta;
    }

// determina la calificación promedio para un conjunto específico de
    public double obtenerPromedio(int[] conjuntoDeCalif) {
        int total = 0;

// suma las calificaciones para un estudiante
        for (int calificacion : conjuntoDeCalif) {
            total += calificacion;
        }

// devuelve el promedio de calificaciones
        return (double) total / conjuntoDeCalif.length;
    }

// imprime gráfico de barras que muestra la distribución de calificaciones en
    {
        System.out.println("Distribucion de calificaciones en general:");

        // almacena la frecuencia de las calificaciones en cada rango de 10
        int[] frecuencia = new int[11];

        // para cada calificación en LibroCalificaciones, incrementa la frecuencia
        for (int[] califEstudiantes : calificaciones) {
            for (int calificacion : califEstudiantes) {
                ++frecuencia[calificacion / 10];
            }
        }

        // para cada frecuencia de calificaciones, imprime una barra en el gráfico
        for (int cuenta = 0; cuenta < frecuencia.length; cuenta++) {
            // imprime etiquetas de las barras ("00-09: ", ..., "90-99: ", "100: ")
            if (cuenta == 10) {
                System.out.printf("%5d: ", 100);
            } else {
                System.out.printf("%02d-%02d: ",
                        cuenta * 10, cuenta * 10 + 9);
            }

            // imprime barra de asteriscos
            for (int estrellas = 0; estrellas < frecuencia[cuenta]; estrellas++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

    // imprime el contenido del arreglo calificaciones
    public void imprimirCalificaciones() {
        System.out.println("Las calificaciones son:%n%n");
        System.out.print(" "); // alinea encabezados de columnas

        // crea un encabezado de columna para cada una de las pruebas
        for (int prueba = 0; prueba < calificaciones[0].length; prueba++) {
            System.out.printf("Prueba %d ", prueba + 1);
        }

        System.out.println("Promedio"); // encabezado de columna de promedio de

        // crea filas/columnas de texto que representan el arreglo calificaciones
        for (int estudiante = 0; estudiante < calificaciones.length; estudiante++) {
            System.out.printf("Estudiante %2d", estudiante + 1);

            for (int prueba : calificaciones[estudiante]) // imprime calificaciones
            {
                System.out.printf("%8d", prueba);
            }

            // pasa fila de calificaciones como argumento para obtenerPromedio
            double promedio = obtenerPromedio(calificaciones[estudiante]);
            System.out.printf("%9.2f%n", promedio);
        }
    }
}
