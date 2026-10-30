
public class CuentaBancaria {
    private String titular;
    private int numeroCuenta;
    private double saldo;

    public CuentaBancaria(String titular, int numeroCuenta, double saldoInicial) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0.0;
        }
    }

    public String getTitular() {
        return titular;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public double consultarSaldo() {
        return saldo;
    }

    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Depósito exitoso de: $" + monto + " | Nuevo saldo: $" + saldo);
        } else {
            System.out.println("Error: No se puede depositar una cantidad negativa o igual a cero.");
        }
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            System.out.println("Error: El monto a retirar debe ser mayor a cero.");
        } else if (monto > saldo) {
            System.out.println("Error: Fondos insuficientes. Intento de retiro: $" + monto + " | Saldo actual: $" + saldo);
        } else {
            saldo -= monto;
            System.out.println("Retiro exitoso de: $" + monto + " | Saldo restante: $" + saldo);
        }
    }
}