package poo.code;

public class TestaGerenciadorDeImpostoDeRenda {

    public static void main(String[] args) {

        GerenciadorDeImpostoDeRenda geranciador = new GerenciadorDeImpostoDeRenda();

        SeguroDeVida sv = new SeguroDeVida();
        geranciador.adiciona(sv);

        ContaCorrente cc = new ContaCorrente(1000);
        geranciador.adiciona(cc);

        System.out.println(geranciador.getTotal());

    }

}
