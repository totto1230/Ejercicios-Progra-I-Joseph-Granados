package problema3proyecto;

import javax.swing.JFrame;

public class GenerarVentana extends JFrame {

    

    public void Ventana() {
        this.setSize(500, 500);
        this.setBounds(700, 250, 500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Problema3Proyecto");
        panel();

    }

    private void panel() {
        JFrame j = new JFrame();
        j.getContentPane().add(j);
        

    }

}
