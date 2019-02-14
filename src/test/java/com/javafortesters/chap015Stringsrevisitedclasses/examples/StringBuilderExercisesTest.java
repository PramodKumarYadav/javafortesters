package com.javafortesters.chap015Stringsrevisitedclasses.examples;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StringBuilderExercisesTest {
    @Test
    public void append() {
        StringBuilder builder = new StringBuilder();

        assertThat(builder.capacity(), is(16));
        builder.append("> ");
        builder.append(1);
        builder.append(" + ");
        builder.append(2);

        char[] charArray = {' ', '=', ' ', '3'};
        builder.append(charArray);

        System.out.println(builder);
        assertThat(builder.toString(), is("> 1 + 2 = 3"));
        builder.append("Adfafadfadfadfadfadfa ");
        assertThat(builder.capacity(), is(34));
    }

    @Test
    public void insert() {
        StringBuilder builder = new StringBuilder("123890");

        builder.insert(3,"4567");

        System.out.println(builder);
        assertThat(builder.toString(), is("1234567890"));
    }

    @Test
    public void insertOutOfBound() {
        StringBuilder builder = new StringBuilder("123890");

        builder.insert(3,"4567");

        builder.insert(13,"ad");
        System.out.println(builder);
    }

    @Test
    public void insertAtEndorBegin() {
        StringBuilder builder = new StringBuilder("123890");

        builder.insert(3,"4567");

        builder.insert(builder.length(),"Endstrign");
        System.out.println(builder);

        builder.insert(0,"BeginString");
        System.out.println(builder);
    }
}
