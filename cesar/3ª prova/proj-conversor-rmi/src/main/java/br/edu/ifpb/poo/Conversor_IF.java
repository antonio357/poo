package br.edu.ifpb.poo;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Conversor_IF extends Remote {
    String decimalBinary(int num) throws RemoteException;
    String decimalHex(int num) throws RemoteException;
}
