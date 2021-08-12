package proyectoprogramacióngrafic;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSlider;

public class Grafic extends JFrame {

    //Establecimiento del objeto m para poder usar los métodos y propiedades de la clase menú
    public final Menu m = new Menu();
    private final JPanel p = new JPanel();
    double totalAPagarC = 0;
    double totalAPagarB = 0;

    public void graphic() {
        ventana(); //Se llama al metodo privado panel para crear la ventana
        panel(); //Se llama al metodo privado panel para que se agregue el mismo a la ventana
        crearBoton(); //Se llama al metodo privado para crear los botones, etiquetas, etc
    }

    //Métodos gráficos:
    //Método que crea una ventana
    private void ventana() {
        this.setSize(1000, 1000);//Tamaño ventana
        this.setTitle("Menú"); //Titulo ventana
        this.setLocationRelativeTo(null); //Poner en el centro
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    //Método que crea un panel, lo mete en la ventana y a su vez crea los botones para seleccionar
    private void panel() {
        //Agregación del panel a la ventana
        this.getContentPane().add(p);//Agregación del panel a la ventana creada arriba
        p.setLayout(null); //Se le quita el layout por defecto al panel 
    }

    //Método que crea botones
    private void crearBoton() {
        //Creación de los que sumete lo seleccionado
        JButton b1 = new JButton("Agregar Comida");
        b1.setBounds(470, 20, 150, 80);
        b1.setVisible(true);
        p.add(b1);

        JButton b2 = new JButton("Agregar Bebida");
        b2.setBounds(470, 140, 150, 80);
        b2.setVisible(true);
        p.add(b2);

        JButton bp = new JButton("Pagar");
        bp.setBounds(470, 400, 150, 80);
        bp.setVisible(true);
        p.add(bp);

        //Creación de etiquetas
        JLabel et = new JLabel();
        et.setBounds(700, 20, 250, 80);
        et.setVisible(true);
        p.add(et);

        JLabel et2 = new JLabel();
        et2.setBounds(700, 140, 200, 80);
        et2.setVisible(true);
        p.add(et2);

        JLabel etTot = new JLabel();
        etTot.setBounds(700, 200, 200, 80);
        etTot.setVisible(true);
        p.add(etTot);

        JLabel etTotB = new JLabel();
        etTotB.setBounds(700, 400, 200, 80);
        etTotB.setVisible(true);
        p.add(etTotB);

        //Agregación de la posibilidad de agregar más cantidad al menú
        JSlider c1 = new JSlider(1, 10, 1);
        c1.setBounds(300, 20, 150, 80);
        c1.setMajorTickSpacing(1);
        c1.setMinorTickSpacing(1);
        c1.setPaintLabels(true);

        p.add(c1);

        JSlider c2 = new JSlider(1, 10, 1);
        c2.setBounds(300, 140, 150, 80);
        c2.setMajorTickSpacing(1);
        c2.setMinorTickSpacing(1);
        c2.setPaintLabels(true);
        p.add(c2);

        //Creación y agregación de los botones con sus opciones para seleccionar
        JRadioButton r = new JRadioButton("Hamburguesa de pollo", false);
        r.setBounds(50, 20, 200, 20);
        r.setVisible(true);
        p.add(r);

        JRadioButton r2 = new JRadioButton("Hamburguesa de carne", false);
        r2.setBounds(50, 40, 200, 20);
        r2.setVisible(true);
        p.add(r2);

        JRadioButton r3 = new JRadioButton("Hamburguesa doble de pollo", false);
        r3.setBounds(50, 60, 200, 20);
        r3.setVisible(true);
        p.add(r3);

        JRadioButton r4 = new JRadioButton("Hamburguesa doble angus", false);
        r4.setBounds(50, 80, 200, 20);
        r4.setVisible(true);
        p.add(r4);

        JRadioButton r5 = new JRadioButton("Coca Cola", false);
        r5.setBounds(50, 120, 200, 20);
        r5.setVisible(true);
        p.add(r5);

        JRadioButton r6 = new JRadioButton("Frutas", false);
        r6.setBounds(50, 140, 200, 20);
        r6.setVisible(true);
        p.add(r6);

        JRadioButton r7 = new JRadioButton("Mojitos", false);
        r7.setBounds(50, 160, 200, 20);
        r7.setVisible(true);
        p.add(r7);

        JRadioButton r8 = new JRadioButton("Limonadas", false);
        r8.setBounds(50, 180, 200, 20);
        r8.setVisible(true);
        p.add(r8);

        JRadioButton r9 = new JRadioButton("Te frio", false);
        r9.setBounds(50, 200, 200, 20);
        r9.setVisible(true);
        p.add(r9);

        //Creación de dos grupos de botones para que solo se seleccione uno a la vez
        ButtonGroup comidas = new ButtonGroup();
        comidas.add(r);
        comidas.add(r2);
        comidas.add(r3);
        comidas.add(r4);

        ButtonGroup bebidas = new ButtonGroup();
        bebidas.add(r5);
        bebidas.add(r6);
        bebidas.add(r7);
        bebidas.add(r8);
        bebidas.add(r9);

        //ActionListener
        ActionListener oye = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {

                //Dentro de la interfaz propiamente del action listener se hace una serie de ifs para sacar el valor de los arreglos desde la clase JAVA
                if (r.isSelected()) {
                    et.setText("Agregado: " + m.comidas[0] + " " + c1.getValue());
                    double cant = c1.getValue();
                    totalAPagarC = totalAPagarC + (m.preciosC[0] * cant);
                    etTot.setText("Total a pagar en comida: " + totalAPagarC);
                } else if (r2.isSelected()) {
                    et.setText("Agregado: " + m.comidas[1] + " " + c1.getValue());
                    double cant = c1.getValue();
                    totalAPagarC = totalAPagarC + (m.preciosC[1] * cant);
                    etTot.setText("Total a pagar en comida: " + totalAPagarC);
                } else if (r3.isSelected()) {
                    et.setText("Agregado: " + m.comidas[2] + " " + c1.getValue());
                    double cant = c1.getValue();
                    totalAPagarC = totalAPagarC + (m.preciosC[2] * cant);
                    etTot.setText("Total a pagar en comida: " + totalAPagarC);
                } else if (r4.isSelected()) {
                    et.setText("Agregado: " + m.comidas[3] + " " + c1.getValue());
                    double cant = c1.getValue();
                    totalAPagarC = totalAPagarC + (m.preciosC[3] * cant);
                    etTot.setText("Total a pagar en comida: " + totalAPagarC);
                } else {
                    et.setText("Empty");

                }

            }
        };

        b1.addActionListener(oye);

        ActionListener oye1 = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {

                //Dentro de la interfaz propiamente del action listener se hace una serie de ifs para sacar el valor de los arreglos desde la clase JAVA
                if (r5.isSelected()) {
                    et2.setText("Agregado: " + m.bebidas[0] + " " + c2.getValue());
                    double cant = c1.getValue();
                    totalAPagarB = totalAPagarB + (m.preciosB[0] * cant);
                    etTotB.setText("Total a pagar en bebidas: " + totalAPagarB);
                } else if (r6.isSelected()) {
                    et2.setText("Agregado: " + m.bebidas[1] + " " + c2.getValue());
                    double cant = c1.getValue();
                    totalAPagarB = totalAPagarB + (m.preciosB[1] * cant);
                    etTotB.setText("Total a pagar en bebidas: " + totalAPagarB);
                } else if (r7.isSelected()) {
                    et2.setText("Agregado: " + m.bebidas[2] + " " + c2.getValue());
                    double cant = c1.getValue();
                    totalAPagarB = totalAPagarB + (m.preciosB[2] * cant);
                    etTotB.setText("Total a pagar en bebidas: " + totalAPagarB);
                } else if (r8.isSelected()) {
                    et2.setText("Agregado: " + m.bebidas[3] + " " + c2.getValue());
                    double cant = c1.getValue();
                    totalAPagarB = totalAPagarB + (m.preciosB[3] * cant);
                    etTotB.setText("Total a pagar en bebidas: " + totalAPagarB);
                } else if (r9.isSelected()) {
                    et2.setText("Agregado: " + m.bebidas[4] + " " + c2.getValue());
                    double cant = c1.getValue();
                    totalAPagarB = totalAPagarB + (m.preciosB[4] * cant);
                    etTotB.setText("Total a pagar en bebidas: " + totalAPagarB);
                } else {
                    et.setText("Empty");

                }

            }
        };

        b2.addActionListener(oye1);

        //Action listener para que enseñe el total a pagar
        ActionListener oye3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double total = totalAPagarB + totalAPagarC;
                JOptionPane.showMessageDialog(null, "Total a pagar: " + total);
            }
        };

        bp.addActionListener(oye3);

    }
}
