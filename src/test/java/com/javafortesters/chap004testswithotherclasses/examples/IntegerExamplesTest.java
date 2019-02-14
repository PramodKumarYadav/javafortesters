package com.javafortesters.chap004testswithotherclasses.examples;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class IntegerExamplesTest {

    @Test
    public void integerExploration(){

        Integer four = new Integer(4);
        assertEquals(4,four.intValue());

        Integer five = new Integer("5");
        assertEquals(5,five.intValue());

        Integer six = 6;
        assertEquals("Autoboxing assignment for 6",6,six.intValue());

        Integer number5 = Integer.valueOf("5");

        int number6 = Integer.parseInt("8");

    }

    @Test
    public void convertIntToHexString(){

        assertEquals("That 11 becomes b","b",Integer.toHexString(11) );
        assertEquals("That 10 becomes a","a",Integer.toHexString(10) );
        assertEquals("That 3 becomes 3","3",Integer.toHexString(3) );
        assertEquals("That 21 becomes 15","15",Integer.toHexString(21) );

        assertEquals(2147483647,Integer.MAX_VALUE );
        assertEquals(-2147483648,Integer.MIN_VALUE );

        Integer firstFour = new Integer(4);
        Integer secondFour = new Integer(4);

        assertEquals(firstFour,secondFour);
        assertTrue( "This Test case is meant to fail since these are two different objects. Although value are same but objects are different",firstFour == secondFour);

    }

    @Test
    public void integerExplorationAutoboxing(){

        Integer six = 6;
        assertEquals("Autoboxing assignment for 6",6,six.intValue());


    }
}
