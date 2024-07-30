package librodehechizos;

public class Animal implements Hechizable {
    private String estado;  // Estado del animal

    @Override
    public void setEstado(String estado) {
        this.estado = estado;  // Establece el estado del animal
    }

    @Override
    public String getEstado() {
        return estado;  // Devuelve el estado del animal
    }
}