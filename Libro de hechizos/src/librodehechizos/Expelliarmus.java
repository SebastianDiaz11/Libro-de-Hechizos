package librodehechizos;

public class Expelliarmus extends Hechizo {
    public Expelliarmus() {
        super("Expelliarmus");  // Llama al constructor de la clase base con el nombre del hechizo
    }

    @Override
    public void aplicarHechizo(Hechizable objetivo) {
        objetivo.setEstado("Me desarmaron");  // Aplica el estado "Me desarmaron" al objetivo
    }
}