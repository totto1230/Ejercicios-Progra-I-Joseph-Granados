package problema3proyecto;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;


public class Paint extends Canvas {
    
    @Override
    public void paint(Graphics g) {
        Random random= new Random();
        int[] randomArray= new int [1000];
        
        
        while (true) {
            g.setColor(Color.CYAN);
            g.fillOval(random.nextInt(15),random.nextInt(15), random.nextInt(4),random.nextInt(5));

        }
    }
}
