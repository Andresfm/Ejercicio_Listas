package co.edu.um.Biblioteca.Modelo;

/**
 * Created with IntelliJ IDEA.
 * User: Andres
 * Date: 18/08/13
 * Time: 10:32
 * To change this template use File | Settings | File Templates.
 */
public class nodoLeg<E> {

    //atributos
    E dato;
    nodoLeg<E> siguiente;

    //constructores
    public nodoLeg(E dato) {
        this.dato = dato;
    }

    public nodoLeg(E dato, nodoLeg<E> siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }
}
