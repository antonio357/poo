package poo.code;


import java.io.*;
import java.util.Scanner;


public class Questao7 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(
                                                new InputStreamReader(
                                                        new FileInputStream("txts\\Questao7IN.txt")));


        PrintWriter printWriter = new PrintWriter(
                                        new PrintStream(
                                                new FileOutputStream("txts\\Questao7OUT.txt")));

        String s = bufferedReader.readLine();
        while (s != null) {
            printWriter.println(s);
            s = bufferedReader.readLine();
        }

        bufferedReader.close();
        printWriter.close();


    }

}

