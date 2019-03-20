package com.anusha.testing;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.hamcrest.collection.IsIterableContainingInAnyOrder.containsInAnyOrder;
import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.hamcrest.core.IsIterableContaining.hasItem;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.assertThat;

public class ArrayListTest {
    @Test
    public void shouldReturnTrueForGopal(){
        /*
        ArrayList<String> myString=new ArrayList<>();
        myString.add("Goutham");
        myString.add("sriraksha");
        myString.add("anusha");
        myString.add("gopal");

        // boolean actual=myString.contains("gopal");
        boolean actual = false;
        Assert.assertEquals("Gopal is not presenst",true,actual); */

        List<String> myString= Arrays.asList("Goutham","Sriraksha","Anusha","Gopal");
        assertThat(myString,hasItem("Gopal"));




    }
    @Test
    public void shouldReturnFalseForAditya(){

        //TODO: remove dead code
     /*   //given  Calculator cal = new Calculator();
        //when  Integer result = cal.add(1, 2);
        //then  Assert.assertEquals(new Integer(3),result);

        ArrayList<String> myString=new ArrayList<>();
        myString.add("Goutham");
        myString.add("sriraksha");
        myString.add("anusha");
        myString.add("gopal");

        boolean actual=myString.contains("aditya");

        Assert.assertEquals(false,actual); */

     //TODO: myString is not an appropriate name . it is list , please rename appropriately
        List<String> myString= Arrays.asList("Goutham","Sriraksha","Anusha","Gopal");
        assertThat(myString,not(hasItem("Gopal")));
    }

    @Test
    public void shouldCopyElementstoAnotherList(Object actual)
    {
        List<Integer> list1=Arrays.asList(100,200,300);
        List<Integer> list2=Arrays.asList(400,500);
        List<Integer> list3=Arrays.asList(600,700);

        list3.addAll(list1);
        list3.addAll(list2);
        assertThat(list3,containsInAnyOrder(200,100,400,300,700,500,600));
    }

    @Test
    public void shouldDisplyListInHigestOrder(){
        List<Integer> myList=Arrays.asList(15,98,45,7,61,34);
        Collections.sort(myList);
        //TODO : this checks only if the numbers are present... any other methods that can check if they are in the expected order
        assertThat(myList,contains(98,61,45,34,15,7));

    }


}
