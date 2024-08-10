package com.in28minutes.oops.level2;

public class Customer {
    // State or Member Variables
    // Constructor or Creation
    // Behaviour or Member Methods or Operations

    // State or Member Variables
    private String name;
    private Address homeAddress;
    private Address workAddress;

    // Constructor or Creation

    public Customer() {
        this.name = "";
//        this.homeAddress = "";
//        this.workAddress = "";
    }

    public Customer(String name, Address homeAddress) {
        this.name = name;
        this.homeAddress = homeAddress;
    }

    // Behaviour or Member Methods or Operations
    public Address getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(Address homeAddress) {
        this.homeAddress = homeAddress;
    }

    public Address getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(Address workAddress) {
        this.workAddress = workAddress;
    }

    public String toString() {
        return String.format("Customer Name: [%s] HomeAddress: [%s] WorkAddress: [%s]" , name, homeAddress, workAddress);
    }

}
