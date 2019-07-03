package poo.code;


import java.io.*;


public class Questao5 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(
                                    new InputStreamReader(
                                            new FileInputStream("txts\\Questao5.txt")));

        String linha = br.readLine();

        while (linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }

        br.close();

    }

}

