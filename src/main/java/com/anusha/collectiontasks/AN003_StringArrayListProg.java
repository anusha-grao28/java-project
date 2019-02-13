package com.anusha.collectiontasks;

import java.lang.reflect.Array;
import java.util.*;

public class AN003_StringArrayListProg {
public static void main(String[] args){
    ArrayList<String> myString=new ArrayList<>();
    myString.add("Goutham");
    myString.add("sriraksha");
    myString.add("anusha");
    myString.add("gopal");

    boolean nameCheck=myString.contains("gopal");

    if (nameCheck)
        System.out.println(nameCheck+" gopal is in the list");
    else
        System.out.println(nameCheck+" gopal is not in the list");


    boolean nameCheck1=myString.contains("aditya");
    if (nameCheck)
        System.out.println(nameCheck1+" aditya is in the list");
    else
        System.out.println(nameCheck1+" aditya is not in the list");

}


}