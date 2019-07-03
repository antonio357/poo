package oop.practices.sugunda_prova_de_katyusco.questao4;

public abstract class Veículo implements Dirigivel {
    protected String combustível;
    private Piloto[] pilotos;

    Veículo(String combustível, Piloto[] pilotos) {
        this.combustível = combustível;
        this.pilotos = pilotos;
    }

    public abstract String getCombustível();

    public final String getAtributos() {
        String s = "";
        for (Piloto p : pilotos) s += p.getAtributos();
        return "Combustível"this.combustível + s + "\n";
    }
}
