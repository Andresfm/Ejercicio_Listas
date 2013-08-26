package co.edu.um.Biblioteca.Vista;

import co.edu.um.Biblioteca.Control.controlBiblioteca;
import co.edu.um.Biblioteca.Modelo.LEG;
import co.edu.um.Biblioteca.Modelo.libro;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: Andres
 * Date: 18/08/13
 * Time: 14:37
 * To change this template use File | Settings | File Templates.
 */
public class ventanaAdicionar extends JFrame implements ActionListener { //implemente significa que implementa una interfaz   //El action permite manejar el evento del boton

    //atributos
    //creamos la instancia del control
    private controlBiblioteca control = new controlBiblioteca();   //Permite intermediar entre el modelo y el control


    //componentes de la interfaz grafica
    private JList nodosLibrosEnLista = new JList(); //la lista para mostrar los libros (isbn y titulo)
    public  JTextField campoAdicionarIsbn = new JTextField();
    public  JTextField campoAdicionarTitulo = new JTextField();
    public  JTextField campoAdicionarAutor = new JTextField();
    public  JTextField campoAdicionarFechaEdi = new JTextField("     "+" /"+"   "+" /");
    public  JTextField campoAdicionarNumeroEjem = new JTextField();
    public  JTextField campoAdicionarTotalLibros = new JTextField();
    public  JTextField campoBuscar = new JTextField();
    private JLabel totalLibros = new JLabel("Total Libros:");
    private JLabel isbn = new JLabel("I.S.B.N:");
    private JLabel titulo = new JLabel("Titulo:");
    private JLabel autor = new JLabel("Autor:");
    private JLabel fechaEdi = new JLabel("Fecha de Edición:");
    private JLabel numeroEjem = new JLabel("Número de Ejemplares:");
    private JScrollPane panelDesplazamientoLista = new JScrollPane(); //permite hacer scroll a la lista
    private JButton adicionarLibroInicio = new JButton("Adicionar Libro al Inicio");
    private JButton adicionarLibroFinal = new JButton("Adicionar Libro al Final");
    private JButton adicionarLibroAntes = new JButton("Adicionar Libro Antes de");
    private JButton adicionarLibroDespues = new JButton("Adicionar Libro Despues de");
    private JButton eliminarLibro = new JButton("Eliminar Libro");
    private JButton botonBuscar = new JButton("Buscar");
    private JButton salirLibro = new JButton("Salir");
    private JLabel aviso = new JLabel("Listado de los libros actuales:");
    private JLabel aviso1 = new JLabel("    ISBN     |     Titulo     |     Autor    |   Fecha Edición  |   Numero Ejemplares");
    private JLabel bienvenido = new JLabel("BIENVENIDO AL SISTEMA");
    private JLabel buscar = new JLabel("Buscar por I.S.B.N:");


    DefaultListModel modeloLista = new DefaultListModel();



    public ventanaAdicionar(){


        adicionarLibroInicio.addActionListener(this);
        adicionarLibroFinal.addActionListener(this);
        adicionarLibroAntes.addActionListener(this);
        adicionarLibroDespues.addActionListener(this);
        eliminarLibro.addActionListener(this);
        botonBuscar.addActionListener(this);
        salirLibro.addActionListener(this);


        this.setTitle("Adicionar Libro en la Librería U.M.");
        this.getContentPane().setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.buscar.setBounds(50, 160, 150, 20);
        this.getContentPane().add(this.buscar);

        campoBuscar.setBounds(50, 180, 108, 20);
        this.getContentPane().add(campoBuscar);

        botonBuscar.setBounds(80, 200, 76, 20);
        this.getContentPane().add(botonBuscar);

        this.totalLibros.setBounds(50, 250, 100, 20);
        this.getContentPane().add(this.totalLibros);

        campoAdicionarTotalLibros.setBounds(125, 250, 30, 20);
        this.getContentPane().add(campoAdicionarTotalLibros);

        this.isbn.setBounds(50, 300, 100, 20);
        this.getContentPane().add(this.isbn);

        campoAdicionarIsbn.setBounds(100, 300, 150, 20);
        this.getContentPane().add(campoAdicionarIsbn);

        this.titulo.setBounds(260, 300, 100, 20);
        this.getContentPane().add(this.titulo);

        campoAdicionarTitulo.setBounds(300, 300, 150, 20);
        this.getContentPane().add(campoAdicionarTitulo);

        this.autor.setBounds(470, 300, 100, 20);
        this.getContentPane().add(this.autor);

        campoAdicionarAutor.setBounds(510, 300, 150, 20);
        this.getContentPane().add(campoAdicionarAutor);

        this.fechaEdi.setBounds(50,340,150,20);
        this.getContentPane().add(fechaEdi);

        campoAdicionarFechaEdi.setBounds(160,340,150,20);
        this.getContentPane().add(campoAdicionarFechaEdi);

        this.numeroEjem.setBounds(340,340,150,20);
        this.getContentPane().add(numeroEjem);

        campoAdicionarNumeroEjem.setBounds(480,340,150,20);
        this.getContentPane().add(campoAdicionarNumeroEjem);


        adicionarLibroInicio.setBounds(50, 380, 200, 20);
        this.getContentPane().add(adicionarLibroInicio);

        adicionarLibroFinal.setBounds(50, 420, 200, 20);
        this.getContentPane().add(adicionarLibroFinal);

        adicionarLibroAntes.setBounds(300, 380, 200, 20);
        this.getContentPane().add(adicionarLibroAntes);

        adicionarLibroDespues.setBounds(300, 420, 200, 20);
        this.getContentPane().add(adicionarLibroDespues);

        eliminarLibro.setBounds(540, 380,120, 20);
        this.getContentPane().add(eliminarLibro);

        salirLibro.setBounds(540, 420,120, 20);
        this.getContentPane().add(salirLibro);

        bienvenido.setFont(new java.awt.Font("Bernard MT Condensed", 0, 25));
        bienvenido.setBounds(250,20 , 250, 20);
        this.getContentPane().add(bienvenido);

        aviso.setBounds(50,40,250, 20);
        this.getContentPane().add(aviso);

        aviso1.setBounds(160,60,400, 20);
        this.getContentPane().add(aviso1);

        nodosLibrosEnLista.setBounds(160, 80, 400, 200);
        this.getContentPane().add(nodosLibrosEnLista);


        initComponents();

        this.nodosLibrosEnLista.setModel(modeloLista);

        getContentPane().setBackground(new java.awt.Color(110, 163, 255));
        setSize(700, 500);
        this.setVisible(true);
    }

    private void initComponents() {
    }


    @Override
    public void actionPerformed(ActionEvent actionEvent) {



        if(actionEvent.getSource() == adicionarLibroInicio)
        {


            if (this.campoAdicionarIsbn.getText().equals("") || this.campoAdicionarTitulo.getText().equals("") || this.campoAdicionarAutor.getText().equals("") || this.campoAdicionarFechaEdi.getText().equals("") || this.campoAdicionarNumeroEjem.getText().equals("") ){

                JOptionPane.showMessageDialog(null,"Por favor ingrese las caracteristicas del Libro");
                this.campoAdicionarIsbn.grabFocus();

            } else {


            int numeroEjemplares;

            numeroEjemplares=this.modeloLista.getSize();
            this.campoAdicionarTotalLibros.setText(""+numeroEjemplares);

            modeloLista.add(0,this.campoAdicionarTotalLibros.getText()+""+this.campoAdicionarIsbn.getText()+"           "+this.campoAdicionarTitulo.getText()+"             "+this.campoAdicionarAutor.getText()+"        "+this.campoAdicionarFechaEdi.getText()+"       "+this.campoAdicionarNumeroEjem.getText());

                this.campoAdicionarIsbn.setText(null);
                this.campoAdicionarTitulo.setText(null);
                this.campoAdicionarAutor.setText(null);
                this.campoAdicionarFechaEdi.setText(null);
                this.campoAdicionarNumeroEjem.setText(null);

             //En el control se enlazan los metodos con la ventana

            /*
              this.modeloLista.addElement(this.campoAdicionarTitulo.getText());
            this.campoAdicionarTitulo.setText(null);

            this.modeloLista.addElement(this.campoAdicionarAutor.getText());
            this.campoAdicionarAutor.setText(null);

            String titulo, autor;
            int isbn;
            isbn = Integer.parseInt(campoAdicionarIsbn.getText());
            titulo = campoAdicionarTitulo.getText();
            autor = campoAdicionarAutor.getText();

            ventanaAdicionar objLibros = new ventanaAdicionar();
            modeloLista.addElement(objLibros);
            */

        }
      }

        if(actionEvent.getSource() == adicionarLibroFinal)
        {
            if (this.campoAdicionarIsbn.getText().equals("") || this.campoAdicionarTitulo.getText().equals("") || this.campoAdicionarAutor.getText().equals("") || this.campoAdicionarFechaEdi.getText().equals("") || this.campoAdicionarNumeroEjem.getText().equals("") ){

                JOptionPane.showMessageDialog(null,"Por favor ingrese las caracteristicas del Libro");
                this.campoAdicionarIsbn.grabFocus();
            } else {

                int numeroEjemplares,indice;
                numeroEjemplares=this.modeloLista.getSize();
                this.campoAdicionarTotalLibros.setText(""+numeroEjemplares);

                indice = this.nodosLibrosEnLista.getSelectedIndex();
                this.modeloLista.addElement(this.campoAdicionarTotalLibros.getText()+""+this.campoAdicionarIsbn.getText()+"            "+this.campoAdicionarTitulo.getText()+"             "+this.campoAdicionarAutor.getText()+"        "+this.campoAdicionarFechaEdi.getText()+"       "+this.campoAdicionarNumeroEjem.getText());
                this.campoAdicionarIsbn.setText(null);
                this.campoAdicionarTitulo.setText(null);
                this.campoAdicionarAutor.setText(null);
                this.campoAdicionarFechaEdi.setText(null);
                this.campoAdicionarNumeroEjem.setText(null);

            }
        }

        if(actionEvent.getSource() == adicionarLibroDespues)
        {
            if (this.campoAdicionarIsbn.getText().equals("") || this.campoAdicionarTitulo.getText().equals("") || this.campoAdicionarAutor.getText().equals("") || this.campoAdicionarFechaEdi.getText().equals("") || this.campoAdicionarNumeroEjem.getText().equals("") ){

                JOptionPane.showMessageDialog(null,"Por favor ingrese las caraecteristicas del Libro");
                this.campoAdicionarIsbn.grabFocus();
            } else {

            //Si no es seleccionado que aparesca esta opción.
            JOptionPane.showMessageDialog(null,"Porfavor seleccione el libro");

            int indice,numeroEjemplares;
            indice = this.nodosLibrosEnLista.getSelectedIndex();
            modeloLista.add(indice+1,this.campoAdicionarTotalLibros.getText()+""+this.campoAdicionarIsbn.getText()+"            "+this.campoAdicionarTitulo.getText()+"             "+this.campoAdicionarAutor.getText()+"        "+this.campoAdicionarFechaEdi.getText()+"       "+this.campoAdicionarNumeroEjem.getText());

            numeroEjemplares=this.modeloLista.getSize();
            this.campoAdicionarTotalLibros.setText(""+numeroEjemplares);

                this.campoAdicionarIsbn.setText(null);
                this.campoAdicionarTitulo.setText(null);
                this.campoAdicionarAutor.setText(null);
                this.campoAdicionarFechaEdi.setText(null);
                this.campoAdicionarNumeroEjem.setText(null);
        }
      }

        if(actionEvent.getSource() == adicionarLibroAntes)
        {
            if (this.campoAdicionarIsbn.getText().equals("") || this.campoAdicionarTitulo.getText().equals("") || this.campoAdicionarAutor.getText().equals("") || this.campoAdicionarFechaEdi.getText().equals("") || this.campoAdicionarNumeroEjem.getText().equals("") ){

                JOptionPane.showMessageDialog(null,"Por favor ingrese las caracteristicas del Libro");
                this.campoAdicionarIsbn.grabFocus();
            } else {
            int indice,numeroEjemplares;
            indice = this.nodosLibrosEnLista.getSelectedIndex();
            modeloLista.add(indice,this.campoAdicionarTotalLibros.getText()+""+this.campoAdicionarIsbn.getText()+"            "+this.campoAdicionarTitulo.getText()+"             "+this.campoAdicionarAutor.getText()+"        "+this.campoAdicionarFechaEdi.getText()+"       "+this.campoAdicionarNumeroEjem.getText());

            numeroEjemplares=this.modeloLista.getSize();
            this.campoAdicionarTotalLibros.setText(""+numeroEjemplares);

                this.campoAdicionarIsbn.setText(null);
                this.campoAdicionarTitulo.setText(null);
                this.campoAdicionarAutor.setText(null);
                this.campoAdicionarFechaEdi.setText(null);
                this.campoAdicionarNumeroEjem.setText(null);
            }
        }


        if(actionEvent.getSource() == eliminarLibro)
        {
           int indice,numeroEjemplares;
           indice = this.nodosLibrosEnLista.getSelectedIndex();
           modeloLista.remove(indice);

           numeroEjemplares=this.modeloLista.getSize();
           this.campoAdicionarTotalLibros.setText(""+numeroEjemplares);


            this.campoAdicionarIsbn.setText(null);
            this.campoAdicionarTitulo.setText(null);
            this.campoAdicionarAutor.setText(null);
            this.campoAdicionarFechaEdi.setText(null);
            this.campoAdicionarNumeroEjem.setText(null);
        }

        if(actionEvent.getSource() == buscar)
        {


           if(this.campoAdicionarIsbn.getText() == this.campoAdicionarTotalLibros.getText() ){

              JOptionPane.showMessageDialog(null,this.campoAdicionarTotalLibros.getText()+""+this.campoAdicionarIsbn.getText()+"            "+this.campoAdicionarTitulo.getText()+"             "+this.campoAdicionarAutor.getText()+"        "+this.campoAdicionarFechaEdi.getText()+"       "+this.campoAdicionarNumeroEjem.getText());


           }


        }



        if(actionEvent.getSource() == salirLibro){
                 System.exit(0);
        }
      }






    private void actualizarListaConNodos()    //No esta completo toca que realizar mas codigo
    {
        //ToDo: actualizar la lista con la lista de los nodos

        //1. obtengo la lista de libros del control
         LEG<libro> listaDeLibros = control.getListaLibro();

        //2. borro todos los items que haya en la lista
        nodosLibrosEnLista.setModel(new DefaultListModel());

        //3. recorro la lista y voy adicionando los item a la lista
        //ToDo: falta
      }
}