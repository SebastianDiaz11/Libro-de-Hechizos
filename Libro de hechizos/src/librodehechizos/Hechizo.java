package librodehechizos;

import java.util.Objects;

public abstract class Hechizo {
    private String nombre;  // Nombre del hechizo

    public Hechizo(String nombre) {
        this.nombre = nombre;  // Inicializa el nombre del hechizo
    }

    public String getNombre() {
        return nombre;  // Devuelve el nombre del hechizo
    }

    public abstract void aplicarHechizo(Hechizable objetivo);  // Método abstracto para aplicar el hechizo

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;  // Verifica si son el mismo objeto
        if (o == null || getClass() != o.getClass()) return false;  // Verifica la clase del objeto
        Hechizo hechizo = (Hechizo) o;  // Hace un cast al tipo Hechizo
        return Objects.equals(nombre, hechizo.nombre);  // Compara los nombres de los hechizos
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);  // Genera un hash basado en el nombre
    }
}
