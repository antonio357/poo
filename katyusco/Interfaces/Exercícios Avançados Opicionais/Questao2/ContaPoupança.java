package poo.code;

public class ContaPoupança implements Conta, Tributavel {
    private double saldo;

    @Override
    public double getSaldo() {
        return this.saldo;
    }

    @Override
    public void deposita(double valor) {
        saldo += valor;
    }

    @Override
    public void saca(double valor) {
        saldo -= valor;
    }

    @Override
    public void atualiza(double taxaSelic) {
        System.out.println("ok");
    }

    @Override
    public double calculaTributos() {
        return (1/100.0) * getSaldo();
    }
}
