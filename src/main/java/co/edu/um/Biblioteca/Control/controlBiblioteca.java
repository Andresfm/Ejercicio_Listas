package co.edu.um.Biblioteca.Control;


import co.edu.um.Biblioteca.Excepciones.datosErradosLibro;
import co.edu.um.Biblioteca.Modelo.LEG;
import co.edu.um.Biblioteca.Modelo.libro;

/**
 * Created with IntelliJ IDEA.
 * User: Andres
 * Date: 18/08/13
 * Time: 10:31
 * To change this template use File | Settings | File Templates.
 */
public class controlBiblioteca {
    //creo la lista que se va a utilizar para contener los nodos
    private LEG<libro> listaLibro = new LEG<libro>();

    //get y set
    public LEG<libro> getListaLibro() {
        return listaLibro;
    }

    public void setListaLibro(LEG<libro> listaLibro) {
        this.listaLibro = listaLibro;
    }

    /**
     * Realiza el control del caso de uso numero 1
     */
    public void adicionarLibro() throws datosErradosLibro // Este metodo es muy interesante ya que lo invoco de vista
    {
        // Libro nuevoLibro = null;
        libro nuevoLibro = new libro();     //Por medio del constructor puedo capturar los datos y relacionarlo con la interfaz

        //1. muestro la ventana para ingresar nuevos libros
        //ToDo: falta crear la vista para ingresar nuevos datos

        //2. recupero los datos del libro

        //3. si los datos no son completos o estan incorrectos lanzo la excepcion

        //4. Creo un nodo y le asigno el libro

        //5. adiciono el nodo a la lista

        //6. la vista debe actualizar la lista de nodos

        // Hayq colocar una excepcion de que ccumpla con que esten llenos los campos ISBN

    }

    public void adicionarLibro(String text) {
    }
}

