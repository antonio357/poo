package poo.code;

public class Circulo implements AreaCalculavel {

    private double raio;

    Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double calculaArea() {
        return raio*raio * Math.PI;
    }
}
