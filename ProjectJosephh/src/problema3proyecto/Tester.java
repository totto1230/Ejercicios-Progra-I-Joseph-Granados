package problema3proyecto;

import java.awt.Canvas;
import javax.swing.JFrame;

public class Tester extends Canvas {

    public static void main(String[] a) {
        Paint p = new Paint();
        
        JFrame jf = new JFrame("Test");
        jf.setSize(1500, 800);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(p);
       
    }
}