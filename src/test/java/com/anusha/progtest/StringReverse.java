package com.anusha.progtest;

import org.junit.Assert;
import org.junit.Test;

public class StringReverse {

    @Test
    public void  shouldReverseString()
    {
        StringReverse str=new StringReverse();
        String result=str.toString();
        Assert.assertEquals("ahsuna",result);

    }
}
