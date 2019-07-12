package com.anusha.collectiontasks;

import java.util.Arrays;
import java.util.List;

public class AN002_ArrayProgs {
    public static void main(String[] args) {
        //1.  to create an array of size 10
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println("size of an integer array is: " + number.length);
        System.out.print(" the integer array is: \n");
        for (int ele : number)
            System.out.println(ele);
        System.out.println("\n-----------------------------\n");

//2. Create an String array and add few elements to it
        String[] myString = new String[]{"anusha", "raksha", "goutham", "gopal", "aditya"};
        System.out.println("Size of an String array is: " + myString.length);
        System.out.println("Contents of String array are:\n");
        for (String ele : myString)
            System.out.println(ele);
        System.out.println("\n-----------------------------\n");

        //3. Create an integer array and add elements. Find the size of the array
        int[] numbers = new int[]{10, 56, 879, 562, 36};
        System.out.println("Size of an array is: " + numbers.length);
        System.out.println("Contents of an integer array is: ");
        for (int ele : numbers)
            System.out.println(ele);
        System.out.println("\n-----------------------------\n");

        //4. Create and array with 5 elements. Print the second and the fourth element in the array
        int[] data = {96, 47, 05, 84, 9};
        int size = data.length;
        System.out.println("Contents of an array is:" + data.toString());
        for (int ele : data)
            System.out.println(ele);
        System.out.println("To print second element from an array: " + data[1]);
        System.out.println("to print the fourth element from an array: " + data[size - 2]);
        System.out.println("\n-----------------------------\n");

        //5. Create an string array with three elements. replace the second element with the word "auto" .
        // Print all the elements of the array and check if the word "auto" appears at the third position
        String[] myStr = {"bike", "car", "zeep"};


        //6. Create an Array of Integers and convert it to an arrayList

        int arr[] = {100, 200, 300, 400, 500};
        List lst = Arrays.asList(arr);
        System.out.println(lst.size());

        System.out.println("My array is : ");
        for (int ele : arr)
            System.out.println(ele);
        System.out.println("My arraylist of integers is: ");
        for (int ele : arr)
            System.out.println(ele);

        //7. Create an string array with three elements. replace the second element with the word "auto" .
        // Print all the elements of the array and check if the word "auto" appears at the third position

      String[] strArray=new String[]{"bus","scooty","bike","car"};

        for(String str:strArray)
            System.out.println(Arrays.toString(strArray));
       strArray[1]="auto";
        System.out.println("after replacing string array : \n");
        for(String str:strArray)
        System.out.println(Arrays.toString(strArray));
    }
}
