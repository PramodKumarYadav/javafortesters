package com.javafortesters.chap015Stringsrevisitedclasses.examples;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StringsUsingSubStringsTest {
    @Test
    public void substring() {
        String digits = "0123456789";

        assertThat(digits.substring(5), is("56789"));
        assertThat(digits.substring(5,6), is("5"));
    }
}
