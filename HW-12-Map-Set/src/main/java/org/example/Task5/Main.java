package org.example.Task5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        System.out.println("Исходный список:");
        Employee ivan = new Employee("Ivan", 83000);
        Employee dmitry = new Employee("Dmitry", 75000);
        Employee alexey = new Employee("Alexey", 79000);
        Employee egor = new Employee("Egor", 99000);


        employees.add(ivan);
        employees.add(dmitry);
        employees.add(alexey);
        employees.add(egor);

        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Collections.sort(employees);
        System.out.println("Список после сортировки by CompareTo в натуральном порядке:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Collections.sort(employees,new EmployeeSalaryComparator());
        System.out.println("Список после сортировки компаратором по зарплате:");
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        Set<Employee> empTree = new TreeSet<>();
        Set<Employee> empTreeComparator = new TreeSet<>(new EmployeeSalaryComparator());
        empTree.add(ivan);
        empTree.add(egor);
        empTree.add(dmitry);
        empTree.add(alexey);

        System.out.println("Список в TreeSet");
        for (Employee employee:empTree) {
            System.out.println(employee);
        }

        empTreeComparator.add(ivan);
        empTreeComparator.add(egor);
        empTreeComparator.add(dmitry);
        empTreeComparator.add(alexey);

        System.out.println("Список в TreeSet с Comparator");
        for (Employee employee:empTreeComparator) {
            System.out.println(employee);
        }

    }
}
