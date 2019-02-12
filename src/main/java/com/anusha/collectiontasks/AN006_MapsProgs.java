package com.anusha.collectiontasks;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class AN006_MapsProgs {
    public static void main(String[] args){

        //1. 1. Create a HashMap of type Map<Integer,String> with some values .
        // Example  ```1 Anusha  2 Goutham   3 Adithya   4 Raksha```

        HashMap<Integer,String> hmap=new HashMap<Integer,String>();
        hmap.put(1,"Goutham");
        hmap.put(2,"Anusha");
        hmap.put(3,"Gopal");
        hmap.put(4,"sriraksha");

        //2. to display the contents of Map

        //1. method-I
        System.out.println("Method-I for displaying map contents: \n"+Arrays.asList(hmap));
        System.out.println("----------------\n");
        //2. method-II
        System.out.println("Method-II for displaying map contents: \n"+ Collections.singletonList(hmap));
        System.out.println("----------------\n");
        //3. Method-III
        for (Map.Entry<Integer, String> entry : hmap.entrySet()) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
        System.out.println("----------------\n");
        //3. to print the third element of the map
        System.out.println(" the elements of the map is: "+hmap.size());
        System.out.println("the third element from the map is: "+hmap.get(3));


    }
}
