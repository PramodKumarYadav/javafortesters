package com.javafortesters.chap007basicsofjavarevisitedabstract;

public class ClassExample {

    public static final String CONSTANT = "a cosntant string";
    public static String aClassField = "a class field";
    protected static String protectedField = "a class field";

    public String pubField = "a public field";

    private String privField = "a private field";
    private String name;

    public ClassExample(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Add two integers and return a int.
     *
     * There is a reisk of overflow since two big
     * integers would max out the return int.
     *
     * @param   a is the first number to add
     *          b is the second number to add
     * @return a+b as an int
     *
     *
     */

    public static int addTwoNumbers(int a, int b) {
        return a+b;
    }
}
