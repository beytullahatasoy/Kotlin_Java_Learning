package com.beytullahatasoy.javalearning;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Arrays {
    public static void main(String[] args) {

        // Array

        String[] myStringArray = new String[3];

        myStringArray[0] = "Ali";
        myStringArray[1] = "Mehmet";
        myStringArray[2] = "Hasan";
        System.out.println(myStringArray[1]);

        int[] myIntegerArray = new int[3];
        myIntegerArray[0] = 50;
        myIntegerArray[1] = 60;
        myIntegerArray[2] = 70;
        System.out.println(myIntegerArray[1]);

        int[] myNumberArray = {1,2,3,4,5,6,7,8};
        System.out.println(myNumberArray[2]);



        // Lists

        ArrayList<String> myMusicians = new ArrayList<>();
        myMusicians.add("Kaan");
        myMusicians.add("Batu");
        myMusicians.add(1, "Ali");
        myMusicians.add("Beyto");

        System.out.println(myMusicians.get(0));
        System.out.println(myMusicians.get(1));
        System.out.println(myMusicians.get(2));
        System.out.println(myMusicians.get(3));
        System.out.println(myMusicians.size());



        // Set

        HashSet<String> mySet = new HashSet<>();
        mySet.add("Hasan");
        mySet.add("Hasan");
        System.out.println(mySet.size());       // 2 tane yazmama rağmen size= 1 verdi


        // HashMap

        HashMap<String, String> myHashMap = new HashMap<>();

        myHashMap.put("name", "Kaan");                              // put yapınca bir key ve bir value vermemizi sağlıyor
        myHashMap.put("instrument", "Guitar");                      // sout da key isteyince bize value'yi veriyor
        System.out.println(myHashMap.get("name"));
        System.out.println(myHashMap.get("instrument"));

        HashMap<String, Integer> mySecondMap = new HashMap<>();     // String ve int berebre kullandık
                                                                    // fakat int değil Integer çünkü int ilkel hali
        mySecondMap.put("run", 100);
        mySecondMap.put("basketball", 200);
        System.out.println(mySecondMap.get("run"));
        System.out.println(mySecondMap.get("basketball"));
    }
}
