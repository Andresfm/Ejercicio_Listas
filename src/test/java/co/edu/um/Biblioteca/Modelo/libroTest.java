package co.edu.um.Biblioteca.Modelo;

import junit.framework.Assert;
import org.junit.Test;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: Andres
 * Date: 18/08/13
 * Time: 10:37
 * To change this template use File | Settings | File Templates.
 */
public class libroTest {

    @Test
    public void validaObjetoLibro() throws Exception
    {
        //valido que el objeto se cree y almacene los datos correctamente
        libro libroPrueba = new libro("isbn123", "el titulo", "el autor", new Date(),3);

        //validacion de creacion del objeto (referencia)
        Assert.assertNotNull(libroPrueba);

        //valido que los datos corresponda al de la clase
        Assert.assertEquals("isbn123", libroPrueba.getIsbn());
        Assert.assertEquals("el titulo", libroPrueba.getTitulo());
        Assert.assertEquals("el autor", libroPrueba.getAutor());
       // Assert.assertEquals(new Date(), libroPrueba.getFechaPublicacion());
        Assert.assertEquals(3, libroPrueba.getNumeroEjemplares());

    }

    @Test
    public void testGetIsbn() throws Exception {

    }

    @Test
    public void testSetIsbn() throws Exception {

    }

    @Test
    public void testGetTitulo() throws Exception {

    }

    @Test
    public void testSetTitulo() throws Exception {

    }

    @Test
    public void testGetAutor() throws Exception {

    }

    @Test
    public void testSetAutor() throws Exception {

    }

    @Test
    public void testGetFechaPublicacion() throws Exception {

    }

    @Test
    public void testSetFechaPublicacion() throws Exception {

    }

    @Test
    public void testGetNumeroEjemplares() throws Exception {

    }

    @Test
    public void testSetNumeroEjemplares() throws Exception {

    }
}
