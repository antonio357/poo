package poo.code;

public class ContaCorrente extends Conta implements Tributavel{
    ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public double calculaTributos() {
        return (1.0/100.0)*getSaldo();
    }

}
