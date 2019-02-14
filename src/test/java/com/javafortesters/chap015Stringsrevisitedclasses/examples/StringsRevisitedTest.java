package com.javafortesters.chap015Stringsrevisitedclasses.examples;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;

public class StringsRevisitedTest {

    @Test
    public void testAString() {
        String aString = "abcdef";
        assertThat("hello".length(), is(5));
        assertEquals("123456", "12" + "34" + "56");
    }

    @Test
    public void testingSystemOutPrintLn() {
        int i = 4;
        System.out.println("Print an input to console " + i);
    }

    @Test
    public void specialCharacterEncoding() {
        System.out.println("Bob said \"hello\" to his cat's friend");
        System.out.println("This is a single backslash \\");

        System.out.println("I say \t \'what's up\'");
        System.out.println("I say\b\' what's up\'");
        System.out.println("I say \n\'what's up\'");
        System.out.println("I say \r\'what's up\'");
    }

    @Test
    public void stringConcatinations() {
        String ps1 = "This is " + "String2";
        assertThat(ps1,is("This is String2"));

        String ps2 = "This is " + 4;
        assertThat(ps2, is("This is 4"));

        String thisIs = "This is ";
        String s1 = thisIs.concat("String1");
        assertThat(s1, is("This is String1"));
    }
}
