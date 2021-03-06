package poo.code;

import java.util.TreeSet;

public class Conta {
    private double saldo;
    private String name;
    private int num;

    Conta(String nome, double saldo, int num) {
        deposita(saldo);
        setName(nome);
        setNum(num);
    }

    @Override
    public int hashCode() {
        return getNum();
    }

    public boolean equals(Conta c) {
        if (hashCode() == c.hashCode()) return true;
        return false;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public int getNum() {
        return num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void deposita(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public String toString() {
        return getName() + "; " + getNum() + "; " + getSaldo();
    }
}
