package com.in28minutes.oops.level2;

public class Address {

    // State or Member Variables
    // Constructor or Creation
    // Behaviour or Member Methods or Operations

    // State or Member Variables
    private String addressLine1;
    private String addressLine2;
    private String City;
    private String PostCode;
    private String County;
    private String Country;

    // Constructor or Creation

    public Address(String addressLine1, String addressLine2, String city, String postCode, String county, String country) {
        super();
        this.addressLine1 = addressLine1;
        this.addressLine2 = addressLine2;
        this.City = city;
        this.PostCode = postCode;
        this.County = county;
        this.Country = country;
    }

    // Behaviour or Member Methods or Operations

    public String getAddressLine1() {
        return addressLine1;
    }

    public void setAddressLine1(String addressLine1) {
        this.addressLine1 = addressLine1;
    }

    public String getAddressLine2() {
        return addressLine2;
    }

    public void setAddressLine2(String addressLine2) {
        this.addressLine2 = addressLine2;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getPostCode() {
        return PostCode;
    }

    public void setPostCode(String postCode) {
        PostCode = postCode;
    }

    public String getCounty() {
        return County;
    }

    public void setCounty(String county) {
        County = county;
    }

    public String getCountry() {
        return Country;
    }

    public void setCountry(String country) {
        Country = country;
    }

    public String toString() {
        return String.format("%s, %s, %s, %s, %s, %s" , addressLine1, addressLine2, City, PostCode, County, Country);
    }
}
