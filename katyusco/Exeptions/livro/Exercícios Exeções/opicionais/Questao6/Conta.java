package poo.code;

public class Conta {
    private double saldo;

    public void deposita(double saldo) {
        if (saldo < 0) throw new ValorInvalidoException(saldo);
        this.saldo += saldo - 0.10;
    }
}
