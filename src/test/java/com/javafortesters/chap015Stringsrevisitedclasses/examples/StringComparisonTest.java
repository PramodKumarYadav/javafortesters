package com.javafortesters.chap015Stringsrevisitedclasses.examples;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StringComparisonTest {
    @Test
    public void compareToMethods() {
        String hello = "Hello";
        assertThat(hello.compareTo("Hello"), is(0));
    }

    @Test
    public void compareToLessthaMethods() {
        String hello = "Hello";

        assertThat(hello.compareTo("hello") < 0, is(true));
        assertThat(hello.compareTo("hel") < 0, is(true));
        assertThat(hello.compareTo("Helloo") < 0, is(true));
        assertThat(hello.compareTo("Hemlo") < 0, is(true));
    }

    @Test
    public void compareToMorethaMethods() {
        String hello = "Hello";

        assertThat(hello.compareTo("H") > 0, is(true));
        assertThat(hello.compareTo("Hel") > 0, is(true));
        assertThat(hello.compareTo("Helln") > 0, is(true));
        assertThat(hello.compareTo("HeLln") > 0, is(true));
        assertThat(hello.compareTo("HeLlnooo") > 0, is(true));
    }

    @Test
    public void compareToIgnoreCase() {
        String hello = "Hello";

        assertThat(hello.compareToIgnoreCase("heLLo") == 0, is(true));
        assertThat(hello.compareToIgnoreCase("HeLLO") == 0, is(true));
        assertThat(hello.compareToIgnoreCase("HELLO") == 0, is(true));
    }
}
