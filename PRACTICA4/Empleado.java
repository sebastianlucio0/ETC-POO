public abstract class Empleado {
    protected String nombre;
    protected String identificador;

    public Empleado(String nombre, String identificador) {
        this.nombre = nombre;
        this.identificador = identificador;
    }

    public abstract double calcularPago();

    public String getNombre() {
        return nombre;
    }

    public String getIdentificador() {
        return identificador;
    }
}