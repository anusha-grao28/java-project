package com.anusha1.testing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseString {
    public static String reverse(String s){
        List<String> tempArray = new ArrayList<String>(s.length());
        for(int i = 0; i <s.length(); i++){
            tempArray.add(s.substring(i, i+1));
        }
        StringBuilder reverseString = new StringBuilder(s.length());
        for(int i = tempArray.size() - 1; i >=0; i--){
            reverseString.append(tempArray.get(i));
        }
        return reverseString.toString();
    }


}
