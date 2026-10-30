
public class Main {
    public static void main(String[] args) {
        System.out.println("=== PRUEBAS DE LA CLASE CUENTA BANCARIA ==-\n");

        CuentaBancaria cuenta1 = new CuentaBancaria("Sebastián Rodríguez", 102938, 5000.0);

        System.out.println("Titular: " + cuenta1.getTitular());
        System.out.println("Número de Cuenta: " + cuenta1.getNumeroCuenta());
        System.out.println("Saldo inicial: $" + cuenta1.consultarSaldo());
        System.out.println("--------------------------------------------------");

        System.out.println("[Prueba 1] Depósito válido:");
        cuenta1.depositar(1500.50);
        System.out.println();

        System.out.println("[Prueba 2] Depósito inválido (negativo):");
        cuenta1.depositar(-500.0);
        System.out.println();

        System.out.println("[Prueba 3] Retiro válido:");
        cuenta1.retirar(2000.0);
        System.out.println();

        System.out.println("[Prueba 4] Retiro inválido (supera el saldo):");
        cuenta1.retirar(10000.0);
        System.out.println();

        System.out.println("[Prueba 5] Retiro inválido (monto negativo):");
        cuenta1.retirar(-200.0);
        System.out.println();

        System.out.println("--------------------------------------------------");
        System.out.println("Saldo final consolidado: $" + cuenta1.consultarSaldo());
    }
}