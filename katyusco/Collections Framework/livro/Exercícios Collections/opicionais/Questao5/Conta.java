package poo.code;

public class Conta {
    private double saldo;

    Conta(double saldo) {
        deposita(saldo);
    }

    public void deposita(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return "" + getSaldo();
    }
}
