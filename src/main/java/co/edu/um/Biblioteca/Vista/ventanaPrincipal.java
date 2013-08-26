package co.edu.um.Biblioteca.Vista;

import co.edu.um.Biblioteca.Control.controlBiblioteca;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: Andres
 * Date: 18/08/13
 * Time: 10:38
 * To change this template use File | Settings | File Templates.
 */
public class ventanaPrincipal  extends JFrame implements ActionListener { //implemente significa que implementa una interfaz   //El action permite manejar el evento del boton

    //atributos
    //creamos la instancia del control
    private controlBiblioteca control = new controlBiblioteca();   //Permite intermediar entre el modelo y el control


    //componentes de la interfaz grafica
    private  JList nodosLibrosEnLista = new JList(); //la lista para mostrar los libros (isbn y titulo)
    private  JScrollPane panelDesplazamientoLista = new JScrollPane(nodosLibrosEnLista); //permite hacer scroll a la lista
    private JButton adicionarLibro = new JButton("Adicionar Libro");
    private JButton eliminarLibro = new JButton("Eliminar Libro");
    private JButton buscarLibro = new JButton("Buscar Libro");
    private JButton salirLibro = new JButton("Salir");
    private JLabel aviso = new JLabel("Listado de los libros actuales:");
    private JLabel bienvenido = new JLabel("BIENVENIDO AL SISTEMA");

    public ventanaPrincipal(){


        adicionarLibro.addActionListener(this);
        buscarLibro.addActionListener(this);
        eliminarLibro.addActionListener(this);
        salirLibro.addActionListener(this);


        this.setTitle("Ingreso a la Librería U.M.");
        this.getContentPane().setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        adicionarLibro.setBounds(460, 80, 150, 20);
        this.getContentPane().add(adicionarLibro);

        buscarLibro.setBounds(460, 120, 150, 20);
        this.getContentPane().add(buscarLibro);

        eliminarLibro.setBounds(460, 160, 150, 20);
        this.getContentPane().add(eliminarLibro);

        salirLibro.setBounds(460, 360, 150, 20);
        this.getContentPane().add(salirLibro);

        bienvenido.setBounds(270,20 , 250, 20);
        this.getContentPane().add(bienvenido);

        aviso.setBounds(50,50 , 250, 20);
        this.getContentPane().add(aviso);

        nodosLibrosEnLista.setBounds(50, 80, 350, 300);
        this.getContentPane().add(nodosLibrosEnLista);

        panelDesplazamientoLista.setBounds(50, 80, 350, 300);
        this.getContentPane().add(panelDesplazamientoLista);


        setSize(700, 500);
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent actionEvent) {

        if(actionEvent.getSource() == adicionarLibro)
        {
            ventanaAdicionar adicionar = new ventanaAdicionar();
            adicionar.setVisible(true);

            ventanaPrincipal principal = new ventanaPrincipal();
            principal.setVisible(false);
        }

        if(actionEvent.getSource() == salirLibro)
        {
            System.exit(0);
        }

    }
}
