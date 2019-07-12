package com.anusha.collectiontasks;

import java.util.ArrayList;
import java.util.Collections;

public class AN004_CopiedListElements {
    public static void main(String[] args){
        ArrayList<String> names1=new ArrayList<>();
        names1.add("anusha");
        names1.add("goutham");
        names1.add("gopal");

        ArrayList<String> names2=new ArrayList<>();
        names2.add("anu");
        names2.add("sriraksha");
        names2.add("aditya");

        ArrayList<String> names=new ArrayList<>();
        names.add("adhi");
        names.add("gouti");

        names.addAll(names1);
        names.addAll(names2);

        System.out.println("Elements of 3rd list are: \n");
        System.out.println(names);



    }
}
