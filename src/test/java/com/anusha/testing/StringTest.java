package com.anusha.testing;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.collection.IsCollectionWithSize.hasSize;
import static org.hamcrest.core.Is.is;

import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.*;
import static org.junit.internal.matchers.IsCollectionContaining.hasItem;

public class StringTest {
    @Test
    public void shouldCheckForStringBuilderElementsAppending(){
        StringBuilder sb=new StringBuilder();
        sb.append(new Integer(9));
        String actual = sb.toString() ;
        assertEquals( "9" , actual);
    }

    @Test
    public void shouldCheckElementPresentInList(){

        String[] myStr=new String[]{"Goutham","SriRaksha","Anusha","Gopal"};
        List<String> myList= Arrays.asList(myStr);

     /*   boolean actual=myList.contains("Gopal");
        assertTrue(actual);

        boolean actuals=myList.contains("Aditya");
        assertFalse(actuals); */

        assertThat(myList,hasItem("Gopal"));

    }

    @Test
    public void ahouldCheckElementNotPresentInList(){
        String[] myStr=new String[]{"Goutham","SriRaksha","Anusha","Gopal"};
        List<String> myList= Arrays.asList(myStr);
        assertThat(myList,not(hasItem("aditya")));
    }

    @Test
    public void shouldDisplayParsedIntegerValue() {
   /*  int number=2;
     Integer actual=Integer.valueOf(number);
     Integer expected=2;
     assertEquals(expected,actual); */

        String s = "4";
        Integer number = Integer.parseInt(s);
        Integer actual = number;
        Integer expected = 4;
        assertEquals(expected, actual);

    }

    @Test
    public void shouldDisplayUppercasedString(){

        String str="anusha";
        String actual=str.toUpperCase();
        String expected="ANUSHA";
        //assertEquals(expected,actual);

       // assertThat(actual,is(expected));
        assertThat(actual,is("ANUSHA"));

    }

    @Test
    public void shouldCheckForAddedString(){
        String a="Goutham";
        String b="Rao";
        String c=a+b;

        String actual=c;
        String expected="GouthamRao";

        //Assert.assertEquals(expected,actual);
        assertThat(c, is("GouthamRao"));
    }

    @Test
    public void shouldCheckForStringListLength(){

        List<String> myString=Arrays.asList("Anusha","Gopal","Goutham","Sriraksha");
        int actual=myString.size();
        int expected=4;

      //  Assert.assertEquals(expected,actual);
        assertThat(myString,hasSize(4));
    }

    @Test
    public void shouldAddTwoStrings(){
        String a = "Hello";
        String b = "World";
        String c = a+b;
        //  Assert.assertEquals("HelloWorld",c);
        assertThat(c, is("HelloWorld"));
    }

    @Test
    public void shouldReturnReveresedString(){
      StringBuilder sb=new StringBuilder();
        System.out.println("1 "+sb);

        sb.append("anusha");
        System.out.println("2 "+sb);

        StringBuilder actual = sb.reverse();
        System.out.println( "actual = "+actual);

        /*System.out.println("sb "+sb);
        StringBuilder expected=sb.append("ahsuna");

        System.out.println("sb "+sb);
        System.out.println("expected "+expected);
        System.out.println("actual "+actual); */

        assertEquals( "ahsuna",actual.toString());
    }
}
