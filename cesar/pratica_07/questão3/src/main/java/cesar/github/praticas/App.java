package cesar.github.praticas;

/**
 * Hello world!
 *
 */
public class App {
    public static void main( String[] args ) {
        Locadora locadora = new Locadora();
        CD cd = new CD();
        DVD dvd = new DVD();
        Fita fita = new Fita();


        System.out.println("Pratilheira");
        System.out.println(locadora.getNaLoja());
        System.out.println("Fora da loja");
        System.out.println(locadora.getAlugados());
        System.out.println("\n");

        cd.setName("calipsu");
        cd.setCod("6a5d4");
        cd.setPrice(new Lançamento());

        dvd.setName("banda u o");
        dvd.setCod("a8wd7");
        dvd.setPrice(new Lançamento());

        fita.setName("varal de cabare");
        fita.setCod("fg32h1");
        fita.setPrice(new Lançamento());

        locadora.colocar(fita);
        locadora.colocar(cd);
        locadora.colocar(dvd);

        System.out.println("Pratilheira");
        System.out.println(locadora.getNaLoja());
        System.out.println("Fora da loja");
        System.out.println(locadora.getAlugados());
        System.out.println("\n");

        locadora.alugar(cd);
        locadora.alugar(fita);

        cd.setPrice(new Normal());
        dvd.setPrice(new Normal());
        fita.setPrice(new Normal());

        System.out.println("Pratilheira");
        System.out.println(locadora.getNaLoja());
        System.out.println("Fora da loja");
        System.out.println(locadora.getAlugados());
        System.out.println("\n");

        locadora.retorna(cd);
        locadora.retorna(fita);

        cd.setPrice(new Infantil());
        dvd.setPrice(new Infantil());
        fita.setPrice(new Infantil());

        System.out.println("Pratilheira");
        System.out.println(locadora.getNaLoja());
        System.out.println("Fora da loja");
        System.out.println(locadora.getAlugados());
        System.out.println("\n");
    }
}
