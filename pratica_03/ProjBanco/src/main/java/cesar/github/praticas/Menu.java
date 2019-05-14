package cesar.github.praticas;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    public int exibirMenu() {
        System.out.println("--- Projeto Conta Corrente ---");
        System.out.println("1. Saque");
        System.out.println("2. Deposito");
        System.out.println("3. Saldo na tela");
        System.out.println("4. Extrato na tela");
        System.out.println("5. SAIR");
        System.out.println("------------------------------");
        System.out.println("digite uma opção: ");
        return sc.nextInt();
    }
}
