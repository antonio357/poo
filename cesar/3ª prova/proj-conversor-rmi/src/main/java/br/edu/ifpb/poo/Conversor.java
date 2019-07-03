package br.edu.ifpb.poo;


import java.rmi.RemoteException;

public class Conversor implements Conversor_IF{
    @Override
    public String decimalBinary(int num) throws RemoteException {
        return Integer.toBinaryString(num);
    }

    @Override
    public String decimalHex(int num) throws RemoteException {
        return Integer.toHexString(num);
    }
}
