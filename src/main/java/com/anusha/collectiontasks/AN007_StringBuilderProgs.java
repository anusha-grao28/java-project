package com.anusha.collectiontasks;

public class AN007_StringBuilderProgs {
    public static void main(String[] args){
        StringBuilder sb=new StringBuilder();
        sb.append("hello");
        sb.append(" world");
        sb.append(" welcome");
        sb.append(" to ");
        sb.append(" testing");
        sb.append( 2019);
        sb.append(" ");
        sb.append(0);


        System.out.println(sb);
        System.out.println("length of a string builder is: "+sb.length());

    }
}
