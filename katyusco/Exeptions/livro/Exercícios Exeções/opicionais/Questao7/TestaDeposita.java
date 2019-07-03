package poo.code;


public class TestaDeposita {

    public static void main(String[] args) {

        Conta conta = new ContaPoupança();
        try {
            conta.deposita(-100);
        }
        catch (ValorInvalidoException e) {
            e.printStackTrace();
            System.exit(1);
        }

    }

}
