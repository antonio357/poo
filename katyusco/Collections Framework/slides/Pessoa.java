package poo.code;

public class Pessoa implements Comparable<Pessoa> {
    private int idade;
    private String nome;

    public Pessoa(String nome, int idade) {
        setIdade(idade);
        setNome(nome);
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return new String(this.nome);
    }

    public int getIdade() {
        return new Integer(this.idade);
    }

    @Override
    public int compareTo(Pessoa pessoa) {
        return Integer.compare(this.getIdade(), pessoa.getIdade());
    }

    @Override
    public String toString() {
        return "Idade: " + getIdade() + " -- Nome: " + getNome();
    }
}
