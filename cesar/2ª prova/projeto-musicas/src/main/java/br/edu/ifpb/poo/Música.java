package br.edu.ifpb.poo;

public class Música implements Comparable<Música> {
    private int cod;
    private String titulo;
    private String autor;
    private int ano;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public int compareTo(Música o) {
        return Integer.compare(getCod(), o.getCod());
    }

    @Override
    public String toString() {
        return "Música=" + "{" + getCod() + ", " + getTitulo() + ", " + getAutor() + ", " + getAno() + "}";
    }

    public String toStringGrava() {
        return getCod() + "; " + getTitulo() + "; " + getAutor() + "; " + getAno();
    }
}
