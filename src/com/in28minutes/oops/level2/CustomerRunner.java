package com.in28minutes.oops.level2;

public class CustomerRunner {

    public static void main(String[] args) {
        Address homeAddress = new Address("21 Stanshaws Close", "Bradley Stoke", "Bristol", "BS32 9AL", "Avon", "UK");
        Customer customer = new Customer("KS",homeAddress);

        Address workAddress = new Address("2620 The Quadrant", "Aztec West, Almondsbury", "Bristol", "BS32 4AQ", "Avon", "UK");
        customer.setWorkAddress(workAddress);

        System.out.println(customer);
    }
}
