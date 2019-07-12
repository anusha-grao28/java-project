package com.anusha.collectiontasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AN002_ArrayToArrayList {
    public static void main(String[] args) {

        Integer[] array = new Integer[]{56, 98, 12, 86, 4};

        List<Integer> myArray = new ArrayList<Integer>();
        myArray.add(37);
        myArray.add(43);
        myArray.add(25);

        Collections.addAll(myArray,array);
            System.out.println("\n my integer list is: \n");
            System.out.println(myArray);

            // alternate method to convert array to arraylist
        Integer[] arr=new Integer[]{10,20,30,40,50};
        List<Integer> myList= Arrays.asList(arr);
        System.out.println(" Elemnts of list are:\n");
        System.out.println(myList);

        //To check added element present in array

        String[] names=new String[]{"car","bus","zeep"};

    }
}
