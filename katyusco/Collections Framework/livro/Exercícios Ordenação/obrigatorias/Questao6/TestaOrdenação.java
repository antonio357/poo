package poo.code;

import java.util.*;

public class TestaOrdenação {

    public static void main(String[] args) {

        List<ContaPoupança> list = new LinkedList<>();

        list.add(new ContaPoupança("antonio", 150, 651));
        list.add(new ContaPoupança("jose", 654, 516));
        list.add(new ContaPoupança("manuel", 321, 984));
        list.add(new ContaPoupança("Karla", 987, 12));

        /**
         * revertendo uma lista
         * */
        System.out.println("\nlista antes de ser revertida");
        System.out.println(list);
        Collections.reverse(list);
        System.out.println("lista depois de ser revertida");
        System.out.println(list);

        /**
         * rotacionando uma lista
         * */
        System.out.println("\nlista antes de ser rotacionada");
        System.out.println(list);
        Collections.rotate(list, 2);
        System.out.println("lista depois de ser rotacionada");
        System.out.println(list);

        /**
         * embaralhando uma lista
         * */
        System.out.println("\nlista antes de ser embaralhada");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println("lista depois de ser embaralhada");
        System.out.println(list);

    }

}
