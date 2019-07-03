package oop.practices.pratica_04;

public abstract class Employee {
    private String name;
    private double baseSalary;
    private int contractNumber;
    private String funcao;

    Employee(String name, int contractNumber) {
        setContractNumber(contractNumber);
        setName(name);
        setBaseSalary(1000);
    }

    final void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    public String getFuncao() {
        return funcao;
    }

    public String getName() {
        return name;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public int getContractNumber() {
        return contractNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setContractNumber(int contractNumber) {
        this.contractNumber = contractNumber;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    @Override
    public String toString() {
        return "\nFuncao: " + getFuncao() + "\n" + "Name: " + getName() + "\n" + "Salario: " + totalSalary() + "\n";
    }

    abstract double totalSalary();


    @Override
    public int hashCode() {
        return getContractNumber();
    }

    @Override
    public boolean equals(Object obj) {
        Employee employee = (Employee) obj;
        return hashCode() == employee.hashCode();
    }
}
