package poo.k.tasks;

import java.util.ArrayList;
import java.util.List;

public class Aluno extends Pessoa{
    private String NomeDaMae;
    private String DataNascimento;
    private List<String> materiais;

    Aluno(String nome, int mat, String nomeDaMae, String dataNascimento) {
        super(nome, mat);
        setNomeDaMae(nomeDaMae);
        setDataNascimento(dataNascimento);
        materiais = new ArrayList<>();
    }

    @Override
    public boolean equals(Object obj) {
        Aluno alunoEqual = (Aluno) obj;
        return getMatricula() == alunoEqual.getMatricula();
    }


    public void setMaterial(String materiais) {
        this.materiais.add(materiais);
    }

    public List<String> getMateriais() {
        return materiais;
    }


    public void setDataNascimento(String dataNascimento) {
        DataNascimento = dataNascimento;
    }

    public void setNomeDaMae(String nomeDaMae) {
        NomeDaMae = nomeDaMae;
    }

    public String getDataNascimento() {
        return DataNascimento;
    }

    public String getNomeDaMae() {
        return NomeDaMae;
    }

    @Override
    public String toString() {
        return "\nAluno={" + getNome() + "}" + "\nMatricula={" + getMatricula() + "}" +
                "\nNomeDaMae={" + getNomeDaMae() + "}" + "\nDataDeNascimento={" + getDataNascimento() +
                "}" + "\nMateriais={" + getMateriais() + "}";
    }
}
