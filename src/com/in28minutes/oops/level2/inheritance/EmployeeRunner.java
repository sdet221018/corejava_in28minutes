package com.in28minutes.oops.level2.inheritance;

import java.math.BigDecimal;

public class EmployeeRunner {
    public static void main(String[] args) {

        Employee employee = new Employee("Abdul", "SDET");
        employee.setEmail("Abdul@in28minutes.com");
        employee.setPhoneNumber("222-456-7890");
        employee.setEmployer("CGI");
        employee.setEmployeeGrade('A');
        employee.setSalary(BigDecimal.valueOf(55000.00));
        System.out.println("Employee: " + employee);

        Employee employee1 = new Employee("Amina", "QA Engineer");

        employee1.setEmail("Amina@in28minutes.com");
        employee1.setPhoneNumber("333-456-7890");
        employee1.setEmployer("CapGemini");
        employee1.setEmployeeGrade('B');
        employee1.setSalary(BigDecimal.valueOf(39456.56));
        System.out.println("Employee: " + employee1);

    }
}
