package com.in28minutes.oops.level2.inheritance;

public class StudentRunner {
    // IS A Relationship
    public static void main(String[] args) {
//        Student student = new Student();
//        student.setName("Ranga");
//        student.setEmail("in28minutes@gmail.com");

        Person person = new Person();
        person.setName("Ranga");
        person.setEmail("ranga@in28minutes.com");
        person.setPhoneNumber("123-456-7890");
        String value = person.toString();
        System.out.println("Value: " + value);
        System.out.println("Person: " + person);

    }
}
