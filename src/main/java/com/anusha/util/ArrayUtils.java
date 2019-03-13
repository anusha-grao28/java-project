package com.anusha.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayUtils {
    public static Integer[] getEvenNmbers(int[] numbers) {
        return null;
    }

    public static String getName(String name) {
        return name;
    }

    public static Long getPhone(Long phone) {
        return phone;
    }

    public static void getNumbers(Integer number, String name) {

    }

    public static void getMethods() {
    }

    public static void getMethod(int[] myArray) {
    }

    public static void getMethod(String[] myArray) {
    }

    public static List<String> getMethodName(List<String> myList) {
        return null;
    }

    public static Integer getMethodInteger(List<Integer> myNumber) {
        return null;
    }

    public static List<Integer> getIntegers(List<Integer> myNum) {
        return myNum;
    }

    public static List<Integer> gerEvenNumbers(ArrayList<Integer> evenNum) {
        return null;
    }

    //1 method to print odd and even numbers

    public static List<Integer> getEvenNumbers(int[] myArray) {

        ArrayList<Integer> evenList = new ArrayList<Integer>();
        ArrayList<Integer> oddList = new ArrayList<Integer>();

        System.out.println("\n to print the odd and even numbers from arraylist of integers is: \n");
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                evenList.add(myArray[i]);
            } else {
                oddList.add(myArray[i]);
            }
        }

        return evenList;
    }

    public static List<Integer> getOddNumbers(int[] myArray) {
        // int[] myArray = {1, 20, 31, 9, 28, 37, 12, 45, 89, 96, 67};
        ArrayList<Integer> evenList = new ArrayList<Integer>();
        ArrayList<Integer> oddList = new ArrayList<Integer>();

        System.out.println("\n to print the odd and even numbers from arraylist of integers is: \n");
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                evenList.add(myArray[i]);
            } else {
                oddList.add(myArray[i]);
            }
        }

        return oddList;
    }

    public static List<Integer> getAscendingOrderElementList(ArrayList<Integer> myArr) {

        Comparator<Integer> ascendingComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);//ascending order
            }
        };
        Collections.sort(myArr, ascendingComparator);

        return myArr;
    }

    public static List<Integer> getDescendingOrderElementList(ArrayList<Integer> myArr) {

        Comparator<Integer> descendingComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);//descending order
            }
        };
        Collections.sort(myArr, descendingComparator);
        return myArr;
    }

    public static List<Integer> getCopiedElementsIntoAnotherList() {
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

        //System.out.println("After copy, Second ArrayList Contains : " + arrayList2);
        return arrayList2;
    }

   /* public static List<String> getElementPresentInlist(ArrayList<String> myStr){
        String name="";
        boolean nameCheck=myStr.contains(name);

        if (nameCheck)
            System.out.println(nameCheck+" gopal is in the list");
        else
            System.out.println(nameCheck+" gopal is not in the list");


        boolean nameCheck1=myStr.contains(name);
        if (nameCheck)
            System.out.println(nameCheck1+" aditya is in the list");
        else
            System.out.println(nameCheck1+" aditya is not in the list");
return myStr;
    } */


}