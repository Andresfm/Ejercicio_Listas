package co.edu.um.Biblioteca.Modelo;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Andres
 * Date: 18/08/13
 * Time: 10:32
 * To change this template use File | Settings | File Templates.
 */
public class libro {

    //atributos
    private String isbn;
    private String titulo;
    private String autor;
    private Date fechaPublicacion;
    private int numeroEjemplares;

    //constructores
    public libro(String isbn, String titulo, String autor, Date fechaPublicacion, int numeroEjemplares) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.fechaPublicacion = fechaPublicacion;
        this.numeroEjemplares = numeroEjemplares;
    }  //Se requiere otro constructor vacio sin parametros


    public libro() {
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Date getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(Date fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

}
