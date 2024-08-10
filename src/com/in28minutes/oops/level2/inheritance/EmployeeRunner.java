package com.in28minutes.oops.level2.inheritance;

import java.math.BigDecimal;

public class EmployeeRunner {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.setTitle("SDET");
        employee.setName("Abdul");
        employee.setEmail("Abdul@in28minutes.com");
        employee.setPhoneNumber("222-456-7890");
        employee.setEmployer("CGI");
        employee.setEmployeeGrade('A');
        employee.setSalary(BigDecimal.valueOf(55000.00));
        System.out.println("Employee: " + employee);

        employee.setTitle("QA Engineer");
        employee.setName("Amina");
        employee.setEmail("Amina@in28minutes.com");
        employee.setPhoneNumber("333-456-7890");
        employee.setEmployer("CapGemini");
        employee.setEmployeeGrade('B');
        employee.setSalary(BigDecimal.valueOf(39456.56));
        System.out.println("Employee: " + employee);

    }
}
