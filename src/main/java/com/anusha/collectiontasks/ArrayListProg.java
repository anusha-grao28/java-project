package com.anusha.collectiontasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListProg {



    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(500);
        numbers.add(800);
        numbers.add(600);
        numbers.add(100);
        numbers.add(300); //herer i have done a
        System.out.println(numbers);
        System.out.println(" the size of the list before operation is: " + numbers.size());
        // 1. to display the list of numbers in ascending and descending order
        System.out.println("ascendind order:");
        Comparator<Integer> ascendingComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);//ascending order
            }
        };
         Collections.sort(numbers, ascendingComparator);


        System.out.println("Descending order:");
        //give meaningful names like descendingComparator
        Comparator<Integer> descendingComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);//descending order
            }
        };
        Collections.sort(numbers, descendingComparator);

        //
        //2. to display the second highest ascendingComparator within the list
        System.out.println("");
        System.out.println("before sorting the list: ");
        System.out.println(numbers);

        int j = Collections.max(numbers);

        System.out.println("Max in the array is " + j);
        numbers.remove(numbers.indexOf(j));
        int max2 = Collections.max(numbers);
        System.out.println(max2);

        // arrays are stored in format a[0],a[1],a[3] etc
        // so if you want the first element , you use get(0)
        // if you want second element it is get(1) and so on
        // now when you remove the first element below, the size of array is reduced
        // so you should use get( array.size() -1 )
        //3. to remove first and last ascendingComparator from the list
        System.out.println("Deleting first element from the list: " + numbers.remove(0));
        System.out.println("Deleting last element from the list: " + numbers.remove(numbers.size()-1));

        //4. to get the size of the list
        System.out.println(" the size of the list is: " + numbers.size());

    }
}
