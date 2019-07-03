package oop.practices.sugunda_prova_de_katyusco.questao1;

public class Computador extends Maquina {
    public Tela tela = new Tela();
    public Teclado teclado = new Teclado();
    Computador() {
        System.out.println("Computador()");
    }
}
