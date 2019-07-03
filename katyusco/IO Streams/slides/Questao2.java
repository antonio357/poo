package poo.code;


import java.io.*;


public class Questao2 {

    public static void main(String[] args) throws IOException {

        OutputStream directory = new FileOutputStream("txts\\Questao2.txt");
        OutputStreamWriter wr = new OutputStreamWriter(directory);
        BufferedWriter bwr = new BufferedWriter(wr);

        bwr.write("Anotnio");
        bwr.newLine();
        bwr.write("19");
        bwr.newLine();
        bwr.write("Violet Evergarden");

        bwr.close();

    }

}

