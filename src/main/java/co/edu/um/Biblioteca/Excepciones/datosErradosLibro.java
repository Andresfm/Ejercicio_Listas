package co.edu.um.Biblioteca.Excepciones;

/**
 * Created with IntelliJ IDEA.
 * User: Andres
 * Date: 18/08/13
 * Time: 10:31
 * To change this template use File | Settings | File Templates.
 */
public class datosErradosLibro extends Exception {

    //cosntructor
    public datosErradosLibro(String s) {
        super("Los datos del libro tiene problemas");
    }

}
