package poo.k.tasks;

public class Boletin {
    private Aluno aluno;
    private String[] boletim;

    Boletin(Aluno aluno) {
        setAluno(aluno);
        boletim = new String[5];
    }

    private void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    protected Aluno getAluno() {
        return aluno;
    }

    public void setNota(double nota, int bimestre) {
        String no = "" + nota;
        bimestre -= 1;
        if (bimestre >= 0 && bimestre <= boletim.length - 1) boletim[bimestre] = no;
        double counter = 0;
        for (int i = 0; i < boletim.length - 1; i++) {
            if (boletim[i] != null) {
                counter += Double.parseDouble(boletim[i]);
            }
            else return;
        }
        boletim[boletim.length - 1] = "" + (counter/boletim.length - 1);
    }

    public String toString() {
        return "Boletim do Aluno={" + getAluno().getNome() + "}" + boletim[0] + ", " + boletim[1] + ", " + boletim[2] + ", " + boletim[3] + ", " + boletim[4];
    }

    @Override
    public boolean equals(Object obj) {
        Boletin boletinEqual = (Boletin) obj;
        return this.getAluno() == boletinEqual.getAluno();
    }
}
