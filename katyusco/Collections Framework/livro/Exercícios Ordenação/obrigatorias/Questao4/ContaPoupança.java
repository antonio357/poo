package poo.code;

public class ContaPoupança extends Conta {
    ContaPoupança(String name, double saldo, int num) {
        super(name, saldo, num);
    }


    public int compareTo(ContaPoupança o) {
        return Integer.compare(getNum(), o.getNum());
    }
}
