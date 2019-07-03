package poo.code;

public class GerenciadorDeImpostoDeRenda {

    private double total;

    void adiciona(Tributavel t) {
        double tributos = t.calculaTributos();
        System.out.println("Adicionando tributavel: " + tributos);
        this.total += tributos;
    }

    public double getTotal() {
        return this.total;
    }

}
