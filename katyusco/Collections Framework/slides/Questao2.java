package poo.code;

import java.util.*;

/**
 * questão 2 do slide de collections
 */
public class Questao2 {

    public static void main( String[] args ) {

        Scanner sc = new Scanner(System.in);
        Set<String> set = new TreeSet<>();
        String input;

        while (true) {

            System.out.println("Se não quiser digitar mais nenhuma palavra digite -1");
            input = sc.nextLine();
            if (input.equals("-1")) break;
            set.add(input);

        }

        System.out.println("Lista com as entradas ordenadas");
        System.out.println(set);

    }

}
