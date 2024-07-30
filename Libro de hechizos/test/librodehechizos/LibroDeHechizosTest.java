package librodehechizos;

import org.junit.Assert;
import org.junit.Test;


public class LibroDeHechizosTest {

    @Test
    public void queSePuedaAgregarUnHechizoAlLibro() {
        LibroDeHechizos libro = new LibroDeHechizos();  // Crea una instancia del libro de hechizos
        Hechizo desarme = new Expelliarmus();  // Crea una instancia del hechizo Expelliarmus
        libro.agregarHechizo(desarme);  // Agrega el hechizo al libro
        Assert.assertEquals(desarme, libro.buscar("expelliarmus"));  // Verifica que el hechizo se haya agregado y se pueda buscar
    }

    @Test
    public void verSiUnHechizableEstaHechizado() {
        LibroDeHechizos libro = new LibroDeHechizos();  // Crea una instancia del libro de hechizos
        Expelliarmus desarme = new Expelliarmus();  // Crea una instancia del hechizo Expelliarmus
        Hechizable perro = new Animal();  // Crea una instancia de un animal hechizable
        libro.agregarHechizo(desarme);  // Agrega el hechizo al libro
        Hechizo hechizo = libro.buscar("expelliarmus");  // Busca el hechizo en el libro
        hechizo.aplicarHechizo(perro);  // Aplica el hechizo al animal
        Assert.assertEquals("Me desarmaron", perro.getEstado());  // Verifica que el estado del animal sea "Me desarmaron"
    }

    @Test
    public void verSiUnHechizableCrece() {
        LibroDeHechizos libro = new LibroDeHechizos();  // Crea una instancia del libro de hechizos
        Hechizo crecer = new Agrandar("enormuvus");  // Crea una instancia del hechizo Agrandar con nombre "enormuvus"
        Hechizable mesa = new Mueble();  // Crea una instancia de un mueble hechizable
        libro.agregarHechizo(crecer);  // Agrega el hechizo al libro
        Hechizo hechizo = libro.buscar("enormuvus");  // Busca el hechizo en el libro
        hechizo.aplicarHechizo(mesa);  // Aplica el hechizo al mueble
        Assert.assertEquals("Ahora soy más grande", mesa.getEstado());  // Verifica que el estado del mueble sea "Ahora soy más grande"
    }

    @Test
    public void agregarYBuscarHechizoNoExistente() {
        LibroDeHechizos libro = new LibroDeHechizos();  // Crea una instancia del libro de hechizos
        Assert.assertNull(libro.buscar("inexistente"));  // Verifica que buscar un hechizo inexistente devuelva null
    }

    @Test
    public void agregarDosHechizosYVerificar() {
        LibroDeHechizos libro = new LibroDeHechizos();  // Crea una instancia del libro de hechizos
        Hechizo desarme = new Expelliarmus();  // Crea una instancia del hechizo Expelliarmus
        Hechizo crecer = new Agrandar("enormuvus");  // Crea una instancia del hechizo Agrandar con nombre "enormuvus"
        libro.agregarHechizo(desarme);  // Agrega el hechizo Expelliarmus al libro
        libro.agregarHechizo(crecer);  // Agrega el hechizo Agrandar al libro
        Assert.assertEquals(desarme, libro.buscar("expelliarmus"));  // Verifica que el hechizo Expelliarmus se haya agregado y se pueda buscar
        Assert.assertEquals(crecer, libro.buscar("enormuvus"));  // Verifica que el hechizo Agrandar se haya agregado y se pueda buscar
    }
}