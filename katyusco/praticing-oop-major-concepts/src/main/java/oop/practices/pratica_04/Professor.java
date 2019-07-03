package oop.practices.pratica_04;

public class Professor extends Employee {
    private int horaAula;

    Professor(String name, int contractNumber) {
        super(name, contractNumber);
        zeraHoraAula();
        setFuncao("Professor");
    }

    Professor(String name, int contractNumber, int horaAula) {
        super(name, contractNumber);
        addHoraAula(horaAula);
        setFuncao("Professor");
    }



    public void addHoraAula(int horaAula) {
        this.horaAula += horaAula;
    }

    public void zeraHoraAula() {
        this.horaAula = 0;
    }

    public int getHoraAula() {
        return horaAula;
    }

    private double getAdicionalPorHoras() {
        return 100*horaAula;
    }

    @Override
    public String toString() {
        return super.toString() + "Horas Aula: " + getHoraAula();
    }

    @Override
    double totalSalary() {
        return getBaseSalary() + getAdicionalPorHoras();
    }

}
