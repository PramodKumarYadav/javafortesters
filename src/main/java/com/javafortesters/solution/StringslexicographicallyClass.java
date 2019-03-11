package com.javafortesters.solution;


import java.util.Scanner;

public class StringslexicographicallyClass {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */

        System.out.println(A.length() + B.length());

        if (B.compareTo(A) <= -1){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }

        System.out.println(A.substring(0,1).toUpperCase()+ A.substring(1,A.length()) + " " + B.substring(0,1).toUpperCase()+ B.substring(1,B.length()));
    }


//        public static void main(String[] args) {
//
//            String str_Sample = "a";
//            System.out.println("Compare To 'a' b is : " + str_Sample.compareTo("b"));
//            str_Sample = "b";
//            System.out.println("Compare To 'b' a is : " + str_Sample.compareTo("a"));
//            str_Sample = "b";
//            System.out.println("Compare To 'b' b is : " + str_Sample.compareTo("b"));
//        }

}



