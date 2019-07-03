package cesar.github.praticas;

import java.util.Scanner;

public class App {
    public static void main( String[] args ) {
        Menu menu = new Menu();
        ContaCorrente contaCorrente = new ContaCorrente(123, "ac");
        int input;
        Scanner sc = new Scanner(System.in);
        while (true) {
            input = menu.exibirMenu();
            if (input == 1) {
                String titular;
                int num;
                double saldo;
                System.out.println("nome do titular:");
                titular = sc.nextLine();
                System.out.println("numero da conta:");
                num = Integer.parseInt(sc.nextLine());
                System.out.println("saldo inicial da conta (opicional):");
                System.out.println("se quiser digite 1, se não digite 0:");
                if (Integer.parseInt(sc.nextLine()) == 1) {
                    System.out.println("saldo inicial:");
                    saldo = Double.parseDouble(sc.nextLine());
                    contaCorrente = new ContaCorrente(num, titular, saldo);
                }
                contaCorrente = new ContaCorrente(num, titular);
            }
            else if (input == 2) {
                System.out.println("valor do deposito");
                double deposito;
                while (true) {
                    try {
                        deposito = Double.parseDouble(sc.nextLine());
                        System.out.println("brook");
                        break;
                    }
                    catch (EntradaInválidaException entradaInválidaException) {
                        System.err.println(entradaInválidaException);
                        sc.nextLine();
                    }
                }
                contaCorrente.deposito(deposito);
            }
            else if (input == 3) {
                System.out.println("valor de saque");
                double saque;
                while (true) {
                    try {
                        saque = Double.parseDouble(sc.nextLine());
                        System.out.println("brook");
                        break;
                    }
                    catch (EntradaInválidaException entradaInválidaException) {
                        System.err.println(entradaInválidaException);
                        sc.nextLine();
                    }
                }
                contaCorrente.deposito(saque);
            }
            else if (input == 4) {
                System.out.println("extrato");
                for (String string: contaCorrente.getExtrato()) System.out.println(string);
            }
            else if (input == 5) {
                System.out.println("saldo = " + contaCorrente.getSaldo());
            }
        }
    }
}
