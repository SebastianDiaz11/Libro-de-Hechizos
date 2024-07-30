package librodehechizos;

public class Agrandar extends Hechizo {
    public Agrandar(String nombre) {
        super(nombre);  // Llama al constructor de la clase base con el nombre del hechizo
    }

    @Override
    public void aplicarHechizo(Hechizable objetivo) {
        objetivo.setEstado("Ahora soy más grande");  // Aplica el estado "Ahora soy más grande" al objetivo
    }
}