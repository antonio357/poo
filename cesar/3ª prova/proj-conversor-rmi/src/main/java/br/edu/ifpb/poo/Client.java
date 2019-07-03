package br.edu.ifpb.poo;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    private String host;
    private Registry registry;
    private Remote stub;
    private Conversor_IF stubConversor;

    public Client(String hos) {
        host = hos;
        try {
            registry = LocateRegistry.getRegistry(host);
        }
        catch (Exception e) {
            System.err.println("Não foi possível criar registro pra o cliente" + e.toString());
            e.printStackTrace();
        }
        try {
            stub = registry.lookup("stub");
            stubConversor = (Conversor_IF) stub;
            System.out.println("Servidor conversor encontrado");
        }
        catch (Exception e) {
            System.err.println("Não foi possível encontrado o stub do servidor coversor" + e.toString());
            e.printStackTrace();
        }
    }

    public String decimalBinary(int num) throws RemoteException {
        return stubConversor.decimalBinary(num);
    }
    public String decimalHex(int num) throws RemoteException {
        return stubConversor.decimalHex(num);
    }
}
