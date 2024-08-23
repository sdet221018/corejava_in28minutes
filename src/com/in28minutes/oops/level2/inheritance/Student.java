package com.in28minutes.oops.level2.inheritance;

public class Student extends Person{
    private String collegeName;
    private int year;

    public Student(String name, String collegeName) {
        super(name);
        this.collegeName = collegeName;
        System.out.println("Student Constructor");
    }

    public String getCollege() {
        return collegeName;
    }

    public void setCollege(String college) {
        this.collegeName = college;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toString() {
//        return getName() + "#" + getEmail() + "#" + getPhoneNumber() +  "#" + employer + "#" + title + "#" + employeeGrade + "#" + salary;
        return super.toString() + "#" + collegeName + "#" + year;
    }
}
