package com.anusha.collectiontasks;

import java.util.HashSet;
import java.util.Set;

public class AN005A_HashSetProgs {
    public static void main(String[] args){

        //1. 1. Create a HashSet of Integers . Add values 1,2,1,3,4 and check the size of set
        Set<Integer> number=new HashSet<Integer>();
        number.add(1);
        number.add(2);
        number.add(1);
        number.add(3);
        number.add(4);

        System.out.println("The size of an Hash Set are: \n "+number.size());

        //2. display the elements of hash set
        System.out.println("Contents of Hash Set elements are: \n");
        for (Integer num:number)
            System.out.println(num);

        //3. to display the third element of the hash Set


    }
}
