package poo.code;


import java.util.ArrayList;
import java.util.List;


public class Desafio2 {

    public static void main(String[] args) {

        Comparador comp = new Comparador();
        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= 1000; i++) list.add(i);
        list.sort(comp);

        System.out.println(list);

    }

}

