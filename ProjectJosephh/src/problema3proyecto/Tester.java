package problema3proyecto;
import java.awt.Canvas;
import javax.swing.JFrame;

public class Tester extends Canvas {

    public static void main(String[] a) {
        JFrame jf = new JFrame("Test");
        Paint p = new Paint();
        jf.setSize(600, 400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(p);

    }
}
