package com.javafortesters.solution;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class javaDateAndTime {

    public static void main(String[] args) throws ParseException {
        int year = 1990;
        int month = 02;
        int day = 15;

        String res = findDay(month, day, year);
        System.out.println(res);

    }


    public static String findDay(int month, int day, int year) {

        String DateInStringFormat = day + "/" + month + "/" + year ;

        try{
            Date date =new SimpleDateFormat("dd/MM/yyyy").parse(DateInStringFormat);
            System.out.println(DateInStringFormat+"\t"+date);

            SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE");
            System.out.println(simpleDateformat.format(date));
            return simpleDateformat.format(date).toUpperCase();
        }catch(ParseException ex){
            //exception
            ex.printStackTrace();
        }

        return "error";

    }
}
