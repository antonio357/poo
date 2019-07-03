package poo.k.tasks;

public class Professor extends Pessoa {
    private String GrauDeInstrucao;
    private double SalarioBase;

    Professor(String nome, int matricula, String grauDeInstrucao, double salarioBase) {
        super(nome, matricula);
        setGrauDeInstrucao(grauDeInstrucao);
        setSalarioBase(salarioBase);
    }

    @Override
    public boolean equals(Object obj) {
        Professor professorEqual = (Professor) obj;
        return getMatricula() == professorEqual.getMatricula();
    }

    public void setSalarioBase(double salarioBase) {
        SalarioBase = salarioBase;
    }

    public void setGrauDeInstrucao(String grauDeInstrucao) {
        GrauDeInstrucao = grauDeInstrucao;
    }

    public double getSalarioBase() {
        return SalarioBase;
    }

    public String getGrauDeInstrucao() {
        return GrauDeInstrucao;
    }

    @Override
    public String toString() {
        return "\nProfessor={" + getNome() + "}" + "\nMatricula={" + getMatricula() + "}"
                + "\nGrauDeInstrução={" + getGrauDeInstrucao() + "}" + "\nSalarioBase={" + getSalarioBase() + "}";
    }
}
