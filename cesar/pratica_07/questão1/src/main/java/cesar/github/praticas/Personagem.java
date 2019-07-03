package cesar.github.praticas;

public abstract class Personagem {
    Arma_IF arma;

    public void falar() {
        System.out.println("HI");
    }

    public void arma() {
        this.arma.usarArma();
    }

    public void setArma(Arma_IF arma) {
        this.arma = arma;
    }

    public abstract void desenhar();
}
