public class Materia {
    private String codigoMateria;
    private String nombre;
    private int creditos;

    public Materia(String codigoMateria, String nombre, int creditos) {
        this.codigoMateria = codigoMateria;
        this.nombre = nombre;
        this.creditos = creditos;
    }

    public String obtenerDetalles() {
        return codigoMateria + " - " + nombre + " (" + creditos + " creditos)";
    }

    public String getCodigoMateria() {
        return codigoMateria;
    }

    public void setCodigoMateria(String codigoMateria) {
        this.codigoMateria = codigoMateria;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
}