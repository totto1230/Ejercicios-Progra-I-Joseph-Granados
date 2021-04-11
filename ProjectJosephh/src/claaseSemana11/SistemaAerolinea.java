/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claaseSemana11;

import java.util.Scanner;

public class SistemaAerolinea {

    Cliente unicoCliente;
    Cliente segundoCliente;
    DestinoVIaje destino1;
    
    
    
    public void iniciar() {
        Scanner s = new Scanner(System.in);
        System.out.println("Que quiere hacer? 1. Ingresar cliente \t 2. Configurar Destino");
        int op = s.nextInt();
        while (true) {

            switch (op) {

                case 1:
                    unicoCliente = new Cliente();
                    segundoCliente = new Cliente();
                    unicoCliente.solicitarDatos();
                    segundoCliente.solicitarDatos();

                    break;

                case 2:
                    destino1 = new DestinoVIaje();
                    destino1.Datos();
                    
                    break;

                case 3:
                    System.out.println(this.destino1.toString());
                    System.out.println(this.segundoCliente.toString());
                    System.out.println(this.segundoCliente.toString());
                    
            }
            /*
            solicitarDatosCliente();
            generarReporteClientes();*/
        }
    }

    /*public void solicitarDatosCliente() {
        unicoCliente.solicitarDatos();
        segundoCliente.solicitarDatos();
    }

    public void generarReporteClientes() {

        System.out.println(this.unicoCliente.toString());

        System.out.println(this.segundoCliente.toString());
    }*/
}
