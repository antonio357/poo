package cesar.github.praticas;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Personagem p;

        p = new Soldado();
        p.desenhar();
        p.setArma(new Revolver());
        p.arma();
        p.setArma(new Fuzil());
        p.arma();

        p = new LutSUMO();
        p.desenhar();
        p.setArma(new Desarmado());
        p.arma();
    }
}
