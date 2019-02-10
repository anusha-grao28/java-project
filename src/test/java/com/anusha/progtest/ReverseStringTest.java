package com.anusha.progtest;

import com.anusha1.testing.ReverseString;
import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {
    @Test
    public void test() {
        ReverseString s = new ReverseString();
        Assert.assertEquals("cba", s.reverse("anusha"));
        Assert.assertEquals("", s.reverse(""));
       // Assert.assertNotEqual("abc", s.reverse("anusha"));

    }
    @Test(expected = NullPointerException.class)
    public void testThrowNPE(){
        ReverseString s = new ReverseString();
        s.reverse(null);
        throw new NullPointerException();
    }
}
