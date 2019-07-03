package poo.code;

public class ContaPoupança extends Conta implements Comparable<ContaPoupança> {
    ContaPoupança(String name, double saldo, int num) {
        super(name, saldo, num);
    }

    ContaPoupança(String name, int num) {
        super(name, num);
    }

    @Override
    public int compareTo(ContaPoupança o) {
        return Integer.compare(getNum(), o.getNum());
    }
}
