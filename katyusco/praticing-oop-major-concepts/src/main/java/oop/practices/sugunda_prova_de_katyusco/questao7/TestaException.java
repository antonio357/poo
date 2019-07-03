package oop.practices.sugunda_prova_de_katyusco.questao7;

import java.io.EOFException;

public class TestaException {
    public  void f (String i) throws Exception {
        try {
            switch (Integer.parseInt(i)) {
                default:
                case 1: throw new NullPointerException();
                case 2: throw new NumberFormatException();
                case 3: throw new EOFException();
            }
        } catch (NumberFormatException e) {
            System.out.println("Em TestaExcecoes - NumberFormatException");
        } catch (EOFException e) {
            System.out.println("Em TestaExcecoes - EOFException");
        }
    }

    public static void main(String[] args) {
        TestaException teste = new TestaException();
        try {
            teste.f(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("No main - NumberFormatException");
        } catch (Exception e) {
            System.out.println("No main - Exception");
        }
    }
}
