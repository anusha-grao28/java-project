package com.anusha.collectiontasks;

import java.util.ArrayList;

public class AN004_CopyArrayListContents {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("a");
        list1.add("b");
        list1.add("c");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("d");
        list2.add("e");
        list2.add("f");

        ArrayList<String> list3 = new ArrayList<>();
        list3.add("g");
        list3.add("h");
        list3.add("i");

        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);
        System.out.println("List3: " + list3);

        list3.addAll(list1);
        list3.addAll(list2);

        System.out.println("after copying list 1 & 2 into list 3, they are:");
        System.out.println("Contents of list3 are: " + list3);
    }
}
