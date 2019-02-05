package com.anusha.bank;

import java.util.List;

public class Bank {
    private String name;
    private String townName;

   // now use refactor
    private List<Customer> customers;

    public Bank(String name, String townName, List<Customer> customers) {
        this.name = name;
        this.townName = townName;
        this.customers = customers;
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

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }

   /* @Override
    /*public String toString() {
        return "Bank{" +
                "name='" + name + '\'' +
                ", townName='" + townName + '\'' +
                ", customers=" + customers +
                '}';
    }*/
}
