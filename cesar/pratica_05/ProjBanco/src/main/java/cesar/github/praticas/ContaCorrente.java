package cesar.github.praticas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ContaCorrente {
    private int num;
    private String titular;
    private double saldo;
    private List<String> extrato;

    @Override
    public String toString() {
        return getNum() + getTitular() + getSaldo();
    }

    public List<String> getExtrato() {
        return extrato;
    }

    public boolean deposito(double num) {
        if (num > 0) {
            this.saldo += num;
            extrato.add("deposito = " + num);
            return true;
        }
        return false;
    }

    public boolean saque(double num) {
        double cpmf = calculaCPMF(num);
        if (num > 0 && num + cpmf <= this.saldo) {
            this.saldo -= num;
            extrato.add("saque = " + num);
            descontaCPMF(cpmf);
            return true;
        }
        return false;
    }

    private double calculaCPMF(double num) {
        return num * 1.0/100.0;
    }

    private void descontaCPMF(double cpmf) {
        this.saldo -= cpmf;
        extrato.add("cpmf = " + cpmf);
    }

    ContaCorrente(int num, String titular, double saldo) {
        this.extrato = new ArrayList<>();
        setNum(num);
        setTitular(titular);
        setSaldo(saldo);
    }

    ContaCorrente(int num, String titular) {
        this.extrato = new ArrayList<>();
        setNum(num);
        setTitular(titular);
        setSaldo(10.0);
    }

    public boolean setNum(int num) {
        if (num >= 0) {
            this.num = num;
            return true;
        }
        return false;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public boolean setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
            return true;
        }
        return false;
    }

    public int getNum() {
        return num;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
}
