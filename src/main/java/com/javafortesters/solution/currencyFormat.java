package com.javafortesters.solution;


import java.util.*;
import java.text.*;

public class currencyFormat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double payment = scanner.nextDouble();

        if (payment <0 || payment >(int)Math.pow(10d,9)){
            System.out.println("payment should be within 0 to 10 to power 9 range");
            return;
        }
        scanner.close();

        NumberFormat usFormat = NumberFormat.getCurrencyInstance(Locale.US);
        String us = usFormat.format(payment);
        System.out.println("US: " + us);

        NumberFormat indiaFormat = NumberFormat.getCurrencyInstance(Locale.UK);
        DecimalFormatSymbols decimalFormatSymbols = ((DecimalFormat) indiaFormat).getDecimalFormatSymbols();
        decimalFormatSymbols.setCurrencySymbol("");
        ((DecimalFormat) indiaFormat).setDecimalFormatSymbols(decimalFormatSymbols);
        String india = indiaFormat.format(payment);
        System.out.println("India: Rs." + india.trim());

        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china = chinaFormat.format(payment);
        System.out.println("China: " + china);

        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = franceFormat.format(payment);
        System.out.println("France: " + france);

    }
}
