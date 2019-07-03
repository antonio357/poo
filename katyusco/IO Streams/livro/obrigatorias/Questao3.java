package poo.code;


import java.io.*;


public class Questao3 {

    public static void main(String[] args) throws IOException {

        InputStream inputStream = new FileInputStream("txts\\Questao3.txt");
        InputStreamReader isr = new InputStreamReader(inputStream);
        BufferedReader br = new BufferedReader(isr);

        String linha = br.readLine();

        while (linha != null) {
            System.out.println(linha);
            linha = br.readLine();
        }

        br.close();

    }

}

