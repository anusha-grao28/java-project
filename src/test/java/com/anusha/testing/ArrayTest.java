package com.anusha.testing;

import org.hamcrest.collection.IsCollectionWithSize;
import org.junit.Assert;
import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;

public class ArrayTest {
    @Test
    public void shouldPrintArraySize()
    {
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int actual = number.length;

        Assert.assertEquals(actual,10);
    }


}
