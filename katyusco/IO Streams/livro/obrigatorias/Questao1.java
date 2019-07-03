package poo.code;


import java.io.*;
import java.util.Scanner;


public class Questao1 {

    public static void main(String[] args) throws IOException {

        InputStream inputStream = System.in;
        InputStreamReader isr = new InputStreamReader(inputStream);
        BufferedReader br = new BufferedReader(isr);

        System.out.println("Digite sua mensagem: ");
        String linha = br.readLine();

        while (linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }

    }

}

