package com.javafortesters.chap015Stringsrevisitedclasses.examples;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StringsUpperAndLowerCaseTest {
    @Test
    public void toLowerAndUpperCaseMethods() {
        String text = "In the lower 3rd";

        assertThat(text.toLowerCase(), is("in the lower 3rd"));
        assertThat(text.toUpperCase(), is("IN THE LOWER 3RD"));
    }

    @Test
    public void trimMethod() {
        String padded = "  some leading and some trailing space    ";
        String trimmed = padded.trim();

        System.out.println("lenght of string with space is : " + padded.length());
        assertThat(padded.trim(), is("some leading and some trailing space"));

        System.out.println("length of string without spaces is : " + trimmed.length());
        assertThat(trimmed, is("some leading and some trailing space"));
    }
}
