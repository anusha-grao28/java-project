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

import static org.hamcrest.Matchers.*;
import static org.hamcrest.core.Is.is;
import static org.hamcrest.core.IsNot.not;
import static org.junit.Assert.*;
import static org.junit.internal.matchers.IsCollectionContaining.hasItem;

/**
 * Unit test for simple App.
 */
public class AppTest{

    @Test
    public void shouldAddTwoIntegers(){

        Calculator cal = new Calculator();
        Integer result = cal.add(1, 2);
       // Assert.assertEquals(new Integer(3),result);
assertThat(result,is(3));
    }

    @Test
    public void shouldSubractNegativeValues(){
        Calculator cal = new Calculator();
        Integer result = cal.add(5, -4);
       // Assert.assertEquals(new Integer(1),result);
        assertThat(result,is(1));
    }

    @Test
    public void shouldSubtractTwoIntegers()
    {
        Calculator cal = new Calculator();
        Integer result = cal.subtract(4, 2);
       // Assert.assertEquals(new Integer(2),result);
        assertThat(result,is(2));
    }

    @Test
    public void shouldMultiplyTwoIntegers(){
        Calculator cal = new Calculator();
        Integer result = cal.multiply(4, 2);
      //  Assert.assertEquals(new Integer(8),result);
        assertThat(result,is(8));
    }

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

    //using hamcrest matchers methods
    List<Integer> myArray=Arrays.asList(15,98,75,59,88,9,25);
    assertThat(myArray, hasSize(7));

}


    @Test
 public void shouldDisplayRemovedFirstElementFromArrayList() {
    List<Integer> myArr=Arrays.asList(15,98,75,59,88,9,25);

    //1. method
  /* Assert.assertEquals(7,myArr.size());
   myArr.remove(0);
   Assert.assertEquals(6,myArr.size()); */

    //2.method
    //Assert.assertTrue(myArr.contains(15));
    myArr.remove(0);
    Assert.assertFalse(myArr.contains(15));

    //using hamcrest matchers
       /* List<Integer> myArrays=Arrays.asList(15,98,75,59,88,9,25);
        assertThat(myArrays,hasItem(15));
        myArrays.remove(0);
        assertThat(myArrays,not(hasItem(15))); */
}

@Test
    public void shouldDisplayRemovedLastElementFromArrayList(){
    List<Integer> myArr=Arrays.asList(15,98,75,59,88,9,25);

    Assert.assertTrue(myArr.contains(25));
    myArr.remove(myArr.size() - 1);
    Assert.assertFalse(myArr.contains(25));
   //using hamcrest matchers
         /*List<Integer> myArrays=Arrays.asList(15,98,75,59,88,9,25);
        assertThat(myArrays,hasItem(25));
    myArr.remove(myArr.size() - 1);
        assertThat(myArrays,not(hasItem(25))); */
}

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

      // Integer[] arr=new Integer[]{15,98,75,59,88,9,25};
   // List<Integer> myArr=Arrays.asList(arr);

   List<Integer> ascendingOrder=ArrayUtils.getAscendingOrderElementList(myArr);

   // Integer actualLowest = myArr.get( myArr.size() - ) ; ;
    Integer actualHighest = myArr.get( myArr.size() - 1) ;
    Integer actualLowest = myArr.get( 0 ) ;;
    Integer expectedLowest=Integer.valueOf(9);
    Integer expectedHighest=Integer.valueOf(98);

    Assert.assertEquals(expectedLowest,actualLowest);
    Assert.assertEquals(expectedHighest,actualHighest);

  /* List<Integer> myList=Arrays.asList(98,35,76,5,41,26,58,82,11);
   Assert.assertThat(myList,contains(5,11,26,35,41,58,76,82,98)); */
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

   /* List<Integer> myList=Arrays.asList(98,35,76,5,41,26,58,82,11);
    assertThat(myList,contains(98,82,76,58,41,35,26,11,5)); */

}

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

      /* Integer[] array=new Integer[]{15,98,75,59,88,9,25};
        List<Integer> myArr=Arrays.asList(array); */

    List<Integer> ascendingOrder=ArrayUtils.getAscendingOrderElementList(myArr);

    // Integer actualLowest = myArr.get( myArr.size() - ) ; ;
    int actualHighest = myArr.get( myArr.size() - 1) ;
    int actualLowest = myArr.get( 0 ) ;;
    int expectedLowest=9;
    int expectedHighest=98;

    Assert.assertEquals(expectedLowest,actualLowest);
    Assert.assertEquals(expectedHighest,actualHighest);
 /* List<Integer> myList=Arrays.asList(98,35,76,5,41,26,58,82,11);
    assertThat(myList,contains(5,11,26,35,41,58,76,82,98)); */
}

}

