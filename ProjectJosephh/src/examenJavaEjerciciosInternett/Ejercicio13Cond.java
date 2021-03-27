package examenJavaEjerciciosInternett;

import java.util.Scanner;

public class Ejercicio13Cond {

    public int cajero(int o) {
        
        System.out.println("Selecione lo que quiere hacer");
        Scanner entry = new Scanner(System.in);
        int saldoI = 1000;
        switch (o) {
            case 1: {
                System.out.println("Ingrese la cantidad de dinero que quiere agregar");
                int num = entry.nextInt();
                int saldo = saldoI + num;
                System.out.println("Su saldo actual es de:" + "\t" + saldo);
                break;

            }
            case 2: {
                System.out.println("Ingrese la cantidad de dinero que quiere retirar");
                int num = entry.nextInt();
                int saldo = saldoI - num;
                if (num > saldoI) {
                    System.out.println("No puede sacar esa cantidad");
                } else {
                    System.out.println("Su saldo actual es de:" + "\t" + saldo);
                }
                break;
            }
            case 3:
                System.out.println("Ha selecionado salir");
                break;
            default:
                System.out.println("Ingrese un numero correcto");
                break;
        }
        return 0;

    }

}
