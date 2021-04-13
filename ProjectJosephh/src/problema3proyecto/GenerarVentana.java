package problema3proyecto;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GenerarVentana extends JFrame {
    Paint object;
    
    public void GenerarVentana() {
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("ProyectoProblemaTres");
        this.setBounds(700, 250, 500, 500);
      
        object = new Paint();
        Iniciar();
        
    }
    
    
    private void Iniciar(){
        JPanel p= new JPanel();
        
        p.setBackground(Color.red);
        this.getContentPane().add(p); //Agregar el panel a la ventana
        
        
        
        
    }
    
    
    

}
