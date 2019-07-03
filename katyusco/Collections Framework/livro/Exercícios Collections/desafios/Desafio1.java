package poo.code;


import java.util.Set;
import java.util.TreeSet;

public class Desafio1 {

    public static void main(String[] args) {

        Comparador comp = new Comparador();
        Set<Integer> set = new TreeSet<>(comp);

        for (int i = 1; i <= 1000; i++) set.add(i);

        System.out.println(set);

    }

}

