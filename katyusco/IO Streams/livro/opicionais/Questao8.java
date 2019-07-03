package poo.code;


import java.io.*;


public class Questao8 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(
                                                new InputStreamReader(
                                                        System.in));


        PrintWriter printWriter = new PrintWriter(
                                        new PrintStream(
                                                new FileOutputStream("txts\\Questao8OUT.txt")));

        String s = bufferedReader.readLine();
        while (s != null) {
            printWriter.println(s);
            s = bufferedReader.readLine();
        }

        bufferedReader.close();
        printWriter.close();


    }

}

