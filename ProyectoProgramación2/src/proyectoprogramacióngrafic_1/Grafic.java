package proyectoprogramacióngrafic_1;

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
import java.sql.*;

public class Grafic extends JFrame {

    //Establecimiento del objeto m para poder usar los métodos y propiedades de la clase menú
    public final Menu m = new Menu();
    private final JPanel p = new JPanel();
    double totalAPagarC = 0;
    double totalAPagarB = 0;
    String Comida = "";
    String Bebida = "";

    //Declaracion de botones
    JButton b1 = new JButton("Agregar Comida");
    JButton b2 = new JButton("Agregar Bebida");
    JButton bp = new JButton("Pagar");

    //Declaracion de los botones para seleccionar
    JRadioButton r = new JRadioButton("Hamburguesa de pollo", false);
    JRadioButton r2 = new JRadioButton("Hamburguesa de carne", false);
    JRadioButton r3 = new JRadioButton("Hamburguesa doble de pollo", false);
    JRadioButton r4 = new JRadioButton("Hamburguesa doble angus", false);
    JRadioButton r5 = new JRadioButton("Coca Cola", false);
    JRadioButton r6 = new JRadioButton("Frutas", false);
    JRadioButton r8 = new JRadioButton("Limonadas", false);
    JRadioButton r9 = new JRadioButton("Te frio", false);
    JRadioButton r7 = new JRadioButton("Mojitos", false);
    
    //Declaracion de etiquetas
    JLabel et = new JLabel();
    JLabel et2 = new JLabel();
    JLabel etTot = new JLabel();
    JLabel etTotB = new JLabel();

    //Declaracion de los sliders
    JSlider c1 = new JSlider(1, 10, 1);
    JSlider c2 = new JSlider(1, 10, 1);

    //Declaracion de grupos de botones
    ButtonGroup comidas = new ButtonGroup();
    ButtonGroup bebidas = new ButtonGroup();

    //Métodos gráficos:
    public void graphic() {
        ventana(); //Se llama al metodo privado panel para crear la ventana
        panel(); //Se llama al metodo privado panel para que se agregue el mismo a la ventana
        Slider();//Llamar motod para la creación del slider para seleccionar la cantidad
        crearBoton(); //Se llama al metodo privado para crear los botones, etiquetas, etc
        opcionesMenu();//Se llama al metodo para crear los botones radio
        crearEtiquetas();//Se llamaa para crear etiquetas
        DataBaseSfuff();//Llamada del método para generar la conexión entre database y netbeans
    }

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

        b1.setBounds(470, 20, 150, 80);
        b1.setVisible(true);
        p.add(b1);

        b2.setBounds(470, 140, 150, 80);
        b2.setVisible(true);
        p.add(b2);

        bp.setBounds(470, 400, 150, 80);
        bp.setVisible(true);
        p.add(bp);

    }

    private void crearEtiquetas() {

        //Creación de etiquetas
        et.setBounds(700, 20, 250, 80);
        et.setVisible(true);
        p.add(et);

        et2.setBounds(700, 140, 200, 80);
        et2.setVisible(true);
        p.add(et2);

        etTot.setBounds(700, 200, 200, 80);
        etTot.setVisible(true);
        p.add(etTot);

        etTotB.setBounds(700, 400, 200, 80);
        etTotB.setVisible(true);
        p.add(etTotB);

    }

    private void opcionesMenu() {

        //Creación y agregación de los botones con sus opciones para seleccionar
        r.setBounds(50, 20, 200, 20);
        r.setVisible(true);
        p.add(r);

        r2.setBounds(50, 40, 200, 20);
        r2.setVisible(true);
        p.add(r2);

        r3.setBounds(50, 60, 200, 20);
        r3.setVisible(true);
        p.add(r3);

        r4.setBounds(50, 80, 200, 20);
        r4.setVisible(true);
        p.add(r4);

        r5.setBounds(50, 120, 200, 20);
        r5.setVisible(true);
        p.add(r5);

        r6.setBounds(50, 140, 200, 20);
        r6.setVisible(true);
        p.add(r6);

        r7.setBounds(50, 160, 200, 20);
        r7.setVisible(true);
        p.add(r7);

        r8.setBounds(50, 180, 200, 20);
        r8.setVisible(true);
        p.add(r8);

        r9.setBounds(50, 200, 200, 20);
        r9.setVisible(true);
        p.add(r9);

        //Creación de dos grupos de botones para que solo se seleccione uno a la vez
        comidas.add(r);
        comidas.add(r2);
        comidas.add(r3);
        comidas.add(r4);

        bebidas.add(r5);
        bebidas.add(r6);
        bebidas.add(r7);
        bebidas.add(r8);
        bebidas.add(r9);

    }

    private void Slider() {
        //Agregación de la cantidad de agregar más cantidad al menú

        c1.setBounds(300, 20, 150, 80);
        c1.setMajorTickSpacing(1);
        c1.setMinorTickSpacing(1);
        c1.setPaintLabels(true);

        p.add(c1);

        c2.setBounds(300, 140, 150, 80);
        c2.setMajorTickSpacing(1);
        c2.setMinorTickSpacing(1);
        c2.setPaintLabels(true);
        p.add(c2);

    }

    private void DataBaseSfuff() {
        /*ActionListener
        
                 Mediante action listener (s) se establece el valor que se debe agregar a las variables
         */
        ActionListener oye = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {

                //Dentro de la interfaz propiamente del action listener se hace una serie de ifs para sacar el valor de los arreglos desde la clase JAVA
                if (r.isSelected()) {
                    
                    et.setText("Agregado: " + m.comidas[0] + " " + c1.getValue());
                    double cant = c1.getValue();
                    Comida = m.comidas[0];
                    totalAPagarC = totalAPagarC + (m.preciosC[0] * cant);
                    etTot.setText("Total a pagar en comida: " + totalAPagarC);
                    
                } else if (r2.isSelected()) {
                    
                    et.setText("Agregado: " + m.comidas[1] + " " + c1.getValue());
                    double cant = c1.getValue();
                    Comida = m.comidas[1];
                    totalAPagarC = totalAPagarC + (m.preciosC[1] * cant);
                    etTot.setText("Total a pagar en comida: " + totalAPagarC);
                    
                } else if (r3.isSelected()) {
                    
                    et.setText("Agregado: " + m.comidas[2] + " " + c1.getValue());
                    double cant = c1.getValue();
                    Comida = m.comidas[2];
                    totalAPagarC = totalAPagarC + (m.preciosC[2] * cant);
                    etTot.setText("Total a pagar en comida: " + totalAPagarC);
                    
                } else if (r4.isSelected()) {
                    
                    et.setText("Agregado: " + m.comidas[3] + " " + c1.getValue());
                    double cant = c1.getValue();
                    Comida = m.comidas[3];
                    totalAPagarC = totalAPagarC + (m.preciosC[3] * cant);
                    etTot.setText("Total a pagar en comida: " + totalAPagarC);
                    
                } else {
                    et.setText("Vacío, ingrese un valor válido");

                }

            }
        };

        b1.addActionListener(oye);

        ActionListener oye1 = new ActionListener() {
            @Override

            public void actionPerformed(ActionEvent e) {

                if (r5.isSelected()) {
                    
                    et2.setText("Agregado: " + m.bebidas[0] + " " + c2.getValue());
                    double cant = c2.getValue();
                    Bebida = m.bebidas[0];
                    totalAPagarB = totalAPagarB + (m.preciosB[0] * cant);
                    etTotB.setText("Total a pagar en bebidas: " + totalAPagarB);
                    
                } else if (r6.isSelected()) {
                    
                    et2.setText("Agregado: " + m.bebidas[1] + " " + c2.getValue());
                    double cant = c2.getValue();
                    Bebida = m.bebidas[1];
                    totalAPagarB = totalAPagarB + (m.preciosB[1] * cant);
                    etTotB.setText("Total a pagar en bebidas: " + totalAPagarB);
                    
                } else if (r7.isSelected()) {
                    
                    et2.setText("Agregado: " + m.bebidas[2] + " " + c2.getValue());
                    Bebida = m.bebidas[2];
                    double cant = c2.getValue();
                    totalAPagarB = totalAPagarB + (m.preciosB[2] * cant);
                    etTotB.setText("Total a pagar en bebidas: " + totalAPagarB);
                    
                } else if (r8.isSelected()) {
                    
                    et2.setText("Agregado: " + m.bebidas[3] + " " + c2.getValue());
                    Bebida = m.bebidas[3];
                    double cant = c2.getValue();
                    totalAPagarB = totalAPagarB + (m.preciosB[3] * cant);
                    etTotB.setText("Total a pagar en bebidas: " + totalAPagarB);
                    
                } else if (r9.isSelected()) {
                    
                    et2.setText("Agregado: " + m.bebidas[4] + " " + c2.getValue());
                    Bebida = m.bebidas[4];
                    double cant = c2.getValue();
                    totalAPagarB = totalAPagarB + (m.preciosB[4] * cant);
                    etTotB.setText("Total a pagar en bebidas: " + totalAPagarB);
                    
                } else {
                    et.setText("Vacío, ingrese un valor válido");

                }

            }
        };

        b2.addActionListener(oye1);//Agregación del objeto oye1 para que sirve cuando se seleccione el botón

        //Action listener para que enseñe el total a pagar y agregar orden a la base de datos
        ActionListener oye3 = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                double total = totalAPagarB + totalAPagarC; //Suma de ambos totales
                JOptionPane.showMessageDialog(null, "Total a pagar: " + total);
                //Integración de NetBeans con la base de datos
                try {
                    /*Utilización de la función: Connection y creación de un objeto. Se usa la función .getConnection para el establecimiento de la misma, se usan tres fields:
                 (el path o la dirección, user, contraseña)*/
                    Connection cn = DriverManager.getConnection("jdbc:mysql://localhost/proyecto", "root", "");

                    /* Se utiliza la función: PreparedStatement de la librería para poder indicarle o darle instrucciones a la base de datos que agregue los valores. Se usa la siguiente estructura:
                insert into orden values (Se ponen el total de columnas de la base de datos y como no se conoce el valor, se pone un signo de pregunta momentáneamente)
                En este caso se usa el insert para el establecimiento de valores dentro de la base de datos*/
                    PreparedStatement pst = cn.prepareStatement("insert into orden values(?,?,?,?,?,?,?,?)");
                    pst.setString(1, "0");
                    pst.setString(2, Comida);
                    pst.setInt(3, c1.getValue());
                    pst.setString(4, Bebida);
                    pst.setInt(5, c2.getValue());
                    pst.setDouble(6, totalAPagarC);
                    pst.setDouble(7, totalAPagarB);
                    pst.setDouble(8, total);
                    pst.executeUpdate(); //Ejecución de las líneas de arriba (Agregación de datos a la base de datos)

                } catch (Exception Ex) {

                }

            }
        };
        bp.addActionListener(oye3);

    }



}
