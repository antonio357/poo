package br.edu.ifpb.poo;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

public class Server implements Conversor_IF {
    private Registry registry;
    private Remote stub;
    private Conversor conversor;

    public Server() {
        try {
            stub = UnicastRemoteObject.exportObject(this, 0);
        }
        catch (Exception e) {
            System.err.println("Não foi exportar o servidor conversor" + e.toString());
            e.printStackTrace();
        }
        try {
            registry = LocateRegistry.createRegistry(1099);
            registry.bind("stub", stub);
            System.out.println("Servidor conversor pronto...\n");
        }
        catch (Exception e) {
            System.err.println("Não foi possível criar registro pra o servidor conversor" + e.toString());
            e.printStackTrace();
        }
        conversor = new Conversor();
    }

    @Override
    public String decimalBinary(int num) throws RemoteException {
        return conversor.decimalBinary(num);
    }

    @Override
    public String decimalHex(int num) throws RemoteException {
        return conversor.decimalHex(num);
    }
}
