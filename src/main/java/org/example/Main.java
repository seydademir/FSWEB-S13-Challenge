package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        runApp();
    }

    public static void runApp() {
        Healthplan hp1 = new Healthplan(1, "A Sigorta", Plan.BASIC);
        System.out.println(hp1.toString());

        String[] healthplans = new String[2];
        Employee employee = new Employee(101, "John Doe", "john@test.com", "1234", healthplans);
        employee.addHealthPlan(0, hp1.getName());
        System.out.println(employee.toString());

        String[] developers = new String[3];
        Company company = new Company(1, "TechCorp", 50000, developers);
        company.addEmployee(0, employee.getFullName());
        System.out.println(company.toString());
    }
}