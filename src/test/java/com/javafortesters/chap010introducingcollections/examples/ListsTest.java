package com.javafortesters.chap010introducingcollections.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ListsTest {

    @Test
    public void getAnElementAtAnIndex() {
        List<String> days = new ArrayList<>();

        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");

        assertEquals("Monday",days.get(0));
        assertEquals("Tuesday",days.get(1));
        assertEquals("Wednesday",days.get(2));
    }

    @Test
    public void removeAnElementAtAnIndex() {
        List<String> days = new ArrayList<>();

        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");

        days.remove(1) ;

        assertEquals(2,days.size());
        assertEquals("Monday",days.get(0));
        assertEquals("Wednesday",days.get(1));
    }

    @Test
    public void addAnElementAtSpecificIndex() {
        List<String> days = new ArrayList<>();

        days.add("Tuesday");
        days.add("Thursday");
        days.add("Saturday");

        days.add(0,"Monday"); ;
        days.add(2,"Wednesday"); ;
        days.add(4,"Friday"); ;
        days.add(6,"Sunday"); ;

        assertEquals(7,days.size());
        assertEquals("Monday",days.get(0));
        assertEquals("Tuesday",days.get(1));
    }

    @Test
    public void addAllElementsAtSpecificIndex() {
        List<String> days = new ArrayList<>();
        List<String> missingDays = new ArrayList<>();

        days.add("Monday");
        days.add("Friday");

        missingDays.add("Tuesday");
        missingDays.add("Wednesday");
        missingDays.add("Thursday");

        days.addAll(1, missingDays);

        assertEquals(5,days.size());

        assertEquals("Monday",days.get(0));
        assertEquals("Tuesday",days.get(1));
        assertEquals("Wednesday",days.get(2));
        assertEquals("Thursday",days.get(3));
        assertEquals("Friday",days.get(4));
    }

    @Test
    public void findTheIndexOfAnElement() {
        List<String> days = new ArrayList<>();

        days.add("Monday");
        days.add("Thursday");
        days.add("Friday");

        assertEquals(3,days.size());
        assertEquals(2,days.indexOf("Friday"));
    }

    @Test
    public void findTheIndexOfAnElementHavingDuplicates() {
        List<String> days = new ArrayList<>();

        days.add("Monday");
        days.add("Friday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Thursday");
        days.add("Friday");

        assertEquals(6,days.size());
        assertEquals(1,days.indexOf("Friday"));
    }

    @Test
    public void findTheLastIndexOfAnElementHavingDuplicates() {
        List<String> days = new ArrayList<>();

        days.add("Monday");
        days.add("Friday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Thursday");
        days.add("Friday");

        assertEquals(6,days.size());
        assertEquals(5,days.lastIndexOf("Friday"));
    }

    @Test
    public void setElementAtAnIndex() {
        List<String> days = new ArrayList<>();

        days.add("Monday");
        days.add("Friday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Thursday");
        days.add("Friday");

        days.set(1, "Tuesday");

        assertEquals(6,days.size());
        assertEquals("Tuesday",days.get(1));
        assertEquals("Thursday",days.get(2));
    }

    @Test
    public void createASubList() {
        List<String> days = new ArrayList<>();

        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");
        days.add("Sunday");

        List<String> workdays = days.subList(0, 5);

        assertEquals(5,workdays.size());

        assertEquals("Monday",workdays.get(0));
        assertEquals("Friday",workdays.get(4));

    }

    @Test
    public void createAndManipulateAListOfUsers() {
        List<User> users = new ArrayList<>();

        User user1 = new User("admin1","pA55w0rD01");
        User user2 = new User("admin2", "password2");

        users.add(user1);
        users.add(0,user2);

        assertEquals(0,users.indexOf(user2));
        assertEquals(1,users.indexOf(user1));

        users.remove(0) ;
        assertEquals(0,users.indexOf(user1));
    }
}
