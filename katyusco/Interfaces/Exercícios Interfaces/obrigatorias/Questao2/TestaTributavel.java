package poo.code;

public class TestaTributavel {

    public static void main(String[] args) {

        ContaCorrente cc = new ContaCorrente(100);
        System.out.println(cc.calculaTributos());
        SeguroDeVida seguroDeVida = new SeguroDeVida();
        System.out.println(seguroDeVida.calculaTributos());

        Tributavel t = cc;
        System.out.println(t.calculaTributos());
        t = seguroDeVida;
        System.out.println(t.calculaTributos());

    }

}
