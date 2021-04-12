package problema3proyecto;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JComponent;

public class Paint extends Canvas {

    public void paint(Graphics g) {
        
        
        g.setColor(Color.CYAN);
        g.drawOval(10, 10, 200, 200);
        

    }
}
