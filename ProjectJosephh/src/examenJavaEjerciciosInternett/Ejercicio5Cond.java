package examenJavaEjerciciosInternett;

public class Ejercicio5Cond {

    public int salario(int h) {
        int resultado = 0;

        if (h<=40){
        resultado=16*h;
            System.out.println("Su salario es:"+"\t"+resultado);
        
    }
        else if (h>40){
            
        resultado=(h-40)*20+(40*16);
            System.out.println("Su salario es:"+"\t"+resultado);
       
    }
        
        return resultado;
        
        
        
        
    }
    
    
    
    
    
    
    
    
    
    
    
}
