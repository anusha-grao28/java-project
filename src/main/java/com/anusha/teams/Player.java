package com.anusha.teams;

import java.util.List;

public class Player {
    private String firstName;
    private String lastName;
    private Integer age;
    private Long phoneNumbers;
    /// make this a list
    /// private List<Integer> phoneNumbers;
    // this variable cannot hold many numbers. so you will need a datastructure to hold many things.. we can use list here as we are not bothered
    //uniqueness  and maintaining insertion order setc

    public Player(String firstName, String lastName, Integer age, Long phoneNumbers) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.phoneNumbers = phoneNumbers;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Long getPhoneNumbers() {
        return phoneNumbers;
    }

    public void setPhoneNumbers(Long phoneNumbers) {
        this.phoneNumbers = phoneNumbers;
    }

    @Override
    public String toString() {
        return "Player{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                ", phoneNumbers=" + phoneNumbers +
                '}';
    }
}
