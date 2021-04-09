package Problema1Proyecto;

import java.util.Scanner;

public class Conversiones {

    private double Cantidad = 0;

    public void Conversion(double Cantidad) {
        boolean contar = true;
        Scanner s = new Scanner(System.in);

        boolean conteo = true;
       // System.out.println("1. Dolar\n 2. Euro \n 3. Colones");

        while (conteo == true) {
            System.out.println("1. Dolar\n 2. Euro \n 3. Colones");
            int select = s.nextInt();
            switch (select) {
                case (1):
                    System.out.println("Su moneda es el dolar");
                    System.out.println("Ingrese la cantidad: ");
                    this.Cantidad = Cantidad;
                    //  while (contar == true) {
                    System.out.println("A qué moneda desea pasar estos dolares?" + this.Cantidad + "1. Dolares > Euros\n 2. Dolares > Colones");

                    int selectt = s.nextInt();

                    if (selectt == 1) {
                        double result = (this.Cantidad * 1) / 1.53;
                        System.out.println("En total son: " + result + " Euros");
                        contar = false;
                    } else if (selectt == 2) {
                        double result = (this.Cantidad * 500) / 1;
                        System.out.println("En total son: " + result + " Euros");
                        contar = false;
                    } else {
                        System.out.println("Ingrese un valor valido.");
                        contar = true;
                    }
                    break;
                // }

                case (2):
                    System.out.println("Su moneda es el Euro");
                    System.out.println("Ingrese la cantidad: ");
                    this.Cantidad = Cantidad;
                    //    while (contar == true) {
                    System.out.println("A qué moneda desea pasar estos Euros?" + this.Cantidad + "1. Euros > Dolares \n 2. Euros > Colones");

                    int selectta = s.nextInt();

                    if (selectta == 1) {
                        double result = (this.Cantidad * 1.53) / 1;
                        System.out.println("En total son: " + result + " Dolares");
                        contar = false;
                    } else if (selectta == 2) {

                        double result = (this.Cantidad * 1.53) / 1;
                        double resultt = (result * 500) / 1;
                        System.out.println("En total son: " + resultt + " Colones");
                        contar = false;
                    } else {
                        System.out.println("Ingrese un valor valido.");
                        contar = true;
                    }
                    break;
                //  }

                case (3):
                    System.out.println("Su moneda es el Colon");
                    System.out.println("Ingrese la cantidad: ");
                    this.Cantidad = Cantidad;
                    //      while (contar == true) {
                    System.out.println("A qué moneda desea pasar estos Colones?" + this.Cantidad + "1. Colones > Euros \n 2. Colones > Dolares");

                    int selecttt = s.nextInt();

                    if (selecttt == 1) {
                        double result = (this.Cantidad * 1) / 500;
                        double resultt = (result * 1) / 1.53;
                        System.out.println("En total son: " + resultt + " Dolares");
                        contar = false;
                    } else if (selecttt == 2) {
                        double result = (this.Cantidad * 1) / 500;
                        System.out.println("En total son: " + result + " Colones");
                        contar = false;
                    } else {
                        System.out.println("Ingrese un valor valido.");
                        contar = true;
                    }
                    break;
                //  }

            }
        }
        conteo = false;
    }
}
