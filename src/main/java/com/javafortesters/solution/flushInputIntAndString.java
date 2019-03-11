package com.javafortesters.solution;

import java.util.Scanner;

public class flushInputIntAndString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();

        // To flush the new line that would otherwise create errors in scanner while reading next line.
        scan.nextLine();
        Double d = Double.parseDouble(scan.nextLine());
        String s = scan.nextLine();

        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
