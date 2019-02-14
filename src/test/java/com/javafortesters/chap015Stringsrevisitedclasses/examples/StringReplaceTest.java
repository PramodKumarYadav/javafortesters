package com.javafortesters.chap015Stringsrevisitedclasses.examples;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StringReplaceTest {
    @Test
    public void replaceMethods() {
        String hello = "Hello fella fella fella";

        assertThat(hello.replace("fella", "World") , is("Hello World World World"));
        assertThat(hello.replaceFirst("fella", "World") , is("Hello World fella fella"));
        assertThat(hello.replaceAll("fella", "World") , is("Hello World World World"));
    }

    @Test
    public void replaceDigitMethods() {
        String digits = "1,2,3";

        assertThat(digits.replaceFirst("[0-9]", "digit") , is("digit,2,3"));
        assertThat(digits.replaceAll("[0-9]", "World") , is("World,World,World"));
    }
}
