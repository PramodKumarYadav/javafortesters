package com.javafortesters.chap015Stringsrevisitedclasses.examples;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StringContainsTest {

    @Test
    public void containsMethod() {
        String hello  = "Hello";

        assertThat(hello.contains("el"), is(true));
        assertThat(hello.contains("Hello"), is(true));
        assertThat(hello.contains("hello"), is(false));
        assertThat(hello.contains("z"), is(false));
    }

    @Test
    public void contentEqualsMethod() {
        String hello  = "Hello";

        assertThat(hello.contentEquals("Hello"), is(true));
        assertThat(hello.contentEquals("hello"), is(false));
    }

    @Test
    public void equalsIgnoreCaseMethod() {
        String hello  = "Hello";
        assertThat(hello.equalsIgnoreCase("hello"), is(true));
    }
}
