package com.javafortesters.chap015Stringsrevisitedclasses.examples;

import org.junit.Test;

public class StringSplitTest {
    @Test
    public void parseSplitString() {
        String csv = "1,2,3,4,5,6,7,8,9,10";
        String[] results = csv.split(",");

        System.out.println(results.length);
        System.out.println(results[0]);
        System.out.println(results[9]);
    }
}
