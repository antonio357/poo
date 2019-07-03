package poo.k.tasks;

public abstract class Pessoa {
    private String Nome;
    private int Matricula;

    Pessoa(String nome, int matricula) {
        setMatricula(matricula);
        setNome(nome);
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public void setMatricula(int matricula) {
        Matricula = matricula;
    }

    public String getNome() {
        return Nome;
    }

    public int getMatricula() {
        return Matricula;
    }

}
