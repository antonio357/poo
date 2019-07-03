package poo.code;

public class Conta {
    private double saldo;
    private String name;

    Conta(String nome, double saldo) {
        deposita(saldo);
        setName(nome);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposita(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return getName() + "; " + getSaldo();
    }
}
