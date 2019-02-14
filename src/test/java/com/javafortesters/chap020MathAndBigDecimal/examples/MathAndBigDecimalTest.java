package com.javafortesters.chap020MathAndBigDecimal.examples;

import org.junit.Test;

import java.math.BigDecimal;
import java.math.BigInteger;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class MathAndBigDecimalTest {
    @Test
    public void floatTest() {
        float total = 0.1f + 0.73f;
        System.out.println(total);
        assertThat(total, is(0.83f));
    }

    @Test
    public void workingWithBigDecimal() {
        BigDecimal bigDecimaltotal = new BigDecimal("0.1").add(new BigDecimal("0.73"));
        assertThat(bigDecimaltotal, is (new BigDecimal((0.83))));
    }

    @Test
    public void tryBigDecimalOrInt() {
        Integer amountinPense = 500;
        amountinPense = amountinPense - 43;
        System.out.println(amountinPense);
        amountinPense = amountinPense - 73;
        System.out.println(amountinPense);
        amountinPense = amountinPense - 173;
        System.out.println(amountinPense);

        float amountinPenseFloat = 500;
        amountinPenseFloat = amountinPenseFloat - 43;
        System.out.println(amountinPenseFloat);
        amountinPenseFloat = amountinPenseFloat - 73;
        System.out.println(amountinPenseFloat);
        amountinPenseFloat = amountinPenseFloat - 173;
        System.out.println(amountinPenseFloat);

        BigDecimal amountinPensebd = new BigDecimal(500) ;
        amountinPensebd = amountinPensebd.subtract(new BigDecimal(43));
        System.out.println(amountinPensebd);
        amountinPensebd = amountinPensebd.subtract(new BigDecimal(73));
        System.out.println(amountinPensebd);
        amountinPensebd = amountinPensebd.subtract(new BigDecimal(173));
        System.out.println(amountinPensebd);
    }

    @Test
    public void constructABigDecimal() {
        BigDecimal fromInt = new BigDecimal(5);
        BigDecimal fromLong = new BigDecimal(5L);
        BigDecimal fromString = new BigDecimal("5");
        BigDecimal fromDouble = new BigDecimal(5.0);
        BigDecimal fromBigInteger = new BigDecimal(BigInteger.valueOf(5L) );
    }

    @Test
    public void bigDecimalFactoryMethods() {
        BigDecimal bd0 = BigDecimal.ZERO;
        BigDecimal bd1 = BigDecimal.ONE;
        BigDecimal bd10 = BigDecimal.TEN;
        BigDecimal bdval = BigDecimal.valueOf(5.0);
        System.out.println(bd10);
        System.out.println(bd1);
        System.out.println(bdval);
    }

    @Test
    public void calculateUsingBigDecimal() {
        BigDecimal aBigDecimal = BigDecimal.ZERO;
        aBigDecimal = aBigDecimal.add(new BigDecimal(10)).multiply(new BigDecimal(2)).subtract(new BigDecimal(10)).divide(new BigDecimal(2));
        System.out.println(aBigDecimal);
        assertThat(aBigDecimal, is(new BigDecimal(5)));
    }

    @Test
    public void compareBigDecimalObjects() {
        assertThat(BigDecimal.ONE.equals(new BigDecimal(1.0)), is(true));
        assertThat(BigDecimal.ONE.equals(new BigDecimal(1)), is(true));
        assertThat(BigDecimal.TEN.compareTo(BigDecimal.ONE) > 0 , is(true));
    }

    @Test
    public void mathMethods() {
        assertThat(Math.max(23.0,42.0), is(42.0));
        assertThat(Math.min(23.0,42.0), is(23.0));
        assertThat(Math.abs(-42.0), is(42.0));
        System.out.println(Math.random());

    }
}
