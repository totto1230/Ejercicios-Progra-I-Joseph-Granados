package problema3proyectoprueba;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class JPanelDibujo extends JPanel {
    //METODO PARA PONER UN COLOR AL BACKGROUND; el fondo

    public JPanelDibujo() {
        this.setBackground(Color.GREEN);
    }

    public void paint(Graphics g) {
        super.paint(g);

        Ovalo ov = new Ovalo();  //(150, 50, 100, 100);
        g.fillOval(ov.getPosX(), ov.getPosY(), ov.getAncho(), ov.getAlto());
        g.setColor(Color.yellow);

    }
}
