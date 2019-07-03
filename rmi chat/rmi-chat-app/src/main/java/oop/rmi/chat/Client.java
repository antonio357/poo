package oop.rmi.chat;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Client implements ClientMessenger {
    private String name;
    private String host;
    private ServerMessenger server;

    Client(String ip) {
        this.host = ip;
        try {
            // colocando o cliente no registro
            ClientMessenger stub = (ClientMessenger) UnicastRemoteObject.exportObject(this, 0);

            Registry registry = LocateRegistry.createRegistry(1099); // default
            registry.bind(name, stub);

            System.out.println("Client pronto...");

            // connectando ao servidor
            Registry serverRegistry = LocateRegistry.getRegistry(host);
            server = (ServerMessenger) serverRegistry.lookup("Server");
            server.addClientHashSet(this);
            System.out.println("Client " + getName() + ", se conectou ao servidor");
        } catch (Exception e) {
            System.err.println("Cliente exception: " + e.toString());
            e.printStackTrace();
        }
    }

    @Override
    public void sendMenssage(String menssage) throws RemoteException {
        server.getSendClientMessenger(new String[]{name, menssage});
    }

    @Override
    public String getName() throws RemoteException {
        return name;
    }

    @Override
    public void getMessage(String[] message) throws RemoteException {
        System.out.println(message[0] + ": " + message[1]);
    }
}
