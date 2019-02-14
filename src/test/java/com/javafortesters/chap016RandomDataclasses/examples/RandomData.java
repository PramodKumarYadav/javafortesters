package com.javafortesters.chap016RandomDataclasses.examples;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

public class RandomData {

    @Test
    public void mathRandom() {
        double rnd  = Math.random();
        System.out.println(rnd);
        assertThat(rnd  < 1.0d, is (true));
        assertThat(rnd  >= 0.0d, is (true));
    }

    @Test
    public void javaUtilRandomMethods() {
        Random generateRandom = new Random();

        boolean randomBoolean =   generateRandom.nextBoolean();
        System.out.println(randomBoolean);
        assertTrue(randomBoolean == true || randomBoolean == false);

        int randomInt = generateRandom.nextInt();
        System.out.println(randomInt);
        assertTrue(randomInt <Integer.MAX_VALUE && randomInt  >= Integer.MIN_VALUE);

        int randomIntInRange = generateRandom.nextInt(12);
        System.out.println(randomIntInRange);
        assertTrue(randomIntInRange < 12 && randomIntInRange >= 0);

        long    randomLong = generateRandom.nextLong();
        System.out.println(randomLong);
        assertTrue(randomLong <Long.MAX_VALUE && randomLong >= Long.MIN_VALUE);

        float randomFloat = generateRandom.nextFloat();
        System.out.println(randomFloat);
        assertTrue(randomFloat <= 1.0f && randomFloat >= 0.0f);

        double randomDouble = generateRandom.nextDouble();
        System.out.println(randomDouble);
        assertTrue(randomDouble <= 1.0d && randomDouble >= 0.0d);

        byte[] bytes = new byte [generateRandom.nextInt(100)];
        System.out.println(bytes);

        generateRandom.nextBytes(bytes);
        System.out.println(bytes);
    }

    @Test
    public void generateRandomNrBetween15And20() {
        Random generateRandom = new Random();
        int minimumNr = 15;
        int maxiumumNr = 20;
        int deltaRandomRange = maxiumumNr - minimumNr + 1;
        int counterToGenerateRandomNumbers = 1000;

        for (int i = 0; i < counterToGenerateRandomNumbers; i++) {
            int randomNrbetween15and20 = generateRandom.nextInt(deltaRandomRange) + minimumNr;
            System.out.println(randomNrbetween15and20);
            assertTrue(randomNrbetween15and20 <=20 && randomNrbetween15and20 >= 15);
        }

    }

    @Test
    public void javaUtilRandomGaussianMethod() {
        Random generateRandom = new Random();

        int countLessThanEqualToOne = 0;
        int countLessThanEqualToTwo = 0;
        int countLessThanEqualToThree = 0;
        int countLessThanEqualToFour = 0;

        for (int i = 0; i < 1000; i++) {
            double randomGaussian = generateRandom.nextGaussian();
//            System.out.println(randomGaussian);
            assertTrue(randomGaussian <= 4.0d && randomGaussian >=- 4.0d);
            if (randomGaussian <= 1.0d) {
                countLessThanEqualToOne++;
            } else if (randomGaussian <= 2.0d) {
                countLessThanEqualToTwo++;
            } else if (randomGaussian <= 3.0d) {
                countLessThanEqualToThree++;
            } else if (randomGaussian <= 4.0d) {
                countLessThanEqualToFour++;
            } else {
                fail();
            }
        }
        Double percentageOne = (double) countLessThanEqualToOne/10;
        Double percentageLessThanTwo = ((double) countLessThanEqualToTwo + (double) countLessThanEqualToOne)/10;
        Double percentageLessThanThree = ((double) countLessThanEqualToThree  + (double) countLessThanEqualToTwo + (double) countLessThanEqualToOne)/10;
        Double percentageLessThanFour = ((double) countLessThanEqualToFour  + (double) countLessThanEqualToThree  + (double) countLessThanEqualToTwo + (double) countLessThanEqualToOne)/10;

        System.out.println("countLessThanEqualToOne : " + countLessThanEqualToOne);
        System.out.println("percentage occurance less than One : " + percentageOne);

        System.out.println("countLessThanEqualToTwo : " + countLessThanEqualToTwo);
        System.out.println("percentage occurance less than Two : " + percentageLessThanTwo);

        System.out.println("countLessThanEqualToThree : " + countLessThanEqualToThree);
        System.out.println("percentage occurance less than Three : " + percentageLessThanThree);

        System.out.println("countLessThanEqualTofour : " + countLessThanEqualToFour);
        System.out.println("percentage occurance less than Four : " + percentageLessThanFour);
    }

    @Test
    public void canGenerate1000AgesUsingDeviation() {
        Random generateRandom = new Random();

        Map<Integer, Integer> ages = new HashMap<Integer, Integer>();

        int[] allAges = new int[1000];

        int meanAge = 35;

        for (int i = 0; i < 1000; i++) {
            int randomGaussian = (int) (generateRandom.nextGaussian() * 5);
            // System.out.println(randomGaussian);

            int age = randomGaussian + 35;
            int ageCount = 0;

            if (ages.containsKey(age)) {
                ageCount = ages.get(age);
            }

            ageCount++;
            ages.put(age,ageCount);
        }

        SortedSet<Integer> ageSorted = new TreeSet(ages.keySet());

        for (int age : ageSorted) {
            System.out.println(age + ":" + ages.get(age));
        }

    }

    @Test
    public void seedingRandomNumbers() {
        long currentSeed1 = System.currentTimeMillis();

        long currentSeed = 1234567L;
        System.out.println("seed used : " + currentSeed);

        Random generateRandomNr = new Random(currentSeed);
        System.out.println(generateRandomNr.nextLong());
    }

    @Test
    public void buildRandomString() {
        String validValues = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ";
        Random generateRandom = new Random();

        String stringOf100Characters = "";

        for (int i = 0; i < 100; i++) {
            int indexOfRandomCharacter = generateRandom.nextInt(validValues.length());
            System.out.println(indexOfRandomCharacter);

            char characterAtIndexOfRandomCharacter =  validValues.charAt(indexOfRandomCharacter);
            System.out.println(characterAtIndexOfRandomCharacter);

            stringOf100Characters = stringOf100Characters + characterAtIndexOfRandomCharacter;
        }

        System.out.println(stringOf100Characters);
        System.out.println(stringOf100Characters.length());


    }

}
