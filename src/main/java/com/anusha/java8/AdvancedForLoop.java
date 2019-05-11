package com.anusha.java8;

import com.anusha.bank.Account;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AdvancedForLoop {

    private static List<String> namesList;

    public static void main(String[] args){

        namesList = Arrays.asList("Goutham","Anusha","Gopal","Sriraksha");

        // oldway of printing names
        for(String name : namesList){
            System.out.println("Name is :  "+ name);
            System.out.println("Name in uppercase : "+ name.toUpperCase());
        }


        //java8 way
        namesList.forEach( name -> System.out.println("Name is :  "+ name));

        // streams api

        namesList.stream().peek( a -> System.out.println("passed value : "+a));
        namesList.stream().map( obj -> obj.toUpperCase()).forEach( name -> System.out.println("Name in uppercase : "+name));

        // print name name starting with G

        for(String name : namesList){

            if(name.startsWith("G")){
                System.out.println("Name beginning with G is "+name);
            }
        }


        namesList.stream().filter( name -> name.startsWith("G") )
                .forEach( name -> System.out.println("Name beginning with G is "+name));

        // convert all the elements to uppercase and copy it to another list

        List<String> upperCaseList = new ArrayList<>();
        for(String name : namesList){
            String upperCaseName = name.toUpperCase();
            upperCaseList.add(upperCaseName);

        }

        for(String upper : upperCaseList){
            System.out.println("Name in uppercase : "+upper);
        }

        namesList.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
        // java 8 way
        List<String> upperCaseListNew = namesList.stream().map(n -> n.toUpperCase()).collect(Collectors.toList());
        namesList.stream().map(n -> n.toUpperCase()).collect(Collectors.toSet());
        upperCaseListNew.stream().forEach( upper  -> System.out.println("Name in uppercase : "+upper) );



        // stream ... map on the value being passed ... then filter it out or collect to collection
    }
}
