package oop.practices.sugunda_prova_de_katyusco.questao1;

public class Notebook extends Computador {
    int codigo = 12345;
    public Bateria bateria = new Bateria();
    Notebook() {
        System.out.println("Notebook();" + "codigo= " + codigo);
    }
    public void ligar() {
        System.out.println("Notebook.ligar();" + " codigo = " + ++codigo);
    }
}
