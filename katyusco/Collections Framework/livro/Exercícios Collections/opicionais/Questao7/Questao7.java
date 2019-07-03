package poo.code;

public class Questao7 {

    public static void main(String[] args) {

        Banco banco = new Banco();
        banco.adiciona(new ContaCorrente("antonio", 150, 1));
        banco.adiciona(new ContaPoupança("jose", 1654, 1));
        banco.adiciona(new ContaCorrente("manuel", 321, 3));
        banco.adiciona(new ContaPoupança("Karla", 987, 4));

        System.out.println(banco.pega("antonio").equals(banco.pega("jose")));
        System.out.println(banco.pega("manuel").equals(banco.pega("Karla")));

    }

}
