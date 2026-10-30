import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Empleado> listaEmpleados = new ArrayList<>();

        listaEmpleados.add(new EmpleadoTiempoCompleto("Ana Gómez", "E001", 15000.0));
        listaEmpleados.add(new EmpleadoPorHoras("Carlos Pérez", "E002", 150.0, 45));
        listaEmpleados.add(new EmpleadoTiempoCompleto("Sofía Torres", "E003", 18500.0));

        for (Empleado emp : listaEmpleados) {
            System.out.println("Empleado: " + emp.getNombre() + " (ID: " + emp.getIdentificador() + ")");
            System.out.println("Pago calculado: $" + emp.calcularPago());
            System.out.println("-----------------------------------");
        }
    }
}