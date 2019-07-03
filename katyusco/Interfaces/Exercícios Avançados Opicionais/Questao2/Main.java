package poo.code;

public class Main {
    public static void main(String[] args) {
        Conta c = new ContaCorrente();
        c.deposita(100);
        Tributavel t = new ContaCorrente();
    }
}
