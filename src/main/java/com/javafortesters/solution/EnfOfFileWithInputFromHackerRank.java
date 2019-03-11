package com.javafortesters.solution;

import java.util.Scanner;

public class EnfOfFileWithInputFromHackerRank {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int lineNr = 1;
        while (scanner.hasNext()) {
            System.out.println(lineNr + " " + scanner.nextLine());
            lineNr++;
        }

    }
}
