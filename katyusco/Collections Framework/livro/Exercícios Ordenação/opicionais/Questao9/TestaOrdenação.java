package poo.code;

import java.util.*;

public class TestaOrdenação {

    public static void main(String[] args) {

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        List<ContaPoupança> list = new LinkedList<>();

        list.add(new ContaPoupança("jose", 516));
        list.add(new ContaPoupança("manuel", 984));
        list.add(new ContaPoupança("antonio", 651));
        list.add(new ContaPoupança("karla", 12));

        double saldo_aleatorio;
        System.out.println("digite num int: ");
        int valor_maximo = scanner.nextInt();
        for (Conta c : list) {
            saldo_aleatorio = random.nextDouble() * valor_maximo;
            c.deposita(saldo_aleatorio);
        }

        Collections.sort(list);
        System.out.println(list);

    }

}
