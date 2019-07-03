package oop.practices.pratica_04;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();

        Professor professor = new Professor("antonio", 123);
        Professor professor1 = new Professor("jose", 456, 45);
        Professor professor2 = new Professor("Karla", 78, 10);
        Professor professor3 = new Professor("joao", 123, 797897);

        Cordenador cordenador = new Cordenador("josais", 123);
        Cordenador cordenador1 = new Cordenador("carlão", 161, 45);
        Cordenador cordenador2 = new Cordenador("caru", 78, 10);
        Cordenador cordenador3 = new Cordenador("tete", 137198, 797897);

        employeeList.add(professor);
        employeeList.add(professor1);
        employeeList.add(professor2);
        employeeList.add(professor3);
        employeeList.add(cordenador);
        employeeList.add(cordenador1);
        employeeList.add(cordenador2);
        employeeList.add(cordenador3);

        Universiry universiry = new Universiry("Harvard", employeeList);

        for (Employee employee:
             universiry.getEmployees()) {
            System.out.println(employee.toString());
        }

    }
}
