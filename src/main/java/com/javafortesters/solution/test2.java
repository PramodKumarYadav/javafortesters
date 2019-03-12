package com.javafortesters.solution;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class test2 {

    public static String longestEvenWord(String sentence) {
        // Write your code here

        // Check for the constrain on sentence size
        int sizeOfSentence = sentence.length();

        if (sizeOfSentence < 1 || sizeOfSentence > (int)Math.pow(10d,5) ){
            return "00";
        }

        // First parse the sentence into a list of words
        List<String> parsedSentenceList = new ArrayList<>();
        parsedSentenceList = Arrays.asList(sentence.split(" "));

        System.out.println(parsedSentenceList);

        // Find the size of the first biggest word among list and the biggest word itself.
        int lengthOfBiggestWord = 0;
        String firstBiggestWord = "00";

        for (int i=0 ; i < parsedSentenceList.size(); i++){

            if (parsedSentenceList.get(i).length() %2 == 0){

                if(parsedSentenceList.get(i).length() > lengthOfBiggestWord){
                    lengthOfBiggestWord = parsedSentenceList.get(i).length();
                    firstBiggestWord = parsedSentenceList.get(i);
                }
            }
        }

        return firstBiggestWord;

    }
}
