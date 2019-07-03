package poo.k.tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sistema {
    private String nomeEscola;
    private List<Turma> turmas;
    private Set<Aluno> alunosSet;
    private Set<Carne> carnesSet;
    private Set<Boletin> boletinsSet;
    private Set<Professor> professorSet;

    Sistema(String nomeEscola, Turma turma) {
        setNomeEscola(nomeEscola);
        turmas = new ArrayList<>();
        alunosSet = new HashSet<>();
        carnesSet = new HashSet<>();
        professorSet = new HashSet<>();
        boletinsSet = new HashSet<>();
        setTurma(turma);
    }

    public void setTurma(Turma turma) {
        turmas.add(turma);
        for (Aluno aluno : turma.getAlunos()) alunosSet.add(aluno);
        for (Professor professor : turma.getProfessores()) professorSet.add(professor);
    }

    public void setBoletinsSet(Boletin boletins) {
        this.boletinsSet.add(boletins);
    }

    public Set<Professor> getProfessorSet() {
        return this.professorSet;
    }

    public void setNomeEscola(String nomeEscola) {
        this.nomeEscola = nomeEscola;
    }

    public List<Turma> getTurmas() {
        return turmas;
    }

    public String getNomeEscola() {
        return nomeEscola;
    }

    @Override
    public String toString() {
        return "Escola={" + getNomeEscola() + "}" + "\nTurmas={" + getTurmas() + "}";
    }

    public List<Aluno> listagemDosAlunos(Turma turma) {
        return turma.getAlunos();
    }

    public List<Aluno> listagemDosAlunos(Professor professor) {
        List<Aluno> alunoList = new ArrayList<>();
        for (Turma turma: turmas) {
            if (turma.getProfessores().contains(professor)) {
                alunoList.addAll(turma.getAlunos());
            }
        }
        return alunoList;
    }

    public Set<Boletin> listagemDosBoletins() {
        return boletinsSet;
    }

    public List<String> listagemDosMaterias(Turma turma) {
        return turma.getMateriais();
    }

    public Set<Carne> listagemDosCarnes() {
        return carnesSet;
    }

}
