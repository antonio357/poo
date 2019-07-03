package poo.code;

import java.util.HashSet;
import java.util.Set;

public class Questao8 {

    public static void main(String[] args) {

        Set<Conta> set = new HashSet<Conta>();

        set.add(new ContaCorrente("antonio", 150, 1));
        set.add(new ContaPoupança("jose", 654, 1));
        set.add(new ContaCorrente("manuel", 321, 3));
        set.add(new ContaPoupança("Karla", 987, 4));

        System.out.println(set);

    }

}
