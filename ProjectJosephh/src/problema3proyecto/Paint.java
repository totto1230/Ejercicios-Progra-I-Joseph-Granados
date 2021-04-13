package problema3proyecto;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import java.util.Scanner;

public class Paint extends Canvas {
    //Propiedades Ovalo

    public static int x;
    public static int y;
    public static int width;
    public static int height;

    //Propiedades Rectangulo
    public static int xx;
    public static int yy;
    public static int widthh;
    public static int heightt;

    @Override
    public void paint(Graphics g) {
        Random ran = new Random();
        super.paint(g);
        Scanner s = new Scanner(System.in);
        int a = 2;
        
        //Generar numero random 0-999 OVAL

        x = ran.nextInt(500);
        y = ran.nextInt(500);
        width = ran.nextInt(500);
        height = ran.nextInt(500);

        //Generar numero random 0-999 Rectangulo
        xx = ran.nextInt(500);
        yy = ran.nextInt(500);
        widthh = ran.nextInt(500);
        heightt = ran.nextInt(500);

      //  for (int i = 0; i < a; i++) {
            //Generar Ovalo
            g.fillOval(x, y, width, height);
            g.setColor(Color.red);

            //Generar Rectangulo
            g.fillRect(xx, yy, widthh, heightt);
            g.setColor(Color.red);
        }
 //   }
}
