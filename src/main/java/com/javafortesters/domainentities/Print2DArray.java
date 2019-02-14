package com.javafortesters.domainentities;

public class Print2DArray {

    public static void print2DIntArray(int[][] multi) {
        for (int[] outer : multi) {
            if (outer == null) {
                System.out.println("null");
            } else {
                for (int inner : outer) {
                    System.out.print(inner + ",");
                }
            }
            System.out.println("");
        }
    }

    public static class EmptyUser extends User {
        public EmptyUser() {
        }
    }
}
