package poo.code;


import java.io.*;


public class Questao3 {

    public static void main(String[] args) throws IOException {

        InputStream flux = new FileInputStream("txts\\Questao2.txt");
        InputStreamReader reader = new InputStreamReader(flux);
        BufferedReader bufferedReader = new BufferedReader(reader);

        String s = bufferedReader.readLine();
        while (s != null) {
            System.out.println(s);
            s = bufferedReader.readLine();
        }

    }

}

