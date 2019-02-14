package com.javafortesters.chap015Stringsrevisitedclasses.examples;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StringBuilderReverse {
    @Test
    public void reverse() {
        StringBuilder builder = new StringBuilder("0123456789");

        builder.reverse().toString();
        System.out.println(builder);

        assertThat(builder.reverse().toString(),is("0123456789"));
        assertThat(builder.reverse().toString(),is("9876543210"));
    }

    @Test
    public void substring() {
        StringBuilder builder = new StringBuilder("0123456789");

        System.out.println(builder.substring(3,7));
        assertThat(builder.substring(3,7), is("3456"));

        System.out.println(builder.substring(3));
        assertThat(builder.substring(3), is("3456789"));
    }
}
