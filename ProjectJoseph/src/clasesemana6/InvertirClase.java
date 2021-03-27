package clasesemana6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

public class InvertirClase {

    public void num(int num) {
        Scanner entry = new Scanner(System.in);
        String listaInvertida="";
        String listaNormal="";
        for (int i = 0; i < num; i++) {
            System.out.println("Ingrese un Num: ");
            int num1 = entry.nextInt();
            listaNormal+= "|" + num1;
            listaInvertida= num1+"|"+listaInvertida;
        }
        System.out.println("Orden normal: "+ listaNormal);
        System.out.println("Orden Invertida"+ listaInvertida);
    }
}
