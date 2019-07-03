package poo.code;


public class AcabandoComMemoriaDaJVM {

    public static void main(String[] args) {

        methodRecursion();

    }

    static void methodRecursion() {
        Conta conta = new ContaPoupança();
        methodRecursion();
    }

}
