package com.cleverdevices.interview.codetest.stringhelper;

import org.junit.Test;

/**
 * Created by brian on 6/8/17.
 */
public class ReverseOrderTest {

    @Test
    public void testOneWord(){
        String original = "ThisIsASingleWord";
        String reversed = StringHelper.reverseWordOrder(original);

        assert reversed.equals(original);
    }

    @Test
    public void testEmptyString(){
        String original = "";
        String reversed = StringHelper.reverseWordOrder(original);

        assert reversed.equals(original);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNull(){
        String original = null;
        String reversed = StringHelper.reverseWordOrder(original);

        assert reversed.equals(original);
    }

    @Test
    public void testReverse(){
        String original = "The quick brown fox.";
        String expected = "fox. brown quick The";
        String reversed = StringHelper.reverseWordOrder(original);

        System.out.println(expected + "  " + reversed);
        assert (expected.equals( reversed ));
    }
}
