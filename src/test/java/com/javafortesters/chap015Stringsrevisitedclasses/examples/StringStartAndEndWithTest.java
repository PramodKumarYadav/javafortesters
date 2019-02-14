package com.javafortesters.chap015Stringsrevisitedclasses.examples;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StringStartAndEndWithTest {
    @Test
    public void endsWithMethod() {
        String hello  = "Hello";
        assertThat(hello.endsWith("Hello"), is(true));
        assertThat(hello.endsWith("llo"), is(true));
        assertThat(hello.endsWith("o"), is(true));
        assertThat(hello.endsWith(""), is(true));

        assertThat(hello.endsWith("hello"), is(false));

    }

    @Test
    public void startsWithMethod() {
        String hello = "Hello";

        assertThat(hello.startsWith("Hello"), is(true));
        assertThat(hello.startsWith("Hel"), is(true));
        assertThat(hello.startsWith(""), is(true));

        assertThat(hello.startsWith("he"), is(false));
    }

    @Test
    public void isEmptyMethod() {
        String hello = "Hello";
        String empty = "";
        String empty2 = new String();

        assertThat(empty.isEmpty(), is(true));
        assertThat(empty.length(), is(0));
        assertThat(empty2.isEmpty(), is(true));
        assertThat(empty2.length(), is(0));
        assertThat(hello.isEmpty(), is(false));

    }
}
