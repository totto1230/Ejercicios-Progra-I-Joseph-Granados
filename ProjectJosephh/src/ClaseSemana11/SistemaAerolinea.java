/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClaseSemana11;

public class SistemaAerolinea {
    Cliente unicoCliente;
    Cliente segundoCliente;
    
    public void iniciar(){
        unicoCliente = new Cliente();
        segundoCliente = new Cliente(); 
        
        solicitarDatosCliente();
        generarReporteClientes();
    }
    
    public void solicitarDatosCliente(){
        unicoCliente.solicitarDatos();
        segundoCliente.solicitarDatos();
    }
    
    public void generarReporteClientes(){
   
        System.out.println(this.unicoCliente.toString());
 
        System.out.println(this.segundoCliente.toString());
    }
}