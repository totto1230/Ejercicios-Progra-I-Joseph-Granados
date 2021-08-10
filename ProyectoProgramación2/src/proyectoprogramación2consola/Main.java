
package proyectoprogramación2consola;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        //Declaraciön de objetos
        
       Menu m= new Menu();
       Scanner s= new Scanner(System.in);
       
       
       //Declaraciön de variables
       int seleccion;
       int cont= 1;
       int cant=1;
       int cont2= 1;
       
       
       
        while(cont==1){
        System.out.println("Qué desea comer? ");
        System.out.println( " 1. Hamburguesa de pollo"+ " 2. Hamburguesa de carne"+ " 3. Hamburguesa doble de pollo"+ " 4. Hamburguesa doble angus");
        seleccion= s.nextInt();
        System.out.println("Cuántas desea agregar a la orden? ");
        cant= s.nextInt();
        m.sacarPrecios(seleccion, m.preciosC, cant);
        System.out.println("Desea pedir algo más");
        System.out.println("1. Sí 2. No");
        cont= s.nextInt();
        }
        
        while(cont2==1){
        System.out.println("Qué desea tomar? ");
        System.out.println( "1 Coca Cola 2 Frutas 3 Mojitos 4 Limonadas 5 Te frio");
        seleccion= s.nextInt();
        System.out.println("Cuántos refrescos desea agregar a la orden? ");
        cant= s.nextInt();
        m.sacarPrecios(seleccion, m.preciosB, cant);
        System.out.println("Desea pedir algo más");
        System.out.println("1. Sí 2. No");
        cont2= s.nextInt();
        }
        
        double total= m.totalB+m.totalC;
        
        System.out.println("Total: "+ total);
        
        
        
        
        
        
        
    }
    
}
