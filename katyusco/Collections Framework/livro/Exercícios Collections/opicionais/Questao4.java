package poo.code;

import java.util.*;

public class Questao4 {

    public static void main(String[] args) {

        System.out.println("\nAdicionar no inicio");
        System.out.println("Tempo para ArrayList");
        testaPerformanceDeAdicionarNaPrimeiraPosicao(new ArrayList<Integer>());
        System.out.println("Tempo para LinkedList");
        testaPerformanceDeAdicionarNaPrimeiraPosicao(new LinkedList<Integer>());

        System.out.println("\nPercorrer");
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 30000; i++) list.add(0, i);
        List<Integer> list1 = new LinkedList<>();
        for (int i = 0; i < 30000; i++) list1.add(0, i);
        System.out.println("Tempo para ArrayList");
        testaPerformancePercorrer(list);
        System.out.println("Tempo para LinkedList");
        testaPerformancePercorrer(list1);

    }

    public static void testaPerformanceDeAdicionarNaPrimeiraPosicao(List<Integer> list) {

        System.out.println("Iniciando...");
        long inicio = System.currentTimeMillis();

        // trocar depois por ArrayList
        for (int i = 0; i < 30000; i++) {
            list.add(0, i);
        }
        long fim = System.currentTimeMillis();
        double tempo = (fim - inicio) / 1000.0;
        System.out.println("Tempo gasto: " + tempo);

    }

    public static void testaPerformancePercorrer(List<Integer> list) {

        System.out.println("Iniciando...");
        long inicio = System.currentTimeMillis();

        // trocar depois por ArrayList
        for (int i = 0; i < 30000; i++) {
            list.get(i);
        }
        long fim = System.currentTimeMillis();
        double tempo = (fim - inicio) / 1000.0;
        System.out.println("Tempo gasto: " + tempo);

    }
}

