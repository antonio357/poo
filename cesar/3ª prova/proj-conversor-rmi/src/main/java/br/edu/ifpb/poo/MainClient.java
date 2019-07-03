package br.edu.ifpb.poo;

import java.util.Scanner;

public class MainClient {
    public static void main( String[] args ) {
        Client client;

        if (args.length < 1) client = new Client("192.168.25.128");
        else client = new Client(args[0]);

        Scanner scanner = new Scanner(System.in);
        int solicitacao;
        int valor;

        try {
            while (true) {
                solicitacao = -1;
                System.out.println("Solicitar uma operação ao servidor");
                System.out.println("(0) para sair");
                System.out.println("(1) converter decimal -> binario");
                System.out.println("(2) converter decimal -> hexadecimal");
                try {
                    solicitacao = Integer.parseInt(scanner.nextLine());
                }
                catch (Exception e) {
                    System.out.println("Operação de conversão invalida");
                    continue;
                }
                if (solicitacao == 0) {
                    System.out.println("Encerrando conexão");
                    break;
                }
                System.out.printf("decimal a ser convertido = ");
                try {
                    valor = Integer.parseInt(scanner.nextLine());
                }
                catch (Exception e) {
                    System.out.println("numro invalido");
                    continue;
                }
                if (solicitacao == 1) System.out.println("resposta do servidor (binario) = " + client.decimalBinary(valor));
                else if (solicitacao == 2) System.out.println("resposta do servidor (hexadecimal) = " + client.decimalHex(valor));
                else System.out.println("Operação de conversão não dispoível");
            }
        }
        catch (Exception e) {
            System.exit(1);
        }
    }
}
