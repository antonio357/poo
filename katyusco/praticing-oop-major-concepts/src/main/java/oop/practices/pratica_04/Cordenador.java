package oop.practices.pratica_04;

public class Cordenador extends Employee {
    private double bonus;

    Cordenador(String name, int contractNumber) {
        super(name, contractNumber);
        setBonus();
        setFuncao("Cordenador");
    }

    Cordenador(String name, int contractNumber, double bonus) {
        super(name, contractNumber);
        setBonus(bonus);
        setFuncao("Cordenador");
    }

    private void setBonus() {
        this.bonus = 10.000;
    }

    private void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public String toString() {
        return super.toString() + "Bonus: " + getBonus();
    }

    @Override
    double totalSalary() {
        return getBaseSalary() + getBonus();
    }
}
