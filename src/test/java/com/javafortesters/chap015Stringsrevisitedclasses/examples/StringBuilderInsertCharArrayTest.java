package com.javafortesters.chap015Stringsrevisitedclasses.examples;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StringBuilderInsertCharArrayTest {
    @Test
    public void charInsert() {
        char[] charArray = {'.','a','b','c','d','e','f'};
        StringBuilder builder = new StringBuilder("abgh");

        builder.insert(2, charArray, 3, 4);
        System.out.println(builder);
        assertThat(builder.toString(),is("abcdefgh"));
    }

    @Test
    public void delete() {
        StringBuilder builder = new StringBuilder("abcdefg");
        builder.delete(2,4);
        System.out.println(builder);
        assertThat(builder.toString(), is("abefg"));

        builder.deleteCharAt(2);
        System.out.println(builder);
        assertThat(builder.toString(), is("abfg"));
    }

    @Test
    public void replaceSubString() {
        StringBuilder builder = new StringBuilder("abcdefgh");

        builder.replace(0,4, "123456789");
        System.out.println(builder);
        assertThat(builder.toString(), is("123456789efgh"));
    }

    @Test
    public void setCharAt() {
        StringBuilder builder = new StringBuilder("123456789");

        builder.setCharAt(4,'A');
        System.out.println(builder);
        assertThat(builder.toString(), is("1234A6789"));
    }
}
