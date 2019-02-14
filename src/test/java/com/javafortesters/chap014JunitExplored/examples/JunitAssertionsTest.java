package com.javafortesters.chap014JunitExplored.examples;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.*;
import static org.junit.Assert.*;

public class JunitAssertionsTest {

    @Test
    public void testingJunitAssertionMethods() {
        assertEquals(6, 3 + 3);
        assertEquals("3+3 is 6 " ,6, 3 + 3);
        assertFalse("1 is not equal to 2", 1 == 2);
        assertTrue("1 is equal to 1", 1 == 1);

        int[] array1 = {0,1};
        int[] array2 = {0,1};
        assertArrayEquals("1 is equal to 1",array1, array2);
        assertNotNull(array1);
        assertNotSame(array1,array2);
        assertNull(null);
        assertSame(array1,array1);
    }

    @Test
    public void testingHamcrestAssertionMethods() {
        // Hamcrest methods
        assertThat(2+2, is(4));
        assertThat(2+2, equalTo(4));
        assertThat(2+2, is(not(5)));
        assertThat("my name is pramod", containsString("pramod"));
        assertThat("my name is pramod", endsWith("pramod"));
        assertThat("my name is pramod", startsWith("my"));
        assertThat(null, is(nullValue()));
        assertThat(" ", is(not(nullValue())));
    }

    @Test
    public void methodToTestFail() {
        fail("fail is what fail does");
    }
}

