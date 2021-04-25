package examenPractica;

import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner ss = new Scanner(System.in);
        int a = ss.nextInt();
         int b = ss.nextInt();
         
         
        PruebaGetterAndSetter s = new PruebaGetterAndSetter();
        
        PruebaGetterAndSetter g= new PruebaGetterAndSetter(a,b);
        
        
    /*    s.privateP(a);
       
        s.publicP(b);*/
        
        g.mostrar();

    }

}
