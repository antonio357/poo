package poo.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Progconconrrente {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        for (int i = 10000; i > 0; i--) list.add(i);

        System.out.println("Lista desordenada:");
        System.out.println(list);

        Runnable ord = new Runnable() {
            @Override
            public void run() {
                Collections.sort(list);
                System.out.println("Lista ordenada: ");
                System.out.println(list);
            }
        };

        Runnable soma = new Runnable() {
            @Override
            public void run() {
                int sum = 0;
                for (Integer i: list) sum += i;
                System.out.println("Resultado da soma = " + sum);
            }
        };

        Thread od = new Thread(ord, "Thread de ordenação");
        Thread sa = new Thread(soma, "Thread de soma");

        sa.start();
        od.start();
    }
}
