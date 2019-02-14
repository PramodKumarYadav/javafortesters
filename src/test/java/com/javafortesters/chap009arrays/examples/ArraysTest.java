package com.javafortesters.chap009arrays.examples;

import com.javafortesters.domainentities.Print2DArray;
import com.javafortesters.domainentities.User;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ArraysTest {

    @Test
    public void simpleArraysExample() {
            String[] number0123 = {"zero" , "one" , "two" , "three"};

        for (String numberText : number0123){
            System.out.println(numberText);
        }

        assertEquals("zero", number0123[0]);
        assertEquals("three", number0123[3]);
    }

    @Test
    public void arraysInitialiseTests() {
        int[] integers = new int[10];
        int []moreInts = new int[10];
        int evenmore[] = new int[10];

        String[] strings = new String[10];

        int[] ints1to10 = {1,2,3,4,5,6,7,8,9,10};

        int[] zeroLength = {};
        int[] moreZeroLength = new int[0];

        int[] uninitialisedArray;
        uninitialisedArray = new int[10];

        uninitialisedArray = new int[] {100,200,300};

        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday","Friday"};

        assertEquals("Monday" , workdays[0]);
        assertEquals("Tuesday" , workdays[1]);
        assertEquals("Friday" , workdays[4]);


    }

    @Test
    public void arraysOfUsers() {

        User[] userList = new User[3];

        userList[0] = new User("username1", "password1");
        userList[1] = new User("username2", "password2");
        userList[2] = new User("username3", "password3");

        System.out.println( userList[2].getUsername() );
        System.out.println( userList[2].getPassword() );
    }

    @Test
    public void forEachArrayExample() {

        User[] userList = new User[3];

        userList[0] = new User("username1", "password1");
        userList[1] = new User("username2", "password2");
        userList[2] = new User("username3", "password3");

        System.out.println( userList[2].getUsername() );
        System.out.println( userList[2].getPassword() );

        for (User currentUser: userList) {
            System.out.println(currentUser.getUsername());
        }

        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday","Friday"};

        String days= "";

        for(String workday : workdays){
            days = days + "|" + workday;
        }

        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday",days);

        String anotherDays= "";
        for(int i=0; i<5 ;i++){
            anotherDays = anotherDays + "|" + workdays[i];
        }

        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday",anotherDays);

        int i=0;
        for(; i<5; i++){
            days = days + "|" + workdays[i];
        }

        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday",anotherDays);

        i=0;
        for(; ; ){
            days = days + "|" + workdays[i];
            i++;
            if(i>=5) break;
        }

        assertEquals("|Monday|Tuesday|Wednesday|Thursday|Friday",anotherDays);


    }

    @Test
    public void forLoopUsingIndexFixedCondition() {
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday","Friday"};

        String days = "";

        for (int i = 0; i < 5; i++) {
            days = days + "|" + i + "-" + workdays[i];
        }

        assertEquals("|0-Monday|1-Tuesday|2-Wednesday|3-Thursday|4-Friday",days);

        int dayIndex = 0;
        for (String workday : workdays) {
            days = days +"|" + workday;
            System.out.println("found " + workday+ " at position: " + dayIndex );
            dayIndex++;
        }

        assertEquals(5,workdays.length);

        days = "";
        for (int i = 0; i < workdays.length; i++) {
            days = days + "|" + i + "-" + workdays[i];
        }

        assertEquals("|0-Monday|1-Tuesday|2-Wednesday|3-Thursday|4-Friday",days);
    }

    @Test
    public void arrayOf100Users() {
        User[] hundredUsers = new User[100];

        for (int i = 0; i < 100; i++) {
            hundredUsers[i] = new User("user"+i,"password"+i);

            System.out.println(hundredUsers[i].getUsername());

            assertEquals("user"+i,hundredUsers[i].getUsername());
            assertEquals("password"+i,hundredUsers[i].getPassword());

        }
        System.out.println(hundredUsers.length);
    }

    @Test
    public void useArraysLibrary() {
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday","Friday"};
        String[] weekdays;

        weekdays = Arrays.copyOf(workdays, 7);

        for (int i = 0; i < workdays.length; i++) {
            System.out.println(weekdays[i]);
            assertEquals(workdays[i],weekdays[i]);
        }

        assertEquals(weekdays[5],null);
        assertEquals(weekdays[6],null);
        weekdays[5] = "Saturday";
        weekdays[6] = "Sunday";
        assertEquals(weekdays[5],"Saturday");
        assertEquals(weekdays[6],"Sunday");
        // assertEquals(weekdays[7],null);

        String[] someWeekdays;

        someWeekdays = Arrays.copyOfRange(weekdays,1,3);

        for (int i = 0; i < someWeekdays.length; i++) {
            System.out.println(someWeekdays[i]);
        }

    }

    @Test
    public void copyOfArraysExample() {
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday","Friday","Saturday","Sunday"};

        String[] halfWeekdays;

        halfWeekdays = Arrays.copyOf(weekdays, 3);
        assertEquals(3, halfWeekdays.length);
        assertEquals("Wednesday",halfWeekdays[2]);
    }

    @Test
    public void copyOfArraysRangeExamples() {
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday","Friday"};
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday","Friday","Saturday","Sunday"};

        String[] someMoreWeekdays;

        someMoreWeekdays = Arrays.copyOfRange(weekdays,2,5);
        assertEquals("Wednesday",someMoreWeekdays[0]);
        assertEquals("Friday",someMoreWeekdays[2]);

        someMoreWeekdays = Arrays.copyOfRange(workdays,2,7);
        System.out.println(someMoreWeekdays.length);
        assertEquals("Wednesday",someMoreWeekdays[0]);
        assertEquals("Friday",someMoreWeekdays[2]);
        assertEquals(null,someMoreWeekdays[someMoreWeekdays.length-1]);

        Arrays.fill(someMoreWeekdays,3,someMoreWeekdays.length,"dummyDay");

        System.out.println(someMoreWeekdays[someMoreWeekdays.length-1] );
    }

    @Test
    public void fillArrays() {
        int[] minusOne = new int[30];
        Arrays.fill(minusOne,-1);
        assertEquals(minusOne[27],-1);

        int[] tenItems = {0,0,0,0,0,1,1,1,1,1};

        Arrays.fill(tenItems,5,10,2);
        assertEquals(0,tenItems[0]);
        assertEquals(2,tenItems[9]);
    }

    @Test
    public void sortArrays() {
        int[] outOforder = {2,4,1,9,6,3,7};
        Arrays.sort(outOforder);

        for (int i = 0; i < outOforder.length; i++) {
            System.out.println(outOforder[i]);
        }
    }

    @Test
    public void sortArraysofTypeStringWithSameCase() {
        String[] workdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Arrays.sort(workdays);
        for (int i = 0; i < workdays.length; i++) {
            System.out.println(workdays[i]);
        }

        assertEquals(workdays[0],"Friday");
    }

    @Test
    public void sortArraysofTypeStringWithDifferntCases() {
        String[] workdays = {"monday", "tuesday", "Wednesday", "Thursday", "friday"};
        String[] weekdays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        Arrays.sort(workdays);
        for (int i = 0; i < workdays.length; i++) {
            System.out.println(workdays[i]);
        }

        assertEquals(workdays[0],"Friday");
    }

    @Test
    public void multiDimensionalArray() {
        int[][] multiDimensional = new int[4][4];

        assertEquals(4,multiDimensional[0].length);
        assertEquals(0,multiDimensional[0][0]);
    }

    @Test
    public void declaredMultiDimensionalArray() {
        int[][] multiDimensional = {{1,2,3,4},
                {5,6,7,8},
                {9,10,11,12,13},
                {14,15,16,17,18}
                                    };

        assertEquals(4,multiDimensional[0].length);
        assertEquals(5,multiDimensional[1][0]);
        assertEquals(10,multiDimensional[2][1]);
        assertEquals(16,multiDimensional[3][2]);
    }

    @Test
    public void threeDimensionalArray() {
        int[][][] threeDimensoinal = new int[3][4][5];

        assertEquals(3,threeDimensoinal.length);
        assertEquals(4,threeDimensoinal[0].length);
        assertEquals(5,threeDimensoinal[0][1].length);

        assertEquals(0,threeDimensoinal[0][1][2]);

    }

    @Test
    public void raggedArray() {
        int[][] ragged2Darray = {{1,2,3,4},{5,6},{7,8,9},{0}};

        assertEquals(4,ragged2Darray.length);
        assertEquals(2,ragged2Darray[1].length);
        assertEquals(1,ragged2Darray[3].length);
        assertEquals(0,ragged2Darray[3][0]);
        assertEquals(8,ragged2Darray[2][1]);

        Print2DArray.print2DIntArray(ragged2Darray);

    }

    @Test
    public void raggedDynamicArray() {
        int[][] ragged2Darray = new int[10][];

        ragged2Darray[0] = new int[10];
        ragged2Darray[1] = new int[3];

        assertEquals(0,ragged2Darray[0][5]);
        assertEquals(0,ragged2Darray[1][2]);
        assertEquals(null,ragged2Darray[2]);
        assertEquals(null,ragged2Darray[9]);

        Print2DArray.print2DIntArray(ragged2Darray);
    }

    @Test
    public void makeATriangleOfBase16() {
        int[][] arrayBase16 = new int[16][];

        System.out.println(arrayBase16.length);

        for (int i = 0; i < arrayBase16.length; i++) {
            arrayBase16[i] = new int[i+1];
            for (int j = 0; j < i+1; j++) {
                arrayBase16[i][j] = j;
                // System.out.print(arrayBase16[i][j] + ",");
            }
            // System.out.println("");
        }

        Print2DArray.print2DIntArray(arrayBase16) ;

    }




}
