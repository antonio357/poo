package oop.rmi.chat;

import java.net.InetAddress;

public class Ip {
    public static void main(String[] args) {
        try {
            System.out.println(InetAddress.getLocalHost().getHostAddress());
        } catch (Exception e) {
            System.out.println("Não funfou");
            System.exit(1);
        }
    }
}
