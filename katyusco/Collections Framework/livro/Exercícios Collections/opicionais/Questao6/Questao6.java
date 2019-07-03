package poo.code;

public class Questao6 {

    public static void main(String[] args) {

        Banco banco = new Banco();
        banco.adiciona(new ContaCorrente("antonio", 150));
        banco.adiciona(new ContaPoupança("jose", 1654));
        banco.adiciona(new ContaCorrente("manuel", 321));
        banco.adiciona(new ContaPoupança("Karla", 987));

        System.out.println(banco.pega("antonio"));
        System.out.println(banco.pega("jose"));
        System.out.println(banco.pega("manuel"));
        System.out.println(banco.pega("Karla"));
        System.out.println(banco.pegaQuantidadeDeContas());

    }

}
