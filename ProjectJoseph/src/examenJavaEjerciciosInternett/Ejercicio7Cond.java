package examenJavaEjerciciosInternett;

public class Ejercicio7Cond {

    public void orden(int a, int b, int c) {
        
        if ((a > b) && (b>c)) {
            System.out.println(a+" "+b+" "+c);
        }
        else if((a>c)&& (c>b)){
            System.out.println(a+" "+c+" "+b);
        }

        else if ((b > c) && c>a) {
            System.out.println(b+" "+c+" "+a);
        }
        else if ((b>c && a>c)){
           System.out.println(b+""+a+""+c); 
        }
        
        if ((c > a) && (b>a) ) {
            System.out.println(c+""+b+""+a);
    }
        else{
            System.out.println(c+""+a+""+b);
        }

}
}
