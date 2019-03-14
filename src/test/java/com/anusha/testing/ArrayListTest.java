package com.anusha.testing;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListTest {
    @Test
    public void shouldReturnTrueForGopal(){

        //given  Calculator cal = new Calculator();
        //when  Integer result = cal.add(1, 2);
        //then  Assert.assertEquals(new Integer(3),result);

        ArrayList<String> myString=new ArrayList<>();
        myString.add("Goutham");
        myString.add("sriraksha");
        myString.add("anusha");
        myString.add("gopal");

        // boolean actual=myString.contains("gopal");
        boolean actual = false;
        Assert.assertEquals("Gopal is not presenst",true,actual);

    }
    @Test
    public void shouldReturnFalseForAditya(){

        //given  Calculator cal = new Calculator();
        //when  Integer result = cal.add(1, 2);
        //then  Assert.assertEquals(new Integer(3),result);

        ArrayList<String> myString=new ArrayList<>();
        myString.add("Goutham");
        myString.add("sriraksha");
        myString.add("anusha");
        myString.add("gopal");

        boolean actual=myString.contains("aditya");

        Assert.assertEquals(false,actual);

    }

    @Test
    public void shouldCopyElementstoAnotherList(Object actual)
    {
        ArrayList<Integer> arrayList1 = new ArrayList<>();

        arrayList1.add(100);
        arrayList1.add(200);
        arrayList1.add(300);

        ArrayList arrayList2 = new ArrayList();

        arrayList2.add(400);
        arrayList2.add(500);
        arrayList2.add(600);
        arrayList2.add(700);
        arrayList2.add(800);
        System.out.println("Before copy, First ArrayList Contains : " + arrayList1);
        System.out.println("Before copy, Second ArrayList Contains : " + arrayList2);

        Collections.copy(arrayList2, arrayList1);


        // TODO use matchers
        //use guide https://www.baeldung.com/hamcrest-collections-arrays .
       // System.out.println("After copy, Second ArrayList Contains : " + arrayList2);
    }

    @Test
    public void shouldAddTwoNumbers()
    {

    }

}
