package poo.code;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class Questao1 {

    public static void main(String[] args) {
        System.out.println("\nexemple()");
        exemple();
        System.out.println("\ntrocandoArrayLIstPorHashSet()");
        trocandoArrayLIstPorHashSet();
        System.out.println("\npergunta()");
        pergunta();
    }

    public static void pergunta() {

        System.out.println("Iniciando...");

        Collection<Integer> teste = new HashSet<>();
        long inicio = System.currentTimeMillis();
        int total = 30000;

        long init = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            teste.add(i);
        }
        long end = System.currentTimeMillis();

        long init1 = System.currentTimeMillis();
        for (int i = 0; i < total; i++) {
            teste.contains(i);
        }
        long end1 = System.currentTimeMillis();

        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo gasto: " + tempo);
        System.out.println("Tempo gasto adicionando: " + (end - init));
        System.out.println("Tempo gasto procurando: " + (end1 - init1));

    }

    public static void exemple() {

        System.out.println("Iniciando...");

        Collection<Integer> teste = new ArrayList<>();
        long inicio = System.currentTimeMillis();
        int total = 30000;

        for (int i = 0; i < total; i++) {
            teste.add(i);
        }

        for (int i = 0; i < total; i++) {
            teste.contains(i);
        }

        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo gasto: " + tempo);

    }

    public static void trocandoArrayLIstPorHashSet() {

        System.out.println("Iniciando...");

        Collection<Integer> teste = new HashSet<>();
        long inicio = System.currentTimeMillis();
        int total = 30000;

        for (int i = 0; i < total; i++) {
            teste.add(i);
        }

        for (int i = 0; i < total; i++) {
            teste.contains(i);
        }

        long fim = System.currentTimeMillis();
        long tempo = fim - inicio;
        System.out.println("Tempo gasto: " + tempo);

    }

}

