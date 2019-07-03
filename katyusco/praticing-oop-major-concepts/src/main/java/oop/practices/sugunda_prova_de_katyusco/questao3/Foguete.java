package oop.practices.sugunda_prova_de_katyusco.questao3;

public class Foguete extends Veículo {

    public void Lançamento() {};

    @Override
    public String getCombustível() {
        return "getCombustível invocado apesar de não poder fazer nada";
    }

    @Override
    public void frear() {

    }

    @Override
    public void acelera() {

    }
}
