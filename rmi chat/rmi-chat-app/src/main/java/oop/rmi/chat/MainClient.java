package oop.rmi.chat;

public class MainClient {
    public static void main(String[] args) {
        String host;
        if (args.length < 1) host = "192.168.25.128";
        else host = args[0];
        Client client = new Client(host);

    }
}