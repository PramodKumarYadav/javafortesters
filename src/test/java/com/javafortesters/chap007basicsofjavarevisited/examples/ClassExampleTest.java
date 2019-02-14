
package com.javafortesters.chap007basicsofjavarevisited.examples;

import com.javafortesters.chap007basicsofjavarevisitedabstract.ClassExample;
import org.junit.Test;

import static org.junit.Assert.*;

public class ClassExampleTest {

    ClassExample instance = new ClassExample("bob") ;

    @Test
    public void canAssertTrue() {
        /* This code checks that the
        true value that truthy was set to
        is true. Pretty obvious right.
         */

        boolean truthy = true;
        assertTrue(truthy); // comment till end of line

    }

    @Test
    public void aJavaDocComment() {
        assertTrue(ClassExample.addTwoNumbers(4, 3) == 7);
        assertEquals(4, 2 + 2);
        assertEquals("2+2 is always =4",
                4,
                2 + 2);
        assertEquals(instance.pubField, "a public field");
        instance.pubField = "amended public field";
        assertEquals(instance.pubField, "amended public field");
    }

    @Test
    public void BooleanType() {
        boolean truthy = true;
        boolean falsey = false;

        assertTrue(truthy);
        assertFalse(falsey);

        truthy = Boolean.TRUE;
        falsey = Boolean.FALSE;

        assertTrue(truthy);
        assertFalse(falsey);

    }

    @Test
    public void IntegerTypes() {
        byte aByteHas1Byte;
        short aShortHas2Bytes;
        int anIntHas4Bytes;
        long aLongHas8Bytes;

        System.out.println(
                         "* 'byte' range : " +
                         Byte.MIN_VALUE + " to " +
                         Byte.MAX_VALUE );

        System.out.println(
                "* 'short' range : " +
                        Short.MIN_VALUE + " to " +
                        Short.MAX_VALUE );

        System.out.println(
                "* 'int' range : " +
                        Integer.MIN_VALUE + " to " +
                        Integer.MAX_VALUE );

        System.out.println(
                "* 'long' range : " +
                        Long.MIN_VALUE + " to " +
                        Long.MAX_VALUE );

        aLongHas8Bytes = 0L;    //add suffix L for long
        assertEquals(0 , aLongHas8Bytes) ;

        aByteHas1Byte   = 0xA;   //add suffix 0X for Hex
        assertEquals(10 , aByteHas1Byte) ;

        anIntHas4Bytes  = 010;    //add zero prefix for octal
        assertEquals(8 , anIntHas4Bytes ) ;

        aByteHas1Byte  = 0b0010;    // Java 1.7 added 0b for binary
        assertEquals(2 , aByteHas1Byte) ;

        // Java 1.7 allows underscores for readability
        aLongHas8Bytes = 9_000_000_000L;    // 9 000 million
        assertEquals(9_000_000_000L , aLongHas8Bytes) ;

    }

    @Test
    public void FloatingPointType() {

        float singlePrecision32bit;
        double doublePrecision64bit;

        System.out.println("* 'float' range : " +
                Float.MIN_VALUE + " to " +
                Float.MAX_VALUE );

        System.out.println("* 'double' range : " +
                Double.MIN_VALUE + " to " +
                Double.MAX_VALUE );

        singlePrecision32bit = 10.0F;
        assertEquals(10F, singlePrecision32bit, 0); // suffix to get a float

        doublePrecision64bit = 20.0;
        assertEquals(20D, doublePrecision64bit, 0); //defaults to double
    }

    @Test
    public void CharacterType() {
        char aChar = '\u0026';
        assertEquals(aChar, '&');

        char anEscapeCharacter = '\b';
        assertEquals(anEscapeCharacter, '\b');
    }

    @Test
    public void traditionalOperatorsExplored() {
        assertEquals(4,2+2);
        assertEquals(5L,10L - 5L);
        assertEquals(25.0F, 12.5F * 2F,0 );
        assertEquals(30.2D, 120.8D / 4D,0 );
        assertEquals("abcd","ab"+"cd");
        assertEquals(1,9%2);

    }

    @Test
    public void assignmentOperatorsExplored() {
        String ab = "ab";
        assertEquals("ab",ab) ;

        int num = 10;
        assertEquals(10,num);

        num += 2;
        assertEquals("-= increments by ", 12, num);

        num -= 4;
        assertEquals("+= decrements by ", 8, num);

        num *= 2;
        assertEquals("+= multiplies by ", 16, num);

        num /= 4;
        assertEquals("+= divides by ", 4, num);

        num %= 3;
        assertEquals("+= divides by ", 1, num);

    }

    @Test
    public void incrementDecrementOperatorsExplored() {
        int num = 10;
        assertEquals(11, ++num) ;
        assertEquals(10, --num) ;
        assertEquals(10, num++) ;
        assertEquals(11, num) ;
        assertEquals(11, num--) ;
        assertEquals(10, num) ;
    }

    @Test
    public void booleanOperatorsExplored(){

        assertTrue(4 == 4);
        assertTrue(4 != 5);
        assertTrue(3 < 4);
        assertTrue(5 > 4) ;
        assertTrue(6 >= 6) ;
        assertTrue(7 >= 6) ;
        assertTrue(8 <= 8);
        assertTrue(8 <= 9) ;

        assertTrue(!false);

        boolean truthy = true;
        assertFalse(!truthy);
    }

    @Test
    public void conditionalOperatorsExplored() {
        assertTrue( true  && true);
        assertTrue(true || false);
        assertTrue(false || true);
        assertFalse(false || false);
        assertFalse(false && true);
    }

    @Test
    public void ternaryOperatorsExplored() {
        int x;
         x = 4>3 ? 2:1;
         assertEquals(2, x);

         assertTrue(5 >= 4 ? true : false);

    }

    @Test
    public void bitwiseOperatorsExplored() {
        assertEquals(0b0001, 0b1001 & 0b0101);
        assertEquals(0b1101, 0b1001 | 0b0101);
        assertEquals(0b1100, 0b1001 ^ 0b0101);

        int x = 0b0001;
        assertEquals("11111111111111111111111111111111", Integer.toBinaryString(-x));

    }

    @Test
    public void bitwiseAssignmentOperatorsExplored() {
        byte x = 0b0001;

        x &= 0b1011;
        assertEquals(0b0001, x);

        x|= 0b1001;
        assertEquals(0b1001, x);

        x ^= 0b1110;
        assertEquals(0b0111, x);

    }

    @Test
    public void bitwiseShiftOperatorsExplored() {
        int x = 56;
        System.out.println(x<<1);

        assertEquals(x*2, x<<1);
        assertEquals(x*4, x<<2);
        assertEquals(x*8, x<<3);

        System.out.println(x);
        x <<=3;
        System.out.println(x);

        assertEquals(56*8, x);

        x = Integer.MAX_VALUE;
        assertEquals(Integer.MAX_VALUE/2, x>>1);
        assertEquals(Integer.MAX_VALUE/4, x>>2);
        assertEquals(Integer.MAX_VALUE/8, x>>3);

        x = Integer.MIN_VALUE; // -ve
        assertEquals((Integer.MAX_VALUE/2) + 1, x >>>1);
    }

    @Test
    public void stringsConcatenated() {
        assertEquals("123456","12"+"34"+"56");

    }

    @Test
    public void someStringMethods() {
        String aString = "abcdef";

        assertEquals(6, aString.length()) ;
        assertTrue(aString.compareToIgnoreCase("ABCDEF") == 0);
        assertTrue(aString.contains("bcd"));
        assertTrue(aString.startsWith("abc"));

        // string indexing starts at 0
        assertEquals('c', aString.charAt(2));
        assertEquals("ef", aString.substring(4) );


    }
}
