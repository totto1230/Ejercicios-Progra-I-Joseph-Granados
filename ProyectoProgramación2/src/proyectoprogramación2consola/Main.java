
package proyectoprogramación2consola;

import java.util.Scanner;
import java.sql.*;

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
       String comida="";
       String bebida="";
       
        while(cont==1){
        System.out.println("Qué desea comer? ");
        System.out.println( " 1. Hamburguesa de pollo"+ " 2. Hamburguesa de carne"+ " 3. Hamburguesa doble de pollo"+ " 4. Hamburguesa doble angus");
        seleccion= s.nextInt();
        
        if(seleccion==1){
            comida= m.comidas[0];
            
        }
          else if(seleccion==2){
            comida= m.comidas[1];
            
        }    
        
         
          else if(seleccion==3){
            comida= m.comidas[2];
            
        } 
        
         else if(seleccion==4){
            comida= m.comidas[3];
            
        } 
                
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
        
         if(seleccion==1){
            bebida= m.bebidas[0];
            
        }
          else if(seleccion==2){
            bebida= m.bebidas[1];
            
        }    
        
         
          else if(seleccion==3){
            bebida= m.bebidas[2];
            
        } 
        
         else if(seleccion==4){
            bebida= m.bebidas[3];
            
        } 
        else if(seleccion==5){
            bebida= m.bebidas[4];
            
        }
        
        
        System.out.println("Cuántos refrescos desea agregar a la orden? ");
        cant= s.nextInt();
        m.sacarPrecios(seleccion, m.preciosB, cant);
        System.out.println("Desea pedir algo más");
        System.out.println("1. Sí 2. No");
        cont2= s.nextInt();
        }
        
        double total= m.totalB+m.totalC;
        
        System.out.println("Total: "+ total);
        
        System.out.println("Agregar valor a la DB test");
        int t= s.nextInt();
        
        if (t==1){
            try{
                Connection cn= DriverManager.getConnection("jdbc:mysql://localhost/prueba","root","");
                PreparedStatement pst = cn.prepareStatement("insert into orden values(?,?,?,?)");
                pst.setString(1, "0");
                pst.setString(2, comida);
                pst.setString(3, bebida);
                pst.setDouble(4, total);
                pst.executeUpdate();
                
            }
            catch(Exception e){
                
            }
            
        }
          
    }
    
}
