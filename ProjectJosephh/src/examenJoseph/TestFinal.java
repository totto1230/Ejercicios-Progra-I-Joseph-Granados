package examenJoseph;

//Examen de Joseph Granados Matamoros
import java.util.Scanner;

public class TestFinal {

    public static void main(String[] args) {
        /*Declaracion para llamar los metodos desde el MAIN y la declaracion de continue para seguir usando 
el menu o no */
        Scanner entry = new Scanner(System.in);
        TestFinal me= new TestFinal();
        boolean continuar = true;
        int contadorCovid = 0;
        String name = "";
        String apellido1 = "";
        String apellido2 = "";
        byte edad = 0;
        char gen = 0;
        boolean covid = true;
        short salud = 0;
        boolean citta = true;
//MENU
        System.out.print(" Digite lo que quiere hacer:" + "\n" + " 1. Ingresar datos" + "\t" + "\n" + "2. Imprimir datos Ingresados" + "\t" + "\n" + " 3. Inyeccion" + "\t" + "4. Borrar Datos" + "\n " + "5. Continuar Usando el menu" + "\t" + "6. Salir ");
//Declaracion de la variable para seleccionar el menu
        byte menu = entry.nextByte();
//Opciones del menu
        switch (menu) {
            //INGRESO DE DATOS
            case (1):
                System.out.println("Digite el nombre");
                name = entry.nextLine();
                System.out.println("Digite el Sus Dos apellidos");
                apellido1 = entry.nextLine();
                apellido2 = entry.nextLine();
                System.out.println("Digite su edad");
                edad = entry.nextByte();
                System.out.println(
                        "Digite su genero mediante un caracter: M= Mujer H= hombre");
                gen = entry.next().charAt(contadorCovid);
                System.out.println("Digite si hay tenido covid (true o false) ");
                covid = entry.nextBoolean();
                System.out.print(
                        "Ingrese el estado de salud: El 1 representa un nivel de salud bajo, y  el 10 representa el mejor nivel de salud ");
                salud = entry.nextShort();
                System.out.println("Desea ver la fecha de su cita? (true o false) ");
                citta = entry.nextBoolean();
                if (edad > 60 || salud <= 4 || covid == true) {

                    System.out.print("ALERTAAA, PACIENTE DE RIESGO");
                }

                if (covid == true && citta == true) {
                    contadorCovid++;
                    me.CalcularCitas(salud, edad);
                } else if (citta == true && covid == false) {
                    me.CalcularCitas(edad, salud);
                } else if (salud > 10) {
                    System.out.print("Ingrese un numero valido");
                }
                break;
            case (2):
                System.out.println("Ha seleccionado Imprimir los datos: ");
                System.out.print("Nombre: " + "\t" + name + "\t" + "Apellidos: " + "\t"
                        + apellido1 + "\t" + apellido2 + "\n" + "Edad:" + "\t" + edad + "\n" + "Genero: " + "\t" + gen + "\n" + "Ha tenido Covid?" + "\t" + covid + "\t" + "Total de personas con covid"
                        + "\t" + contadorCovid + "\n");
                break;
            case (3):
                System.out.println("Ingrese el tamaño de los monitores del Ministerio de  Salud ");
                int a = entry.nextInt();
                for (int i = 0; i < a; i++) {
                    System.out.print("*\t");
                }
                System.out.println();
                for (int i = 0; i < a; i++) {
                    System.out.print("*\t");
                }
                System.out.println();

                for (int i = 0; i < a; i++) {
                    for (int j = 0; j < a; j++) {
                        if (i == j) {
                            System.out.print("*\t");
                        } else {
                            System.out.print(" \t");
                        }
                    }}
                    System.out.println();
                    break;
                
                case (4):
                System.out.println("Selecciono Borrar Datos");
                name = "";
                apellido1 = "";
                apellido2 = "";
                edad = 0;
                gen = ' ';
                salud = 0;
                break;
            case (5):
                System.out.println("Selecciono Continuar");
                continuar = true;
                break;
            case (6):
                System.out.println("Selecciono Salir");
                continuar = false;
                break;
        
        
        }while (continuar);
        //primer metodo
    } 
        
    public void CalcularCitas(byte edad, short salud) {
        int cont = 0;
        int diaCita = 0;
        //SACAR MES 
        for (int i = 0; i < edad; i++) {
            if (edad > 90) {
                System.out.print("Su primera cita es en Marzo");
            } else if (70 < edad && edad < 90) {
                System.out.print("Su primera cita es en Junio");
            } else if (50 < edad&& edad< 70) {
                System.out.print("Su primera cita es en Julio");
            } else if (edad < 50) {
                System.out.print("Su primera cita es en Agosto");
            }
            cont++;
            edad -= edad;
        }
        diaCita = salud + cont;
        if (diaCita > 31) {
            int fechaF = 0;
            fechaF = (diaCita - 31);
            System.out.println("El día de su fecha es:" + "\t" + fechaF);
        } else {
            System.out.println("El día de su fecha es:" + "\t" + diaCita);
        }
        System.out.println("El total de citas dadas es: " + "\t" + cont);
    }
//Metodo dos (Sobrecargado)

    public void CalcularCitas(short ssalud, byte eedad) {
        int cita = 0;
        int cont = 0;
        cita = ssalud + 1;
        int segundaCi = 10 + cita;
        for (int i = 0; i < eedad; i++) {
            if (eedad > 90) {
                System.out.print("Su cita es en Marzo");
            } else if (70 < eedad && eedad< 90) {
                System.out.print("Su cita es en Junio");
            } else if (50 < eedad && eedad< 70) {
                System.out.print("Su cita es en Julio");
            } else if (eedad < 49) {
                System.out.print("Su cita es en Agosto");
            }
            eedad -= eedad;
            cont++;
        }
        System.out.println("Su primera cita es el dia: " + cita);
        if (segundaCi > 31) {
            int fechaF = 0;
            fechaF = (segundaCi - 31);
            System.out.println("Su segunda cita es :" + "\t" + fechaF);
        } else {
            System.out.println("El día de su fecha es:" + "\t" + segundaCi);
        }
        System.out.println("El total de citas dadas es: " + "\t" + cont);

    }
}


