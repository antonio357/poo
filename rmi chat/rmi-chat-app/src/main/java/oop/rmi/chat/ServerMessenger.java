package oop.rmi.chat;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ServerMessenger extends Remote {
    boolean addClientHashSet(ClientMessenger client) throws RemoteException;
    void getSendClientMessenger(String[] clientMessage) throws RemoteException;

}
