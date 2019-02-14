package com.javafortesters.chap010introducingcollections.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import static org.junit.Assert.*;

public class IntroducingCollectionsTest {

    @Test
    public void simpleArrayExample() {
        String[] numbers0123 = {"zero", "one","two","three"} ;

        for (String numberText : numbers0123) {
            System.out.println(numberText);
        }

        assertEquals("zero", numbers0123[0]);
        assertEquals("three", numbers0123[3]);
    }

    @Test
    public void simpleCollectionExample() {
        String[] numbers0123Array = {"zero", "one","two","three"} ;
        List<String> number0123 = Arrays.asList(numbers0123Array);

        for (String numbertext : number0123) {
            System.out.println(numbertext);
        }

        assertEquals("zero",number0123.get(0));
        assertEquals("three",number0123.get(3));
    }

    @Test
    public void simpleDynamicCollectionExample() {
        List<String> number0123 = new ArrayList<String>();

        number0123.add("zero");
        number0123.add("one");
        number0123.add("two");
        number0123.add("three");

        for (String numberText : number0123) {
            System.out.println(numberText);
        }

        assertEquals("zero" , number0123.get(0));
        assertEquals("three" , number0123.get(3));
    }

    @Test
    public void experimentingWithForEachLoop() {
        String[] someDays = {"Tuesday","Thursday","Wednesday","Monday","Saturday","Sunday","Friday"};

        List<String> days = Arrays.asList(someDays);
        int i = 0;
        for (String currentDay : someDays) {
            if (currentDay == "Monday") {
                System.out.println("Position of Monday is : " + i);
                break;
            }
            i++;
        }

        // Using lists
        int j =0;
        for (String currentDay : days) {
            if (currentDay.equals("Monday")) {
                break;
            }
            j++;
        }

        assertEquals("Monday is at position 3 : ",3, j);
    }

    @Test
    public void experimentingWithForLoop() {
        String[] someDays = {"Tuesday","Thursday","Wednesday","Monday","Saturday","Sunday","Friday"};

        List<String> days = Arrays.asList(someDays);

        for (int i =0; i < someDays.length ; i++) {
            if (someDays[i] == "Monday") {
                System.out.println("Position of Monday is : " + i);
                break;
            }
        }

        // Using lists
        int i = 0;
        for (i =0; i <= days.size() ; i++) {
            if (days.get(i).equals("Monday")) {
                System.out.println("Position of Monday is : " + i);
                break;
            }
        }

        assertEquals("Monday is at position 3 : ",3, i);
    }

    @Test
    public void experimentingWithWhileLoop() {
        String[] someDays = {"Tuesday","Thursday","Wednesday","Monday","Saturday","Sunday","Friday"};
        List<String> days = Arrays.asList(someDays);

        int loopCount = 0;
        while (!days.get(loopCount).equals("Monday")) {
            loopCount++;
        }

        assertEquals("Monday is at position 3 ",3,loopCount);
    }

    @Test
    public void experimentingWithDoWhileLoop() {
        String[] someDays = {"Tuesday","Thursday","Wednesday","Monday","Saturday","Sunday","Friday"};
        List<String> days = Arrays.asList(someDays);

        int loopCount = -1;
        do {
            loopCount++;
        } while (!days.get(loopCount).equals("Monday"));

        assertEquals("Monday is at position 3 ",3,loopCount);

        int i ;
        for (i = 0; !days.get(i).equals("Monday"); i++) {
            System.out.println(days.get(i));
        }

        assertEquals("Monday is at position 3 ",3,i);
    }

    @Test
    public void workingWithInterfaces() {
        Collection<String> workdays = new <String>ArrayList();
        Collection<String> daysOfWeek = new <String>ArrayList();
        Collection<String> weekendDays = new <String>ArrayList();

        workdays.add("Monday") ;
        workdays.add("Tuesday") ;
        workdays.add("Wednesday") ;
        workdays.add("Thursday") ;
        workdays.add("Friday") ;

        assertEquals(5, workdays.size());

        daysOfWeek.addAll(workdays);
        System.out.println(daysOfWeek);

        assertEquals(workdays.size(),daysOfWeek.size());
        assertTrue(daysOfWeek.containsAll(workdays));

        weekendDays.add("Saturday");
        weekendDays.add("Funday");

        weekendDays.remove("Funday");
        assertFalse(weekendDays.contains("Funday"));
        assertTrue("Bug fixed now, Saturday is in list" ,weekendDays.contains("Saturday"));
    }

    @Test
    public void emptyACollection() {
        Collection workdays = new ArrayList();
        Collection daysOfWeek = new ArrayList();
        Collection weekEndDays = new ArrayList();

        workdays.add("Monday");
        workdays.add("Tuesday") ;
        workdays.add("Wednesday") ;
        workdays.add("Thursday") ;
        workdays.add("Friday") ;

        daysOfWeek.addAll(workdays) ;

        weekEndDays.add("Saturday");
        weekEndDays.add("Funday");

        daysOfWeek.addAll(weekEndDays) ;

        assertEquals(7, daysOfWeek.size());

        daysOfWeek.clear();

        assertEquals(0,daysOfWeek.size());
        assertTrue(daysOfWeek.isEmpty());

    }

    @Test
    public void removeOneCollectionFromAnother() {
        Collection workdays = new ArrayList();
        Collection daysOfWeek = new ArrayList();
        Collection weekEndDays = new ArrayList();

        workdays.add("Monday");
        workdays.add("Tuesday") ;
        workdays.add("Wednesday") ;
        workdays.add("Thursday") ;
        workdays.add("Friday") ;

        daysOfWeek.addAll(workdays) ;

        weekEndDays.add("Saturday");
        weekEndDays.add("Sunday");

        daysOfWeek.addAll(weekEndDays) ;
        System.out.println(daysOfWeek);

        assertEquals(7, daysOfWeek.size());

        daysOfWeek.removeAll(weekEndDays);
        System.out.println(daysOfWeek);

        assertEquals(5,daysOfWeek.size());
        assertTrue(daysOfWeek.containsAll(workdays));
        assertFalse(daysOfWeek.containsAll(weekEndDays));
    }

    @Test
    public void retainOneCollectionInAnother() {
        Collection workdays = new ArrayList();
        Collection daysOfWeek = new ArrayList();
        Collection weekEndDays = new ArrayList();

        workdays.add("Monday");
        workdays.add("Tuesday") ;
        workdays.add("Wednesday") ;
        workdays.add("Thursday") ;
        workdays.add("Friday") ;

        daysOfWeek.addAll(workdays) ;

        weekEndDays.add("Saturday");
        weekEndDays.add("Sunday");

        daysOfWeek.addAll(weekEndDays) ;
        System.out.println(daysOfWeek);

        assertEquals(7, daysOfWeek.size());

        daysOfWeek.retainAll(weekEndDays);
        System.out.println(daysOfWeek);

        assertEquals("Contains only weekends now",2,daysOfWeek.size());
        assertTrue(daysOfWeek.containsAll(weekEndDays));
        assertFalse(daysOfWeek.containsAll(workdays));
    }

    @Test
    public void convertingToArray() {
        Collection workdays = new ArrayList();
        Collection daysOfWeek = new ArrayList();
        Collection weekEndDays = new ArrayList();

        workdays.add("Monday");
        workdays.add("Tuesday") ;
        workdays.add("Wednesday") ;
        workdays.add("Thursday") ;
        workdays.add("Friday") ;

        daysOfWeek.addAll(workdays) ;

        weekEndDays.add("Saturday");
        weekEndDays.add("Sunday");

        daysOfWeek.addAll(weekEndDays) ;
        System.out.println(daysOfWeek);

        assertEquals(7, daysOfWeek.size());

        Object[] daysOfWeekArray = daysOfWeek.toArray();
        assertEquals(7,daysOfWeekArray.length);

        assertEquals("Monday".length(),((String)daysOfWeekArray[0]).length());

        String[] anotherArray = new String[daysOfWeek.size()];
        daysOfWeek.toArray(anotherArray);
        assertEquals("Monday".length(),anotherArray[0].length());
    }

    @Test
    public void collectionOfusers() {
        Collection users = new ArrayList();
        Collection users02 = new ArrayList();

        assertEquals(0, users.size());
        assertTrue(users.isEmpty());

        User user1 = new User("admin1","pA55w0rD01");
        User user2 = new User("admin2","pA55w0rD02");

        users.add(user1);
        users.add(user2);

        assertEquals(2, users.size());
        assertFalse(users.isEmpty());

        System.out.println(users);

        User user3 = new User("admin3","pA55w0rD01");
        User user4 = new User("admin4","pA55w0rD02");

        users02.add(user3);
        users02.add(user4);

        users.addAll(users02);
        assertTrue(users.containsAll(users02));

        users02.clear();
        users.clear();
        assertEquals(0, users.size());
        assertEquals(0, users02.size());
    }

}