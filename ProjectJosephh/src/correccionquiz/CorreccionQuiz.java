//Correcion Quiz JAVA JOSEPH GRANADOS
package correccionquiz;

import java.util.Scanner;

public class CorreccionQuiz {

    public static void main(String[] args) {

        Scanner entry = new Scanner(System.in);
        System.out.println("Ingrese su salario: ");
        double salario = entry.nextInt();
        System.out.println("Ingrese el numero de meses: ");
        byte meses = entry.nextByte();
        System.out.println("Ingrese el numero de amonestaciones: ");
        int amos = entry.nextInt();
        double agui = aguinaldo(salario, meses);
        double aguif = aguinaldo(agui, amos);
        System.out.println(agui);
        System.out.println("Su aguinaldo es final es: ");
        System.out.println(aguif);

    }

    public static double aguinaldo(double salario, byte meses) {
       
        if (meses >= 12) {
            double so = salario * meses;
            return so;
        } else if (meses < 12) {
            double si = (meses / 12) * salario;
            return si;
        } else {
            return 0;
        }
    }

    public static double aguinaldo(double agui, int amos) {
        
        if (amos >= 2) {
            double so = agui * 0;
            return so;
        } else if (amos == 1) {
            double so = agui * 0.70;
            return so;
        } else if (amos < 1) {
            double so = agui * 1;
            return so;
        } else {
            return 0;
        }
    }
}
