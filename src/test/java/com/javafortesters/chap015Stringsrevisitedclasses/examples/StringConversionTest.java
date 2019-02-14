package com.javafortesters.chap015Stringsrevisitedclasses.examples;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StringConversionTest {
    @Test
    public void convertingToString() {
        String intConcatConvert = "" + 1;
        assertThat(intConcatConvert, is("1"));

        String IntegerIntConvert = Integer.toString(2);
        assertThat(IntegerIntConvert, is("2"));
    }

    @Test
    public void toValueMethod() {
        String integerStringConvert = String.valueOf(3);
        assertThat(integerStringConvert, is("3"));
    }

    @Test
    public void convertingFromAString() {
        assertThat(Integer.valueOf("2"), is(2));
        char[] cArray = {'2','3'};
        assertThat("23".toCharArray(), is(cArray));
    }

    @Test
    public void convertingFromAStringToByte() throws UnsupportedEncodingException {
        byte[] bArray = "hello there".getBytes("UTF8");
        System.out.println(bArray[0]);
    }

}
