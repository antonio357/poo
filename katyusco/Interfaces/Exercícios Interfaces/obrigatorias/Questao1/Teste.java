package poo.code;


public class Teste {

    public static void main(String[] args) {

        AreaCalculavel fig = new Quadrado(5);
        System.out.println(fig.calculaArea());
        fig = new Retangulo(3,2);
        System.out.println(fig.calculaArea());
        fig = new Circulo(7);
        System.out.println(fig.calculaArea());

    }


}
