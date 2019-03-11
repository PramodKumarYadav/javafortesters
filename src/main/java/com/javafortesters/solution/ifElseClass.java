package com.javafortesters.solution;

import java.util.Scanner;

public class ifElseClass {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if (N <2 || N>20){
            System.out.println("Not a valid range. Select a number between 2 and 20 (both inclusive)") ;

        }else {
            for (int i=1; i<=10; i++){
                System.out.println(N +" x " + i + " = " + N*i) ;
            }
        }
        scanner.close();
    }
}

