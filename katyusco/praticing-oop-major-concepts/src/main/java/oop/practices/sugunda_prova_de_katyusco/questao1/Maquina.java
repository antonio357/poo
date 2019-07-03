package oop.practices.sugunda_prova_de_katyusco.questao1;

public class Maquina {
    private String fabricante = "Intel";
    Maquina() {
        System.out.println("Maquina()");
        System.out.println(fabricante);
        this.ligar();
    }

    public void ligar() {
        System.out.println("Maquina ligar()");
    }
}
