package br.edu.ifpb.poo;

public class Fusca implements Comparable<Fusca> {
    private String cor;
    private  double preco;

    public Fusca(String c, double p) {
        this.cor = c;
        this.preco = p;
    }

    public String getCor() {
        return cor;
    }

    @Override
    public int compareTo(Fusca o) {
        String str1;
        String str2;
        return (this.cor.length() - o.getCor().length()) * -1;
    }

    @Override
    public String toString() {
        return "Fusca" + "{" + "cor=" + this.cor + ", " + "preco=" + this.preco + "}";
    }
}
