package librodehechizos;

import java.util.HashMap;
import java.util.Map;

import java.util.HashMap;
import java.util.Map;

public class LibroDeHechizos {
    private Map<String, Hechizo> hechizos;  // Mapa para almacenar hechizos por su nombre

    public LibroDeHechizos() {
        this.hechizos = new HashMap<>();  // Inicializa el mapa de hechizos
    }

    public void agregarHechizo(Hechizo hechizo) {
        hechizos.put(hechizo.getNombre().toLowerCase(), hechizo);  // Agrega un hechizo al mapa
    }

    public Hechizo buscar(String nombre) {
        return hechizos.get(nombre.toLowerCase());  // Busca un hechizo en el mapa por su nombre
    }
}
