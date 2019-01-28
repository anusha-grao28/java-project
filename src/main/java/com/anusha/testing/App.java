package com.anusha.testing;

import com.anusha.polymorphism.*;

/**
 * Hello world!
 */
public class App {
   private static Animal a;
   private static Bird b;
    public static void main(String[] args) {
        Cat c = new Cat();
        c.shout();
        a=new Dog();
        a.shout();
        a=new Cow();
        a.shout();

        b=new Dog();





    }
}
