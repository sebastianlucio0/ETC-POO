public class EmpleadoPorHoras extends Empleado {
    private double tarifaPorHora;
    private int horasTrabajadas;

    public EmpleadoPorHoras(String nombre, String identificador, double tarifaPorHora, int horasTrabajadas) {
        super(nombre, identificador);
        this.tarifaPorHora = tarifaPorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calcularPago() {
        return tarifaPorHora * horasTrabajadas;
    }
}