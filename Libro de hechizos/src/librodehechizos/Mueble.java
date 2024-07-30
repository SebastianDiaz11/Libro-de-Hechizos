package librodehechizos;

public class Mueble implements Hechizable {
    private String estado;  // Estado del mueble

    @Override
    public void setEstado(String estado) {
        this.estado = estado;  // Establece el estado del mueble
    }

    @Override
    public String getEstado() {
        return estado;  // Devuelve el estado del mueble
    }
}