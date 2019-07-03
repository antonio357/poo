package poo.code;

public class ContaCorrente extends Conta {
    ContaCorrente(String name, double saldo, int num) {
        super(name, saldo, num);
    }

    ContaCorrente(String name, int num) {
        super(name, num);
    }
}
