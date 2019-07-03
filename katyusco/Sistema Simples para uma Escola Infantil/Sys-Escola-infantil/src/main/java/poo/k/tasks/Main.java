package poo.k.tasks;

import java.security.cert.TrustAnchor;

/**
 * Sistema da escola infantial
 *
 */
public class Main {
    public static void main( String[] args ) {

        Professor Jose = new Professor("Jose", 654, "Mestrado", 651651.0);
        Professor Moseis = new Professor("Moseis", 543, "Mestrado", 651651.0);
        Aluno Antonio = new Aluno("Antonio", 321, "Maria", "12/12/2012");
        Boletin antonioBoletin = new Boletin(Antonio);
        antonioBoletin.setNota(45, 1);
        antonioBoletin.setNota(68, 2);
        antonioBoletin.setNota(95, 3);
        antonioBoletin.setNota(100, 4);
        Aluno Joao = new Aluno("Joao", 54, "Marlene", "03/05/ 1205");
        Aluno Karla = new Aluno("Karla", 987, "Madalena", "14/09/301");
        Aluno Emanuel = new Aluno("Manuel", 79, "Sasha", "12/04/1023");

        Turma turma1 = new Turma(879423, "Turma de Jose", "Sala 32", "Tipo A", Jose);
        turma1.setMaterial("Lapis");
        turma1.setMaterial("Borracha");
        Antonio.setMaterial("Lapis");
        Antonio.setMaterial("Lapiseira");
        Antonio.setMaterial("Borracha");
        Joao.setMaterial("Lapis");
        Joao.setMaterial("Lapiseira");
        turma1.setIntegrante(Antonio);
        turma1.setIntegrante(Joao);

        Turma turma2 = new Turma(651, "Turma de Moises", "Sala 19", "Tipo B", Moseis);
        turma2.setMaterial("notebook");
        Emanuel.setMaterial("notebook");
        Joao.setMaterial("notebook");
        turma2.setIntegrante(Karla);
        turma2.setIntegrante(Emanuel);
        turma2.setIntegrante(Joao);

        Sistema escola = new Sistema("Escola tal", turma1);
        escola.setBoletinsSet(antonioBoletin);
        escola.setTurma(turma2);

        // Listagem de Alunos por Turma
        for (Turma turma : escola.getTurmas()) {
            System.out.println("\nTurma: " + turma.getNomeTurma());
            System.out.println(escola.listagemDosAlunos(turma));
        }

        // Listagem de alunos por Professor
        for (Professor professor : escola.getProfessorSet()) {
            System.out.println("\nProfessor: " + professor.getNome());
            System.out.println(escola.listagemDosAlunos(professor));
        }

        // Listagem dos Boletins de Notas
        System.out.println(escola.listagemDosBoletins());

        // Litagem dos Carnes
        System.out.println(escola.listagemDosCarnes());

        // Listagem dos Materiais por Turma
        for (Turma turma : escola.getTurmas()) {
            System.out.println("\nTurma: " + turma.getNomeTurma());
            System.out.println(escola.listagemDosMaterias(turma));
        }

    }
}
