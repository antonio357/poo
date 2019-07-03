package oop.practices.pratica_04;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Universiry {
    private Set<Employee> employees;
    private String name;

    Universiry(String name) {
        setName(name);
        this.employees = new HashSet<>();
    }

    Universiry(String name, Collection<Employee> employees) {
        setName(name);
        this.employees = new HashSet<>();
        addEmployee(employees);
    }

    public double getEmployeeSalary(Employee employee){
        return employee.totalSalary();
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    public void addEmployee(Collection<Employee> employees) {
        this.employees.addAll(employees);
    }
}
