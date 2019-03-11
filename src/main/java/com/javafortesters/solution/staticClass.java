package com.javafortesters.solution;

import java.util.Scanner;

public class staticClass {


    static int B ;
    static int H ;
    static boolean flag = true ;
    static {
        Scanner scanner = new Scanner(System.in);
        B = scanner.nextInt();
        scanner.nextLine();
        H = scanner.nextInt();
        scanner.close();
        if((B<=0 || H<=0) || (B>100 || H>100) ){
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");

        }
    }

    public static void main(String[] args){
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }//end of main

}//end of class