package com.javafortesters.chap010introducingcollections.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SetTest {

    @Test
    public void setDoesNotAllowDuplicateElements() {
        Set<String> workdays = new HashSet<>();

        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");
        workdays.add("Monday");

        assertEquals(1, workdays.size());
    }

    @Test
    public void createAndManipulateSetOfUsers() {
        Set<User> users = new HashSet<>();

        User user01 = new User("admin01","password01");

        users.add(user01);
        users.add(user01);
        users.add(user01);

        assertEquals(1,users.size());
        assertTrue(users.contains(user01));


    }
}
