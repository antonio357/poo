package poo.code;

public class Questao5 {

    public static void main(String[] args) {

        Banco banco = new Banco();
        banco.adiciona(new ContaCorrente(150));
        banco.adiciona(new ContaPoupança(1654));
        banco.adiciona(new ContaCorrente(321));
        banco.adiciona(new ContaPoupança(987));

        for (int i = 0; i < banco.pegaQuantidadeDeContas(); i++) System.out.println(banco.pega(i));

    }

}
