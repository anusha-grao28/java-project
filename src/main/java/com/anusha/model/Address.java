package com.anusha.model;

public class Address {
private String city;
private Integer pincode;
////private Long phoneNumber;


    public Address(String city, Integer pincode) {
        this.city = city;
        this.pincode = pincode;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public Integer getPincode() {
        return pincode;
    }

    public void setPincode(Integer pincode) {
        this.pincode = pincode;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", pincode=" + pincode +
                '}';
    }
}
