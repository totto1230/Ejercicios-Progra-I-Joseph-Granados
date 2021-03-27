
package examenFinal;
import java.util.Scanner;


public class ExamenFinal{


public static void main(String[]args){
Scanner entry= new Scanner (System.in);
System.out.println("Ingrese los siguientes Datos:");

//Ingrese SobreNombre

System.out.print("Ingrese su sobrenombre" );
String sobrenombre= entry.nextLine();

//Ingrese Su primer apellido

System.out.print("Ingrese Su primer apellido:");
String primerA= entry.nextLine();

//Ingrese Su segundo apellido

System.out.print("Ingrese Su segundo apellido");
String segundoA= entry.nextLine();

//Ingrese su Edad
System.out.print("Ingrese su Edad:");
int edad= entry.nextInt();

//Ingrese su genero
char gen=entry.next().charAt(0);
	
	if(sobrenombre!="" && edad>=0 && gen=='h' &&gen== 'm' && primerA!=""&& segundoA!="" ){
			//info medica
			System.out.print("Presenta algun antecedente");
			String ante= entry.nextLine();
			System.out.print("El tipo de Sangre");
			char sangre= entry.next().charAt(0);
			System.out.print("Tiene Covid?");
			String cov= entry.nextLine();
			
			//menu
			System.out.println("Seleccione lo que quiere imprimir:");
			System.out.println("1. Nombre");
			System.out.println("2. Edad y Genero");
			System.out.println("3. Datos Medicos");
			
			int a= entry.nextInt();
			
			switch (a){
			case(1):
			System.out.print("El nombre es: "+"\t" + sobrenombre+"\t" + primerA+"\t"+segundoA);
 			break;
			
			case(2):
			System.out.print("Edad: "+"\t" + edad+"\t"+"Genero: " + gen);
 			break;
			
			case(3):
			System.out.print("El nombre es: "+"\t" + sobrenombre+"\t" + primerA+"\t"+segundoA);
 			break;

}
}
	else{
	System.out.print("Ingrese Datos Validos");

	
}
}
}
    
    
    
    
    
    
    
    
    
    
    
    
    
 
