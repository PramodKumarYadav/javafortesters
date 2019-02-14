package com.javafortesters.chap015Stringsrevisitedclasses.examples;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StringFormatTest {
    @Test
    public void formatMethodForDecimal() {
        int value = 4;

        String output = "The value " + value + " was used";
        assertThat(output, is("The value 4 was used"));

        String template = "The value %d was used";
        String formatted = String.format(template, value);
        assertThat(formatted, is("The value 4 was used"));
    }

    @Test
    public void formatMethodForString() {
        String value = "Pramod";

        String output = "The name " + value + " was used";
        assertThat(output, is("The name Pramod was used"));

        String template = "The name %s was used";
        String formatted = String.format(template, value);
        assertThat(formatted, is("The name Pramod was used"));
    }

    @Test
    public void someMoreStringFormatExamples() {
        String use = "%s %s towards %d large %s";
        assertThat(String.format(use,"Bob","ran",6,"onions"), is("Bob ran towards 6 large onions"));

        String text = "%2$s %4$s towards %3$d large %1$s";
        assertThat(String.format(text,"Bob","ran",6,"onions"), is("ran onions towards 6 large Bob"));

        String text2 = "%1$s %1$s towards %3$d large %1$s";
        assertThat(String.format(text2,"Bob","ran",6,"onions"), is("Bob Bob towards 6 large Bob"));

    }
}
