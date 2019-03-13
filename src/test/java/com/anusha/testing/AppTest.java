package com.anusha.testing;

import com.anusha.collectiontasks.AN001_ArrayListElementAscDesc;
import com.anusha.util.ArrayUtils;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;


import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest{

    @Test
    public void shouldAddTwoIntegers(){

        Calculator cal = new Calculator();
        Integer result = cal.add(1, 2);
        Assert.assertEquals(new Integer(3),result);

    }

    @Test
    public void shouldSubractNegativeValues(){
        Calculator cal = new Calculator();
        Integer result = cal.add(5, -4);
        Assert.assertEquals(new Integer(1),result);
    }

    @Test
    public void shouldSubtractTwoIntegers()
    {
        Calculator cal = new Calculator();
        Integer result = cal.subtract(4, 2);
        Assert.assertEquals(new Integer(2),result);

    }

    @Test
    public void shouldMultiplyTwoIntegers(){
        Calculator cal = new Calculator();
        Integer result = cal.multiply(4, 2);
        Assert.assertEquals(new Integer(8),result);

    }
    @Test
    public void shouldAddTwoStrings(){
        String a = "Hello";
        String b = "World";

        String c = a+b;

      //  Assert.assertEquals("HelloWorld",c);

        assertThat(c, is("HelloWorld"));

    }

    // to check for printing even and odd numbers
@Test
    public void shouldREturnEvenValues(){
    int[] myArray = {1, 20, 31, 9, 28, 37, 12, 45, 89, 96, 67};
    List<Integer> evenList = ArrayUtils.getEvenNumbers(myArray);
    boolean actual = evenList.contains(1);

    //List<Integer> oddList = ArrayUtils.getOddNumbers(myArray);
    //List<Integer> expected = Arrays.asList(20,28,12,96);

    Assert.assertFalse(actual);
   /* Collections.sort(evenList);
    for (int even : evenList)
        System.out.print(even + ","); */
}

@Test
    public void shouldREturnOddValues(){
    int[] myArray = {1, 20, 31, 9, 28, 37, 12, 45, 89, 96, 67};
    List<Integer> oddList = ArrayUtils.getOddNumbers(myArray);
    boolean actual = oddList.contains(20);

    Assert.assertFalse(actual);
    /*Collections.sort(oddList);
    for (int odd : oddList)
        System.out.print(odd + ","); */
}

// to check for the arraylist size
@Test
    public void shouldDisplayArrayListSize(){
    ArrayList<Integer> myArr = new ArrayList<>();
    myArr.add(15);
    myArr.add(98);
    myArr.add(75);
    myArr.add(59);
    myArr.add(88);
    myArr.add(9);
    myArr.add(25);

    Assert.assertEquals(7,myArr.size());
}

//to check whether first element is removed from the arraylist
@Test
 public void shouldDisplayRemovedFirstElementFromArrayList() {

    ArrayList<Integer> myArr = new ArrayList<>();
    myArr.add(15);
    myArr.add(98);
    myArr.add(75);
    myArr.add(59);
    myArr.add(88);
    myArr.add(9);
    myArr.add(25);

    //1. method
  /* Assert.assertEquals(7,myArr.size());
   myArr.remove(0);
   Assert.assertEquals(6,myArr.size()); */

    //2.method
    Assert.assertTrue(myArr.contains(15));
    myArr.remove(0);
    Assert.assertFalse(myArr.contains(15));
}

    //to check whether last element is removed from the arraylist
@Test
    public void shouldDisplayRemovedLastElementFromArrayList(){
    ArrayList<Integer> myArr = new ArrayList<>();
    myArr.add(15);
    myArr.add(98);
    myArr.add(75);
    myArr.add(59);
    myArr.add(88);
    myArr.add(9);
    myArr.add(25);

    Assert.assertTrue(myArr.contains(25));
    myArr.remove(myArr.size() - 1);
    Assert.assertFalse(myArr.contains(25));
}

// to check the list display in ascending order
@Test
    public void shouldDisplayAscendingOrderArraylist(){
         ArrayList<Integer> myArr = new ArrayList<>();
    myArr.add(15);
    myArr.add(98);
    myArr.add(75);
    myArr.add(59);
    myArr.add(88);
    myArr.add(9);
    myArr.add(25);

      /*  Integer[] arr=new Integer[]{15,98,75,59,88,9,25};

    List<Integer> myArr=Arrays.asList(arr); */

   List<Integer> ascendingOrder=ArrayUtils.getAscendingOrderElementList(myArr);

   // Integer actualLowest = myArr.get( myArr.size() - ) ; ;
    Integer actualHighest = myArr.get( myArr.size() - 1) ;
    Integer actualLowest = myArr.get( 0 ) ;;
    Integer expectedLowest=Integer.valueOf(9);
    Integer expectedHighest=Integer.valueOf(98);

    Assert.assertEquals(expectedLowest,actualLowest);
    Assert.assertEquals(expectedHighest,actualHighest);

}

@Test
public void shouldDisplayDescendingOrderArraylist(){
    ArrayList<Integer> myArr = new ArrayList<>();
    myArr.add(15);
    myArr.add(98);
    myArr.add(75);
    myArr.add(59);
    myArr.add(88);
    myArr.add(9);
    myArr.add(25);

    List<Integer> descendingOrder=ArrayUtils.getDescendingOrderElementList(myArr);

    // Integer actualLowest = myArr.get( myArr.size() - ) ; ;
    Integer actualLowest = myArr.get( 0) ;
    Integer actualHighest = myArr.get(myArr.size() - 1) ;;
    Integer expectedLowest=Integer.valueOf(98);
    Integer expectedHighest=Integer.valueOf(9);

    Assert.assertEquals(expectedLowest,actualLowest);
    Assert.assertEquals(expectedHighest,actualHighest);

}

// alternate method for testing the elements ordered in ascending and descending
@Test
public void testSortAscendingDescending() throws Exception {
    ArrayList<Integer> numberList = new ArrayList<>();
    numberList.add(15);
    numberList.add(98);
    numberList.add(75);
    numberList.add(59);
    numberList.add(88);
    numberList.add(9);
    numberList.add(25);


    AN001_ArrayListElementAscDesc sortArrayList = new AN001_ArrayListElementAscDesc(numberList);
    ArrayList<Integer> unsortedArrayList = sortArrayList.getArrayList();
    System.out.println("Unsorted ArrayList: " + unsortedArrayList);
    ArrayList<Integer> sortedArrayListAscending = sortArrayList.sortAscending();
    System.out.println("Sorted ArrayList in Ascending Order : " + sortedArrayListAscending);
    ArrayList<Integer> sortedArrayListDescending = sortArrayList.sortDescending();
    System.out.println("Sorted ArrayList in Descending Order: " + sortedArrayListDescending);
}

// convert from wrapper to primitive and display ascending and descending order
@Test
public void shouldDisplayAscendingOrderArraylistPrimitive(){


         ArrayList<Integer> myArr = new ArrayList<>();
    myArr.add(15);
    myArr.add(98);
    myArr.add(75);
    myArr.add(59);
    myArr.add(88);
    myArr.add(9);
    myArr.add(25);

    //alt. mtd

       /*Integer[] array=new Integer[]{15,98,75,59,88,9,25};
        List<Integer> myArr=Arrays.asList(array); */

    List<Integer> ascendingOrder=ArrayUtils.getAscendingOrderElementList(myArr);

    // Integer actualLowest = myArr.get( myArr.size() - ) ; ;
    int actualHighest = myArr.get( myArr.size() - 1) ;
    int actualLowest = myArr.get( 0 ) ;;
    int expectedLowest=9;
    int expectedHighest=98;

    Assert.assertEquals(expectedLowest,actualLowest);
    Assert.assertEquals(expectedHighest,actualHighest);

}
/*
 @Test
    public void  shouldCheckElementsCopied(){
     ArrayList<Integer> arrayList1 = new ArrayList<>();

     arrayList1.add(100);
     arrayList1.add(200);
     arrayList1.add(300);

     ArrayList arrayList2 = new ArrayList();

     arrayList2.add(400);
     arrayList2.add(500);
     arrayList2.add(600);
     arrayList2.add(700);
     arrayList2.add(800);

List<Integer> actual=ArrayUtils.getCopiedElementsIntoAnotherList();
List<Integer> expected=
        assertThat(actual.getList(), containsInAnyOrder(expectedList.toArray(new String[expectedList.size()]));

 }  */

 @Test
    public void shouldCheckForStringListLength(){
    /* List<String> myString=new ArrayList<>();
     myString.add("Anusha");
     myString.add("Gopal");
     myString.add("Goutham");
     myString.add("Sriraksha");
*/
    String[] str=new String[]{"Anusha","Gopal","Goutham","Sriraksha"};
    List<String> myString=Arrays.asList(str);
     int actual=myString.size();
     int expected=4;

     Assert.assertEquals(expected,actual);
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
    public void shouldDisplayUppercasedString(){

     String str="anusha";
     String actual=str.toUpperCase();
     String expected="ANUSHA";
     assertEquals(expected,actual);

 }

 @Test
 public void shouldDisplayParsedIntegerValue(){
   /*  int number=2;
     Integer actual=Integer.valueOf(number);
     Integer expected=2;
     assertEquals(expected,actual); */

     String s = "4";
     Integer number=Integer.parseInt(s);
     Integer actual=number;
     Integer expected=4;
     assertEquals(expected,actual);
 }

 @Test
    public void shouldCheckElementPresentInList(){

     String[] myStr=new String[]{"Goutham","SriRaksha","Anusha","Gopal"};
     List<String> myList=Arrays.asList(myStr);

     boolean actual=myList.contains("Gopal");
    assertTrue(actual);

    boolean actuals=myList.contains("Aditya");
    assertFalse(actuals);
 }

@Test
    public void shouldReturnSecondHighestElementFromList(){
Integer[] array=new Integer[]{100,12,5,45,78};
List<Integer> myArray=Arrays.asList(array);
    int secondLargest = myArray.get(0);
    int largest = myArray.get(0);
    for (int i = 0; i < myArray.size(); i++)
    {
        if(myArray.get(i) > secondLargest)
        {
            if(myArray.get(i) > largest ) {
                secondLargest = largest;
                largest = myArray.get(i);
            } else {
                secondLargest = myArray.get(i);
            }
        }
    }
  Integer actual=largest;
    Integer expected=78;
    assertEquals(expected,actual);
}

@Test
    public void shouldCheckForStringBuilderElementsAppending(){
     StringBuilder sb=new StringBuilder();
    sb.append(new Integer(9));
    String actual = sb.toString() ;
    assertEquals( "9" , actual);
}

}


