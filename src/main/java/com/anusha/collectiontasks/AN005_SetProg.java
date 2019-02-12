package com.anusha.collectiontasks;


import java.util.*;

public class AN005_SetProg {
    public static void main(String[] args){

        //to declare set of integers
        //1.1. Create a Set of Intgers and add the numbers in the following order 1,20,30,40,20

       Set<Integer> number=new HashSet<>();
       number.add(1);
       number.add(20);
       number.add(30);
       number.add(40);
       number.add(20);

       System.out.println(" my set of integers are:\n");
       System.out.println(number);
       System.out.println(" size of an array is: "+number.size());

       //2. Test how many 20's are present in the collection
        boolean result=number.contains(20);
        System.out.println(" to count value 20 in the set is: "+result);

        System.out.println("To count occurence of elemnt 20 in set: "+Collections.frequency(number,20));

    }
}
