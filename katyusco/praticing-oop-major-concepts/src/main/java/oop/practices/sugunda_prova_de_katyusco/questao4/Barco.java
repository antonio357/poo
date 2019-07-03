package oop.practices.sugunda_prova_de_katyusco.questao4;

public class Barco extends Veículo implements Navegavel {
    int Largura, Comprimento;

    Barco(String combustível, Piloto[] pilotos, int Largura, int Comprimento) {
        super(combustível, pilotos);
        this.Largura = Largura;
        this.Comprimento = Comprimento;
    }

    @Override
    public String getCombustível() {
        return this.combustível;
    }

    @Override
    public void frear() {

    }

    @Override
    public void acelera() {

    }

    @Override
    public void localização() {

    }
}
