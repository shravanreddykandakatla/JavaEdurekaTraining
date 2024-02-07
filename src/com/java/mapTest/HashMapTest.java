package com.java.mapTest;

import java.util.*;

public class HashMapTest {
    public static void main(String[] args) {
        Map<String, Float> bank = new HashMap<String, Float>();

        //this hashmap will not maintain the order of the entry
        System.out.println(bank.put("Shravan", 1000.3f));// this will return null
        System.out.print(bank + "\n");
        System.out.println(bank.put("Shravan", 1001.3f));// this will override the value previously assigned to shravan and return the previous values
        System.out.print(bank + "\n");
        bank.put("Shreya", 999.8f);
        bank.put("Reddy", 999.8f);
        bank.put("Vijayram", 999.8f);
        System.out.print(bank + "\n");

        //to get the value of a key
        Float bal = bank.get("Shreya");
        System.out.println("Account balance for Shreya: " + bal);

        //To get all key values
        Set<String> names = bank.keySet();
        for (String name : names) {
            System.out.println(name);
        }
        System.out.println("\n");

        //To get all entries
        Set<Map.Entry<String, Float>> entries = bank.entrySet();
        Iterator<Map.Entry<String, Float>> it = entries.iterator();
        while (it.hasNext()) {
            Map.Entry<String, Float> entry = it.next();
            //System.out.println(entry);
            String name = entry.getKey();
            bal = entry.getValue();
            String acc = String.format("%-12s : %.2f", name, bal);
            System.out.println(acc);
            try {
                Thread.sleep(1000);
            } catch (Exception ex) {

            }
        }
    }
}
