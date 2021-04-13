package problema3proyecto;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Paint extends Canvas {

    public static int x;
    public static int y;
    public static int width;
    public static int height;
    public static int xx;
    public static int yy;
    public static int widthh;
    public static int heightt;

    @Override
    public void paint(Graphics g) {
        Random ran = new Random();
        x = ran.nextInt(1000);
        y = ran.nextInt(1000);
        width = ran.nextInt(1000);
        height = ran.nextInt(800);

        super.paint(g);
        g.drawOval(x, y, width, height);
        g.setColor(Color.red);
        g.drawRect(x, y, width, height);
        g.setColor(Color.red);
    }
}
