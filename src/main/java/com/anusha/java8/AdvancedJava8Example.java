package com.anusha.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class AdvancedJava8Example {
    private static List<String> nameList;
    public static void main(String[] args){

        nameList= Arrays.asList("Anusha","Goutham","Gopal","Sriraksha");

        // common way of calling loop structure
        for(String name:nameList){
            System.out.println("Name  is : "+name);
            System.out.println("Name in uppercase is : "+name.toUpperCase());
        }


        // java 8 way of calling for loop
        //to display upper case letters from a llist

        System.out.println(" java8 looping concepts....\n");
        nameList.forEach(name -> System.out.println("name is : "+name));
        nameList.stream().map(obj->obj.toUpperCase()).forEach(name->System.out.println("name is : "+name));

        // to print names starting with G
        for(String name:nameList) {
            if(name.startsWith("G")) {
                System.out.println("Names starting with G is : " + name);
            }
        }

        nameList.stream().filter(name->name.startsWith("G")).
                forEach(name->System.out.println("name beginning with G is : "+name));

        //Covert all the elements of list to uppercase and copy to another list
        List<String> upperCaseList=new ArrayList<>();
        for(String name:nameList) {
            String upperCaseName=name.toUpperCase();
            upperCaseList.add(upperCaseName);
        }

        for(String upper:upperCaseList){
            System.out.println("Name in Upper Case is : "+upper);
        }
        //java 8 way

        List<String> upperCaseListNew = nameList.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
        upperCaseListNew.stream().forEach(upper->System.out.println("Name in Upper Case is : "+upper));

        }


    }

