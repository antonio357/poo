package poo.k.tasks;

import javax.xml.stream.FactoryConfigurationError;

public class Carne {
    private Aluno aluno;
    private String referente;
    private boolean pago;
    private double valor;
    private String data;

    Carne(Aluno aluno, double valor, String data, String referente) {
        setAluno(aluno);
        setData(data);
        setValor(valor);
        setReferente(referente);
        setPago(false);
    }

    public void setPago(boolean pago) {
        this.pago = pago;
    }

    public boolean isPago() {
        return pago;
    }

    private void setReferente(String referente) {
        this.referente = referente;
    }

    private void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    private void setData(String data) {
        this.data = data;
    }

    private void setValor(double valor) {
        this.valor = valor;
    }

    protected Aluno getAluno() {
        return aluno;
    }

    protected double getValor() {
        return valor;
    }

    protected String getData() {
        return data;
    }

    protected String getReferente() {
        return referente;
    }

    @Override
    public boolean equals(Object obj) {
        Carne carneEqual = (Carne) obj;
        if (getAluno().equals(carneEqual.getAluno()) &&
                getData().equals(carneEqual.getData()) &&
                getReferente().equals(carneEqual.getReferente())) return true;
        return false;
    }

    @Override
    public String toString() {
        return "\nCarne={" + getReferente() + "}" + "\nAluno={" + getAluno() + "}" + "\nData={" + getData() + "}" +
                "\nValor={" + getValor() + "}";
    }
}
