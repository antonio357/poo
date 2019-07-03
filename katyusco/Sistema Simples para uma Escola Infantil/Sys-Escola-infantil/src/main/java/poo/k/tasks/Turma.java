package poo.k.tasks;

import java.util.ArrayList;
import java.util.List;

public class Turma {
    private int codigo;
    private String nomeTurma;
    private String sala;
    private String horario;
    private List<Aluno> Alunos;
    private List<Professor> Professores;
    private List<String> Materiais;

    Turma(int codigo, String nomeTurma, String sala, String horario, Professor professor) {
        setCodigo(codigo);
        setNomeTurma(nomeTurma);
        setSala(sala);
        setHorario(horario);
        Materiais = new ArrayList<>();
        Alunos = new ArrayList<>();
        Professores = new ArrayList<>();
        setIntegrante(professor);
    }

    public List<Professor> getProfessores() {
        return Professores;
    }

    public void setMaterial(String materiais) {
        Materiais.add(materiais);
    }

    public List<String> getMateriais() {
        return Materiais;
    }

    public void setIntegrante(Professor professor) {
        Professores.add(professor);
    }
    public void setIntegrante(Aluno aluno) {
        if (checkAluno(aluno)) Alunos.add(aluno);
    }

    public List<Aluno> getAlunos() {
        return Alunos;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNomeTurma(String nomeTurma) {
        this.nomeTurma = nomeTurma;
    }

    public String getSala() {
        return sala;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getHorario() {
        return horario;
    }

    public String getNomeTurma() {
        return nomeTurma;
    }

    private boolean checkAluno(Aluno aluno) {
        return aluno.getMateriais().containsAll(this.getMateriais());
    }

    @Override
    public String toString() {
        return "\n\nTurma={" + getNomeTurma() + "}" + "\nSala={" + getSala() + "}" + "\nHorario={" + getHorario() + "}" +
                 "\nCodigo={" + getCodigo() + "}" + "\nProfessores={" + getProfessores() + "}" +
                "\nMateriais={" + getMateriais() + "}" + "\n\nAlunos={" + getAlunos() + "}";
    }
}
