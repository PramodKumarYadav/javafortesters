package com.javafortesters.chap008conditionalstatements.examples;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConditionalStatementsTest {

    @Test
    public void moreTernary() {
        String url = "www.eviltester.com";

        url = url.startsWith("http") ? url : addHttp(url);

        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.eviltester.com", url);

    }

    private String addHttp(String url) {
        return "http://" + url;
    }

    @Test
    public void returnCatOrCats() {

        assertEquals("more than one cat is Cats", "cats", catorCats(2));
    }

    private String catorCats(int i) {
        String x;
        return x = i == 1 ? "cat" : "cats";
    }

    @Test
    public void ifAddHttp() {
        String url = "www.seleniumsimplified.com";

        if (!url.startsWith("http")) {
            url = addHttp(url);
        }

        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com",url);

    }

    @Test
    public void assertTrueMethod() {
        boolean truthy = true;

        if(truthy == true)
            assertTrue(truthy);

        if(truthy == true) {
            assertTrue(truthy);
            assertFalse(!truthy);
        }
    }

    @Test
    public void ifElseAddHttp() {
        String url = "www.seleniumsimplified.com";

        if (url.startsWith("http")) {
            // do notthing the url is fine
        } else {
            url = addHttp(url);
        }

        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com",url);

    }

    @Test
    public void assertTruElseFalseMethod() {
        boolean truthy = false;

        if(truthy == true)
            assertTrue(truthy);
        else
            assertFalse(truthy);

        if (truthy == true) {
            assertTrue(truthy);
            assertFalse(!truthy);
        }else {
            assertFalse(truthy);
        }
    }

    @Test
    public void ifElseNestedAddHttp() {
        String url = "seleniumsimplified.com";

        if (url.startsWith("http")) {
            System.out.println("already starts with http. No need to add http");
        } else {
            if (!url.startsWith("www")) {
                url = "www."+url;
            }
            url = addHttp(url);
        }

        assertTrue(url.startsWith("http://"));
        assertEquals("http://www.seleniumsimplified.com",url);

    }

    @Test
    public void horrorsOfNestedIfElse() {
        boolean truthy = false;
        boolean falsey = false;

        if (truthy == true) {
            if (!falsey == true) {
                if (truthy && !falsey) {
                    if (falsey || truthy) {
                        assertTrue(truthy);
                    }else {
                        assertFalse(falsey);
                    }
                }
            }
        }else{
            if (!truthy) {
                if (falsey) {
                    assertTrue(falsey);
                    assertFalse(truthy);
                }
                else
                {
                    assertFalse(falsey);
                    assertFalse(truthy);
                }

            }
        }

    }

    @Test
    public void switchExample() {
        assertEquals("M", likelyGenderFor("sir"));
        assertEquals("M", likelyGenderFor("mr"));
        assertEquals("M", likelyGenderFor("master"));
        assertEquals("F", likelyGenderFor("miss"));
        assertEquals("F", likelyGenderFor("mrs"));
        assertEquals("F", likelyGenderFor("ms"));
        assertEquals("F", likelyGenderFor("lady"));
        assertEquals("F", likelyGenderFor("madam"));
    }

    private String likelyGenderFor(String title) {
        String likelyGender;

        switch (title.toLowerCase()) {
            case "sir":
                likelyGender = "M";
                break;
            case "mr":
                likelyGender = "M";
                break;
            case "master":
                likelyGender = "M";
                break;
            default:
                likelyGender = "F";
                break;
        }

        switch (title.toLowerCase()) {
            case "sir":
            case "mr":
            case "master":
                likelyGender = "M";
                break;
            default:
                likelyGender = "F";
                break;
        }

        return likelyGender;
    }

    @Test
    public void switchOnShortCountryCode() {
        String shortCountryCode;

        shortCountryCode = "uK";

        assertEquals("United Kingdom",findCountryNameFromCountryCode("uK"));
        assertEquals("United States",findCountryNameFromCountryCode("us"));
        assertEquals("United States",findCountryNameFromCountryCode("uSa"));
        assertEquals("France",findCountryNameFromCountryCode("Fr"));
        assertEquals("Sweden",findCountryNameFromCountryCode("SE"));
        assertEquals("Rest of World",findCountryNameFromCountryCode("In"));
    }

    private String findCountryNameFromCountryCode(String shortCountryCode) {
        String countryName;

        switch(shortCountryCode.toLowerCase()){
            case "uk":
                countryName = "United Kingdom";
                break;
            case "us":
            case "usa":
                countryName = "United States";
                break;
            case "fr":
                countryName = "France";
                break;
            case "se":
                countryName = "Sweden";
                break;
            default:
                countryName = "Rest of World";
                break;
        }

        return countryName;
    }

    @Test
    public void convertsIntNumberToStringNameUntilNrFour() {
        int number;
        number = 2;

        assertEquals("One", findNameForNumber(1));
        assertEquals("Two", findNameForNumber(2));
        assertEquals("Three", findNameForNumber(3));
        assertEquals("Four", findNameForNumber(4));
        assertEquals("Too big", findNameForNumber(33));
        assertEquals("Too small", findNameForNumber(-33));
    }

    private String findNameForNumber(int number) {
        String numberName;

        switch(number){
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                numberName = "Three";
                break;
            case 4:
                numberName = "Four";
                break;
            default:
                if (number > 4) {
                    numberName = "Too big";
                } else if (number < 1) {
                    numberName = "Too small";
                } else {
                    numberName = "Too small";
                }

                break;
        }

        return numberName;
    }


}
