package com.javafortesters.solution;

import java.util.Scanner;

public class EndOfFileClass {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfLines = scanner.nextInt();

        String readLine = scanner.nextLine();
        for (int i =0; i<numberOfLines; i++){
            readLine = readLine + scanner.nextLine() +"\n" ;
        }

        System.out.println("File content : \n" + readLine );

        int lineNr = 1;

        Scanner output = new Scanner(readLine);

        while (output.hasNext()) {
            System.out.println(lineNr + " " + output.nextLine());
            lineNr++;
        }

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}