package co.edu.um.Biblioteca.Vista;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: Andres
 * Date: 18/08/13
 * Time: 10:32
 * To change this template use File | Settings | File Templates.
 */
public class ventanaUno extends JFrame implements ActionListener {

    private JButton ingresar = new JButton("Ingresar");
    private JButton salir = new JButton("Salir");
    private JLabel bienvenida = new JLabel("Bienvenido al Sistema de Libros U.M.");



    public ventanaUno()  {

        ingresar.addActionListener(this);
        salir.addActionListener(this);


        this.setTitle("Ingreso a la Librería U.M.");
        this.getContentPane().setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        ingresar.setBounds(240, 280, 100, 20);
        this.getContentPane().add(ingresar);

        salir.setBounds(360, 280, 100, 20);
        this.getContentPane().add(salir);

        bienvenida.setBounds(150, 80, 500, 80);
        this.getContentPane().add(bienvenida);


        bienvenida.setFont(new java.awt.Font("Bernard MT Condensed", 0, 28));
        getContentPane().setBackground(new java.awt.Color(110, 163, 255));
        setSize(700, 500);
        this.setVisible(true);



    }



    @Override
    //maneja los eventos de los botones
    public void actionPerformed(ActionEvent actionEvent) {

        if(actionEvent.getSource() == ingresar)
        {
            ventanaAdicionar prin = new ventanaAdicionar();
            prin.setVisible(true);

            ventanaUno uno = new ventanaUno();
            uno.setVisible(false);
        }

        if(actionEvent.getSource() == salir)
        {
            System.exit(0);
        }

    }
}

