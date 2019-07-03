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
                System.out.println("valor do saque");
                contaCorrente.saque(Double.parseDouble(sc.nextLine()));
            }
            else if (input == 2) {
                System.out.println("valor do deposito");
                contaCorrente.deposito(Double.parseDouble(sc.nextLine()));
            }
            else if (input == 3) System.out.println("saldo = " + contaCorrente.getSaldo());
            else if (input == 4) {
                System.out.println("extrato");
                for (String string: contaCorrente.getExtrato()) System.out.println(string);
            }
            else if (input == 5) System.exit(0);
        }
    }
}
