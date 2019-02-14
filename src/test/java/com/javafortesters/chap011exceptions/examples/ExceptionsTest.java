package com.javafortesters.chap011exceptions.examples;

import com.javafortesters.domainentities.User;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ExceptionsTest {

    @Test
    public void throwNullPointerException() {
        Integer age = null;
        age = 18;

        String ageAsString  = age.toString();
        String yourAge = "You are " + ageAsString + " years old";
        assertEquals("You are 18 years old", yourAge);
    }

    @Test
    public void catchANullPointerException() {
        Integer age = null;
        String ageAsString;

        try {
            ageAsString = age.toString();
        } catch (NullPointerException e) {
            age = 18;
            ageAsString = age.toString();
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            System.out.println("Illegal argument" + e.getMessage());
        }


        String yourAge = "You are " + age.toString() + " years old";
        assertEquals("You are 18 years old", yourAge);
    }

    @Test
    public void catchAArthmeticException() {
        Integer age = null;
        String ageAsString;

        try {
            ageAsString = age.toString();
        } catch (ArithmeticException e) {
            age = 18;
            ageAsString = age.toString();
        }

        String yourAge = "You are " + age.toString() + " years old";
        assertEquals("You are 18 years old", yourAge);
    }

    @Test(expected = NullPointerException.class)
    public void nullPointerExceptionExpected() {
        Integer age = null;
        age.toString();
    }

    @Test
    public void shortPassword() {
        User shortUserPassword = new User("username","pass");
    }

    @Test
    public void tryCatchFinallyANullPointerException() {
        Integer age = null;
        String ageAsString;
        String yourAge = "";

        try {
            System.out.println("1.Generate a null pointer exception");
            ageAsString = age.toString();
        } catch (NullPointerException e) {
            System.out.println("2.Handle null pointer exception");
            throw new IllegalArgumentException("Null pointer become illegal", e);
        } finally{
            System.out.println("3.Tidy up resources in finally block");
        }

        assertEquals("You are 18 years old", yourAge);
    }
}
