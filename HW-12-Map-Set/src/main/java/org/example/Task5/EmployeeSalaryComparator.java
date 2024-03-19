package org.example.Task5;

import java.util.Comparator;

public class EmployeeSalaryComparator implements Comparator <Employee>{

    @Override
    public int compare(Employee employee1, Employee employee2) {
        return employee1.getSalary()-employee2.getSalary();
    }
}
