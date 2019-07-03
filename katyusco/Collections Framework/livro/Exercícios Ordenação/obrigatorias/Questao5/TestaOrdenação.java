package poo.code;

import java.util.*;

public class TestaOrdenação {

    public static void main(String[] args) {

        List<ContaPoupança> list = new LinkedList<>();

        list.add(new ContaPoupança("antonio", 150, 651));
        list.add(new ContaPoupança("jose", 654, 516));
        list.add(new ContaPoupança("manuel", 321, 984));
        list.add(new ContaPoupança("Karla", 987, 12));

        System.out.println(list);

        Collections.sort(list);

        System.out.println(list);

    }

}
