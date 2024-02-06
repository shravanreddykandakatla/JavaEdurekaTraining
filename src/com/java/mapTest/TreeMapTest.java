package com.java.mapTest;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {
        Map<String,Float> bank= new TreeMap<String, Float>();

        //this TreeMap will store in the ascending order of the key.
        System.out.println(bank.put("Shravan",1000.3f));// this will return null
        System.out.print(bank+"\n");
        System.out.println(bank.put("Shravan",1001.3f));// this will override the value previously assigned to shravan and return the previous values
        System.out.print(bank+"\n");
        bank.put("Shreya",999.8f);
        bank.put("Reddy",999.8f);
        bank.put("Vijayram",999.8f);
        System.out.print(bank+"\n");
    }
}
