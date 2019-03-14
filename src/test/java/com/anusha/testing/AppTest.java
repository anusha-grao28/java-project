package com.anusha.testing;

import com.anusha.collectiontasks.AN001_ArrayListElementAscDesc;
import com.anusha.util.ArrayUtils;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.Test;
//clean up used importss
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
    // to check for printing even and odd numbers
@Test
    public void shouldREturnEvenValues(){
    int[] myArray = {1, 20, 31, 9, 28, 37, 12, 45, 89, 96, 67};
    List<Integer> evenList = ArrayUtils.getEvenNumbers(myArray);
    boolean actual = evenList.contains(1);

    //List<Integer> oddList = ArrayUtils.getOddNumbers(myArray);
    //List<Integer> expected = Arrays.asList(20,28,12,96);

    Assert.assertFalse(actual);
}

@Test
    public void shouldREturnOddValues(){
    int[] myArray = {1, 20, 31, 9, 28, 37, 12, 45, 89, 96, 67};
    List<Integer> oddList = ArrayUtils.getOddNumbers(myArray);
    boolean actual = oddList.contains(20);

    Assert.assertFalse(actual);
    }

@Test
    public void shouldDisplayArrayListSize(){
    List<Integer> myArr=Arrays.asList(15,98,75,59,88,9,25);
    Assert.assertEquals(7,myArr.size());
}

@Test
 public void shouldDisplayRemovedFirstElementFromArrayList() {
    List<Integer> myArr=Arrays.asList(15,98,75,59,88,9,25);

    //1. method
  /* Assert.assertEquals(7,myArr.size());
   myArr.remove(0);
   Assert.assertEquals(6,myArr.size()); */

    //2.method
    Assert.assertTrue(myArr.contains(15));
    myArr.remove(0);
    Assert.assertFalse(myArr.contains(15));
}

@Test
    public void shouldDisplayRemovedLastElementFromArrayList(){
    List<Integer> myArr=Arrays.asList(15,98,75,59,88,9,25);

    Assert.assertTrue(myArr.contains(25));
    myArr.remove(myArr.size() - 1);
    Assert.assertFalse(myArr.contains(25));
}


@Test
    public void shouldDisplayAscendingOrderArraylist(){
    //TODO fix this to use Arrays.asList

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
    //TODO fix this to use Arrays.asList

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

@Test
public void shouldDisplayAscendingOrderArraylistPrimitive(){
    // TODO fix this to use Arrays.asList


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


@Test

// check comment for this in git hub
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


}


