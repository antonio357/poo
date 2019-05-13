package cesar.github.praticas;

public abstract class Personagem {
    private Arma_IF arma;
    private Recuar esquiva;
    private Fala fala;

    public void setEsquiva(Recuar esquiva) {
        this.esquiva = esquiva;
    }

    public void esquivar() {
        this.esquiva.recuar();
    }

    public void setFala(Fala fala) {
        this.fala = fala;
    }

    public void falarr() {
        this.fala.falar();
    }

    public void arma() {
        this.arma.usarArma();
    }

    public void setArma(Arma_IF arma) {
        this.arma = arma;
    }

    public abstract void desenhar();
}
