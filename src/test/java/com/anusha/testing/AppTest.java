package com.anusha.testing;

import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Assert;
import org.junit.Test;

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
}
