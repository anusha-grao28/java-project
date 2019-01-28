package com.anusha.polymorphism;

public class Dog implements Animal,Bird {
    @Override
    public void shout() {
        System.out.println("barks");
    }

    @Override
    public void fly() {
        System.out.println("flies");
    }
}
