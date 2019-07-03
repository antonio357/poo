package oop.practices.sugunda_prova_de_katyusco.questao4;

public class Foguete extends Veículo {

    Foguete(String combustível, Piloto[] pilotos) {
        super(combustível, pilotos);
    }

    public void Lançamento() {};

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
}
