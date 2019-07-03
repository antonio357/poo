package oop.rmi.chat;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.HashSet;
import java.util.Set;

public class Server implements ServerMessenger {
    private static Set<ClientMessenger> stringClientHashSet = new HashSet<>();
    private static Set<ServerListener> threads = new HashSet<>();

    public static void main(String[] args) {
        try {
            Server server = new Server();
            ServerMessenger stub = (ServerMessenger) UnicastRemoteObject.exportObject(server, 0);

            Registry registry = LocateRegistry.createRegistry(1099); // default
            registry.bind("Server", stub);

            System.out.println("Servidor pronto...");
        } catch (Exception e) {
            System.err.println("Servidor exception: " + e.toString());
            e.printStackTrace();
        }

    }

    @Override
    public boolean addClientHashSet(ClientMessenger client) throws RemoteException {
        threads.add(new ServerListener(client));
        return stringClientHashSet.add(client);
    }

    @Override
    public void getSendClientMessenger(String[] clientMessage) throws RemoteException {
        for (ClientMessenger client : stringClientHashSet) {
            if (client.getName() == clientMessage[0]) {
                client.getMessage(new String[] {client.getName(), clientMessage[1]});
            }
        }
    }

}
