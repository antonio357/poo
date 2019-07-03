package poo.code;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * questão 3 do slide de collections
 */
public class Questao3 {

    public static void main( String[] args ) {

        Scanner sc = new Scanner(System.in);
        List<Pessoa> list = new ArrayList<>();
        String nome;
        int idade;

        while (true) {

            System.out.println("Se não quiser digitar mais nenhuma Pessoa digite -1");
            System.out.println("Nome: ");
            nome = sc.nextLine();
            if (nome.equals("-1")) break;
            System.out.println("Idade:");
            idade = Integer.parseInt(sc.nextLine());
            list.add(new Pessoa(nome, idade));

        }

        Collections.sort(list);

        System.out.println("Lista com as Pessoas ordenadas por idade");
        System.out.println(list);

    }

}
