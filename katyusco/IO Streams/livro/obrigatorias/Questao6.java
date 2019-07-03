package poo.code;


import java.io.*;
import java.util.Scanner;


public class Questao6 {

    public static void main(String[] args) throws IOException {

        InputStream inputStream = System.in;
        Scanner input  = new Scanner(inputStream);

        while (input.hasNextLine()) System.out.println(input.nextLine());

        input.close();

    }

}

