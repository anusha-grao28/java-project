package com.anusha.bank;

public class Bank {
    private String name;
    private String townName;

    private Customer customer;

    public Bank(String name, String townName, Customer customer) {
        this.name = name;
        this.townName = townName;
        this.customer = customer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
