package com.javafortesters.chap013MoreExceptions.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class MoreExceptionsTest {

    @Test
    public void canCreateDefaultUserWithoutHandlingException() {
        User aUser = new User();

        assertEquals("username", aUser.getUsername());
        assertEquals("username", aUser.getUsername());
    }

//    @Test
//    public void haveToCatchIllegalPasswordForParamConstructor() {
//        try {
//            User aUser = new User("me","short);
//            fail("an exception should have been thrown");
//
//        } catch (InvalidPassword invalidPassword) {
//            assertTrue("The exception was thrown", true );
//        }
//    }
}
