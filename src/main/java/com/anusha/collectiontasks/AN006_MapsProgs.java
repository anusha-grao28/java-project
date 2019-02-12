package com.anusha.collectiontasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

public class AN006_MapsProgs {
    public static void main(String[] args){

        //1. 1. Create a HashMap of type Map<Integer,String> with some values .
        // Example  ```1 Anusha  2 Goutham   3 Adithya   4 Raksha```

        HashMap<Integer,String> hmap=new HashMap<Integer,String>();
        hmap.put(1,"Goutham");
        hmap.put(2,"Anusha");
        hmap.put(3,"Gopal");
        hmap.put(4,"sriraksha");

        // to display the contents of Map

        //1. method-I
        System.out.println("Method-I for displaying map contents: \n"+Arrays.asList(hmap));

        //2. method-II
        System.out.println("Method-II for displaying map contents: \n"+ Collections.singletonList(hmap));
    }
}
