package com.javafortesters.chap015Stringsrevisitedclasses.examples;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StringConstructorsTest {

    @Test
    public void zeroLengthString() {
        String empty = new String();
        System.out.println(empty.length());
        assertThat(empty.length(), is(0));
    }

    @Test
    public void StringFromArguments() {
        char[] cArray   = {'2','3'};
        assertThat(new String(cArray), is("23"));

        byte[] bArray = {104,105, 106, 107};
        System.out.println(new String(bArray));

        assertThat(new String(bArray), is("hijk"));

        String tempString = " this" + " is" + " string";
        assertThat(new String(tempString), is(" this is string"));
    }
}
