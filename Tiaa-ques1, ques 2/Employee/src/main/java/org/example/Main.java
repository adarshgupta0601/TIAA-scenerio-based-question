package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
        public static void main(String[] args) {
            List<Employee> employees = new ArrayList<>();
            employees.add(new Employee(1, "Adarsh", 50000.0));
            employees.add(new Employee(2, "Priya", 35000.0));
            employees.add(new Employee(3, "Ana", 66000.0));
            employees.add(new Employee(4, "abcy", 99000.0));

            // Sorting employees based on salary
            List<Employee> sortedEmployees = employees.stream()
                    .sorted(Comparator.comparingDouble(Employee::getSalary))
                    .collect(Collectors.toList());

            System.out.println("Sorted Employees:");
            sortedEmployees.forEach(System.out::println);

            // Filtering employees with salary greater than 20000
            List<Employee> highSalaryEmployees = employees.stream()
                    .filter(employee -> employee.getSalary() > 20000)
                    .collect(Collectors.toList());

            System.out.println("\nHigh Salary Employees:");
            highSalaryEmployees.forEach(System.out::println);
        }
    }
