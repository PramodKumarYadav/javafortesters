package com.javafortesters.chap015Stringsrevisitedclasses.examples;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StringRegexTest {

    @Test
    public void regexMethodForADigit() {
        String mustIncludeAdigit = ".*[0123456789]+.*";

        assertThat("12345678".matches(mustIncludeAdigit), is(true));
        assertThat("1nvalid".matches(mustIncludeAdigit), is(true));
        assertThat("inval5d".matches(mustIncludeAdigit), is(true));

        assertThat("INVALID".matches(mustIncludeAdigit), is(false));
        assertThat("invalid".matches(mustIncludeAdigit), is(false));
    }

    @Test
    public void regexMethodForUPPERCASE() {
        String mustIncludeAdigit = ".*[A-Z]+.*";

        assertThat("12345678".matches(mustIncludeAdigit), is(false));
        assertThat("1234A678".matches(mustIncludeAdigit), is(true));
        assertThat("A123B567".matches(mustIncludeAdigit), is(true));

    }
}
