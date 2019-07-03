package cesar.github.praticas;

import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    public int exibirMenu() {
        System.out.println("Projeto Banco");
        System.out.println("================");
        System.out.println("1. Criar uma conta");
        System.out.println("2. Deposito");
        System.out.println("3. Saque");
        System.out.println("4. Extrato");
        System.out.println("5. Saldo atual");
        System.out.println("Digite uma opção: ");
        int ret;
        while (true) {
            try {
                ret = Integer.parseInt(sc.nextLine());
                break;
            }
            catch (EntradaInválidaException entradaInválidaException) {
                System.err.println(entradaInválidaException);
                sc.nextLine();
                System.out.println(entradaInválidaException.getStackTrace());
            }
        }
        return ret;
    }
}
