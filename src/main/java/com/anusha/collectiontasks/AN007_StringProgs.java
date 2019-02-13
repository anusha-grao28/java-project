package com.anusha.collectiontasks;

import java.util.Arrays;
import java.util.Scanner;

public class AN007_StringProgs {
    public static void main(String[] args){

        //1. reverse  a string
        String original, reverse = "";
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a string to reverse");
        original = in.nextLine();

        int length = original.length();

        for (int i = length - 1 ; i >= 0 ; i--)
            reverse = reverse + original.charAt(i);

        System.out.println("Reverse of the string: " + reverse);
        System.out.println("-------------------------------\n");

        //2. Write program to split a string "goutham-k-rao" ,
        // the string should be split using the delimiter "-"
        System.out.println("-------------------------------\n");

        //3.Use string replace to replace 3rd character of a "Goutham" with the letter d
        String str="Goutham";
        System.out.println("String before replacing: "+str);
        str.replace('t','d');
        System.out.println("String after replacing: "+str.replace('t','d'));
        System.out.println("-------------------------------\n");

    //4.Write program to get substring . i.e code to extract "gou" from the string "goutham"
        String name="Goutham";
        System.out.println("the given string is: "+name);
        System.out.println("to obtain a substring from given string is: "+name.substring(0,3));

    }
}
