package com.anusha.collectiontasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class AN001_ArrayListProg1 {
    public static void main(String[]  args) {

        // 1. to print odd and even numbers from given  arraylist of integers
        int[] myArray = {1, 20, 31, 9, 28, 37, 12, 45, 89, 96, 67};
        ArrayList<Integer> evenList = new ArrayList<Integer>();
        ArrayList<Integer> oddList = new ArrayList<Integer>();

        System.out.println("\n to print the odd and even numbers from arraylist of integers is: \n");
        for (int i = 0; i <myArray.length; i++) {
            if (myArray[i] % 2 == 0) {
                evenList.add(myArray[i]);
            } else {
                oddList.add(myArray[i]);
            }
        }

            //to print even numbers from arraylist
        Collections.sort(evenList);
        for (int even : evenList)
            System.out.print(even + ",");

        // to print odd numbers from arraylist
        Collections.sort(oddList);
        for (int odd : oddList)
            System.out.print(odd + ",");

        System.out.println("\n  list of even numbers from arraylist of integers: \n");
        System.out.println(evenList);

        System.out.println("\n list of odd numbers from arraylist of integers: \n");
        System.out.println(oddList);

        System.out.println("\n");
        System.out.println("--------------------------\n");

        //2. to get the size of  arraylist of integers

        ArrayList<Integer> myArr = new ArrayList<>();
        myArr.add(15);
        myArr.add(98);
        myArr.add(75);
        myArr.add(59);
        myArr.add(88);
        myArr.add(9);
        myArr.add(25);
        System.out.println(" Given array is: " + myArr);
        System.out.println(" size  of an  array is: " + myArr.size());
        System.out.println("--------------------------\n");

        //3. to  remove  the first  and  last  element from  the  list
        System.out.println("Removed  first  element  from the list is: " + myArr.remove(0));
        System.out.println("Removed last element  from  the  list is:  " + myArr.remove(myArr.size() - 1));
        System.out.println("--------------------------\n");

        //4.  to  sort the list  element by  ascending  and desc ending  order
        System.out.println("ascendind order:");
        Comparator<Integer> ascendingComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);//ascending order
            }
        };
        Collections.sort(myArr, ascendingComparator);
        for (Integer ascendingOrder : myArr)
            System.out.println(ascendingOrder);

        System.out.println("Descending order:");

        Comparator<Integer> descendingComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);//descending order
            }
        };
        Collections.sort(myArr, descendingComparator);
        for (Integer descendingOrder : myArr)
            System.out.println(descendingOrder);

        //5. to copy elements of one arraylist into another arraylist and print arraylist contents
        System.out.println("--------------------------\n");
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

        Collections.copy(arrayList2,arrayList1);

        System.out.println("After copy, Second ArrayList Contains : " + arrayList2);

        System.out.println("--------------------------\n");
        //6. Create an arraylist of numbers and sort them by highest order and print out the numbers
        ArrayList<Integer> myList=new ArrayList<>();
        myList.add(15);
        myList.add(98);
        myList.add(45);
        myList.add(7);
        myList.add(61);
        myList.add(34);

        System.out.println(" before sorting the list \n");
        //for (Integer beforeSort:myList)
            System.out.println(myList);

        Collections.sort(myList);

        System.out.println(" after sorting the list \n");
        //for (Integer afterSort:myList)
            System.out.println(myList);


        //7. to print second highest number from given arraylist of integers
        System.out.println("--------------------------\n");

        ArrayList<Integer> myList1=new ArrayList<>();
        myList1.add(15);
        myList1.add(65);
        myList1.add(98);
        myList1.add(47);
        myList1.add(28);

        System.out.println("Size of list is:\n "+myList1.size());
        System.out.println("before sorting the list:\n "+myList1);

        Comparator<Integer> highestNumber = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);//descending order
            }
        };

        Collections.sort(myList1,highestNumber);
        System.out.println(" to print the second higest number is:\n");
      //  for (Integer secondHighest:myList1)
            System.out.println(myList1.get(1)); // tell code to retreive 2nd highest


        //alternate method to fnd the second highest number fom arraylist of integers
ArrayList<Integer> list=new ArrayList<>();
list.add(100);
list.add(12);
list.add(5);
list.add(45);
list.add(78);
        int secondLargest = list.get(0);
        int largest = list.get(0);
        for (int i = 0; i < list.size(); i++)
        {
            if(list.get(i) > secondLargest)
            {
                if(list.get(i) > largest ) {
                    secondLargest = largest;
                    largest = list.get(i);
                } else {
                    secondLargest = list.get(i);
                }

            }
        }





    }
}
