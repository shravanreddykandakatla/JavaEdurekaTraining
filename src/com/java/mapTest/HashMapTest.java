package com.java.mapTest;

import java.util.HashMap;
import java.util.Map;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String,Float> bank= new HashMap<String, Float>();

        //this hashmap will not maintain the order of the entry
        System.out.println(bank.put("shravan",1000.3f));// this will return null
        System.out.print(bank+"\n");
        System.out.println(bank.put("shravan",1001.3f));// this will override the value previously assigned to shravan and return the previous values
        System.out.print(bank+"\n");
        bank.put("shreya",999.8f);
        bank.put("Reddy",999.8f);
        bank.put("Vijayram",999.8f);
        System.out.print(bank+"\n");
    }
}
