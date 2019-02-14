package com.javafortesters.chap015Stringsrevisitedclasses.examples;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StringBuillderTest {
    @Test
    public void stringbuildermethod() {
        StringBuilder builder = new StringBuilder();

        builder.append("Hello there").replace(7,11,"World");
        System.out.println(builder);

        builder.delete(5,7);
        System.out.println(builder);
    }

    @Test
    public void emptyStringbuildermethod() {
        StringBuilder emptyBuilder = new StringBuilder();
        assertThat(emptyBuilder.length(), is(0));
        assertThat(emptyBuilder.capacity(), is(16));
    }

    @Test
    public void initialisedtringbuildermethod() {
        StringBuilder initalisedBuilder = new StringBuilder("hello");
        assertThat(initalisedBuilder.length(), is(5));
        assertThat(initalisedBuilder.capacity(), is(21));
    }

    @Test
    public void initialiedCapacityBuilderMethod() {
        StringBuilder capacitiyIniBuilder = new StringBuilder(512);
        assertThat(capacitiyIniBuilder.capacity(), is(512));
        assertThat(capacitiyIniBuilder.length(), is(0));

        capacitiyIniBuilder.trimToSize();
        assertThat(capacitiyIniBuilder.capacity(), is(0));

        capacitiyIniBuilder.ensureCapacity(600);
        assertThat(capacitiyIniBuilder.capacity(), is(600));
    }
}
