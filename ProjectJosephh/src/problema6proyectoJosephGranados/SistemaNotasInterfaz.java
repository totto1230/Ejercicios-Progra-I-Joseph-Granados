package problema6proyectoJosephGranados;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

//El diagrama UML fue subido acá: https://drive.google.com/drive/folders/1vVy5UmQwwKEpI6TGjkd6aKisMZBbpVsc?usp=sharing
public class SistemaNotasInterfaz extends JFrame {

    JFrame frame;
    JButton boton;
    JButton boton1;
    JButton boton2;
    JButton boton3;
    JButton boton4;
    JButton boton5;
    int modo = 0;
    int continuar;
    int opcionMenu;
    String nombre;
    String nombreP;
    int nota;
    public int cantEst;
    SistemaNotasReporte model = new SistemaNotasReporte();

    Scanner s = new Scanner(System.in);

    //Metodos de la parte grafica
    public void agregarNotaGra() {

        nota = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota"));
    }

    public void ingresarEstuGra() {
        cantEst = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de estudiantes que tiene"));

    }

    public void agregarEtis() {

        //HACER LA VENTANA, ETIQUETAS, ETC
        this.setTitle("Mejor programa para organizar mejor las notas");
        this.setSize(1000, 1000);
        this.setLayout(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLabel eti = new JLabel();
        JLabel eti1 = new JLabel();
        JLabel eti2 = new JLabel();
        eti.setText("Bienvenidos al mejor programa para organizar mejor las notas y ayudar a los profesores a organizar las notas");
        eti1.setText("Dev: Joseph Granados");
        eti2.setText("Opciones del programa: ");
        eti.setBounds(200, -450, 1000, 1000);
        eti1.setBounds(450, -400, 1000, 1000);
        eti2.setBounds(450, -350, 1000, 1000);
        this.add(eti);
        this.add(eti1);
        this.add(eti2);

    }

    public void names() {
        digitarNameGra();
        digitarNamePaGra();
    }

    public void digitarNameGra() {
        nombre = (String) JOptionPane.showInputDialog("Ingrese el nombre del estudiante: ");

    }

    public void digitarNamePaGra() {
        nombreP = (String) JOptionPane.showInputDialog("Ingrese el nombre del papa: ");

    }

    public void agregarBoton(int[] array, double promedio, int setenta) {

        //Instanciando las interfaces del action listener
        ActionListener oyente1 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame jf = new JFrame();
                jf.setTitle("Notas ordenadas");
                jf.setSize(500, 500);
                jf.setLayout(null);
                jf.setVisible(true);
                jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
                JLabel eti = new JLabel();
                eti.setText("El arreglo ordenado " + Arrays.toString(array));
                eti.setBounds(150, 100, 250, 250);
                jf.add(eti);
            }
        };
        ActionListener oyente2;
        oyente2 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int i = 0;
                while (i < array.length) {
                    names();
                    i++;
                    break;
                }
            }
        };

        ActionListener oyente4 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a = array.length;
                JFrame jf = new JFrame();
                jf.setTitle("Estadisticas");
                jf.setSize(500, 500);
                jf.setLayout(null);
                jf.setVisible(true);
                jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
                JLabel eti = new JLabel();
                JLabel eti1 = new JLabel();
                JLabel eti2 = new JLabel();
                JLabel eti3 = new JLabel();
                eti.setText("La nota más alta fue: " + array[(a - 1)]);
                eti.setBounds(150, 25, 250, 250);
                eti1.setText("La nota más baja fue: " + array[0]);
                eti1.setBounds(150, 75, 250, 250);
                eti2.setText("El promedio de las notas es: " + promedio);
                eti2.setBounds(150, 140, 250, 250);
                eti3.setText("En total hay " + setenta + " notas menores a 70");
                eti3.setBounds(150, 190, 250, 250);
                jf.add(eti);
                jf.add(eti1);
                jf.add(eti2);
                jf.add(eti3);

            }
        };
        ActionListener oyente5 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        };

        //AGREGAR BOTONES
        boton1 = new JButton("Ordenar Notas de Mayor a menor");
        boton1.addActionListener(oyente1);
        boton1.setBounds(300, 300, 400, 100);
        boton1.setBackground(Color.LIGHT_GRAY);
        add(boton1);

        boton2 = new JButton("AGREGAR LOS NOMBRES");
        boton2.setBounds(300, 400, 400, 100);
        boton2.setBackground(Color.LIGHT_GRAY);
        add(boton2);
        boton2.addActionListener(oyente2);

        /*  boton3 = new JButton("IMPRIMIR NOTAS");
        boton3.setBounds(300, 500, 400, 100);
        boton3.setBackground(Color.LIGHT_GRAY);
        add(boton3);
        boton3.addActionListener(oyente3);*/
        boton4 = new JButton("GENERAR REPORTE DE ESTADISTICAS");
        boton4.setBounds(300, 500, 400, 100);
        boton4.setBackground(Color.LIGHT_GRAY);
        add(boton4);
        boton4.addActionListener(oyente4);

        boton5 = new JButton("IMPRIMIR INFO DEL ESTUDIANTE");
        boton5.setBounds(300, 600, 400, 100);
        boton5.setBackground(Color.LIGHT_GRAY);
        add(boton5);
        boton5.addActionListener(oyente5);

    }

    //ERRORES/ALERTAS
    public void errorDigitar() {
        System.out.println("Ingrese un valor valido, 0-100!");
    }

    public void errorDigitarGra() {
        JFrame jf = new JFrame();
        jf.setTitle("Error");
        jf.setSize(500, 500);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JLabel eti = new JLabel();
        eti.setText("Ingrese un valor valido, 0-100!");
        eti.setBounds(150, 100, 250, 250);
        jf.add(eti);

    }

    //PARTE De LA CONSOLE
    //IMPRESIONES
    public void imprimir_opcion() {
        System.out.println(" ");
        System.out.println("Qué desea hacer?");
        System.out.println(" ");
        System.out.println(" 1. Ordenar Notas de Mayor a menor, 2. AGREGAR LOS NOMBRES , 3. IMPRIMIR NOTAS, 4. GENERAR REPORTE DE ESTADISTICAS, 5. IMPRIMIR INFO DEL ESTUDIANTE");
        System.out.println(" ");

    }

    public int impriCont() {
        System.out.println(" ");
        System.out.println("Desea continuar? 1= Deseo continuar, >2 Deseo retirarme");
        System.out.println(" ");
        return this.continuar = s.nextInt();

    }

    public void informacionEstu(String[] name, String nameP[]) {

        int i = 0;
        while (i < name.length) {
            System.out.println(" ");
            System.out.print("El estudiante numero " + (i + 1) + " es ");
            System.out.println(" ");
            System.out.println(name[i]);
            System.out.println(" ");
            System.out.println("El papa del estudiante " + name[i] + " es " + nameP[i]);
            System.out.println(" ");
            i++;
        }
    }

    public void arrayOrdenado(int[] array) {

        System.out.println(Arrays.toString(array));

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
        System.out.println(" ");
        System.out.println("La nota más alta fue: " + array[(a - 1)]);
        System.out.println(" ");
        System.out.println("La nota más baja fue: " + array[0]);
        System.out.println(" ");
        System.out.println("El promedio de las notas es: " + promedio);
        System.out.println(" ");
        System.out.println("En total hay " + setenta + " notas menores a 70");
        System.out.println(" ");
        System.out.println("---------------------------------------");

    }

    public void welcome() {
        System.out.println("---------------------------------------");
        System.out.println(" ");
        System.out.println("Bienvenidos al mejor programa para organizar mejor las notas y ayudar a los profesores a organizar las notas");
        System.out.println(" ");
        System.out.println("Dev: Joseph Granados");
        System.out.println(" ");

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
            System.out.println(" ");
            System.out.print(" La nota del estudiante " + name[i]);
            System.out.println("  es " + array[i]);
            System.out.println(" ");
        }

    }

    //Scanners
    public void digitarNameP(String[] nameA) {
        int i = 0;
        System.out.println(" ");
        System.out.println("Digite el nombre del Papa/Mama del alumno " + nameA[i]);
        System.out.println(" ");
        i++;
        nombreP = s.next();

    }

    public int generarEst() {

        System.out.println("Ingrese la Cantidad de Estudiantes que tiene: ");
        System.out.println(" ");
        return this.cantEst = s.nextInt();

    }

    public void digitarNota() {
        System.out.println(" ");
        System.out.println("Agregue la nota: ");
        System.out.println(" ");
        nota = s.nextInt();

    }

    public void digitarnName() {
        System.out.println(" ");
        System.out.println("Digite el nombre del estudiante: ");
        System.out.println(" ");
        nombre = s.next();

    }

    public void elegirModo() {
        System.out.println("Qué modo desea elegir? \n 1. Modo gráfico, 2. Por la consola");
        modo = s.nextInt();

    }

    public int generarOp() {
        this.opcionMenu = s.nextInt();
        return opcionMenu;
    }
}
