package co.edu.um.Biblioteca.Modelo;

/**
 * Created with IntelliJ IDEA.
 * User: Andres
 * Date: 18/08/13
 * Time: 10:32
 * To change this template use File | Settings | File Templates.
 */
public class LEG<E> {
    //atributos
    protected nodoLeg<E> primero;
    protected int talla;

    //constructor
    public LEG() {
        primero = null;
        talla = 0;
    }

    //metodos

    /**
     * Ratorna el numero de elementos de la lista
     * @return numero de elementos de la lista
     */

    public int talla(){
        //ToDo: falta implementar el retorno de talla
        return 0;
    }

    /**
     * Adiciona un nodo a la lista
     * @param x Informacion del nodo de tipo E
     */
    public void insertar (E x){
        nodoLeg<E> nuevo= new nodoLeg<E>(x);
        nuevo.siguiente=primero;
        primero=nuevo;
        this.talla ++;

    }

    public void insertarEnFin (E x){
        nodoLeg<E> nl= new nodoLeg<E>(x);
        this.talla ++;
        nodoLeg<E> aux = primero;
        if  (aux == null) {
            primero = nl;
        }
        else {
            while (aux.siguiente != null){
                aux= aux.siguiente;
                aux.siguiente=nl;
            }
        }


    }
    public boolean eliminar(E x) {
        nodoLeg<E> aux = primero, ant=null;
        boolean res = false;
        while (aux != null){
            ant=aux;
            aux=aux.siguiente;
        }
        if (aux != null){
            res = true;
            this.talla -- ;
            if (ant == null) {
                primero =aux.siguiente;


            } else{   ant.siguiente = aux.siguiente;

            }
        }
        return res;

    }
    public String toString(){
        String res ="";
        for (nodoLeg<E> aux = primero;
             aux != null;
             aux=aux.siguiente) {
            res += aux.dato.toString()+"\n";

        }

        return res;
    }

}
