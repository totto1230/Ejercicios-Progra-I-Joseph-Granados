
package examenJavaEjerciciosInternett;


public class Ejercicio1Cond {
   public int Cond(int n){
       int result=0;
      // do{
       if(n%10==0){
           System.out.println("El numero es multiplo de 10"+n);
           result=n;
       }
       if (n%10!=0){
           System.out.println("El numero no es multiplo de 10"+ n);
           result=n;
       }
     //  }
     //  while(n>0);
       return result;
       
   
}
    
    
    
    
}
