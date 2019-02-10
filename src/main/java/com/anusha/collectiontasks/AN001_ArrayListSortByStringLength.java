package com.anusha.collectiontasks;

import java.util.*;

public class AN001_ArrayListSortByStringLength {
    public static void main(String[] args) {

        //8. to print arraylist of strings in ascending order based  on length of the strings
        sortStringArrayByLength(new String[]{"ram", "raaaaaaaam", "raam", "raaaam"});
        sortStringListByLength(new ArrayList<>(
                Arrays.asList("ram", "raaaaaaaam", "raam", "raaaam")));
    }

    private static void sortStringListByLength(List<String> list) {
        System.out.println("-- sorting list of string --");
        // in java  8 style
        Collections.sort(list, Comparator.comparing(String::length));
        list.forEach(System.out::println);
    }

    private static void sortStringArrayByLength(String[] stringArray) {
        System.out.println("-- sorting array of string --");
        Arrays.sort(stringArray, Comparator.comparing(String::length));
        Arrays.stream(stringArray).forEach(System.out::println);
    }
}
