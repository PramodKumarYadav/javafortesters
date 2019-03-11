package com.javafortesters.solution;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MathSeries{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();

        if (t<0 || t>500){
            System.out.println("Allowed range for repetition is 1 till 500");
            return;
        }
        for(int i=0;i<t;i++){

            int a = in.nextInt();
            if (a<0 || a>50){
                System.out.println("Allowed range for a is 1 till 50");
                return;
            }
            int b = in.nextInt();
            if (b<0 || b>50){
                System.out.println("Allowed range for b is 1 till 50");
                return;
            }
            int n = in.nextInt();
            if (n<0 || n>15){
                System.out.println("Allowed range for n is 1 till 15");
                return;
            }
            // System.out.println("number of series n : " + n);

            List<String> series = new ArrayList<>();
            String seriesOuput = "";
            Integer sum = a;
            for (int j=0 ; j<n ; j++){
                sum = sum + b*(int)Math.pow(2d,j);
                // series.add(sum.toString());
                seriesOuput = seriesOuput + sum + " ";
            }

            // System.out.println(series);
            System.out.println(seriesOuput);
        }
        in.close();
    }
}