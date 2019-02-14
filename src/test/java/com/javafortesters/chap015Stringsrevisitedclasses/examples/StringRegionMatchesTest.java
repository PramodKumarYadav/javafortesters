package com.javafortesters.chap015Stringsrevisitedclasses.examples;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class StringRegionMatchesTest {

    @Test
    public void regionMatches() {
        String hello = "Hello fella";
        String lady = "young lady";

        assertThat(hello.regionMatches(true, 6, "FEz", 0, 2), is(true));
        assertThat(hello.regionMatches(true, 9, lady, 6, 2), is(true));
    }

    @Test
    public void indexOfAndLastIndexOfMethods() {
        String hello = "Hello fella";
        String lady = "young lady";

        assertThat(hello.indexOf("l"), is(2));
        assertThat(hello.lastIndexOf("l"), is(9));

        assertThat(hello.indexOf("l",3), is(3));
        assertThat(hello.indexOf("l",5), is(8));

        assertThat(hello.lastIndexOf("l",7), is(3));
        assertThat(hello.lastIndexOf("l",3), is(3));

        assertThat(hello.indexOf("z"), is(-1));
        assertThat(hello.lastIndexOf("z"), is(-1));
    }

    @Test
    public void findAllOccurances() {
        String stringToSearch = "Hello fella";
        String substringToSearch = "l";

        List<Integer> intOccurance = new ArrayList<>();
        int offsetValue = 0;

        System.out.println("length of string : " + stringToSearch.length());

        for (int i = 0; i < stringToSearch.length(); i++) {
            offsetValue = stringToSearch.indexOf("l",offsetValue + 1);
            System.out.println(offsetValue);
            if (offsetValue == -1) {
                break;
            }
            else if (offsetValue < stringToSearch.length()) {
                intOccurance.add(offsetValue);
            }
        }

        System.out.println(intOccurance);

    }

    @Test
    public void findAllReverseOccurances() {
        String stringToSearch = "Hello fella";
        String substringToSearch = "l";

        List<Integer> intReverseOccurance = new ArrayList<>();
        int offsetValue = stringToSearch.length();

        System.out.println("length of string : " + stringToSearch.length());

        for (int i = 0; i < stringToSearch.length(); i++) {

            offsetValue = stringToSearch.lastIndexOf("l", offsetValue- 1);
            System.out.println(offsetValue);
            if (offsetValue == -1) {
                break;
            }
            else if (offsetValue < stringToSearch.length()) {
                intReverseOccurance.add(offsetValue);
            }
        }

        System.out.println(intReverseOccurance);

    }
}
