package com.beytullahatasoy.javalearning;

public class Variables {

    public static void main(String[] args){
        // Variables
        // Integer

        int age = 20;

        System.out.println(10*age);

        int x = 5;
        int y = 11;
        System.out.println(y/x);

        // Double - Float
        double z = 5.0;
        double a = 11.0;
        System.out.println(a/z);

        double pi = 3.14;
        int r = 5;
        System.out.println(2*pi*r);

        // String
        String name = "Kaan";
        String surname = "Tangoze";
        String fullName = name + surname;
        System.out.println(name);
        System.out.println(surname);
        System.out.println(fullName);

        // Boolean
        boolean isAlive = true;
        isAlive = false;                // değişmesine izin veriyor
        System.out.println(isAlive);    // ama değişken türü aynı olmalı

        // Final
        final int myInteger = 5;        // bunun son değeri bu demek gibi
        System.out.println("myInteger: " + myInteger);
    }

}
