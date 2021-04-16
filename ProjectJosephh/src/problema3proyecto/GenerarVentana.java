package problema3proyecto;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GenerarVentana extends JFrame {
    //Propiedades Ovalo
    // Paint o;
    public static int x;
    public static int y;
    public static int width;
    public static int height;

    //Propiedades Rectangulo
    public static int xx;
    public static int yy;
    public static int widthh;
    public static int heightt;

    public void Ventana() {

        this.setBounds(700, 250, 500, 500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Problema3Proyecto");
        panel();
        /* o= new Paint();
        repaint();*/

    }

    private void panel() {
        JPanel j = new JPanel();
        this.getContentPane().add(j);
        // j.repaint();

    }

    @Override
    public void paint(Graphics g) {
        Random ran = new Random();
        super.paint(g);
        Scanner s = new Scanner(System.in);
       // int a = s.nextInt();

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

       // for (int i = 0; i < a; i++) {
            //Generar Ovalo
            g.fillOval(x, y, width, height);
            g.setColor(Color.red);

            //Generar Rectangulo
            g.fillRect(xx, yy, widthh, heightt);
            g.setColor(Color.red);
        }
    //}
}
