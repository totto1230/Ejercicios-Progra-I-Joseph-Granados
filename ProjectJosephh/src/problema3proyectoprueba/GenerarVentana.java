/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3proyectoprueba;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GenerarVentana extends JFrame {

    private JFileChooser jFileChooser = new JFileChooser(System.getProperty("user.dir"));
    private JPanel panelIzquierda = new JPanel();
    private JPanelDibujo panelCentral = new JPanelDibujo();
    private JButton abrirBoton = new JButton("Abrir");
    private JButton salirBoton = new JButton("Salir");
    private GenerarVentana este = this;

    public GenerarVentana(String titulo) {
        super(titulo);
        this.setLayout(new BorderLayout());
        panelIzquierda.setLayout(new GridLayout(2, 1));
        panelIzquierda.add(abrirBoton);
        panelIzquierda.add(salirBoton);
        this.add(panelIzquierda, BorderLayout.WEST);
        this.add(panelCentral, BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setVisible(true);
    }

}
