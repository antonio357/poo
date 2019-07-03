package poo.code;


import java.io.*;

public class Questao1 {

    public static void main(String[] args) {

        try {
            InputStream is = new FileInputStream("txts\\Questao1.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String s = br.readLine();
            System.out.println(s);
        }
        catch (IOException e) {
            System.err.println(e.getStackTrace());
            System.err.println(e);
        }
        finally {
            System.exit(1);
        }

    }

}

