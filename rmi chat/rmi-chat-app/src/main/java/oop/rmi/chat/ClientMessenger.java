package oop.rmi.chat;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ClientMessenger extends Remote {
    void sendMenssage(String menssage) throws RemoteException;
    String getName() throws RemoteException;
    void getMessage(String[] message) throws RemoteException;
}
