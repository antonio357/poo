package poo.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * questão 1 do slide de collections
 */
public class Questao1 {

    public static void main( String[] args ) {

        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();
        String input;

        while (true) {

            System.out.println("Se não quiser digitar mais nenhuma palavra digite -1");
            input = sc.nextLine();
            if (input.equals("-1")) break;
            list.add(input);

        }

        Collections.sort(list);

        System.out.println("Lista com as entradas ordenadas");
        System.out.println(list);

    }

}
