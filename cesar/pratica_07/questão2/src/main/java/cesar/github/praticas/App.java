package cesar.github.praticas;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Personagem p;

        p = new General();
        p.setArma(new Fuzil());
        p.setEsquiva(new Correr());
        p.setFala(new Falar());

        p.desenhar();
        p.falarr();
        p.esquivar();
        p.arma();

        p = new Soldado();
        p.setArma(new Revolver());
        p.setEsquiva(new Correr());
        p.setFala(new Falar());

        p.desenhar();
        p.falarr();
        p.esquivar();
        p.arma();

        p = new LutSUMO();
        p.setArma(new Desarmado());
        p.setEsquiva(new Correr());
        p.setFala(new Falar());

        p.desenhar();
        p.falarr();
        p.esquivar();
        p.arma();

        p = new DragãoAlado();
        p.setArma(new OndaDeFogo());
        p.setEsquiva(new Voar());
        p.setFala(new Mudo());

        p.desenhar();
        p.falarr();
        p.esquivar();
        p.arma();
    }
}
