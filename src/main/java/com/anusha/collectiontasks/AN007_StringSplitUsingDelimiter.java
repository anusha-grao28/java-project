package com.anusha.collectiontasks;

public class AN007_StringSplitUsingDelimiter {
public static void main(String[] args){
    String string = "Goutham-K-Rao";
    String[] parts = string.split("-");

    for(int i=0;i<parts.length;i++){
    System.out.println(parts[i]);
}
}
}
