package com.javafortesters.solution;

public class testS {

    static String mergeStrings(String a, String b) {

        // Get the lenghts of both stings  and check which of them is smaller
        int lengthOfStringA = a.length();
        int lengthOfStringB = b.length();
        String finalMergeString = "";

        // Test for constraints on string a and b
        if (lengthOfStringA < 1 || lengthOfStringA >25000){
            System.out.println("length of string a should be within 1 till 25000 characters long. Currently this is : " + lengthOfStringA);
            return finalMergeString;
        }
        if (lengthOfStringB < 1 || lengthOfStringB > 25000) {
            System.out.println("length of string b should be within 1 till 25000 characters long. Currently this is : " + lengthOfStringB);
            return finalMergeString;
        }

        int mergeLength ;
        String biggerString = "";
        if (lengthOfStringA <= lengthOfStringB){
            mergeLength = lengthOfStringA;
            biggerString = b;
        } else {
            mergeLength = lengthOfStringB;
            biggerString = a;
        }

        // Build the merged String
        String mergeString = "";
        for (int i=0; i < mergeLength ; i++){
            mergeString = mergeString + a.substring(i, i+1) + b.substring(i, i+1);
        }

        // System.out.println(mergeString);

        // String finalMergeString = "";
        finalMergeString = mergeString +  biggerString.substring(mergeLength,biggerString.length());
        System.out.println(finalMergeString);
        return finalMergeString;
    }
}
