package com.anusha.bank;

import java.util.Date;
import java.util.List;

public class Customer {
    private String name;
    private Integer age;
    private String DOB;

    private Account account;
    private List<TransactionHistory> tHistory;

    public Customer(String name, Integer age, String DOB, Account account, List<TransactionHistory> tHistory) {
        this.name = name;
        this.age = age;
        this.DOB = DOB;
        this.account = account;
        this.tHistory = tHistory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDOB() {
        return DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public List<TransactionHistory> gettHistory() {
        return tHistory;
    }

    public void settHistory(List<TransactionHistory> tHistory) {
        this.tHistory = tHistory;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", DOB='" + DOB + '\'' +
                ", account=" + account +
                ", tHistory=" + tHistory +
                '}';
    }
}
